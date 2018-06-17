package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class ChunkData extends Type
{

    public soupply.bedrock.type.Section[] sections;
    public short[] heights;
    public byte[] biomes;
    public byte[] borders;
    public soupply.bedrock.type.ExtraData[] extraData;
    public byte[] blockEntities;

    public ChunkData()
    {
        this.heights = new short[256];
        this.biomes = new byte[256];
    }

    public ChunkData(soupply.bedrock.type.Section[] sections, short[] heights, byte[] biomes, byte[] borders, soupply.bedrock.type.ExtraData[] extraData, byte[] blockEntities)
    {
        this.sections = sections;
        this.heights = heights;
        this.biomes = biomes;
        this.borders = borders;
        this.extraData = extraData;
        this.blockEntities = blockEntities;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)sections.length);
        for(soupply.bedrock.type.Section cvdlbm:sections)
        {
            cvdlbm.encodeBody(_buffer);
        }
        for(short avzhc:heights)
        {
            _buffer.writeLittleEndianShort(avzhc);
        }
        _buffer.writeBytes(biomes);
        _buffer.writeVaruint((int)borders.length);
        _buffer.writeBytes(borders);
        _buffer.writeVaruint((int)extraData.length);
        for(soupply.bedrock.type.ExtraData zhcfyr:extraData)
        {
            zhcfyr.encodeBody(_buffer);
        }
        _buffer.writeBytes(blockEntities);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bnyrb5 = _buffer.readVaruint();
        for(int cvdlbm=0;cvdlbm<sections.length;cvdlbm++)
        {
            sections[cvdlbm].decodeBody(_buffer);
        }
        heights = new short[bhaddm];
        for(int avzhc=0;avzhc<heights.length;avzhc++)
        {
            heights[avzhc] = _buffer.readLittleEndianShort();
        }
        biomes = _buffer.readBytes(biomes.length);
        final int bjcrcm = _buffer.readVaruint();
        borders = _buffer.readBytes(bjcrcm);
        final int bvdjrfy = _buffer.readVaruint();
        for(int zhcfyr=0;zhcfyr<extraData.length;zhcfyr++)
        {
            extraData[zhcfyr].decodeBody(_buffer);
        }
        blockEntities = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

}
