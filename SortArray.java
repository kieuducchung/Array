
package array;
import java.util.Scanner;

public class SortArray {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": " );
            arr[i] = scanner.nextInt();  
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int Min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[Min]) {
                    Min = j; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[Min];
            arr[Min] = temp;
        }
        System.out.println("Phan tu sau khi sap xep: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            
        }
    }
}
