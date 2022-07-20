package coleções;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Pedro");
        usuarios.put(3, "João");
        usuarios.put(4, "Sara");
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.size());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsKey(1));
        System.out.println(usuarios.containsValue("Pedro"));
        System.out.println(usuarios.get(1));
        usuarios.remove(1);
        for (int key :
                usuarios.keySet()) {
            System.out.println(key);
        }
        for (String valor :
                usuarios.values()) {
            System.out.println(valor);
        }
        for (Map.Entry<Integer, String> valor:
        usuarios.entrySet()){
            System.out.print(valor.getKey() + " ");
            System.out.println(valor.getValue());

        }


    }
}
