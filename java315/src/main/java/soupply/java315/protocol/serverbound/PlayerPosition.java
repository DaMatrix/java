package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerPosition extends soupply.java315.Packet
{

    public static final int ID = 12;

    public DoubleXYZ position;
    public boolean onGround;

    public PlayerPosition()
    {
        this.position = new DoubleXYZ();
    }

    public PlayerPosition(DoubleXYZ position, boolean onGround)
    {
        this.position = position;
        this.onGround = onGround;
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