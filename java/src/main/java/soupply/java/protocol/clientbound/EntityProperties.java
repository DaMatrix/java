package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java.Packet
{

    public static final int ID = 78;

    public int entityId;
    public soupply.java.type.Attribute[] attributes;

    public EntityProperties()
    {
        this.attributes = new soupply.java.type.Attribute[]();
    }

    public EntityProperties(int entityId, soupply.java.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
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