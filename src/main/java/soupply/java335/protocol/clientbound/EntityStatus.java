package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityStatus extends soupply.java335.Packet
{

    public static final int ID = 27;

    // status
    public static final byte SPAWN_TIPPED_ARROW_PARTICLE_EFFECTS = 0;
    public static final byte PLAY_JUMPING_ANIMATION_AND_PARTICLES = 1;
    public static final byte RESET_SPAWNER_DELAY = 1;
    public static final byte PLAY_HURT_ANIMATION_AND_SOUND = 2;
    public static final byte PLAY_DEATH_ANIMATION_AND_SOUND = 3;
    public static final byte PLAY_ATTACK_ANIMATION_AND_SOUND = 4;
    public static final byte SPAWN_SMOKE_PARTICLES = 6;
    public static final byte SPAWN_HEART_PARTICLES = 7;
    public static final byte PLAY_SHAKING_WATER_ANIMATION = 8;
    public static final byte FINISHED_CONSUMING = 9;
    public static final byte PLAY_EATING_GRASS_ANIMATION = 10;
    public static final byte IGNITE_MINECART_TNT = 10;
    public static final byte HOLD_POPPY = 11;
    public static final byte SPAWN_VILLAGER_MATING_HEART_PARTICLES = 12;
    public static final byte SPAWN_VILLAGER_ANGRY_PARTICLES = 13;
    public static final byte SPAWN_VILLAGER_HAPPY_PARTICLES = 14;
    public static final byte SPAWN_WITCH_MAGIC_PARTICLES = 15;
    public static final byte PLAY_ZOMBIE_CURE_FINISHED_SOUND = 16;
    public static final byte SPAWN_FIREWORK_EXPLOSION_EFFECT = 17;
    public static final byte SPAWN_LOVE_PARTICLES = 18;
    public static final byte RESET_SQUID_ROTATION = 19;
    public static final byte SPAWN_EXPLOSION_PARTICLES = 20;
    public static final byte PLAY_GUARDIAN_SOUND_EFFECT = 21;
    public static final byte ENABLE_REDUCED_DEBUG_SCREEN = 22;
    public static final byte DISABLE_REDUCED_DEBUG_SCREEN = 23;
    public static final byte SET_OP_PERMISSION_LEVEL_0 = 24;
    public static final byte SET_OP_PERMISSION_LEVEL_1 = 25;
    public static final byte SET_OP_PERMISSION_LEVEL_2 = 26;
    public static final byte SET_OP_PERMISSION_LEVEL_3 = 27;
    public static final byte SET_OP_PERMISSION_LEVEL_4 = 28;
    public static final byte PLAY_SHIELD_BLOCK_SOUND = 29;
    public static final byte PLAY_SHIELD_BREAK_SOUND = 30;
    public static final byte HOOK_KNOCKBACK = 31;
    public static final byte PLAY_HIT_SOUND = 32;
    public static final byte PLAY_THORNS_HURT_ANIMATION_AND_SOUND = 33;
    public static final byte REMOVE_POPPY = 34;
    public static final byte PLAY_TOTEM_UNDYING_ANIMATION = 35;

    public int entityId;
    public byte status;

    public EntityStatus()
    {
    }

    public EntityStatus(int entityId, byte status)
    {
        this.entityId = entityId;
        this.status = status;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
