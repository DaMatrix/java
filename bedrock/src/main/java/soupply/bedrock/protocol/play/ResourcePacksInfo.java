package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePacksInfo extends soupply.bedrock.Packet
{

    public static final int ID = 6;

    public boolean mustAccept;
    public soupply.bedrock.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock.type.PackWithSize[] behaviourPacks, soupply.bedrock.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(mustAccept);
        _buffer.writeVaruint((int)behaviourPacks.length);
        for(soupply.bedrock.type.PackWithSize yvyzbvuf:behaviourPacks)
        {
            yvyzbvuf.encodeBody(_buffer);
        }
        _buffer.writeVaruint((int)resourcePacks.length);
        for(soupply.bedrock.type.PackWithSize cvbvyvyn:resourcePacks)
        {
            cvbvyvyn.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        mustAccept = _buffer.readBool();
        final int bjafa9cb = _buffer.readVaruint();
        for(int yvyzbvuf=0;yvyzbvuf<behaviourPacks.length;yvyzbvuf++)
        {
            behaviourPacks[yvyzbvuf].decodeBody(_buffer);
        }
        final int bjc9cnuf = _buffer.readVaruint();
        for(int cvbvyvyn=0;cvbvyvyn<resourcePacks.length;cvbvyvyn++)
        {
            resourcePacks[cvbvyvyn].decodeBody(_buffer);
        }
    }

    public static ResourcePacksInfo fromBuffer(byte[] buffer)
    {
        ResourcePacksInfo packet = new ResourcePacksInfo();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
