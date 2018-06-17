package soupply.java315;

import soupply.util.Buffer;
import soupply.util.BufferOverflowException;

public abstract class Packet extends soupply.util.Packet
{

    public abstract int getId();

    @Override
    public byte[] encode()
    {
        Buffer buffer = new Buffer();
        _buffer.writeVaruint(this.getId());
        this.encodeBody(buffer);
        return buffer.toByteArray();
    }

    @Override
    public void decode(byte[] _buffer) throws BufferOverflowException
    {
        Buffer buffer = new Buffer(_buffer);
        final int _id = _buffer.readVaruint();
        this.decodeBody(buffer);
    }

}
