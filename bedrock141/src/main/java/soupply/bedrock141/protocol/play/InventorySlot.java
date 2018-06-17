package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventorySlot extends soupply.bedrock141.Packet
{

    public static final int ID = 50;

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
    }

    public static InventorySlot fromBuffer(byte[] buffer)
    {
        InventorySlot packet = new InventorySlot();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
