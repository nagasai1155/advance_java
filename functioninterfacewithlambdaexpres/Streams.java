package functioninterfacewithlambdaexpres;

import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String args[]){

         List <Integer> numberslist = new ArrayList<>();

         numberslist.add(3);
         numberslist.add(2);
         numberslist.add(5);

         List <Integer> evennumberss = new ArrayList<>();

//         for(int n: numberslist){
//             if(n%2==0){
//                 evennumbers.add(n);
//             }
//         }
//         System.out.println(evennumbers);//without using streams concept we filter a data from an collection
//



        //now using streams concept
//
//        evennumberss = numberslist.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(evennumberss);
//

      //numberslist.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        evennumberss = numberslist.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evennumberss);

    }
}
