package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class BookEdit extends soupply.bedrock137.Packet
{

    public byte type;
    public byte slot;

    public BookEdit()
    {
    }

    public BookEdit(byte type, byte slot)
    {
        this.type = type;
        this.slot = slot;
    }

}