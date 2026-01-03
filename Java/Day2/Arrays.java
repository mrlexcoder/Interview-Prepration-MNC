package Java.Day2;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Hi");

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;    
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        switch (arr.length) {
            case 5:
                System.out.println("Array of length 5");
                break;
            default:
                System.out.println("Array of different length");
        }
    }

abstract class Sample {
    abstract void display();
}    
}
