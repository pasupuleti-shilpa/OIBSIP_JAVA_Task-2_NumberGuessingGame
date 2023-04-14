package numberguessinggame;
import java.util.Random;
import javax.swing.JOptionPane;
public class Abc {
	static int c=1;
	public static void main(String[] args) {
		new Abc();
	}
	public Abc()
	{
		String play="yes";
		while(play.equals("yes"))
		{
			Random r=new Random();
			int n=r.nextInt(100)+1;
			//System.out.println(n);
			String s1=JOptionPane.showInputDialog("Enter a number in between 1 to 100");
			String s2;
			int g_val=Integer.parseInt(s1);
			while(true) 
			{
				
				if(g_val==n) {
					System.out.println("you got it in "+c+" attempts!");
					s2=JOptionPane.showInputDialog("do you wanna play again yes or no??");
					play=s2;
					break;
					}
				else if(n>g_val) {
					String s3=JOptionPane.showInputDialog("number is too low");
				 g_val=Integer.parseInt(s3);
					c++;
					}
				else if(n<g_val) {
					String s4=JOptionPane.showInputDialog("number is too high");
					g_val=Integer.parseInt(s4);
					c++;
				    }
				
	         }
			
	  }
    }
}
