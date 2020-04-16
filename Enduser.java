interface Notepad {
    
    public abstract void os();
}

class WinOS implements Notepad {
    
    @Override
    public void os() {
        System.out.println("Win OS");
}
}

class MacOS implements Notepad {
    
    @Override
    public void os() {
        System.out.println("Mac OS");
    }
}

class Ubuntu implements Notepad {
    
    @Override
    public void os() {
        System.out.println("Ubuntu");
    }
}
public class Enduser {
    public static void main(String args[]) {
       Notepad note = null;
       note = new WinOS();
       note.os();
       note = new MacOS();
       note.os();
       note = new Ubuntu();
       note.os();
    }
}