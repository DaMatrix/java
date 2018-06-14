package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ResourcePackChunkRequest extends soupply.bedrock150.Packet
{

    public String id;
    public int chunkIndex;

    public ResourcePackChunkRequest()
    {
    }

    public ResourcePackChunkRequest(String id, int chunkIndex)
    {
        this.id = id;
        this.chunkIndex = chunkIndex;
    }

}