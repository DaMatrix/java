package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class FullChunkData extends soupply.bedrock150.Packet
{

    public Tuples.IntXZ position;
    public soupply.bedrock150.type.ChunkData data;

    public FullChunkData()
    {
    }

    public FullChunkData(Tuples.IntXZ position, soupply.bedrock150.type.ChunkData data)
    {
        this.position = position;
        this.data = data;
    }

}