/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dict_19127429;


import java.io.*;
import java.util.*;

/**
 *
 * @author jame
 */
public class Slangword {
    HashMap<String, Vector<String>> SlangwordList;
    String path = ".//slang.txt";
    
    public Slangword() {
        SlangwordList = new HashMap<>();
        readFile(path);
    }
    
    public void readFile(String path)
    {
        try
        {            
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path))); 
            String str;
            while((str = br.readLine()) != null)
            {
                String Slangword[] = str.split("`");
                String temp[] = Slangword[1].split("| ");
//                Slangword[1].pl
                Vector<String> meaning = new Vector<>();
                for(int i = 0; i < temp.length; i++)
                {
                    meaning.add(temp[i]);
                }
                
                SlangwordList.put(Slangword[0], meaning);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
//        new Slangword();
//        String a ="abc";
//        String b[] = a.split(". ");
//        a.
//        System.out.println(b.length);
//        System.out.println(a.split(".").length);
    }
    
}
