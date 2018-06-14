package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class EntityPickRequest extends soupply.bedrock150.Packet
{

    public static final int ID = 35;

    public long entityType;
    public byte slot;

    public EntityPickRequest()
    {
    }

    public EntityPickRequest(long entityType, byte slot)
    {
        this.entityType = entityType;
        this.slot = slot;
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