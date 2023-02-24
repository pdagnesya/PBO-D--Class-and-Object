package classNobject;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("PUTR DWI AGNESYA (21081010142)");
        
        System.out.println("~~SQUARE~~");
        System.out.print("Input Panjang Sisi :");
        int LengthOfSide = input.nextInt();
        square persegi = new square(LengthOfSide);
        System.out.println("Luas Persegi adalah "+persegi.LengthOfSide());
        System.out.println("Keliling Persegi adalah "+persegi.calculatePerimeter());
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("~~REGTAGLE~~");
        System.out.print("Input Length = ");
        int length = input.nextInt();
        System.out.print("Input Width = ");
        int width = input.nextInt();
        rectagle persegiPanjang = new rectagle(length,width);
        System.out.println("Luas Persegi Panjang adalah "+persegiPanjang.areaRectagle());
        System.out.println("Keliling Persegi Panjang adalah "+persegiPanjang.perimeterRectagle());
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("~~CIRCLE~~");
        System.out.print("Input Radius :");
        double radius = input.nextDouble();
        circle lingkaran = new circle(radius);
        System.out.println("Luas Lingkaran adalah "+lingkaran.areaCircle());
        System.out.println("Keliling Lingkaran adalah "+lingkaran.perimeterCircle());
        
        System.out.println("--------------------------------------------------");
        
        System.out.println("~~ELIPS~~");
        System.out.print("Input Major Axis :");
        double majorAxis = input.nextDouble();
        System.out.print("Input Minor Axis :");
        double minorAxis = input.nextDouble();
        elips oval = new elips(majorAxis, minorAxis);
        System.out.println("Luas Elips adalah "+oval.areaElips());
        System.out.println("Keliling Elips adalah "+oval.perimeterElips());

    }
}
