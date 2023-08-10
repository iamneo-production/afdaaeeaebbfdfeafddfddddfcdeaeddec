package utility;

public class StringAdvanceMethod {
	//Enter the code here...
	private String input1;
    private String input2;
    
    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) { 
        this.input1 = input1;  
    }
    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
       
    }

    public String concat(String i1,String i2) {
        return i1 + i2;
    }


    public String split(String input1,String input2) {
        String[] splitString=input1.split(input2);
        return String.join(",",splitString);
	}

    public String firstCharacter(String i1) {
        return String.valueOf(i1.charAt(0));
    }

    public String indexOf(String i1, String i2) {
        return String.valueOf(i1.indexOf(i2));
    }

    public String trim(String i1) {
        return i1.trim();
	}
}