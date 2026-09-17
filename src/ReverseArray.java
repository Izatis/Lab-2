import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Random rand = new Random(10);
        int[] list = new int[11];
        for (int i = 0; i < list.length; i++) {
            list[i] = 1 + rand.nextInt(100);
        }
        System.out.println("Original Array");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        reverseArray(list);
        System.out.println("Reversed Array using iteration");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        reverseArrayRecursive(list);
        System.out.println("Reversed Array using recursion");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n\nSecond Test\n\n");
        int[] list2 = new int[10];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = 1 + rand.nextInt(100);
        }
        System.out.println("Original Array");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        reverseArray(list2);
        System.out.println("Reversed Array using iteration");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
        System.out.println();
        reverseArrayRecursive(list2);
        System.out.println("Reversed Array using recursion");
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
    }

    public static void reverseArray(int[] list) {
// Left as Exercise
        int left = 0;
        int right = list.length - 1;

        while (left < right) {
            int temporary = list[left];
            list[left] = list[right];
            list[right] = temporary;
            left++;
            right--;
        }
    }

    public static void reverseArrayRecursive(int[] list) {
// Left as Exercise
        reverseArrayRecursive(list, 0, list.length - 1);
    }

    private static void reverseArrayRecursive(int[] list, int left, int right) {
        if (left >= right) {
            return;
        }
        int temporary = list[left];
        list[left] = list[right];
        list[right] = temporary;
        reverseArrayRecursive(list, left + 1, right - 1);
    }
}