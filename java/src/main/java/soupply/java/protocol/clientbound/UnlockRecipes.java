package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class UnlockRecipes extends soupply.java.Packet
{

    public static final int ID = 49;

    // action
    public static final int ADD = 1;
    public static final int REMOVE = 2;
    public static final int ADD_WITHOUT_NOTIFICATION = 3;

    public int action;
    public boolean openBook;
    public boolean filtering;
    public int[] recipes;
    public int[] bookRecipes;

    public UnlockRecipes()
    {
    }

    public UnlockRecipes(int action, boolean openBook, boolean filtering, int[] recipes, int[] bookRecipes)
    {
        this.action = action;
        this.openBook = openBook;
        this.filtering = filtering;
        this.recipes = recipes;
        this.bookRecipes = bookRecipes;
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