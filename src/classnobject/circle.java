/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classNobject;
         
public class circle {
    public double radius;
    public double phi= 3.14;
    public  circle (double radius){
        this.radius=radius;
    }
    
    public double areaCircle(){
        double areaLingkaran;
        areaLingkaran = this.phi * this.radius * this.radius;
        return areaLingkaran;
    }
    public double perimeterCircle(){
        double perimeterLingkaran;
        perimeterLingkaran = this.phi * (2 * this.radius);
        return perimeterLingkaran;
    }
    
    
    
}
