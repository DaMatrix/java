package soupply.java340.serverbound;

import java.util.*;
import soupply.util.*;

class CloseWindow extends soupply.java340.Packet
{

    public byte window;

    public CloseWindow()
    {
    }

    public CloseWindow(byte window)
    {
        this.window = window;
    }

}