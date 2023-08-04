
import java.io.*;

public class InpOut {
    public static void main(String[] args)  throws IOException{
        File f1=new File("shine.java");   // does not create a file
        System.out.println(f1.exists());           //check if file exists
        f1.createNewFile();                        //create a file
        System.out.println(f1.exists());



        // to get details of a file or directory like no of files, size, etc

        File dir=new File("mydir");
        System.out.println(dir.exists());
        dir.mkdir();    
        System.out.println(dir.exists());

        int count=0;
        File f2=new File("../Arrays");
        String[] s=f2.list();
        for(String s1:s){
            count++;
            System.out.println(s1);

        }
        System.out.println("The total number of files are: "+count);
    }
    
}
