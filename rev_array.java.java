import java.util.Scanner;

public class calcc {
    public static void main(String[] args) {
        int size=10;
        int[] arr=new int[size];
        Scanner adds=new Scanner(System.in);
        for(int i=0; i<size; i++){
            arr[i]=adds.nextInt();
        }
        System.out.println("Original array is ");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reversed array is ");
        for(int i=arr.length-1; i>0; i--){

            System.out.print(arr[i]+" ");
        }
    }
}
