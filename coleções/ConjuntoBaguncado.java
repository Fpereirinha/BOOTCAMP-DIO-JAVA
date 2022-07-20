package coleções;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add("x");
        System.out.println(conjunto.size());
        conjunto.remove(9);
        conjunto.remove("x");
        System.out.println(conjunto.size());
        System.out.println(conjunto.contains("Teste"));
        System.out.println(conjunto.contains(false));

        Set nums = new HashSet();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
        System.out.println(conjunto);
        conjunto.addAll(nums); // união de 2 conjuntos.
        System.out.println(conjunto);
        conjunto.retainAll(nums); // apenas semelhantes.
        System.out.println(conjunto);
        conjunto.clear();
        nums.clear();
        System.out.printf("%s %s", nums, conjunto);
    }
}
