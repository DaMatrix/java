package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ClientStatus extends soupply.java338.Packet
{

    public static final int ID = 3;

    // action
    public static final int RESPAWN = (int)0;
    public static final int REQUEST_STATS = (int)1;

    public int action;

    public ClientStatus()
    {
    }

    public ClientStatus(int action)
    {
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readVaruint();
    }

    public static ClientStatus fromBuffer(byte[] buffer)
    {
        ClientStatus packet = new ClientStatus();
        packet.safeDecode(buffer);
        return packet;
    }

}
