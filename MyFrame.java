import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

//extending MyFrame class form JFrame class
public class MyFrame extends JFrame{
	String time;
	String day;
	String date;
	SimpleDateFormat dateFormat;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	
	//Making Constructor of the JFrame class which is used to create a layout
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close operation
		this.setTitle("Clock");//To set title
		this.setLayout(new FlowLayout());//to set the layout "FlowLayout" is one of many layouts present
		this.setSize(350,200);//to set the size in pixels
		this.setResizable(false);//It is used to add resizable functionablity to frame "flase" means it is not resizeable
		this.setVisible(true);//To make layout visible
		
		//SimpleDateFormat class is used to ormatting and parsing dates in a locale-sensitive manner
		 timeFormat = new SimpleDateFormat("HH:MM:SS"); //creating format for time
		 dayFormat = new SimpleDateFormat("EEEE");//creating format for day
		 dateFormat = new SimpleDateFormat("MMMM dd, yyyy");//creating format for date
		
		//JLabel class is used to display a short string or an image icon
		 timeLabel= new JLabel();//creating label to show time
		 dayLabel= new JLabel();//creating label to show day
		 dateLabel= new JLabel();//creating label to show date
		//Fot Time Label
		timeLabel.setFont(new Font("Script Tags",Font.PLAIN,50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		//For day Label
		dayLabel.setFont(new Font("Script Tags",Font.BOLD,35));
		
		//For date Label
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		
		this.add(timeLabel);
		this.add(dateLabel);
		this.add(dayLabel);
		this.setVisible(true);
		
		//to set a time
		setTime();
		
	}
	public void setTime() {
		//because of while it'll display till we close the window
		while(true) {
			//Calendar class is used to get date and time at that instance
			
			time = timeFormat.format(Calendar.getInstance().getTime());//storing time at that instance in a string 
			timeLabel.setText(time);//timeLabel will show that string
			
			day = dayFormat.format(Calendar.getInstance().getTime());//storing day at that instance in a string
			dayLabel.setText(day);//dayLabel will show that string
			
			date = dateFormat.format(Calendar.getInstance().getTime());//storing date at that instance
			dateLabel.setText(date);//dateLabel will show that string
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
					
					
					
					
		}
	}
}
