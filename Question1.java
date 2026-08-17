public class Question1 {
    public static void main(String[] args) {
        // 1 to 100 (even numbers)
        for (int i = 1; i < 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } 
            else if (i%5==0) {
                System.out.println("Buzz");
            }
            else if (i%3==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
