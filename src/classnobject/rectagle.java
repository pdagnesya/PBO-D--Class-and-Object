/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classNobject;


public class rectagle {
    public int lenght, width;
    public  rectagle(int length, int width){
        this.lenght=length;
        this.width=width;
    }
    
    public int areaRectagle(){
        int area;
        area=this.lenght * this.width;
        return area;
    }
    public int perimeterRectagle(){
        int perimeter;
        perimeter=(this.lenght+this.width)*2;
        return perimeter;
    }
}
