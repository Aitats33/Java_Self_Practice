package day08_practice_task;

public class CombineWords {

    public static void main(String[] args) {

String word1 = "one";
String word2="eight";

String result;

if(word1.charAt(word1.length()-1)==word2.charAt(0)){
    result = word1+word2.substring(1);
}else {
    result=word1+word2;
}

        System.out.println(result);

    }

}
/*Create a class named CombineWords. Ask the user to enter two words. Then, add them together and print. But if the
last letter of the first word and the first letter of the second word are the same, print that character once.

        Example:
              Input:
                 one
                 eight

              Output:
                   oneight


 */