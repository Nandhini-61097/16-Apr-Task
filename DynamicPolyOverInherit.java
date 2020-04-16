class Radio
{
public void activity() {

System.out.println("Base Class");
}
}

class Tv extends Radio
{
public void activity() {

System.out.println("TV Class");
}
}

class Dvd extends Radio
{
public void activity() {

System.out.println("DVD Class");
}
}

public class DynamicPolyOverInherit{
public static void main(String args[]){
Radio dev = new Radio();
dev.activity();
dev = new Tv();
dev.activity();
dev = new Dvd();
dev.activity();
}
}