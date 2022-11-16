package bridge;

public class Validation {
    public static void isInputIncludeCharacter(String input) {
        String result = input.replaceAll("[0-9]", "");
        if (result.length() != 0)
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_INCLUDE_CHARACTER.getMessage());
    }

    public static void isInputBetween3And20(int input) {
        if (input < 3 || input > 20)
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_NOT_BETWEEN_3_AND_20.getMessage());
    }

    public static void isInputUpOrDown(String input) {
        if (!input.equals("U") && !input.equals("D"))
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_UP_OR_DOWN.getMessage());
    }

    public static void isInputRestartOrQuit(String input) {
        if (!input.equals("R") && !input.equals("Q"))
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_RESTART_OR_QUIT.getMessage());
    }
}
