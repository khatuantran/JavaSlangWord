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
class Slangword implements Serializable{
    private TreeMap<String, Vector<String>> slangwordList;
    private Vector<String> history;
    private String path = ".//slang.txt";
    private String searchPath = "//searchHistory.txt";
    public Slangword() {
        slangwordList = new TreeMap<>();
        history = new Vector<>();
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
                
                slangwordList.put(Slangword[0], meaning);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
  
    
    public TreeMap getTreeMap()
    {
        return slangwordList;
    }
    
    public Vector<String> getHistoryVector()
    {
        return history;
    }
            
    public void addHistory(Vector<String> key)
    {
        for(int i = 0; i < key.size(); i++)
        {
            String temp = key.get(i);
            if(!history.contains(temp))
            {
                history.add(temp);
            }
        }
    }
    
    public Vector<String> slangwordSearch(String key)
    {
        Vector<String> result = null;
        if(slangwordList.containsKey(key))
        {
            result = slangwordList.get(key);
        }
        return result;
    }
    
    public TreeMap<String, Vector<String>> definationSearch(String defination)
    {
        TreeMap<String, Vector<String>> result = new TreeMap<>();
        Vector<String> key = new Vector<>(slangwordList.keySet());
        for(int i = 0; i < key.size(); i++)
        {
            Vector<String> value = slangwordList.get(key.get(i));
            Vector<String> resultSet = new Vector<>();
            for(int j = 0; j < value.size(); j++)
            {
                String temp = value.get(j).toLowerCase();
                if(temp.contains(defination.toLowerCase()))
                {
                    resultSet.add(value.get(j));
                }
            }
            if(!resultSet.isEmpty())
            {
                result.put(key.get(i), resultSet);
            }
        }
        
        return result;
    }
}

public class MainJavaSlangWord
{
        public static void main(String[] args) 
        {
            Slangword slang;
//            slang.writeFile();
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
