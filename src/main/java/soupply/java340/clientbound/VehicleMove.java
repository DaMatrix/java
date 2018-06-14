package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class VehicleMove extends soupply.java340.Packet
{

    public Tuples.DoubleXYZ position;
    public float yaw;
    public float pitch;

    public VehicleMove()
    {
    }

    public VehicleMove(Tuples.DoubleXYZ position, float yaw, float pitch)
    {
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
    }

}