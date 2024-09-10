import java.io.*;
import java.util.Scanner;

public class ACC
{

	public static void main(String[] args) throws FileNotFoundException
	{
			int nRows;
			char[][] arr;
			String filler;
			Scanner in = new Scanner(System.in);
			File dataFile = new File("MyFile.txt");
			PrintWriter fout = new PrintWriter(dataFile);
			
			System.out.print("Введіть розмір квадратної матриці: ");
			nRows = in.nextInt();
			in.nextLine();
			
			arr = new char[nRows][nRows];
			
			System.out.print("\nВведіть символ-заповнювач: ");
			filler = in.nextLine();
			exit:
				try {
				for(int i = 0; i < nRows; i++) {
				    for(int j = 0; j < nRows; j++) {
				        if(filler.length() == 1) {
				        	if (j < nRows/2  &&  i < nRows/2) {
				            arr[i][j] = (char) filler.codePointAt(0);
				            System.out.print(arr[i][j] + " ");
				            fout.print(arr[i][j] + " ");
				        	}
				        	if (j < nRows/2  &&  i >= nRows/2) {
					            arr[i][j] = (char) filler.codePointAt(0);
					            System.out.print(" " + " ");
					            fout.print(" " + " ");
					        }
				        	if (j >= nRows/2  && i >= nRows/2) {
				                arr[i][j] = (char) filler.codePointAt(0);
				                System.out.print(arr[i][j] + " ");
				                fout.print(arr[i][j] + " ");
				            }		        	  	
				        }
			else if (filler.length() == 0)
			{
				System.out.print("\nНе введено символ заповнювач");
				break exit;
			}
			else 
			{
				System.out.print("\nЗабагато символів заповнювачів");
				break exit;
			}
					}
					System.out.print("\n");
					fout.print("\n");
					} 
				}
			finally 
			{
		            in.close();
		    }
			fout.flush();
			fout.close();
			
	}
	
}
