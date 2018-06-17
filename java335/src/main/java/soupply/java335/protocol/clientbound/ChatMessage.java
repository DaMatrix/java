package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ChatMessage extends soupply.java335.Packet
{

    public static final int ID = 15;

    // position
    public static final byte CHAT = (byte)0;
    public static final byte SYSTEM_MESSAGE = (byte)1;
    public static final byte ABOVE_HOTBAR = (byte)2;

    public String message;
    public byte position;

    public ChatMessage()
    {
    }

    public ChatMessage(String message, byte position)
    {
        this.message = message;
        this.position = position;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bvcfz = _buffer.convertString(message);
        _buffer.writeVaruint((int)bvcfz.length);
        _buffer.writeBytes(bvcfz);
        _buffer.writeBigEndianByte(position);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbvcfz = _buffer.readVaruint();
        message = _buffer.readString(bvbvcfz);
        position = _buffer.readBigEndianByte();
    }

    public static ChatMessage fromBuffer(byte[] buffer)
    {
        ChatMessage packet = new ChatMessage();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
