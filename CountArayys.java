
package array;
import java.util.Scanner;


public class CountArayys {
    
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
        
        System.out.print("Nhap so can dem: ");
        int numbers = scanner.nextInt();
        
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numbers) {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua " + numbers + " la: " + count);
        
        
        
    }
}
