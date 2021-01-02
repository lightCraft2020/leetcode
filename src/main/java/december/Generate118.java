package december;

import java.util.ArrayList;
import java.util.List;

public class Generate118 {

    public static List<Integer> generateSub(int numRows) {
        List<Integer> list = new ArrayList<>();
        if(1==numRows){
            list.add(1);
            return list;
        } else{
            List<Integer> list1 = generateSub(numRows-1);
            list.add(1);
            for (int i = 0; i < numRows-2 ; i++) {
                int item1 = list1.get(i);
                int item2 = list1.get(i+1);
                list.add(item1+item2);
            }
            list.add(1);
            return list;
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(1==numRows){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list.add(list1);
            return list;
        } else {
            for (int i = 1; i <= numRows ; i++) {
                List<Integer> list1 = generateSub(i);
                list.add(list1);
            }
            return list;
        }
    }

    public static List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(1==numRows){
            List<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list.add(list1);
            return list;
        } else{
            List<Integer> list1 = new ArrayList<>();
            list = generate(numRows-1);
            List<Integer> list2 = list.get(numRows-2);
            list.add(list1);
            list1.add(1);
            for (int i = 0; i < numRows-2 ; i++) {
                Integer item1 = list2.get(i);
                Integer item2 = list2.get(i+1);
                list1.add(item1+item2);
            }
            list1.add(1);
            return list;
        }
    }


    public static List<Integer> getRow(int numRows) {
        List<Integer> list = new ArrayList<>();
        if(0==numRows){
            list.add(1);
            return list;
        } else {
            List<Integer> list1 = getRow(numRows-1);
            list.add(1);
            for (int i = 0; i < numRows-1 ; i++) {
                int item1 = list1.get(i);
                int item2 = list1.get(i+1);
                list.add(item1+item2);
            }
            list.add(1);
            return list;
        }
    }

    public static void main(String[] args) {
       // List<List<Integer>> list  = generate(5);
        System.out.println(getRow(3));

    }
}
