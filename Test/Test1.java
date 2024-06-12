package Test;

public class Test1 {
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.setA(10);
        System.out.println(t.getA());

    }
}
