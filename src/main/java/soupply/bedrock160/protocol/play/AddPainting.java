package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class AddPainting extends soupply.bedrock160.Packet
{

    public static final int ID = 22;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock160.type.BlockPosition position;
    public int direction;
    public String title;

    public AddPainting()
    {
    }

    public AddPainting(long entityId, long runtimeId, soupply.bedrock160.type.BlockPosition position, int direction, String title)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.direction = direction;
        this.title = title;
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