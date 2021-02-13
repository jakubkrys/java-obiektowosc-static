public class Text {

    private char[] text;
    private int min;
    private int max;

    public Text(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int generateSize(int min, int max){
        return (int) (Math.floor((Math.random()*(max-min))+min));
    }

    public char generateLetter() {
        return (char) ((Math.random()*(90-65))+65);
    }
}
