package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class RequestChunkRadius extends soupply.bedrock201.Packet
{

    public int radius;

    public RequestChunkRadius()
    {
    }

    public RequestChunkRadius(int radius)
    {
        this.radius = radius;
    }

}