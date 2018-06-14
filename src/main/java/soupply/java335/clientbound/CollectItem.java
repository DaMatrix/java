package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class CollectItem extends soupply.java335.Packet
{

    public int collected;
    public int collector;
    public int count;

    public CollectItem()
    {
    }

    public CollectItem(int collected, int collector, int count)
    {
        this.collected = collected;
        this.collector = collector;
        this.count = count;
    }

}