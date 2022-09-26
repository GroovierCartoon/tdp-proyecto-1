package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student studentData = new Student(126811,"Lobos","Brian","lobosbagustin@gmail.com","https://github.com/GroovierCartoon","/images/miFoto.png");
            	SimplePresentationScreen presentation = new SimplePresentationScreen(studentData);
            	
            	presentation.setVisible(true);
            }
        });
    }
}