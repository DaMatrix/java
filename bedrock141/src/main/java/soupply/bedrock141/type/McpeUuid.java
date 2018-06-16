package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

class McpeUuid extends Type
{

    public long mostSignificantBits;
    public long leastSignificantBits;

    public McpeUuid()
    {
    }

    public McpeUuid(long mostSignificantBits, long leastSignificantBits)
    {
        this.mostSignificantBits = mostSignificantBits;
        this.leastSignificantBits = leastSignificantBits;
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