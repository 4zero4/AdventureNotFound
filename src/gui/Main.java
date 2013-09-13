package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import omella.Adventurer;

public class Main {
	
	public static void main(String args[]) {
		final Adventurer juvigar = null;
		JFrame hans = new JFrame("Adventure Not Found");
		hans.setVisible(true);
		hans.setSize(800, 600);
		hans.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton hashtag = new JButton("Create Your Juvigar");
		hashtag.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
            {
                instancia();
                System.out.println("Your Juvigar has been created!");
                juvigar.checkAtt();
		        juvigar.reRoll();
		        juvigar.checkAtt();
            }			
		}
		);
		hans.getContentPane().add(hashtag);
		/*JButton partiu = new JButton("Roll me some attributes!");
		partiu.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
            {
				juvigar.checkAtt();
		        juvigar.reRoll();
		        juvigar.checkAtt();
            }			
		}
		);
		hans.getContentPane().add(partiu);*/
	}
	
	public static void instancia(){
		Adventurer juvigar = new Adventurer("Juvigar",1,2);
	}

	
}
