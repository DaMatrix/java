package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class KeepAlive extends soupply.java316.Packet
{

    public int id;

    public KeepAlive()
    {
    }

    public KeepAlive(int id)
    {
        this.id = id;
    }

}