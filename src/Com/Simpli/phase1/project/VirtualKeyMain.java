package Com.Simpli.phase1.project;

import java.io.File;
import java.util.Scanner;




public class VirtualKeyMain {
	
	
	
	static void welcome() {
		boolean run = true;
		File folder = new File("D:/Developer/FileOps/");
		FileHandling fh = new FileHandling();
		
		while(run) 
		{
			System.out.println("Select one of the below options:-");
			System.out.println("1. Print all file names");
			System.out.println("2. File Operations");
			System.out.println("3. Close");
			
			try {
				Scanner sc = new Scanner(System.in);
				int choice = sc.nextInt();
		
					if (choice==1) {
						//all files
						fh.listFilesForFolder();
					}
					else if (choice==2) {
						//operations
						boolean fileOp = true;
						do
						{
							fileOp = operations(fh, fileOp);
						}
						while(fileOp); 
						
						
						
					}
					else if (choice ==3) {
						//exit
						System.out.println("Program will now exit");
						run = false;
					}
					else {
						System.out.println("Invalid choice. Please try again");
					}
			}
			catch(Exception e)
			{
				System.out.println("Invalid choice. Please enter integer");
			}
			
			
		}
		
	}
	
	static boolean operations(FileHandling fh, boolean fileOp) {
		//
		System.out.println("Select one of the below options:-");
		System.out.println("1. Search");
		System.out.println("2. Create file");
		System.out.println("3. Delete file");
		System.out.println("4. back to main menu");
		
		try {
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			if (choice==1) {
				//all files
				fh.searchFilesForFolder();
			}
			else if (choice==2) {
				//operations to create file
				fh.createFile();
				
			}
			else if (choice==3) {
				//operations to create file
				fh.deleteFile();
				
			}
			else if (choice ==4) {
				//exit
				return fileOp = false;
				
			}
			else {
				System.out.println("Invalid choice. Please try again");
			}
		}
		catch(Exception e){
			System.out.println("Invalid choice. Please enter integer");
		}
		finally {
			return fileOp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Virtual Key Repository");
		
		
		welcome();
		
		
		

	}

}
