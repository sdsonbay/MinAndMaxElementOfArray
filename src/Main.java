import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        int[] sortedArray = array;
        Arrays.sort(sortedArray);
        int highestAndSmaller = 0;
        int smallestAndBigger = 0;

        for(var element: sortedArray){
            if(number > element){
                highestAndSmaller = element;
            }
            if(element > number){
                smallestAndBigger = element;
                break;
            }
        }

        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Girilen Sayı: " + number);
        System.out.println("Girilen sayıdan küçük en büyük sayı: " + highestAndSmaller);
        System.out.println("Girilen sayıdan büyük en küçük sayı: " + smallestAndBigger);
    }
}
