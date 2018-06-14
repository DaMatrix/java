package soupply.java316.login;

import java.util.*;
import soupply.util.*;

class EncryptionResponse extends soupply.java316.Packet
{

    public byte[] sharedSecret;
    public byte[] verifyToken;

    public EncryptionResponse()
    {
    }

    public EncryptionResponse(byte[] sharedSecret, byte[] verifyToken)
    {
        this.sharedSecret = sharedSecret;
        this.verifyToken = verifyToken;
    }

}