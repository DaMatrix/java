package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class UpdateTrade extends soupply.bedrock141.Packet
{

    public byte window;
    public byte windowType = 15;
    public int unknown2;
    public int unknown3;
    public boolean willing;
    public long trader;
    public long player;
    public String displayName;
    public byte[] offers;

    public UpdateTrade()
    {
    }

    public UpdateTrade(byte window, byte windowType, int unknown2, int unknown3, boolean willing, long trader, long player, String displayName, byte[] offers)
    {
        this.window = window;
        this.windowType = windowType;
        this.unknown2 = unknown2;
        this.unknown3 = unknown3;
        this.willing = willing;
        this.trader = trader;
        this.player = player;
        this.displayName = displayName;
        this.offers = offers;
    }

}