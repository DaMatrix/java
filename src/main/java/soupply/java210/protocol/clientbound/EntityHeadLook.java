package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityHeadLook extends soupply.java210.Packet
{

    public static final int ID = 52;

    public int entityId;
    public byte headYaw;

    public EntityHeadLook()
    {
    }

    public EntityHeadLook(int entityId, byte headYaw)
    {
        this.entityId = entityId;
        this.headYaw = headYaw;
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