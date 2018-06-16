package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

class ClientStatus extends soupply.java335.Packet
{

    public static final int ID = 4;

    // action
    public static final int RESPAWN = 0;
    public static final int REQUEST_STATS = 1;

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