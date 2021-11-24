import java.util.*;
import java.io.*;

public class PracticeLinkedLists{
    public static void main(String[] args) {
        LinkedList<Integer> mylist = new LinkedList<>();
        for(int i = 0; i < 10; i++){
            mylist.add(i+1);
        }
        System.out.println(mylist);
        mylist.set(1,123);
        System.out.println(mylist);

    }
}