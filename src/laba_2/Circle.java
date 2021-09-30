package laba_2;



public class Circle {
    private double square;
    private double circumference;
    private String color;


    public Circle(double s, double ci, String co){
        this.square = s;
        this.circumference = ci;
        this.color = co;
    }

    public double getSquare(){
        return square;
    }
    public double getCircumference(){
        return circumference;
    }
    public String getColor(){
        return color;
    }

    public void setSquare(double s){
        this.square = s;
    }
    public void setCircumference(double ci){
        this.circumference = ci;
    }
    public void setColor(String co){
        this.color = co;
    }

}

