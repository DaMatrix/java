package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class UseBed extends soupply.java335.Packet
{

    public static final int ID = 47;

    public int entityId;
    public long position;

    public UseBed()
    {
    }

    public UseBed(int entityId, long position)
    {
        this.entityId = entityId;
        this.position = position;
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