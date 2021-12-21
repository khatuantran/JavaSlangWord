/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dict_19127429;


import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jame
 */
public class Slangword implements Serializable{
    TreeMap<String, Vector<String>> SlangwordList;
    String path = ".//slang.txt";
    
    public Slangword() {
        SlangwordList = new TreeMap<>();
        readFile();
    } 
    
    
    public void writeFile()
    {
        ObjectOutputStream ooj;
        try 
        {
            ooj = new ObjectOutputStream(new FileOutputStream("SlangwordNew.dat"));
            ooj.writeObject(this);
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Slangword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void readFile()
    {
        try
        {            
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path))); 
            String str = br.readLine();           
            while((str = br.readLine()) != null)
            {
                String Slangword[] = str.split("`");
                String temp[] = Slangword[1].split("\\| ");
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
    

    public TreeMap getTreeMap()
    {
        return SlangwordList;
    }
}

class MainJavaSlangWord{
        public static void main(String[] args) 
        {
            Slangword slang;
            try
            {
                   
                   if(new File("SlangwordNew.dat").isFile())
                   {
                        ObjectInputStream obj = new ObjectInputStream(new FileInputStream("SlangwordNew.dat"));

                        slang = (Slangword)obj.readObject();
                        
                   }
                   else 
                   {
                        slang = new Slangword();
                   }
                   new MenuFrame(slang);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                    
            }
             
           
            
        }   
         
    
}
