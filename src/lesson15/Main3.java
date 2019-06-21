package lesson15;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main3 {

    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        HashSet<Integer> b = new HashSet<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);




        CollectionUtils utils = new CollectionUtillsImpl();
        Collection<Integer> resultUnion = utils.union(a, b);
        System.out.println(resultUnion);

        CollectionUtils utils1 = new CollectionUtillsImpl();
        Collection<Integer> resultUnion1 = utils1.intersection(a,b);
        System.out.println(resultUnion1);

        System.out.println(utils.unionWithoutDuplicate(a,b));

        System.out.println(utils.intersectionWithoutDuplicate(a,b));

        System.out.println(utils.difference(a,b));

    }


}
