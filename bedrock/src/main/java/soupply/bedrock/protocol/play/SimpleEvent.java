package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class SimpleEvent extends soupply.bedrock.Packet
{

    public static final int ID = 64;

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
    }

    public static SimpleEvent fromBuffer(byte[] buffer)
    {
        SimpleEvent packet = new SimpleEvent();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
