package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class AdvancementProgress extends soupply.java335.Packet
{

    public static final int ID = 54;

    public boolean notEmpty;
    public String identifier;

    public AdvancementProgress()
    {
    }

    public AdvancementProgress(boolean notEmpty, String identifier)
    {
        this.notEmpty = notEmpty;
        this.identifier = identifier;
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