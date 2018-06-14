package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class Spectate extends soupply.java338.Packet
{

    public static final int ID = 30;

    public UUID player;

    public Spectate()
    {
    }

    public Spectate(UUID player)
    {
        this.player = player;
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