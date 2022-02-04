
package university;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ChangeStyle {
    
    String style[] = {  "com.jtattoo.plaf.mcwin.McWinLookAndFeel",
                        "com.jtattoo.plaf.smart.SmartLookAndFeel",
                        "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel",
                        "com.jtattoo.plaf.acryl.AcrylLookAndFeel",
                        "com.jtattoo.plaf.aero.AeroLookAndFeel",
                        "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel",
                        "com.jtattoo.plaf.graphite.GraphiteLookAndFeel",
                        "com.jtattoo.plaf.fast.FastLookAndFeel",
                        "com.jtattoo.plaf.hifi.HifiLookAndFeel",
                        "com.jtattoo.plaf.luna.LunaLookAndFeel",   
                        "com.jtattoo.plaf.mint.MintLookAndFeel",
                        "com.jtattoo.plaf.noire.NoireLookAndFeel"
    };
    
    public void LookAndFeel(int index){
        try {
            UIManager.setLookAndFeel(style[index]);
        } catch ( NoClassDefFoundError | ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }
    
    public void LookAndFeel(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }
}

