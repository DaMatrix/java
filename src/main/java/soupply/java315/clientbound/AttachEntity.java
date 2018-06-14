package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class AttachEntity extends soupply.java315.Packet
{

    public int target;
    public int holder;

    public AttachEntity()
    {
    }

    public AttachEntity(int target, int holder)
    {
        this.target = target;
        this.holder = holder;
    }

}