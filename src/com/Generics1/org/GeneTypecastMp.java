package com.Generics1.org;
import java.util.*;
import java.util.Map.Entry;  
class GeneTypecastMp{  
public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();  
map.put(1,"vijay");  
map.put(4,"umesh");  
map.put(2,"ankit");  
   
Set<Map.Entry<Integer,String>> set=map.entrySet();  
  
Iterator<Map.Entry<Integer,String>> itr=set.iterator();  
while(itr.hasNext()){  
Entry<Integer, String> e=itr.next();
System.out.println(e.getKey()+" "+e.getValue());  
}  
  
}
}  
