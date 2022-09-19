public class Main {
    public static void main(String[] args) {

    int [] numbers = {1, 2, 3};
    int firstNumber = numbers[0];
    int secondNumber = numbers[1];
    int thirdNumber = numbers[2];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] %2 !=0){
                numbers[i] = numbers[i] + 1;
            }
            System.out.println(numbers[i]);
        }
    }
}