package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class UpdateBlock extends soupply.bedrock150.Packet
{

    // flags and meta
    public static final int NEIGHBORS = 1;
    public static final int NETWORK = 2;
    public static final int NO_GRAPHIC = 4;
    public static final int PRIORITY = 8;

    public soupply.bedrock150.type.BlockPosition position;
    public int block;
    public int flagsAndMeta;

    public UpdateBlock()
    {
    }

    public UpdateBlock(soupply.bedrock150.type.BlockPosition position, int block, int flagsAndMeta)
    {
        this.position = position;
        this.block = block;
        this.flagsAndMeta = flagsAndMeta;
    }

}