import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
//import  connectingpackage.connect;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.undo.UndoManager;

public  class GUI implements ActionListener { 
	JFrame window;
	JTextArea textArea;
	boolean wordwrapon =false;
	JScrollPane scrollPane;
	JMenuBar menuBar;
	JMenu file,edit,format,color;
	JMenuItem iNew,isave,isaveas, iexit,iopen; 
	JMenuItem color1,color2,color3;
	JMenuItem undo,redo; 
	JMenu font,fontsize;
	JMenuItem wrap;
	JMenuItem aerial,comicsansms,timesnewroman;
	JMenuItem size12,size14,size16,size18;
	
	FunctionFile FILE= new FunctionFile(this);
	FunctionColor Color=new FunctionColor(this);
	functionformat format1=new functionformat(this);
	
	UndoManager um=new UndoManager();

	public static void main(String[] args) {
		
         new GUI();
	
       
//connectingpackage.connect obj=new connectingpackage.connect();
//int a=obj.a;
//System.out.println(a);

	}
	
	public GUI()
	{
		createWindow();
		createTextArea();
		createMenubar();
		
		format1.selectedfont="AERIAL";
		format1.createfont(16);
		Color.Changecolor("white");
		window.setVisible(true);
		
	}
	public void createWindow()
	{
		window=new JFrame("Notepad");
		window.setSize(800,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} 
	public void createTextArea()
	{
		textArea=new JTextArea(); 
		
		scrollPane=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//window.add(textArea);
		window.add(scrollPane);
	} 
	public void createMenubar()
	{
		menuBar=new JMenuBar();
		window.setJMenuBar(menuBar);
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		format=new JMenu("Format");
		color=new JMenu("Color");
		
		iNew=new JMenuItem("NEW");
		iNew.addActionListener(this);
		iNew.setActionCommand("New");
		
		iopen=new JMenuItem("Open");
		iopen.addActionListener(this);
		iopen.setActionCommand("Open");
		
		
		isave=new JMenuItem("Save");
		isave.addActionListener(this);
		isave.setActionCommand("Save");
		
		isaveas=new JMenuItem("Saveas");
		isaveas.addActionListener(this);
		isaveas.setActionCommand("Saveas");
		
		iexit=new JMenuItem("EXIT"); 
		iexit.addActionListener(this);
		iexit.setActionCommand("EXIT");
		
		color1=new JMenuItem("white");
		color1.addActionListener(this);
		color1.setActionCommand("white");
		
		color2=new JMenuItem("red");
		color2.addActionListener(this);
		color2.setActionCommand("red");
		
		
		color3=new JMenuItem("green");
		color3.addActionListener(this);
		color3.setActionCommand("green");
		
		undo=new JMenuItem("UNDO");
		undo.addActionListener(this);
		undo.setActionCommand("UNDO");
		
		
		redo=new JMenuItem("REDO");
		redo.addActionListener(this);
		redo.setActionCommand("REDO");
		
		font=new JMenu("FONT"); 
		
		aerial=new JMenuItem("AERIAL");
		aerial.addActionListener(this);
		aerial.setActionCommand("AERIAL");
		
		comicsansms=new JMenuItem("COMIC SANS MS");
		comicsansms.addActionListener(this);
		comicsansms.setActionCommand("COMIC SANS MS");
		
		timesnewroman=new JMenuItem("TIMES NEW ROMAN");
		timesnewroman.addActionListener(this);
		timesnewroman.setActionCommand("TIMES NEW ROMAN");
		
		
		fontsize=new JMenu("FONTSIZE");
		
		size12=new JMenuItem("12");
		size12.addActionListener(this);
		size12.setActionCommand("12");
		
		size14=new JMenuItem("14");
		size14.addActionListener(this);
		size14.setActionCommand("14");
		
		size16=new JMenuItem("16");
		size16.addActionListener(this);
		size16.setActionCommand("16");
		
		size18=new JMenuItem("18");
		size18.addActionListener(this);
		size18.setActionCommand("18");
		
		wrap=new JMenuItem("Word Wrap OFF");
		wrap.addActionListener(this);
		wrap.setActionCommand("Word Wrap");
		
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(format);
		menuBar.add(color);
		
		file.add(iNew);
		file.add(iopen);
		file.add(isave);
		file.add(isaveas);
		file.add(iexit); 
		
		color.add(color1);
		color.add(color2);
		color.add(color3); 
		
		format.add(font);
		format.add(fontsize);
		format.add(wrap);
		
		font.add(aerial);
		font.add(comicsansms);
		font.add(timesnewroman);
		
	fontsize.add(size12);
	fontsize.add(size14);
	fontsize.add(size16);
	fontsize.add(size18);
	
		edit.add(undo);
		edit.add(redo);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		switch(command) {
		case "New": FILE.newFile(); break;
		case "Open": FILE.Open(); break;
		case "white": Color.Changecolor(command);break;
		case "red": Color.Changecolor(command);break;
		case "green": Color.Changecolor(command);break;
		case "Word Wrap":format1.wordwrap();break;
		case "AERIAL":format1.setfont(command);
		case "COMIC SANS MS":format1.setfont(command);
		case "TIMES NEW ROMAN":format1.setfont(command);
		case "12":format1.createfont(12);break;
		case "14":format1.createfont(14);break;
		case "16":format1.createfont(16);break;
		case "18":format1.createfont(18);break;
		case "Saveas":FILE.saveas();break;
		case "Save":FILE.save();break;
		case "EXIT":FILE.exit();break;
		}
		
	}
}
