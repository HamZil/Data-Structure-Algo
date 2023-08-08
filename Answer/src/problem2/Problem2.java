package problem2;

import java.io.*;

public class Problem2 {
    public static void main(String[] args){
        String filename="file.txt";
        String name = "sync";
        
        FileThreadclass th1= new FileThreadclass(filename,"a",name);
        FileThreadclass th2 = new FileThreadclass(filename, "b", name);
        FileThreadclass th3= new FileThreadclass (filename,"c",name); 
       th1.start();
       th2.start();
       th3.start() ;
       try {
           th1.join();
           th2.join();
        th3.join();
        System.out.println ("file is completed .");}
        catch ( InterruptedException e) {
             System.out.println ("File is interrup") ;
    }
}
}

class FileThreadclass extends Thread implements Runnable {
	 private BufferedWriter bufferw = null;
	 private String identifer;
	 private String name;
	        private String fileName;
	 public FileThreadclass (String fileName, String identifer, String name){
	 this.name = name;
	 try {
	        bufferw = new BufferedWriter (new  FileWriter ( fileName, true));
	    }
	 catch ( IOException e) {
	  System.out.println( "writing Error");
	         }
	 }
	    public synchronized void run(){
	    try{
	            bufferw.write("Thread" +identifer + " start writing") ; 
	    bufferw.write("Thread" +identifer + " is currently writing");
	 bufferw.write("Thread" +identifer + " Finsh writing-" +name+ "");
	 
	 bufferw.close();} catch (IOException ex) {
	        System.out.println(" writting Error");
	     }
	    }
	    
}

    