package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class BlockEvent extends soupply.bedrock.Packet
{

    public static final int ID = 26;

    public soupply.bedrock.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
        this.position = new soupply.bedrock.type.BlockPosition();
        this.data = new int[2];
    }

    public BlockEvent(soupply.bedrock.type.BlockPosition position, int[] data)
    {
        this.position = position;
        this.data = data;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        position.encodeBody(_buffer);
        for(int zfy:data)
        {
            _buffer.writeVarint(zfy);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.decodeBody(_buffer);
        for(int zfy=0;zfy<data.length;zfy++)
        {
            data[zfy] = _buffer.readVarint();
        }
    }

    public static BlockEvent fromBuffer(byte[] buffer)
    {
        BlockEvent packet = new BlockEvent();
        packet.safeDecode(buffer);
        return packet;
    }

}
