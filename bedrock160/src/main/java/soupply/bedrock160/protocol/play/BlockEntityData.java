package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class BlockEntityData extends soupply.bedrock160.Packet
{

    public static final int ID = 56;

    public soupply.bedrock160.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
        this.position = new soupply.bedrock160.type.BlockPosition();
    }

    public BlockEntityData(soupply.bedrock160.type.BlockPosition position, byte[] nbt)
    {
        this.position = position;
        this.nbt = nbt;
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
        _buffer.writeBytes(nbt);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.decodeBody(_buffer);
        nbt = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

    public static BlockEntityData fromBuffer(byte[] buffer)
    {
        BlockEntityData packet = new BlockEntityData();
        packet.safeDecode(buffer);
        return packet;
    }

}
