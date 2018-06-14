package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class PlayerListHeaderAndFooter extends soupply.java340.Packet
{

    public String header;
    public String footer;

    public PlayerListHeaderAndFooter()
    {
    }

    public PlayerListHeaderAndFooter(String header, String footer)
    {
        this.header = header;
        this.footer = footer;
    }

}