package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class ClickWindow extends soupply.java315.Packet
{

    public static final int ID = 7;

    public byte window;
    public short slot;
    public byte button;
    public short action;
    public int mode;
    public soupply.java315.type.Slot clickedItem;

    public ClickWindow()
    {
    }

    public ClickWindow(byte window, short slot, byte button, short action, int mode, soupply.java315.type.Slot clickedItem)
    {
        this.window = window;
        this.slot = slot;
        this.button = button;
        this.action = action;
        this.mode = mode;
        this.clickedItem = clickedItem;
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