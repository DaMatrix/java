package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class TabComplete extends soupply.java335.Packet
{

    public static final int ID = 2;

    public String text;
    public boolean command;
    public boolean hasPosition;
    public long block;

    public TabComplete()
    {
    }

    public TabComplete(String text, boolean command, boolean hasPosition, long block)
    {
        this.text = text;
        this.command = command;
        this.hasPosition = hasPosition;
        this.block = block;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] dvd = _buffer.convertString(text);
        _buffer.writeVaruint((int)dvd.length);
        _buffer.writeBytes(dvd);
        _buffer.writeBool(command);
        _buffer.writeBool(hasPosition);
        if(hasPosition==true)
        {
            _buffer.writeBigEndianLong(block);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvdvd = _buffer.readVaruint();
        text = _buffer.readString(bvdvd);
        command = _buffer.readBool();
        hasPosition = _buffer.readBool();
        if(hasPosition==true)
        {
            block = _buffer.readBigEndianLong();
        }
    }

    public static TabComplete fromBuffer(byte[] buffer)
    {
        TabComplete packet = new TabComplete();
        packet.safeDecode(buffer);
        return packet;
    }

}
