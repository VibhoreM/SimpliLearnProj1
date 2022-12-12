package Com.Simpli.phase1.project;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;



public class FileHandling {
	
	File folder = new File("D:/Developer/FileOps/");
	
	static ArrayList fileList = new ArrayList();
	
	public FileHandling() {
		File folder = new File("D:/Developer/FileOps/");
		fileList = createFileNameList(folder);
		bubbleSort(fileList);
	}
	
	
	public void bubbleSort(ArrayList al) {
	int n = al.size();
	String temp;
	{
		for (int j = 0; j < n - 1; j++)
        {
            for (int i = j + 1; i < n; i++)
            {
                if (al.get(j).toString().compareTo(al.get(i).toString()) > 0)
                {
                    temp = al.get(j).toString();
                    al.set(j, al.get(i));
                    al.set(i, temp);
                }
            }
        }
	}
	
	//printing all file names in separate lines
	
	
}
	public ArrayList createFileNameList(File folder) {
		//ArrayList fileList = new ArrayList();
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) 
	        {
	        	createFileNameList(fileEntry);
	        } 
	        else
	        {
	            fileList.add(fileEntry.getName().toString());
	        	//System.out.println(fileEntry.getName());
	        }
	    }
	    return fileList;
	}
	
	
	
	public void listFilesForFolder() {
		System.out.println("********************************");
		for(int m =0; m<fileList.size();m++) 
		{
			System.out.println(fileList.get(m));
		}
		
	    System.out.println("********************************");
	}
	
	public void searchFilesForFolder() {
		System.out.println("Enter the file to search: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("********************************");
		if (fileList.contains(name)) 
		{
			System.out.println("Main folder contains this file");
		}
		else
		{
			System.out.println("Main folder does not contain this file");
		}
		System.out.println("********************************");
	}

	 
	public void createFile() {
		System.out.println("Enter name of file along with extention to be created: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		File file = new File("D:/Developer/FileOps//" +name);
		
	      try {
			if (file.createNewFile()) {
			    System.out.println("File created: " + file.getName());
			  } else {
			    System.out.println("File already exists.");
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	    fileList.clear();
		fileList = createFileNameList(folder);
	}
	
	public void deleteFile() {
		//write code
		System.out.println("Enter name of file along with extention to be deleted: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		File file = new File("D:/Developer/FileOps//" +name);
		//File file = new File("C:\\Users\\Mayank\\Desktop\\1.txt");

		if (file.delete()) {
        System.out.println("File deleted successfully");
		}
		else {
        System.out.println("Failed to delete the file");
		}	
		fileList.clear();
		fileList = createFileNameList(folder);

	}

}
