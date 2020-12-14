public class RectangleClass {
    double height, width;
    public RectangleClass(){};
    public RectangleClass(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getArea() {
      return  this.width*this.height;
    }
    public double getPerimeter() {
        return 2*(this.height+this.width);
    }
    public String display() {
        return "Rectangle {"+ "width: "+this.width+"; height: "+this.height +"}";
    }
}
