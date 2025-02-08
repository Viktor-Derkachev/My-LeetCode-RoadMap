package main.tasks.mergeTwoSortedList;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeTwoSortedListSolution {


    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));
        System.out.println("Output: [1, 1, 2, 3, 4, 4], actually:" + mergeTwoLists(list1, list2));
    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int indexList1 = 0;
        int indexList2 = 0;

        LinkedList<Integer> result = new LinkedList<>();

        while (indexList1 < list1.size() && indexList2 < list2.size()) {
            if (list1.get(indexList1) <= list2.get(indexList2)) {
                result.add(list1.get(indexList1));
                indexList1++;
            } else {
                result.add(list2.get(indexList2));
                indexList2++;
            }

        }

        if (indexList1 == list1.size()) {
            for (int i = indexList2; i < list2.size(); i++) {
                result.add(list2.get(i));
            }
        } else {
            for (int i = indexList1; i < list1.size(); i++) {
                result.add(list1.get(i));
            }
        }

        return result;
    }
}
