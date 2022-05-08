/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mpeht
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the size of vector:");
        num = sc.nextInt();
       
        int vector[] = new int[num];
        System.out.print("Enter the values for vector fill: ");
       
        for (int i = 0; i < num; i++) {
            vector[i] = sc.nextInt();
        }
       
        SelectionS(vector, num);
    }

    public static void SelectionS(int vet[], int tam) {
        int i, j, min, aux;
        for (i = 0; i < (tam - 1); i++) {
            min = i;
            for (j = (i + 1); j < tam; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                }
            }
            if (vet[i] != vet[min]) {
                aux = vet[i];
                vet[i] = vet[min];
                vet[min] = aux;
            }
        }
        System.out.print (Arrays.toString(vet) + " - ");
    }
    
}
