package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

/**
 * Created by spathare on 12/22/16.
 */
public class ReadProperty {

    public static List<String> getPackages(){
        Properties properties;
        List <String> packages = new ArrayList<String>();
        try {
            properties=new Properties();
            properties.load(new FileInputStream(new File("src/test/resources/packages.properties")));
            for ( String pkg : properties.getProperty("packages").split(",")){
                packages.add(pkg);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return packages;
    }

   public static void main(String args[]){
      List<String> pkglist =  ReadProperty.getPackages();
       System.out.println("Number of pakcages are : " + pkglist.size());
       for( String pkgname : pkglist){
           System.out.println(pkgname);
       }
   }


}
