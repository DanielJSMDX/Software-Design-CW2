import java.util.Arrays;
import java.util.ArrayList;


public class Main {
    private static String[] args;

    public static void main(String[] args){
        int [] m_list =  {1,2,3,6,4,5,7};
        int hw_mark = (int) Math.ceil(m_list.length/2);
        ArrayList<Integer> split_list = new ArrayList<>();
        for (int pos = 0; pos <= hw_mark-1; pos++) {
            System.out.println(m_list[pos]);
            split_list.add(pos, m_list[pos]);
        }
        splitter(split_list);
        System.out.println(split_list);

    }

    private static void splitter(ArrayList<Integer> x) {
        System.out.println("I just got executed!" + x);

    }



}