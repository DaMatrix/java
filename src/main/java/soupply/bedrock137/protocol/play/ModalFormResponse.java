package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class ModalFormResponse extends soupply.bedrock137.Packet
{

    public static final int ID = 101;

    public int formId;
    public String data;

    public ModalFormResponse()
    {
    }

    public ModalFormResponse(int formId, String data)
    {
        this.formId = formId;
        this.data = data;
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