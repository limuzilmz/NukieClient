package net.nukie;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.vialoadingbase.ViaLoadingBase;
import de.florianmichael.viamcp.ViaMCP;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;

public class Client {
    public static String Name = "Nukie Client";
    public static String Version = "1.0";
    public static void Start(){
            ViaMCP.create();
            ViaMCP.INSTANCE.initAsyncSlider();
            ViaMCP.INSTANCE.initAsyncSlider(0, 0, 110, 20);
            ViaLoadingBase.getInstance().reload(ProtocolVersion.v1_8);
        System.out.println("Website");
        Sys.openURL("https://github.com/limuzilmz/NukieClient");
        Display.setTitle(Name + " " + Version);
    }

    public static void Stop(){
        System.exit(0);
    }
}
