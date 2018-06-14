package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityTeleport extends soupply.java338.Packet
{

    public static final int ID = 76;

    public int entityId;
    public Tuples.DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public boolean onGround;

    public EntityTeleport()
    {
    }

    public EntityTeleport(int entityId, Tuples.DoubleXYZ position, byte yaw, byte pitch, boolean onGround)
    {
        this.entityId = entityId;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
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