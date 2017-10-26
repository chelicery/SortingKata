package pl.edu.pjwstk;
/*
* Kata02
* */

public class Chop {
    public static void main(String[] args){
           System.out.println("index:" + chop(15, new int[] {1, 3, 5, 7, 8, 9, 10, 11, 15} ));
    }

    public static int chop(int targetValue, int[] arr){

            int min = 0;
            int max = arr.length - 1;
            int guess;
            int index = -1;

            while(min <= max){
                guess = (max+min)/2;
                System.out.println(guess);
                if(arr[guess] == targetValue){
                    index = guess;
                    break;
                } else if(arr[guess]<targetValue){
                    min = guess + 1;
                } else {
                    max = guess - 1;
                }
            }

            return index;
    }


}
