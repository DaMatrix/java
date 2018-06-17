package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerHotbar extends soupply.bedrock261.Packet
{

    public static final int ID = 48;

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

    public static PlayerHotbar fromBuffer(byte[] buffer)
    {
        PlayerHotbar packet = new PlayerHotbar();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
