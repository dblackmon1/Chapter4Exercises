package CH4HW.Triangle;

public class IllegalTriangleSideException extends Exception{
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleSideException(double side1, double side2, double side3){
        super("Illegal Triangle Side Exception Occurred");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public IllegalTriangleSideException(String msg){
        super(msg);
    }

}
