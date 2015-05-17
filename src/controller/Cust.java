package controller;

/**
 * Created by Макс on 17.05.2015.
 */
public class Cust {

    public static int i = 0;

    public Cust(){
        System.out.println("Constructor" + (++i));
    }
}
