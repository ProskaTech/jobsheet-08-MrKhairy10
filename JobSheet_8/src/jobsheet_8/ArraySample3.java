/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package jobsheet_8;

/**
 *
 * @author ASUS
 */

public class ArraySample3 {
    public static void main(String[] args) {
        //String array 4 baris x 2 kolom
        String[][] dogs = {{"Terry", "brown"}, //baris ke 0
                           {"Kristin", "white"}, //baris ke 1
                           {"Toby", "gray"}, //baris ke 2
                           {"Fido", "black"} //baris ke 3
                          };
        System.out.println(dogs[0][0]);
        //mengakses variabel dogs dengan indeks baris 0, indeks kolom 0
    }
}