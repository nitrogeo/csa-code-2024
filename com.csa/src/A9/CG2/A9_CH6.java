package A9.CG2;

import A8.LabsG2.A8_ArrayExpander;

import java.util.Scanner;
/*
spread var checks if length is odd or even
text is made into char array
the middle index of the text is found and stored in midiIndx
based on spread the least and greatest indexes are found
the letters between the L and G indexes are substringed into midi
midi is returned
*/
public class A9_CH6 {
    /* public static void main(String[] args) {
        A9_CH6 midi = new A9_CH6();
        Scanner keyboard = new Scanner(System.in); // make a new Scanner called "keyboard"
        System.out.println("enter text");
        String text = keyboard.nextLine();
        middleValue(text);
        System.out.println(midi);
    } */
    public static String middleValue(String text) {
        int spread = 0;
        if (text.length() % 2 == 0) {
            spread = 4;
        }
        else {
            spread = 3;
        }
        int midiIndx = text.length() / 2;
        int midiL = 0, midiG = 0;
        if (spread == 4 && text.length() == 4) {
            return text;
        }
        if (spread == 3 && text.length() == 3) {
            return text;
        }
        if (spread == 4) { // when even midiIndx is at the number .5 more than the middle of the array
            midiL = midiIndx - 2;
            midiG = midiIndx + 2;
        }
        if (spread == 3) { // when odd midiIndx is at the exact middle of the array fr
            midiL = midiIndx - 1;
            midiG = midiIndx + 2;
        }
        String midi = text.substring(midiL, midiG);
        return midi;
    }
}
