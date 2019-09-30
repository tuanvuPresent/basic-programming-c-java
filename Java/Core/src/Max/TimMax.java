/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Max;

/**
 *
 * @author TuanVu
 */
import java.util.Scanner;

public class TimMax {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			float a, b;
			a = sc.nextFloat();
			b = sc.nextFloat();
			float c = Math.max(a, b);
//        float c=(a+b)/2 + Math.abs(a-b)/2;			// cách này dùng công thức
			System.out.println("Số lớn nhất là: " + c);
		}
	}
}