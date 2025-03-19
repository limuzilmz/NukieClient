package net.nukie;

import org.lwjgl.opengl.Display;

public class Client {
    public static String Name = "Nukie Client";
    public static String Version = "1.0";
    public static void Start(){
        Display.setTitle(Name + " " + Version);
    }

    public static void Stop(){

    }
}
