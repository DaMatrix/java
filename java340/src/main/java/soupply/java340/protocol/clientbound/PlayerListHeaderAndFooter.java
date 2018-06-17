package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerListHeaderAndFooter extends soupply.java340.Packet
{

    public static final int ID = 74;

    public String header;
    public String footer;

    public PlayerListHeaderAndFooter()
    {
    }

    public PlayerListHeaderAndFooter(String header, String footer)
    {
        this.header = header;
        this.footer = footer;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] avzv = _buffer.convertString(header);
        _buffer.writeVaruint((int)avzv.length);
        _buffer.writeBytes(avzv);
        byte[] z9dv = _buffer.convertString(footer);
        _buffer.writeVaruint((int)z9dv.length);
        _buffer.writeBytes(z9dv);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvavzv = _buffer.readVaruint();
        header = _buffer.readString(bvavzv);
        final int bvz9dv = _buffer.readVaruint();
        footer = _buffer.readString(bvz9dv);
    }

    public static PlayerListHeaderAndFooter fromBuffer(byte[] buffer)
    {
        PlayerListHeaderAndFooter packet = new PlayerListHeaderAndFooter();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
