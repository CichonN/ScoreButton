import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Class: ScoreButton
 * Abstract: Score Button Program
 * @author NC
 * @since 1/19/2021
 * @version 1.0
 *
 */
public class ScoreButton {
	/**
	 * main method: Track Red Score and Blue Score
	 * @param args not used
	 */
	public static void main(String[] args) 	{  
        //Create and set up the window.
        JFrame f = new JFrame("Play with JButton Scores!");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //Red Team Label
	    JLabel lblRedTeam=new JLabel("Red Team");   
	    lblRedTeam.setBounds(70, 10, 200, 20);   
	    lblRedTeam.setForeground(Color.red);
	    f.getContentPane().add(lblRedTeam);
	    
	    //Red Team Score Label
	    JLabel lblRedScore=new JLabel("0");   //Need to change to int and back into string
	    lblRedScore.setBounds(94, 55, 200, 20);  
	    
	    //Red Team +1 button
	    Button btnRedAdd=new Button("Red Score!");
	    
	    // set bounds of button x axis, y axis, width, height
	    btnRedAdd.setBounds(50,100,100,30); 
	    
	    //Need to change score in label to an integer and back into string
	    btnRedAdd.addActionListener(new ActionListener() { 
	    	/**
	    	 * Add 1 to Red Team Score
	    	 * @param e Action Event by user
	    	 */
	    	public void actionPerformed(ActionEvent e) 	{  
	    		int intRedScore = Integer.parseInt(lblRedScore.getText());
	    		intRedScore = intRedScore + 1;
	    		String strRedScore = String.valueOf(intRedScore);
	    		//Change value of lblRedScore to value of strRedScore
	    		lblRedScore.setText(strRedScore);
	    	}  
	    }); 
	    
	    //Red Team -1 button
	    Button btnRedMinus=new Button("-1 for Red");
	    
	    // set bounds of button x axis, y axis, width, height
	    btnRedMinus.setBounds(50,135,100,30); 
	    
	    //Need to change score in label to an integer and back into string
	    btnRedMinus.addActionListener(new ActionListener() {  
	    	/**
	    	 * Subtract 1 from Red Team Score
	    	 * @param e Action Event by user
	    	 */
	    	public void actionPerformed(ActionEvent e) 	{  
	    		int intRedScore = Integer.parseInt(lblRedScore.getText());
	    		intRedScore = intRedScore - 1;
	    		String strRedScore = String.valueOf(intRedScore);
	    		//Change value of lblRedScore to value of strRedScore
	    		lblRedScore.setText(strRedScore);
	    	}  
	    }); 
	    
	    //Blue Team Label
	    JLabel lblBlueTeam=new JLabel("Blue Team");   
	    lblBlueTeam.setBounds(180, 10, 200, 20);   
	    lblBlueTeam.setForeground(Color.blue);
	    f.getContentPane().add(lblBlueTeam);
	    
	    //Blue Team Score Label
	    JLabel lblBlueScore=new JLabel("0");   //Need to change to int and back into string
	    lblBlueScore.setBounds(204, 55, 200, 20);  
	    
	    //Blue Team +1 button
	    Button btnBlueAdd=new Button("Blue Score!");
	    
	    // set bounds of button x axis, y axis, width, height
	    btnBlueAdd.setBounds(160,100,100,30); 
	    
	    //Need to change score in label to an integer and back into string
	    btnBlueAdd.addActionListener(new ActionListener() {  
	    	/**
	    	 * Add 1 to Blue Team Score
	    	 * @param e Action Event by user
	    	 */
	    	public void actionPerformed(ActionEvent e) 	{  
	    		int intBlueScore = Integer.parseInt(lblBlueScore.getText());
	    		intBlueScore = intBlueScore + 1;
	    		String strBlueScore = String.valueOf(intBlueScore);
	    		//Change value of lblBlueScore to value of strBlueScore
	    		lblBlueScore.setText(strBlueScore);
	    	}  
	    }); 
	    
	    //Blue Team -1 button
	    Button btnBlueMinus=new Button("-1 for Blue");
	    
	    // set bounds of button x axis, y axis, width, height
	    btnBlueMinus.setBounds(160,135,100,30); 
	    
	    //Need to change score in label to an integer and back into string
	    btnBlueMinus.addActionListener(new ActionListener() {  
	    	/**
	    	 * Subtract one from Blue Team Score
	    	 * @param e Action Event by user
	    	 */
	    	public void actionPerformed(ActionEvent e) 	{  
	    		int intBlueScore = Integer.parseInt(lblBlueScore.getText());
	    		intBlueScore = intBlueScore - 1;
	    		String strBlueScore = String.valueOf(intBlueScore);
	    		//Change value of lblBlueScore to value of strBlueScore
	    		lblBlueScore.setText(strBlueScore);
	    	}  
	    }); 
	    
	    
	    //Reset button
	    Button btnReset=new Button("Reset Scores");
	    
	    // set bounds of button x axis, y axis, width, height
	    btnReset.setBounds(50,175,210,30); 
	   
	    
	    btnReset.addActionListener(new ActionListener() {  
	    	/**
	    	 * Reset all scores to 0
	    	 * @param e Action Event by user
	    	 */
	    	public void actionPerformed(ActionEvent e) 	{
	    		//Reset Red and Blue Scores to 0
	    		lblBlueScore.setText("0");
	    		lblRedScore.setText("0");
	    	}  
	    }); 
	   	    
	    //Add everything to frame
	    f.add(btnRedAdd);
	    f.add(btnRedMinus);
	    f.add(lblRedTeam);
	    f.add(lblRedScore);
	    
	    f.add(btnBlueAdd);
	    f.add(btnBlueMinus);
	    f.add(lblBlueTeam);
	    f.add(lblBlueScore);
	    
	    f.add(btnReset);
	    
	    f.setSize(400,300);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	    
	}  
}
