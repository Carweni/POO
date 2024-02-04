import java.util.Random;

public class VetorOrdenado {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(20); 
        }
        
        System.out.println("Vetor original:");
        printArray(vetor);
        
        bubbleSort(vetor);
        
        System.out.println("\nVetor ordenado:");
        printArray(vetor);
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
