package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class VehicleMove extends soupply.java338.Packet
{

    public static final int ID = 16;

    public DoubleXYZ position;
    public float yaw;
    public float pitch;

    public VehicleMove()
    {
        this.position = new DoubleXYZ();
    }

    public VehicleMove(DoubleXYZ position, float yaw, float pitch)
    {
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
        _buffer.writeBigEndianFloat(yaw);
        _buffer.writeBigEndianFloat(pitch);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        yaw = _buffer.readBigEndianFloat();
        pitch = _buffer.readBigEndianFloat();
    }

    public static VehicleMove fromBuffer(byte[] buffer)
    {
        VehicleMove packet = new VehicleMove();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
