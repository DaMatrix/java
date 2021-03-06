package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class LevelSoundEvent extends soupply.bedrock137.Packet
{

    public static final int ID = 24;

    // sound
    public static final byte ITEM_USE_ON = (byte)0;
    public static final byte HIT = (byte)1;
    public static final byte STEP = (byte)2;
    public static final byte FLY = (byte)3;
    public static final byte JUMP = (byte)4;
    public static final byte BREAK = (byte)5;
    public static final byte PLACE = (byte)6;
    public static final byte HEAVY_STEP = (byte)7;
    public static final byte GALLOP = (byte)8;
    public static final byte FALL = (byte)9;
    public static final byte AMBIENT = (byte)10;
    public static final byte AMBIENT_BABY = (byte)11;
    public static final byte AMBIENT_IN_WATER = (byte)12;
    public static final byte BREATHE = (byte)13;
    public static final byte DEATH = (byte)14;
    public static final byte DEATH_IN_WATER = (byte)15;
    public static final byte DEATH_TO_ZOMBIE = (byte)16;
    public static final byte HURT = (byte)17;
    public static final byte HURT_IN_WATER = (byte)18;
    public static final byte MAD = (byte)19;
    public static final byte BOOST = (byte)20;
    public static final byte BOW = (byte)21;
    public static final byte SQUISH_BIG = (byte)22;
    public static final byte SQUISH_SMALL = (byte)23;
    public static final byte FALL_BIG = (byte)24;
    public static final byte FALL_SMALL = (byte)25;
    public static final byte SPLASH = (byte)26;
    public static final byte FIZZ = (byte)27;
    public static final byte FLAP = (byte)28;
    public static final byte SWIM = (byte)29;
    public static final byte DRINK = (byte)30;
    public static final byte EAT = (byte)31;
    public static final byte TAKEOFF = (byte)32;
    public static final byte SHAKE = (byte)33;
    public static final byte PLOP = (byte)34;
    public static final byte LAND = (byte)35;
    public static final byte SADDLE = (byte)36;
    public static final byte ARMOR = (byte)37;
    public static final byte ADD_CHEST = (byte)38;
    public static final byte THROW = (byte)39;
    public static final byte ATTACK = (byte)40;
    public static final byte ATTACK_NODAMAGE = (byte)41;
    public static final byte WARN = (byte)42;
    public static final byte SHEAR = (byte)43;
    public static final byte MILK = (byte)44;
    public static final byte THUNDER = (byte)45;
    public static final byte EXPLODE = (byte)46;
    public static final byte FIRE = (byte)47;
    public static final byte IGNITE = (byte)48;
    public static final byte FUSE = (byte)49;
    public static final byte STARE = (byte)50;
    public static final byte SPAWN = (byte)51;
    public static final byte SHOOT = (byte)52;
    public static final byte BREAK_BLOCK = (byte)53;
    public static final byte LAUNCH = (byte)54;
    public static final byte BLAST = (byte)55;
    public static final byte LARGE_BLAST = (byte)56;
    public static final byte TWINKLE = (byte)57;
    public static final byte REMEDY = (byte)58;
    public static final byte UNFECT = (byte)59;
    public static final byte LEVELUP = (byte)60;
    public static final byte BOW_HIT = (byte)61;
    public static final byte BULLET_HIT = (byte)62;
    public static final byte EXTINGUISH_FIRE = (byte)63;
    public static final byte ITEM_FIZZ = (byte)64;
    public static final byte CHEST_OPEN = (byte)65;
    public static final byte CHEST_CLOSED = (byte)66;
    public static final byte SHULKER_BOX_OPEN = (byte)67;
    public static final byte SHULKER_BOX_CLOSE = (byte)68;
    public static final byte POWER_ON = (byte)69;
    public static final byte POWER_OFF = (byte)70;
    public static final byte ATTACH = (byte)71;
    public static final byte DETACH = (byte)72;
    public static final byte DENY = (byte)73;
    public static final byte TRIPOD = (byte)74;
    public static final byte POP = (byte)75;
    public static final byte DROP_SLOT = (byte)76;
    public static final byte NOTE = (byte)77;
    public static final byte THORNS = (byte)78;
    public static final byte PISTON_IN = (byte)79;
    public static final byte PISTON_OUT = (byte)80;
    public static final byte PORTAL = (byte)81;
    public static final byte WATER = (byte)82;
    public static final byte LAVA_POP = (byte)83;
    public static final byte LAVA = (byte)84;
    public static final byte BURP = (byte)85;
    public static final byte BUCKET_FILL_WATER = (byte)86;
    public static final byte BUCKET_FILL_LAVA = (byte)87;
    public static final byte BUCKET_EMPTY_WATER = (byte)88;
    public static final byte BUCKET_EMPTY_LAVA = (byte)89;
    public static final byte RECORD_13 = (byte)90;
    public static final byte RECORD_CAT = (byte)91;
    public static final byte RECORD_BLOCKS = (byte)92;
    public static final byte RECORD_CHIRP = (byte)93;
    public static final byte RECORD_FAR = (byte)94;
    public static final byte RECORD_MALL = (byte)95;
    public static final byte RECORD_MELLOHI = (byte)96;
    public static final byte RECORD_STAL = (byte)97;
    public static final byte RECORD_STRAD = (byte)98;
    public static final byte RECORD_WARD = (byte)99;
    public static final byte RECORD_11 = (byte)100;
    public static final byte RECORD_WAIT = (byte)101;
    public static final byte GUARDIAN_FLOP = (byte)103;
    public static final byte ELDERGUARDIAN_CURSE = (byte)104;
    public static final byte MOB_WARNING = (byte)105;
    public static final byte MOB_WARNING_BABY = (byte)106;
    public static final byte TELEPORT = (byte)107;
    public static final byte SHULKER_OPEN = (byte)108;
    public static final byte SHULKER_CLOSE = (byte)109;
    public static final byte HAGGLE = (byte)110;
    public static final byte HAGGLE_YES = (byte)111;
    public static final byte HAGGLE_NO = (byte)112;
    public static final byte HAGGLE_IDLE = (byte)113;
    public static final byte CHORUS_GROW = (byte)114;
    public static final byte CHORUS_DEATH = (byte)115;
    public static final byte GLASS = (byte)116;
    public static final byte CAST_SPELL = (byte)117;
    public static final byte PREPARE_ATTACK = (byte)118;
    public static final byte PREPARE_SUMMON = (byte)119;
    public static final byte PREPARE_WOLOLO = (byte)120;
    public static final byte FANG = (byte)121;
    public static final byte CHARGE = (byte)122;
    public static final byte CAMERA_TAKE_PICTURE = (byte)123;
    public static final byte LEASHKNOT_PLACE = (byte)124;
    public static final byte LEASHKNOT_BREAK = (byte)125;
    public static final byte GROWL = (byte)126;
    public static final byte WHINE = (byte)127;
    public static final byte PANT = (byte)128;
    public static final byte PURR = (byte)129;
    public static final byte PURREOW = (byte)130;
    public static final byte DEATH_MIN_VOLUME = (byte)131;
    public static final byte DEATH_MID_VOLUME = (byte)132;
    public static final byte INITIATE_BLAZE = (byte)133;
    public static final byte INITIATE_CAVE_SPIDER = (byte)134;
    public static final byte INITIATE_CREEPER = (byte)135;
    public static final byte INITIATE_ELDER_GUARDIAN = (byte)136;
    public static final byte INITIATE_ENDER_DRAGON = (byte)137;
    public static final byte INITIATE_ENDERMAN = (byte)138;
    public static final byte INITIATE_EVOCATION_ILLAGER = (byte)140;
    public static final byte INITIATE_GHAST = (byte)141;
    public static final byte INITIATE_HUSK = (byte)142;
    public static final byte INITIATE_ILLUSION_ILLAGER = (byte)143;
    public static final byte INITIATE_MAGMA_CUBE = (byte)144;
    public static final byte INITIATE_POLAR_BEAR = (byte)145;
    public static final byte INITIATE_SHULKER = (byte)146;
    public static final byte INITIATE_SILVERFISH = (byte)147;
    public static final byte INITIATE_SKELETON = (byte)148;
    public static final byte INITIATE_SLIME = (byte)149;
    public static final byte INITIATE_SPIDER = (byte)150;
    public static final byte INITIATE_STRAY = (byte)151;
    public static final byte INITIATE_VEX = (byte)152;
    public static final byte INITIATE_VINDICATION_ILLAGER = (byte)153;
    public static final byte INITIATE_WITCH = (byte)154;
    public static final byte INITIATE_WITHER = (byte)155;
    public static final byte INITIATE_WITHER_SKELETON = (byte)156;
    public static final byte INITIATE_WOLF = (byte)157;
    public static final byte INITIATE_ZOMBIE = (byte)158;
    public static final byte INITIATE_ZOMBIE_PIGMAN = (byte)159;
    public static final byte INITIATE_ZOMBIE_VILLAGER = (byte)160;
    public static final byte DEFAULT = (byte)161;
    public static final byte UNDEFINED = (byte)162;

    public byte sound;
    public FloatXYZ position;
    public int volume;
    public int pitch;
    public boolean unknown4;
    public boolean disableRelativeVolume;

    public LevelSoundEvent()
    {
        this.position = new FloatXYZ();
    }

    public LevelSoundEvent(byte sound, FloatXYZ position, int volume, int pitch, boolean unknown4, boolean disableRelativeVolume)
    {
        this.sound = sound;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
        this.unknown4 = unknown4;
        this.disableRelativeVolume = disableRelativeVolume;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(sound);
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeVaruint(volume);
        _buffer.writeVarint(pitch);
        _buffer.writeBool(unknown4);
        _buffer.writeBool(disableRelativeVolume);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        sound = _buffer.readByte();
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        volume = _buffer.readVaruint();
        pitch = _buffer.readVarint();
        unknown4 = _buffer.readBool();
        disableRelativeVolume = _buffer.readBool();
    }

    public static LevelSoundEvent fromBuffer(byte[] buffer)
    {
        LevelSoundEvent packet = new LevelSoundEvent();
        packet.safeDecode(buffer);
        return packet;
    }

}
