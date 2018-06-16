package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksStackPacket extends soupply.bedrock141.Packet
{

    public static final int ID = 7;

    public boolean mustAccept;
    public soupply.bedrock141.type.Pack[] behaviourPacks;
    public soupply.bedrock141.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
        this.behaviourPacks = new soupply.bedrock141.type.Pack[]();
        this.resourcePacks = new soupply.bedrock141.type.Pack[]();
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock141.type.Pack[] behaviourPacks, soupply.bedrock141.type.Pack[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
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