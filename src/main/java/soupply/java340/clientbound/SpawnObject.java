package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnObject extends soupply.java340.Packet
{

    public int entityId;
    public UUID uuid;
    public byte type;
    public Tuples.DoubleXYZ position;
    public byte pitch;
    public byte yaw;
    public int data;
    public Tuples.ShortXYZ velocity;

    public SpawnObject()
    {
    }

    public SpawnObject(int entityId, UUID uuid, byte type, Tuples.DoubleXYZ position, byte pitch, byte yaw, int data, Tuples.ShortXYZ velocity)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.type = type;
        this.position = position;
        this.pitch = pitch;
        this.yaw = yaw;
        this.data = data;
        this.velocity = velocity;
    }

}