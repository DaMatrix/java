package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

class ExtraData extends Type
{

    public int key;
    public short value;

    public ExtraData()
    {
    }

    public ExtraData(int key, short value)
    {
        this.key = key;
        this.value = value;
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