import java.awt.Font;

public class functionformat {
	GUI gui;
	Font aerial,comicsansms,timesnewroman;
	String selectedfont;
	
	public functionformat(GUI gui)
	{
		this.gui=gui;
	}
   public void wordwrap()
   {
	   if(gui.wordwrapon==false)
	   {
		   gui.wordwrapon=true;
		   gui.textArea.setLineWrap(true);
		   gui.textArea.setWrapStyleWord(true);
		  // gui.textArea.setText("Word Wrap On");
	   }
	   else
	   {
		   gui.wordwrapon=false;
		   gui.textArea.setLineWrap(false);
		   gui.textArea.setWrapStyleWord(false);
		 //  gui.textArea.setText("Word Wrap Off");
	   }
   } 
  public void createfont(int fontSize)
   {
	   aerial=new Font("AERIAL",Font.PLAIN, fontSize);
	   comicsansms=new Font("COMIC SANS MS",Font.PLAIN, fontSize);
	   timesnewroman=new Font("TIMES NEW ROMAN",Font.PLAIN, fontSize);
	   
	   setfont(selectedfont);
	   
   } 
  
   public void setfont(String font)
   {
	   selectedfont=font;
	   switch(selectedfont)
	   {
	   case "AERIAL":
		   gui.textArea.setFont(aerial);
		   break;
	   case "COMIC SANS MS":
		   gui.textArea.setFont(comicsansms);
		   break;
	   case "TIMES NEW ROMAN":
		   gui.textArea.setFont(timesnewroman);
		   break;
	   }
   }
}
