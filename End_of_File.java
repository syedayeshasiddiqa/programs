import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_Of_File {
      public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        int n=0;
        while(name !=null)
        {
            System.out.printf("%d %s\n",++n,name);
            name=sc.nextLine();      
        }
        sc.close();
    }
}