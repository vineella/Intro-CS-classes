import java.util.*;

public class SummerLab3 {
   public static void main(String[] args) {
        Sortinglab3 l1 = new Sortinglab3();
        Sortinglab3 l2 = new Sortinglab3();
        Sortinglab3 l3 = new Sortinglab3();
        Sortinglab3 l4 = new Sortinglab3();

        int[] list1 = {33, -29, -81, 24, 92, -89, 69, 45, 77, -46, 59, 53, 57, 69, -60, 62, 71, -91, -50, 13};
        System.out.println("Originals Array: ");
            for (int i = 0; i < list1.length; i++){
            System.out.print(list1[i] + "  ");
        }
        System.out.println();
        System.out.println();

        System.out.println("BubbleSort: ");
        System.out.println(l1.bubbleSort(list1) + " swaps");
        System.out.print("Output: ");
        for (int i = 0; i < list1.length; i++){
            System.out.print(list1[i] + "  ");
        }
        System.out.println();
        System.out.println();


        int[] list2 = {33, -29, -81, 24, 92, -89, 69, 45, 77, -46, 59, 53, 57, 69, -60, 62, 71, -91, -50, 13};
        System.out.println("InsertionSort: ");
        System.out.println(l2.insertionSort(list2) + " swaps");
        System.out.print("Output: ");
        for (int i = 0; i < list2.length; i++){
            System.out.print(list2[i] + "  ");
        }
        System.out.println();
        System.out.println();


        int[] list3 = {33, -29, -81, 24, 92, -89, 69, 45, 77, -46, 59, 53, 57, 69, -60, 62, 71, -91, -50, 13};
        System.out.println("MergeSort: ");
        System.out.println(l3.mergeSort(list3) + " swaps");
        System.out.print("Output: ");
        for (int i = 0; i < list3.length; i++){
            System.out.print(list3[i] + "  ");
        }
        System.out.println();
        System.out.println();


        int[] list4 = {33, -29, -81, 24, 92, -89, 69, 45, 77, -46, 59, 53, 57, 69, -60, 62, 71, -91, -50, 13};
        System.out.println("QuickSort: ");
        System.out.println(l4.quickSort(list4) + " swaps");
        System.out.print("Output: ");
        for (int i = 0; i < list4.length; i++){
            System.out.print(list4[i] + "  ");
        }
        System.out.println();
        System.out.println();
   } 

}
