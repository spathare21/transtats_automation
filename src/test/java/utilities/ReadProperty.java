package utilities;

import java.io.*;
import java.util.*;

/**
 * Created by spathare on 12/22/16.
 */
public class ReadProperty {

    public static String packageFilePath = "src/test/resources/packages.properties";
    public static String configFilePath = "src/test/resources/transtatsconfig.properties";


    public static List<String> getPackages(){
        Properties properties;
        List <String> packages = new ArrayList<String>();
        try {
            properties=new Properties();
            properties.load(new FileInputStream(new File(packageFilePath)));
            for ( String pkg : properties.getProperty("packages").split(",")){
                packages.add(pkg);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return packages;
    }

    public static String getConfig(String key) throws IOException {

        Properties prop=new Properties();
        InputStream file=new FileInputStream(configFilePath);
        prop.load(file);
        String pairValue=prop.getProperty(key);
        return pairValue;
    }

   public static void main(String args[]){
      List<String> pkglist =  ReadProperty.getPackages();
       System.out.println("Number of pakcages are : " + pkglist.size());
       for( String pkgname : pkglist){
           System.out.println(pkgname);
       }
   }


}
