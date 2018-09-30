public class LowercaseToUppercase {
    /**
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        // write your code here
        char upper = (char)(character-32);
        return upper;
    }
}