package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class SubClientLogin extends soupply.bedrock261.Packet
{

    public static final int ID = 94;

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

    public static SubClientLogin fromBuffer(byte[] buffer)
    {
        SubClientLogin packet = new SubClientLogin();
        packet.safeDecode(buffer);
        return packet;
    }

}
