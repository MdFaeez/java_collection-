import java.util.*;
import java.io.*;
class PropertiesDemo1{
public static void main(String args[]) throws Exception{
Properties p=new Properties();
FileInputStream fis=new FileInputStream("abc.properties");
p.load(fis);
System.out.println(p);
String url=p.getProperty("url");
String user=p.getProperty("user");
String pwd=p.getProperty("pwd");
System.out.println(url);
System.out.println(user);
System.out.println(pwd);
}
}