package Spring;

class Cons_Addition{
    private int x;
    private int y;
    public Cons_Addition(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("This is Int Constructor ");
    }

    public Cons_Addition(String x, String y) {
        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);

        System.out.println("This is String Constructor ");
    }


    public void Sum(){
    
        System.out.println("Sum of two numbers is: "+(x+y));
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "Cons_Addition [x=" + x + ", y=" + y + "]";
    }

    
}