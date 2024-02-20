import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);




//        1.Write a program to find all of the longest word in a given dictionary.



//        String [] first = {"cat", "dog", "red", "is", "am"} ;
//
//        System.out.println(find(first));








//        2. Write a program that displays the number of occurrences of an element in the array.
//Original Array:
//[1,1,1,3,3,5]




//        int [] num = {1 ,1 ,1 ,3 ,3 ,5 };
//
//        int count = 0 ;
//
//        System.out.println("enter number : ");
//        int num1 = s.nextInt();
//
//        for (int i = 0; i < num.length ; i++) {
//            if (num[i] == num1 ){
//                count++ ;
//            }
//        }
//
//        System.out.println(num1 + " occurs " + count +" times");








//        3.Write a program to find the k largest elements in a given array. Elements in the array can be in any order
//Original Array:
//[1, 4, 17, 7, 25, 3, 100]
//
//
//
//        int[] array = {1, 4, 17, 7, 25, 3, 100};
//
//        System.out.println("please enter the K");
//        int k = s.nextInt();
//
//        Arrays.sort(array);
//
//        System.out.print( k + " largest elements of the said array are: ");
//        for (int i = array.length - 1; i >= array.length - k; i--) {
//            System.out.print(array[i] + " ");
//        }





//        4. Create a method to reverse an array of integers. Implement the method without creating a new array
//Original Array:
//[5,4,3,2,1]


//
//        int [] array = {5 ,4 ,3 ,2 ,1 };
//
//        reverse(array);
//
//        System.out.println("Reversed array : " + Arrays.toString(array));











//        5. Write a menu driven Java program with following option:
//1. Accept elements of an array
//2. Display elements of an array
//3. Search the element within array
//4. Sort the array
//5. To Stop
//the size of the array should be entered by the user.




//        int choice, size;
//        int[] arr = null;
//
//        System.out.println("Menu:");
//        System.out.println("1. Accept elements of an array");
//        System.out.println("2. Display elements of an array");
//        System.out.println("3. Search the element within array");
//        System.out.println("4. Sort the array");
//        System.out.println("5. Stop");
//
//
//        do {
//
//
//            System.out.print("Enter your choice: ");
//            choice = s.nextInt();
//
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the size of the array: ");
//                    size = s.nextInt();
//                    arr = new int[size];
//                    System.out.println("Enter the elements of the array:");
//                    for (int i = 0; i < size; i++) {
//                        arr[i] = s.nextInt();
//                    }
//                    break;
//
//                case 2:
//                    if (arr == null) {
//                        System.out.println("Array is empty. Please enter elements first.");
//                    } else {
//                        System.out.println("Elements of the array:");
//                        System.out.println(Arrays.toString(arr));
//                    }
//                    break;
//
//                case 3:
//                    if (arr == null) {
//                        System.out.println("Array is empty. Please enter elements first.");
//                    } else {
//                        System.out.print("Enter the element to search: ");
//                        int search = s.nextInt();
//                        boolean found = false;
//                        for (int i = 0; i < arr.length; i++) {
//                            if (arr[i] == search) {
//                                System.out.println("Element found at index " + i);
//                                found = true;
//                                break;
//                            }
//                        }
//                        if (!found) {
//                            System.out.println("not found in the array.");
//                        }
//                    }
//                    break;
//
//                case 4:
//                    if (arr == null) {
//                        System.out.println("Array is empty. Please enter elements first.");
//                    } else {
//                        Arrays.sort(arr);
//                        System.out.println("Array sorted ");
//                    }
//                    break;
//
//                case 5:
//
//                    break;
//
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//
//        } while (choice != 5);
//
//









//        6. Create a method that generates a random number within a given range. Allow the user to
//specify the range and call the method to display random numbers.
//Hint: use Random class

//
//
//        Random r = new Random();
//
//        System.out.println("Enter the minimum value of the range : ");
//        int min = s.nextInt();
//
//
//        System.out.println("Enter the maximum value of the range : ");
//        int max = s.nextInt();
//
//
//        System.out.println("Enter the number of random numbers to generate : ");
//        int ran = s.nextInt();
//
//
//        System.out.println("Random numbers within the specified range : ");
//
//        for (int i = 0; i < ran; i++)
//
//            System.out.print(" " + randomnum(min , max));












//        7. Write a program that checks the strength of a password. Create a method that evaluates a
//password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters.




//        System.out.println("enter your password: ");
//        String password = s.nextLine();
//
//        int totalscore = score(password);
//
//        if (totalscore >= 8) {
//            System.out.println("strong password");
//        } else if (totalscore >= 5) {
//            System.out.println("moderately strong password");
//        } else {
//            System.out.println("Password is weak");
//        }













//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//and each subsequent number in the sequence is the sum of the two preceding ones.


//        System.out.println("Enter the number of Fibonacci terms to generate: ");
//        int numterms = s.nextInt();
//
//        System.out.println("Fibonacci sequence with " + numterms + " terms:");
//        generateFibonacci(numterms);








    }


// Q1

//public static ArrayList<String> find (String[] first ){
//
//        ArrayList<String> list = new ArrayList<String>();
//        int longest = 0 ;
//
//        for (String fi : first){
//            int lin = fi.length();
//
//            if (lin > longest){
//                longest = lin ;
//                list.clear();
//            }
//
//            if (lin == longest){
//                list.add(fi);
//            }
//        }
//        return list ;
//}










//    Q4

//    public static void reverse(int[] array) {
//        if (array == null || array.length <= 1) {
//            return;
//        }
//
//        int left = 0;
//        int right = array.length - 1;
//
//        while (left < right) {
//            int temp = array[left];
//            array[left] = array[right];
//            array[right] = temp;
//
//            left++;
//            right--;
//        }
//
//
//    }











// Q6


//public static int randomnum (int mi , int ma){
//
//    int n = (int) (Math.random() * (ma- mi)) + mi ;
//    return n ;
//
//
//    }
//






// Q7




//    private static int score(String password) {
//        int lengthScore = lengthn(password.length());
//        int specialCharScore = special(password);
//        int caseScore = checkuplo(password);
//
//        return lengthScore + specialCharScore + caseScore;
//    }
//
//    private static int lengthn(int length) {
//        if (length <= 5) {
//            return 0;
//        } else if (length <= 7) {
//            return 2;
//        } else {
//            return 3;
//        }
//    }
//
//
//    private static int special(String password) {
//        return password.matches(".[^a-zA-Z0-9].") ? 2 : 0;
//    }
//
//    private static int checkuplo(String password) {
//        boolean upper = false;
//        boolean lower = false;
//
//        for (char c : password.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                upper = true;
//            } else if (Character.isLowerCase(c)) {
//                lower = true;
//            }
//        }
//
//        return (upper && lower)?3:0;
//}
//





// Q8


//    private static void generateFibonacci(int numterms) {
//        int first = 0, second = 1;
//
//        for (int i = 0; i < numterms; i++) {
//            System.out.print(first + " ");
//
//            int nextterm = first + second;
//            first = second;
//            second = nextterm;
//}
//}


}