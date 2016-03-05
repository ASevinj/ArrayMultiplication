/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymultiplication;

/**
 *
 * @author Sevinc
 */
public class ArrayMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO copublic static void main(String[] args) {
        int[][] a= new int[2][3];
        int[][] b= new int[3][4];
        int[][] c= new int[2][4]; 
        for (int i = 0;i < 2;i++) {
            for (int j = 0;j< 3;j++) {
                a[i][j]=(int)(Math.random() * 9 - 1);
                System.out.print(a[i][j] + " ");
            }
           System.out.println();
        }
        for (int i=0;i<3;i++) {
            for (int j=0;j<4;j++) {
                b[i][j]=(int)(Math.random() * 9 - 1);
                System.out.print(b[i][j] + " ");
            }
           System.out.println();
        }
       for (int i = 0;i<a.length;i++) {
            for (int j = 0;j<b[0].length;j++) { 
               for (int k= 0;k<b.length;k++) {
                c[i][j]+=a[i][k]*b[k][j];
               }
            }
    }
    for (int i = 0; i<c.length;i++) {
            for (int j = 0;j<c[0].length;j++) { 
             System.out.print(c[i][j] + " ");
            }
           System.out.println();
        }
}
}