// Java program for implementation of Bubble Sort
public class BubbleSort{
  //mySort is an implementation of BubbleSort with performance of Theta(N^2)
  public static int[] mySort(int[] list, int numValues){
    for (int i = 0; i < numValues - 1; i++){
       for (int j = 0; j < numValues - i - 1; j++){
            if (list[j] > list[j+1]){
                  //swap list[j] and list[j+1]
                  int temp = list[j];
                  list[j] = list[j+1];
                  list[j+1] = temp;
           }
        }
    }
   return list;
}

    // Driver method to test above
    public static void main(String args[])
    {
        int[] list = {6,4,6,3,4,2,1,3,4};
        int[] sortedList = mySort(list, list.length);
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i]+ " ");
    }
        System.out.println();
}
}
