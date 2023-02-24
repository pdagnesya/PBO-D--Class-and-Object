
package classNobject;

public class square {
    public int LengthOfSide;
    public  square (int LengthOfSide ){
        this.LengthOfSide=LengthOfSide;
    }
    
    public int LengthOfSide(){
        int area;
        area=this.LengthOfSide * this.LengthOfSide;
        return area;
    }
    public int calculatePerimeter(){
        int perimeter;
        perimeter = this.LengthOfSide*4;
        return perimeter;
    }
    
}