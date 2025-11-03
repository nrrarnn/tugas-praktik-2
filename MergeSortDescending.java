public class MergeSortDescending {

    // Fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        int[] data = {45, 12, 78, 34, 89, 56, 23, 90};

        System.out.println("Data sebelum diurutkan:");
        printArray(data);

        mergeSort(data, 0, data.length - 1);

        System.out.println("\nData setelah diurutkan (terbesar ke terkecil):");
        printArray(data);
    }

    // Fungsi rekursif untuk merge sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Fungsi untuk menggabungkan dua bagian array
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Ubah tanda pembanding agar hasilnya descending
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Menyalin sisa elemen
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Fungsi untuk mencetak array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
