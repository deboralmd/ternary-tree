package pucrs.alpro3;


	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.Scanner;

	public class ReadFile 
	{
		Integer[] root, root2, left,center, center2, right;
		
		public ReadFile(){}
			
		public void LerFile()
		{
			 
			

			 Path pt = Paths.get("F_1.txt");
			
			 try (Scanner sc = new Scanner(Files.newBufferedReader(pt)))
			 {
				 int second = 0, x = 0, first = sc.nextInt();
				 
			root = new Integer[first];
			left = new Integer[first];
			center = new Integer[first];
				 
			
				 while(sc.hasNext())
				 {
					 if (x < first)
					 {
						 String line = sc.nextLine();
						 String[] temp = line.split(" ");
						 
						 root[0] = Integer.parseInt(temp[0]);
						 left[0] = Integer.parseInt(temp[1]);
						 center[0] = Integer.parseInt(temp[2]);
						 
					 }				 
					 
					 if(x == first + 1)
						 second = sc.nextInt();
					root2 = new Integer[first];
					right = new Integer[first];
					center2 = new Integer[first];
					 
					 
					 if(x > second)
					 {
						 String line = sc.nextLine();
						 String[] temp = line.split(" ");
						 root2[0] = Integer.parseInt(temp[0]);
						 right[0] = Integer.parseInt(temp[1]);
						 center2[0] = Integer.parseInt(temp[2]);
						 
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

		
	}
	}

