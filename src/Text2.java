public class Text2 {

    public static String text (int size){
        String chars = "abcdefghijklmnopqrstuvwxyz";

        int min = 0;
        int max = chars.length()-1;

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int index = (int) (Math.floor(Math.random()*(max-min+1)+min));
            char c = chars.charAt(index);

            text.append(c);

        }
        return text.toString();
    }
}
