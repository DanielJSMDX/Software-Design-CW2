import java.util.ArrayList;
import java.util.Arrays;

// NOTE: ALL print statements are for seeing the steps after running code, final version will not have any prints/returns unless needed.
public class Main {
    public static final ArrayList<String> final_list = new ArrayList<>();

    public static void main(String[] args) {
        //this method is to make the two main halves of the starting list, it will account for lists of odd lengths
        ArrayList<String> m_list = new ArrayList<>(Arrays.asList("c", "a"));
        splitter(m_list, final_list); //sends the "first" half of the list into the splitter function

    }

    public static void splitter(ArrayList<String> list, ArrayList<String> FINAL_LIST) { // starts with the original list given
        ArrayList<String> final_list = new ArrayList<>();
        final_list.addAll(FINAL_LIST);
        int hw_mark = (int) Math.ceil(list.size()) / 2;
        ArrayList<String> part1 = new ArrayList<>(); // assigns empty lists that later get filled with the two halves of the list respectively
        ArrayList<String> part2 = new ArrayList<>();
        if (list.size() >= 2) { //checks if the list has 2 elements inside it, and if so, proceed with the for loop, and if not, then
            for (int pos = 0; pos <= list.size() - 1; pos++) {
                if (pos < hw_mark) {
                    part1.add(list.get(pos));
                } else {
                    part2.add(list.get(pos));
                }
            }
            System.out.println("split list, now checking if they can go to be compared");
            System.out.println("part 1 contains: " + part1 + " and part 2 contains " + part2 + ", and the final list so far contains " + final_list);
            if (part1.size() == 1 && part2.size() == 1) {
                final_list.addAll(part1);
                final_list.addAll(part2);
                System.out.println("final_list is: " + final_list);
            }
            System.out.println("proceeding to compare");
        }
        if (part1.size() == 1) {
            System.out.println("adding part 1 to final list, final list now contains " + final_list);
            final_list.addAll(part1);
            System.out.println("final_list is: " + final_list);

        } else {
            System.out.println("proceeding to split part 1");
            splitter(part1, final_list);
        }
        if (part2.size() == 1) {
            System.out.println("adding part 2 to final list, final list now contains " + final_list);
            final_list.addAll(part2);
            System.out.println("final_list is: " + final_list);
        } else {
            System.out.println("proceeding to split part 2");
            splitter(part2, final_list);
        }


    }
}