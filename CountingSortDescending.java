public class CountingSortDescending {
    public static void main(String[] args) {
        int[] data = {7, 2, 4, 1, 6, 3, 5, 4};

        System.out.println("Sebelum diurutkan:");
        printArray(data);

        countingSort(data);

        System.out.println("Setelah diurutkan (Descending):");
        printArray(data);
    }

    static void countingSort(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }

        int[] count = new int[max + 1];

        // Hitung frekuensi
        for (int num : arr) count[num]++;

        int index = 0;

        // Output dari terbesar ke terkecil
        for (int i = count.length - 1; i >= 0; i--) {
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
