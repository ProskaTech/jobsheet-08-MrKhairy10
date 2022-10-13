/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package jobsheet_8;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */

public class Tugas2 {
    public static void main(String[]args){
        int[] a = new int[10];
        String[] n = new String[10];
        int terbesar = 0;

        for(int i = 1; i + 1 <= a.length; i++){
            System.out.println(i);
            n[i] = JOptionPane.showInputDialog("Masukkan angka ke-"+i+" :");
            a[i] = Integer.parseInt(n[i]);

            if(terbesar > a[i]){
                if(terbesar > a[i]){
                    System.out.println(terbesar);
                }
            }
            else{
                if(a[i] > a[i-1]){
                    terbesar = a[i];
                }
                else{
                    terbesar = a[i-1];
                }
                System.out.println(terbesar);
            }
        }
        String hasil= "Input Terbesar adalah "+terbesar;

        JOptionPane.showMessageDialog(null,hasil);       
    }
}
