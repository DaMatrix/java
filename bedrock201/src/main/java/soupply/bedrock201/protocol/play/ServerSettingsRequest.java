package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class ServerSettingsRequest extends soupply.bedrock201.Packet
{

    public static final int ID = 102;

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

    public static ServerSettingsRequest fromBuffer(byte[] buffer)
    {
        ServerSettingsRequest packet = new ServerSettingsRequest();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
