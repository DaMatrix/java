package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class PlayerBlockPlacement extends soupply.java335.Packet
{

    public static final int ID = 31;

    // hand
    public static final int MAIN_HAND = 0;
    public static final int OFF_HAND = 1;

    public long position;
    public int face;
    public int hand;
    public Tuples.FloatXYZ cursorPosition;

    public PlayerBlockPlacement()
    {
    }

    public PlayerBlockPlacement(long position, int face, int hand, Tuples.FloatXYZ cursorPosition)
    {
        this.position = position;
        this.face = face;
        this.hand = hand;
        this.cursorPosition = cursorPosition;
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