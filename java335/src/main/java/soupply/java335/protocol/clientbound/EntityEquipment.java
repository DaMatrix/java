package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityEquipment extends soupply.java335.Packet
{

    public static final int ID = 62;

    public int entityId;
    public int slot;
    public soupply.java335.type.Slot item;

    public EntityEquipment()
    {
        this.item = new soupply.java335.type.Slot();
    }

    public EntityEquipment(int entityId, int slot, soupply.java335.type.Slot item)
    {
        this.entityId = entityId;
        this.slot = slot;
        this.item = item;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        _buffer.writeVaruint(slot);
        item.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        slot = _buffer.readVaruint();
        item.decodeBody(_buffer);
    }

    public static EntityEquipment fromBuffer(byte[] buffer)
    {
        EntityEquipment packet = new EntityEquipment();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
