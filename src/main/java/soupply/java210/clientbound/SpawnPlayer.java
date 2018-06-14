package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnPlayer extends soupply.java210.Packet
{

    public int entityId;
    public UUID uuid;
    public Tuples.DoubleXYZ position;
    public byte yaw;
    public byte pitch;
    public soupply.java210.Metadata metadata;

    public SpawnPlayer()
    {
    }

    public SpawnPlayer(int entityId, UUID uuid, Tuples.DoubleXYZ position, byte yaw, byte pitch, soupply.java210.Metadata metadata)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.metadata = metadata;
    }

}