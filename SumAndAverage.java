
package array;
import java.util.Scanner;

public class SumAndAverage {
    
    
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
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        double average = (double) sum / arr.length;

        System.out.println("Tong cac phan tu la: " + sum);
        System.out.println("Trung binh cong la: " + average);
        
        
    }  
}
    
    
