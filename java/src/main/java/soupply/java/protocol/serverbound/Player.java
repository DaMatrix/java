package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class Player extends soupply.java.Packet
{

    public static final int ID = 12;

    public boolean onGround;

    public Player()
    {
    }

    public Player(boolean onGround)
    {
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