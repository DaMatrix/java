package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class ClientToServerHandshake extends soupply.bedrock.Packet
{

    public static final int ID = 4;

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}