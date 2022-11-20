package bridge;

public class Validation {
    private static final int NUMBER_ZERO = 0;
    private static final int NUMBER_MIN = 3;
    private static final int NUMBER_MAX = 20;
    private static final String NUMBER_REMOVE_REGEX = "[0-9]";
    private static final String REGEX_CHANGE_WORD = "";
    private static final String WORD_UP = "U";
    private static final String WORD_DOWN = "D";
    private static final String WORD_RESTART = "R";
    private static final String WORD_QUIT = "Q";

    public static void isInputIncludeCharacter(String input) {
        String result = input.replaceAll(NUMBER_REMOVE_REGEX, REGEX_CHANGE_WORD);
        if (result.length() != NUMBER_ZERO)
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_INCLUDE_CHARACTER.getMessage());
    }

    public static void isInputBetween3And20(int input) {
        if (input < NUMBER_MIN || input > NUMBER_MAX)
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_NOT_BETWEEN_3_AND_20.getMessage());
    }

    public static void isInputUpOrDown(String input) {
        if (!input.equals(WORD_UP) && !input.equals(WORD_DOWN))
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_UP_OR_DOWN.getMessage());
    }

    public static void isInputRestartOrQuit(String input) {
        if (!input.equals(WORD_RESTART) && !input.equals(WORD_QUIT))
            throw new IllegalArgumentException(ErrorMessage.ERROR_MESSAGE_INPUT_RESTART_OR_QUIT.getMessage());
    }
}
