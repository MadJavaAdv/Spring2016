package java112.demo;

import java.util.*;

/** A class to demonstrate maps
 *  @author pwaite
 */

public class MapDemo {

 /** Main method to demonstrate use of the Treemap class to
  *  hold a sorted set of mapped data.
  *  @param args Parameters that are entered on the command line.
  */

  public static void main(String[] args) {

      //ArrayList myList ...
      Map<String, Integer> map = new TreeMap<>();

      map.put("abc", 4);
      map.put("123", 5);
      map.put("def", 6);
      map.put("abc", 10);

      System.out.println(map);

      /*if (map.containsValue(6)) {
          System.out.println("The value 6 is in the map");
      }*/

      /*if (map.containsKey("123")) {
          System.out.println("The key 123 is in the map and here is the value:"
              + map.get("123"));
      }*/

      /*System.out.println();

      System.out.println("Here we are iterating over the map");


      for (Map.Entry<String, Integer> entry : map.entrySet()) {
          String key = entry.getKey();
          Integer value = entry.getValue();
          System.out.println(key + " => " + value);
      }*/




  }
}
