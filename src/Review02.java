
public class Review02 {

    public static void main(String[] args) {
     // iの値を0から100より小さい間、1ずつカウントアップして繰り返す
        for (int i = 1; i <= 100; i++) {

         // iの値が5で割り切れるとき
         if (i % 3 == 0 && i % 5 == 0) {
              // FizzBuzz と表示する
              System.out.println("FizzBuzz");

         // iの値が2で割り切れるとき
          } else if (i % 3 == 0) {
                // Fizz と表示する
                System.out.println("Fizz");

         // iの値が5で割り切れるとき
          } else if (i % 5 == 0) {
                // Buzz と表示する
                System.out.println("Buzz");

         // それ以外の数
          } else {
                // その数をそのまま表示する
                System.out.println(i);
          }

        }
    }

}
