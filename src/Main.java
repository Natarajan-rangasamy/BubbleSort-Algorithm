import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bubble sort algorithm----------!");
        System.out.println("Enter the array length");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i<length; i++){
            arr[i]= sc.nextInt();
        }
        boolean swap = true;
        while(swap){

            swap = false;
            for(int i=0; i<arr.length-1;i++){

                if(arr[i] > arr[i+1]){
                    swap = true;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
        }

        System.out.println("After sorting");
        for(int i = 0;i < arr.length; i++){

            System.out.println(arr[i]);
        }
    }
}