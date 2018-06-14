package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class EntityFall extends soupply.bedrock160.Packet
{

    public long entityId;
    public float distance;
    public boolean unknown2;

    public EntityFall()
    {
    }

    public EntityFall(long entityId, float distance, boolean unknown2)
    {
        this.entityId = entityId;
        this.distance = distance;
        this.unknown2 = unknown2;
    }

}