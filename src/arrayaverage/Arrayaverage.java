
package arrayaverage;

import java.util.Scanner;


public class Arrayaverage {

    public static void main(String[] args) {




        int[] a = {24, 25, 24,23,27,30,40};


        int sum = 0;

        for (int b = 0; b < a.length; b++) {

            sum = sum + a[b];
        }
        double promedio = ((double) sum) / a.length;

        int arriba = 0;
        int abajo = 0;

        for (int b = 0; b < a.length; b++) {

            if ((double) a[b] > promedio) {
                arriba++;
            } else if ((double) a[b] < promedio) {
                System.out.println("numero abajo del promedio: "+ a[b]);
                abajo++;
            }
        }

        System.out.println("El promedio de temperatura es" + " " + promedio);

    }
}
