/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author NURARINI
 */
public class CountingSortDescending {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] data = {7,2,4,1,6,3,5,4};
      
      System.out.println("Sebelum di urutkan : ");
      printArray(data);
      
      countingSort(data);
      
      System.out.println("Setelah di urutkan : ");
      printArray(data);
    }
    
    static void countingSort(int[] arr) {
        int max = arr[0];
        for (int num : arr){
            if(num > max) max = num;
        }
        
        int[] count = new int[max + 1];
        
        for(int num : arr) count[num]++;
        
        int index = 0;
        
        for(int i = count.length - 1; i >= 0; i--) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }
    
    static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    
}
