package utility;

public class StringMethod {
//	Enter the code here....
private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String lower(String i1){
        return i1.toLowerCase();
    }

    public String upper(String a) {
        return a.toUpperCase();
    }

    public String firstCharacter(String input) {
        return String.valueOf(input.charAt(0));
    }

    public String length(String a) {
        return String.valueOf(a.length());
    }

    public String trim(String k) {
        return k.trim();
    }

}
