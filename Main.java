import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*--------------------------------------------*/

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> arr_num = new ArrayList<Integer>();
        System.out.println("Please enter \n1 to set individual numbers" +
                "\n2 to set collection of numbers" +
                "\n3 to set default array (default array is the 5th exercise array");
        int var = input.nextInt();

        switch (var){
            case 1 :
                while (true){
                    System.out.print("please enter numbers or -1 to exit: ");
                    int num = input.nextInt();
                    if(num == -1)
                        break;
                    arr_num.add(num);
                }
                break;
            case 2:
                System.out.print("please enter collection of numbers ex 22,44,10 : ");
                String collection_num = input.next();
                String [] tem = collection_num.split(",");
                int[] result = Arrays.stream(tem).mapToInt(Integer::parseInt).toArray();
                // For-each loop
                for (int item : result) {
                    arr_num.add(item);
                }
                break;
            case 3:
                int [] arr = {2,3,40,1,5,9,4,10,7};
                for (int item : arr) {
                    arr_num.add(item);
                }
                break;
            default:
                System.out.println("Please try again");
                break;
        }

       /*--------------------------------------------*/

        /*1.Write a Java program to test if the first and the last element of an array of
            integers are same. The length of the array must be greater than or equal to
            2 Test Data: */

        System.out.println(arr_num.getFirst() +", "+arr_num.getLast());
        System.out.println(arr_num.getFirst() == arr_num.getLast() ? "equal" : "Not equal");


        /*2.Write a Java program to find the numbers greater than the average of the
            numbers of a given array.
            Original Array: */

//        int sum = 0 ;
//        int counter = 0 ;
//        // For-each loop
//        for (int item : arr_num) {
//            // process item
//            sum+=item;
//            counter+=1;
//        }
//        float avg = (float)sum/counter;
//
//        System.out.println("The average of the said array is: "+avg+"  The numbers in the said array that are\n" +
//                "greater than the average are:");
//        // For-each loop
//        for (int item : arr_num) {
//            // process item
//            if(item>avg)
//                System.out.print(item+" " );
//        }


        /*
        *3.Write a Java program to get the larger value between first and last
            element of an array of integers.
            Original Array:
        * */


//        System.out.println("array "+ arr_num);
//        System.out.println(arr_num.getFirst() > arr_num.getLast() ? arr_num.getFirst()
//                                                                  : arr_num.getLast());


        /*
        *4.Write a Java program to swap the first and last elements of an array and
           create a new array.
        * */

//        System.out.println("Original array: "+ arr_num);
//        int first = arr_num.getFirst();
//        arr_num.set(0,arr_num.getLast());
//        arr_num.set(arr_num.size()-1,first);
//        System.out.println("swapping array: "+arr_num);


        /*
        * 5. Write a program that places the odd elements of an array before the
             even elements.
        * */

//
//        System.out.println("Original array: "+ arr_num);
//        ArrayList<Integer> odd = new ArrayList<Integer>();
//        ArrayList<Integer> even = new ArrayList<Integer>();
//
//
//        // For-each loop
//        for (int item : arr_num) {
//            if(item%2==0)
//                even.add(item);
//            else
//                odd.add(item);
//        }
//
//        odd.addAll(even);
//        System.out.println("Output array: "+odd);


        /*6. Write a program that test the equality of two arrays*/

//        System.out.print("please enter second collection of numbers ex 22,44,10 : ");
//        String collection_num = input.next();
//        String [] tem = collection_num.split(",");
//        int[] result = Arrays.stream(tem).mapToInt(Integer::parseInt).toArray();
//        ArrayList<Integer> arr_num2 = new ArrayList<Integer>();
//        // For-each loop
//        for (int item : result) {
//            arr_num2.add(item);
//        }
//
//        boolean equal = true;
//        for (int i = 0; i <arr_num.size() ; i++) {
//
//            if (arr_num.get(i) != arr_num2.get(i)) {
//                System.out.println("Not equal");
//                equal = false;
//                break;
//            }
//        }
//
//        if (equal)
//               System.out.println("equal");

        
        
        
        
        









}}