package pucrs.alpro3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile 
{
	
	public ReadFile(){}
		
	public void LerFile()
	{
		 String[] root,left,center, right;
		 root = left = center = right = null;
		 Path pt = Paths.get("F_1.txt");
		
		 try (Scanner sc = new Scanner(Files.newBufferedReader(pt)))
		 {
			 int x = 0, first = sc.nextInt();
	
			 while(sc.hasNext())
			 {
				 if (x < first)
				 {
					 String line = sc.nextLine();
					 String[] temp = line.split(" ");
					 root[0] = temp[0];
					 left[0] = temp[2];
				 }				 
			 }			 
		 }
		 catch(IOException ex)
     {
        System.out.println(ex);
		 }	 
	}
}
