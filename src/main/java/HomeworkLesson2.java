import java.util.*;

public class HomeworkLesson2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(tokenGenerator(random, (userTokenLengthChoiceAndValidation())));
    }

    public static String tokenGenerator(Random random, int length) {
        return random.ints(33, 126)
                .mapToObj(i -> (char) i)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public static int userTokenLengthChoiceAndValidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the token length from the following numbers: 5, 10 or 15: ");
        String chosenNumber = scanner.nextLine();

        List<String> lengthNumberArray = new ArrayList<>((Arrays.asList("5", "10", "15")));

        while (!lengthNumberArray.contains(chosenNumber)) {
            System.out.println("Please insert correct value: ");
            chosenNumber = scanner.nextLine();
        }
        return Integer.parseInt(chosenNumber);
    }
}
