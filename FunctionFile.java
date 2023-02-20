import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;



public class FunctionFile { 
	
	GUI gui;
	String filename;
	String fileaddress;
	
	public FunctionFile(GUI gui)
	{
		this.gui=gui;
	} 
	public void newFile() 
	{
		gui.textArea.setText(null);
		gui.window.setTitle("New");
		fileaddress=null;
		filename=null;
	} 
	public void Open()
	{
		FileDialog fd=new FileDialog(gui.window,"Open",FileDialog.LOAD);
		fd.setVisible(true); 
		
		if(fd.getFile()!=null)
		{
			filename=fd.getFile();
			fileaddress=fd.getDirectory();
			gui.window.setTitle(filename);
		} 
		System.out.println("File Address and Filename" + fileaddress + filename);
		try
		{
			BufferedReader br =new BufferedReader(new FileReader(fileaddress+filename));
			gui.textArea.setText("");
			String line=null;
			
			while((line=br.readLine())!=null)
					{
				         gui.textArea.append(line + "\n");
					}
			br.close();
		} 
		
		catch(Exception e)
		{
			System.out.println("File not openend");
		}
	} 
	public void save()
	{ 
		if(filename==null)
		{ 
			saveas();
		} 
		try
		{
            FileWriter fw =new FileWriter(fileaddress+filename);			
			fw.write(gui.textArea.getText());
			gui.window.setTitle(filename);
			fw.close();		
		}
		catch(Exception e)
		{
			System.out.println("File not openend");
		}
	}
	public void saveas()
	{
		FileDialog fd=new FileDialog(gui.window,"Save",FileDialog.SAVE);
		fd.setVisible(true);
		
		if(fd.getFile()!=null)
		{
			filename=fd.getFile();
			fileaddress=fd.getDirectory();
			gui.window.setTitle(filename);
		}
		try
		{
			FileWriter fw =new FileWriter(fileaddress+filename);
			
			fw.write(gui.textArea.getText());
			fw.close();
			
		
			
		} 
		catch(Exception e)
		{
			System.out.println("File not openend");
		}
	} 
	public void exit()
	{
		System.exit(0);
	}

}
