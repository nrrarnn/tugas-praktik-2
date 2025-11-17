/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author NURARINI
 */
public class MergeSortDescending {
    public static void main(String[] args) {
        int[] data = {45, 12, 78, 34, 89, 56, 23, 90};
        
        System.out.println("Data sebelum di urutkan: ");
        printArray(data);
        
        mergeSort(data, 0, data.length - 1);
        
        System.out.println("\nData setelah diurutkan dari terbesar ke terkecil: ");
        printArray(data);
        
    }
    
    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for(int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for(int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];
        
        int i = 0, j= 0, k = left;
        
        while(i < n1 && j < n2){
            if(L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    
}
