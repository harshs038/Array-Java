import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int s = input.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            System.out.print("Enter the " + i + "th element of array : ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < s; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 2;
            } else {
                arr[i] += 10;
            }
        }
        System.out.print("The new array is : ");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}