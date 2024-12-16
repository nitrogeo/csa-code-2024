package A9.CG1;

public class A9_CH2 {
    public String contains(String text) {
        String threeDiv = "";
        for (int iter = 0; iter < text.length(); iter+=3) { // s2
            threeDiv += text.indexOf(iter);
        }
        return threeDiv;
    }
}
