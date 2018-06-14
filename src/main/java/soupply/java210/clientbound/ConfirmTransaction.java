package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class ConfirmTransaction extends soupply.java210.Packet
{

    public byte window;
    public short action;
    public boolean accepted;

    public ConfirmTransaction()
    {
    }

    public ConfirmTransaction(byte window, short action, boolean accepted)
    {
        this.window = window;
        this.action = action;
        this.accepted = accepted;
    }

}