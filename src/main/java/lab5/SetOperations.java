package lab5;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static Set<Integer> createUnion(Set<Integer> seta,Set<Integer> setb){
        //объединение
        Set<Integer> union = new HashSet<>(seta);
        union.addAll(setb);
        return union;
    }
    public static Set<Integer> createIntersection(Set<Integer> seta,Set<Integer> setb){
        //пересечение
        Set<Integer> intersection = new HashSet<>(seta);
        intersection.retainAll(setb);
        return intersection;
    }
    public static Set<Integer> createDifference(Set<Integer> seta,Set<Integer> setb){
        //разность а/б
        Set<Integer> difference = new HashSet<>(seta);
        difference.removeAll(setb);
        return difference;
    }


    public static boolean isSubset(Set<Integer> firstSet,Set<Integer> secondSet){
        return firstSet.containsAll(secondSet);
    }
}
