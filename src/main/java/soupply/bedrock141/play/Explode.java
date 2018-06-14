package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class Explode extends soupply.bedrock141.Packet
{

    public Tuples.FloatXYZ position;
    public float radius;
    public soupply.bedrock141.type.BlockPosition[] destroyedBlocks;

    public Explode()
    {
    }

    public Explode(Tuples.FloatXYZ position, float radius, soupply.bedrock141.type.BlockPosition[] destroyedBlocks)
    {
        this.position = position;
        this.radius = radius;
        this.destroyedBlocks = destroyedBlocks;
    }

}