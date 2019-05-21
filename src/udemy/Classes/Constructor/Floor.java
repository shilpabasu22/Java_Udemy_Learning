package udemy.Classes.Constructor;

public class Floor {
    private double length;
    private double width;
    public Floor(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if(length<0){
            length = 0.0;
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width<0){
            width = 0.0;
        }
        this.width = width;
    }
    public double getArea(){
        return this.length * this.width;
    }
}
