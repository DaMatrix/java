package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SetCooldown extends soupply.java.Packet
{

    public static final int ID = 23;

    public int item;
    public int cooldown;

    public SetCooldown()
    {
    }

    public SetCooldown(int item, int cooldown)
    {
        this.item = item;
        this.cooldown = cooldown;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(item);
        _buffer.writeVaruint(cooldown);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        item = _buffer.readVaruint();
        cooldown = _buffer.readVaruint();
    }

    public static SetCooldown fromBuffer(byte[] buffer)
    {
        SetCooldown packet = new SetCooldown();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
