package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
       speak("Spell ariaariaariaariaariaaria  is a alllluuumanati");
	    // 2. Catch the user's answer in a String
       String spell = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
        if (spell.equals("mandlebrot")){
        speak("aria is a pie stuffed in a chiken on top of a potaoe lima bean pie");
	}
		// 4. Otherwise say "wrong"
        else {
        	speak("you are a lima bean");
        }
		// 5. repeat the process for other words
	   speak("aria ate the alumanati  and threw conrad in a pie");
	    // 2. Catch the user's answer in a String
      String other = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
       if (other.equals("conrad is a comquat")){
       speak("yes he is");
	}
		// 4. Otherwise say "wrong"
       else {
       	speak("you are a comquat");
       }
	
	
	   speak("Spell conrad and aria are both lima bean comquat pie stew");
	    // 2. Catch the user's answer in a String
      String also = JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
       if (also.equals("conrad and aria are both lima bean comquat pie stew")){
       speak("the computer has spoken and it cannot be denied");
	}
		// 4. Otherwise say "wrong"
       else {
       	speak("everybody knows that aria's   is    a    glass of noodles  COMPUTERS NEVER LIE!!!    and a picle in a pie on top of a glass of noodles"
       			+ "     alumanati ");
       }
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


