package pucrs.alpro3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile 
{
	Integer[] root, root2, left, center, center2, right;
	
	public ReadFile(){}
		
	public void LerFile()
	{	 
		 Path pt = Paths.get("F_1");
		
		try (Scanner sc = new Scanner(Files.newBufferedReader(pt)))
		{
			int second = 0, x = 0, y = 0, first = sc.nextInt();
			 
			root = new Integer[first];
			left = new Integer[first];
			center = new Integer[first];
			
			System.out.println("first: " + first);
			sc.nextLine();
	
			while(sc.hasNext())
			{
				if (x < first)
				{
					
					String line = sc.nextLine();
					String[] temp = line.split(" ");
					
//					System.out.println(line);
						 
					root[x] = Integer.parseInt(temp[0]);
					left[x] = Integer.parseInt(temp[1]);
					center[x] = Integer.parseInt(temp[2]);
					
					System.out.println("primeira arvore: " + root[x] + " " + left[x] + " " + center[x]);
				}				 
 
				else if(x == first)
				{
					second = sc.nextInt();
					root2 = new Integer[second];
					right = new Integer[second];
					center2 = new Integer[second];
					sc.nextLine();
					
					System.out.println("second: " + second);
				}
 
				else if(x > second)
				{
					String line = sc.nextLine();
					String[] temp = line.split(" ");
					root2[y] = Integer.parseInt(temp[0]);
					right[y] = Integer.parseInt(temp[1]);
					center2[y] = Integer.parseInt(temp[2]);
					
					System.out.println("segunda arvore: " + root2[y] + " " + right[y] + " " + center2[y]);
					y++;
				}
				x++; 
				
			}			 
		}
			catch(IOException ex)
		{
				System.out.println(ex);
		}	 
}
	
	public void juntarArvores()
	{
		LerFile();
		
		boolean ok = true;
		int k = 0;
		String[] finalCenter; 
		
		if(center.length >= center2.length)
		{
			finalCenter= new String[center.length];
			
			for(int i=k; i < center2.length; i++){
			if (center[i] != 0 || center2[i] != 0)
			{
				for(int j = i+1;j<center.length;j++)
				{
					if(center[j] == 0 && center2[j] == 0)
						ok = false;
					
				}
			}
				if(ok){
				for(int i1 = k;  i1< center2.length; i1++)
				{
					finalCenter[i1] = center[i1].toString() + "/" + center2[i1].toString();
					System.out.println(finalCenter[i1]);
					
				}
					
				}
				
				
			}
		}
	
		
	}

}
