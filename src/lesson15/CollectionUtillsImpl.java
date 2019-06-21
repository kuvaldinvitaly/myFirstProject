package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtillsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : a) {
            result.add(number);
        }

        for (Integer number : b) {
            result.add(number);
        }
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result1 = new ArrayList<>();
        for (Integer number : a) {
            if (b.contains(number)) {
                result1.add(number);
            }
        }
        for (Integer number : b) {
            if (a.contains(number)) {
                result1.add(number);
            }

        }

        return result1;
    }


    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {
        HashSet<Integer> vivod = new HashSet<>();

        for (Integer number : a) {
            vivod.add(number);

        }

        for (Integer number : b) {
            vivod.add(number);
        }

        return vivod;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {
        HashSet<Integer> vivod = new HashSet<>();

        for (Integer number : a){
            if (b.contains(number)){
                vivod.add(number);
            }
        }

        for (Integer number : b){
            if (a.contains(number)){
                vivod.add(number);
            }
        }


        return vivod;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {
        ArrayList<Integer> raznost = new ArrayList<>();

        for (Integer number : a){
            if (!(b.contains(number))){
                raznost.add(number);
            }
        }

        for (Integer number : b) {
            if(!(a.contains(number))){
                raznost.add(number);
            }
        }

        return raznost;
    }
}
