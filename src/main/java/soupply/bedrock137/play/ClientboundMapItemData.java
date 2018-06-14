package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ClientboundMapItemData extends soupply.bedrock137.Packet
{

    // update
    public static final int TEXTURE = 2;
    public static final int DECORATIONS = 4;
    public static final int ENTITIES = 8;

    public long mapId;
    public int update;
    public byte scale;
    public Tuples.IntXZ size;
    public Tuples.IntXZ offset;
    public byte[] data;
    public soupply.bedrock137.type.Decoration[] decorations;

    public ClientboundMapItemData()
    {
    }

    public ClientboundMapItemData(long mapId, int update, byte scale, Tuples.IntXZ size, Tuples.IntXZ offset, byte[] data, soupply.bedrock137.type.Decoration[] decorations)
    {
        this.mapId = mapId;
        this.update = update;
        this.scale = scale;
        this.size = size;
        this.offset = offset;
        this.data = data;
        this.decorations = decorations;
    }

}