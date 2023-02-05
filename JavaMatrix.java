package javamatrix;
import java.util.*;

public class JavaMatrix {

    public static void main(String[] args) {
       List<String> lista = new ArrayList<String>();
       lista.add("João da Silva");
       lista.add("Antonio Sousa");
       lista.add("Lucia Ferreira");
       lista.add("Antonio Sousa");
       System.out.println("O valor da lista eh" +lista);
    }
    HashSet<String> conjunto = new HashSet<String>();
    conjunto.add("Opa");
    conjunto.add("João da Silva");
    conjunto.add("Antonio Sousa");
    conjunto.add("Antonio Sousa");
    System.out.prinln("O valor da Hashet eh "+conjunto);

    Map m = new HashMap();
    m.put("Julia",  "8 anos");
    m.put("Opa");
    m.put("Joao da Silva", value:"");
    m.put("Antonio Sousa");
    m.put("Antonio Sousa");
    
}
