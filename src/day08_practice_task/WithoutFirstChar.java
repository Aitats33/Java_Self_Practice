package day08_practice_task;

public class WithoutFirstChar {

    public static void main(String[] args) {

        String word1 = "apple";
        String word2 = "banana";

        String result = word1.substring(1)+word2.substring(1);

       // String result = word1.substring(1) + word2.substring(1);


        System.out.println(" ");
        System.out.println(result);


    }

}
/*Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */