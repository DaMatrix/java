package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class SetTime extends soupply.bedrock160.Packet
{

    public static final int ID = 10;

    public int time;

    public SetTime()
    {
    }

    public SetTime(int time)
    {
        this.time = time;
    }

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