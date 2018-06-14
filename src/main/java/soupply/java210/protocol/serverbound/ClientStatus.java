package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class ClientStatus extends soupply.java210.Packet
{

    public static final int ID = 3;

    // action
    public static final int RESPAWN = 0;
    public static final int REQUEST_STATS = 1;
    public static final int OPEN_INVENTORY = 2;

    public int action;

    public ClientStatus()
    {
    }

    public ClientStatus(int action)
    {
        this.action = action;
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