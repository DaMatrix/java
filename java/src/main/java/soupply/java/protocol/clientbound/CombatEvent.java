package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class CombatEvent extends soupply.java.Packet
{

    public static final int ID = 45;

    public byte eventId;

    public CombatEvent()
    {
    }

    public CombatEvent(byte eventId)
    {
        this.eventId = eventId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianByte(eventId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        eventId = _buffer.readBigEndianByte();
    }

    public static CombatEvent fromBuffer(byte[] buffer)
    {
        CombatEvent packet = new CombatEvent();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
