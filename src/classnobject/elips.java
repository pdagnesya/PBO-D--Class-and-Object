
package classNobject;

public class elips {
    public double majorAxis,  minorAxis;
    public double phi= 3.14;
    public  elips (double majorAxis, double minorAxis){
        this.majorAxis=majorAxis;
        this.minorAxis=minorAxis;
    }
    
    
    public double areaElips(){
        double area;
        area = this.phi * this.majorAxis * this.minorAxis;
        return area;
    }
    public double perimeterElips(){
        double perimeter;
        perimeter = this.phi * (this.majorAxis + this.minorAxis);
        return perimeter;
    }
}
