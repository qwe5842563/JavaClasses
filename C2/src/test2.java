class peter extends Object { 
int add(Integer i1, Integer i2) { 
return i1 + i2; 
} 
} 

public class test2 { 
public static void main(String[] args) { 
peter c = new peter(); 

System.out.println (c.add(10, 22)); 
System.out.println (c.add(new Integer(10),new Integer(20))); 
} 
}
