public class Subtract {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        int subtractionResult;

        System.out.println("Enter first Number");
        firstNumber = scan.nextInt();

        System.out.println("Enter second Number");
        secondNumber = scan.nextInt();

        subtractionResult = firstNumber - secondNumber;

        System.out.println("Final result is: " + subtractionResult);
    }
}