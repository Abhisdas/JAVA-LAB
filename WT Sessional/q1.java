

class shape{
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erase shape");
    }
}
class circle extends shape{
    public void draw(){
        System.out.println("Drawing circle");
    }
    public void erase(){
        System.out.println("Erase Circle");
    }
}
class triangle extends shape{
    public void draw(){
        System.out.println("Drawing triangle");
    }
    public void erase(){
        System.out.println("Erase triangle");
    }
}
class square extends shape{
    public void draw(){
        System.out.println("Drawing square");
    }
    public void erase(){
        System.out.println("Erase square");
    }
}
public class q1 {
    public static void main(String[] args) {
        shape c = new circle();
        shape t = new triangle();
        shape s = new square();

        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();
    }
}