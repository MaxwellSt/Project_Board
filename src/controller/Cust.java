package controller;

import entity.User;
import org.omg.PortableInterceptor.USER_EXCEPTION;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Макс on 17.05.2015.
 */
public class Cust {

    public static int i = 0;

    public static void main(String[] args) {
        User user = new User(23, "dfsd");
        System.out.println(user);
    }
    public Cust(){
        System.out.println("Constructor" + (++i));
    }
}
