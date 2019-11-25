package org.week8;

import java.io.File;

public class FolderLists {
	public static void main(String[] args) {
		File file = new File("Z:\\"); 
        File[] klasorler = file.listFiles();
        
        for (File klasor_yazdir : klasorler)
        {	
        	if(klasor_yazdir.isDirectory())	
        		System.out.println(klasor_yazdir +"****");
        	else
        		System.out.println(klasor_yazdir.getName());
        }
	}
}
