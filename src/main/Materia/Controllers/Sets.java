package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public Sets(){
        construirHashSet();
        construirLinkedHashSet();
        construirTreeSet();
        construirTreeSetConComparador();

    }
    //construir y mostrar un hashset
    public void construirHashSet(){
        HashSet<String>conjunto=new HashSet<>();
        conjunto.add("Manzana");
        System.out.println("HashSet:  "+conjunto);
        conjunto.add("Banana");
        System.out.println("HashSet:  "+conjunto);
        conjunto.add("Naranja");
        System.out.println("HashSet:  "+conjunto);
        conjunto.add("Manzana");
        System.out.println("HashSet:  "+conjunto);
        conjunto.add("Uvas");
        System.out.println("HashSet:  "+conjunto);
        conjunto.add("Piñas");
        System.out.println("HashSet:  "+conjunto);
        conjunto.remove("Uvas");
        System.out.println("HashSet:  "+conjunto);

        //verificar si un elemento existe

        boolean contieneNaranja=conjunto.contains("Naranja");
        System.out.println("HashSet contiene Naranja?:"+contieneNaranja);
        int tamano=conjunto.size();
        System.out.println("Tamaño del HashSet  "+tamano);
    }
    //construir y mostrar un linkedhash
    public void construirLinkedHashSet(){
        LinkedHashSet<String>conjunto=new LinkedHashSet<>();
        
        conjunto.add("Manzana");
        conjunto.add("Banana");        
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piñas");
        System.out.println("LinkedHashSet:  "+conjunto);
       
    }

    public void construirTreeSet(){
        TreeSet<String>conjunto=new TreeSet<>();
        
        conjunto.add("Manzana");
        conjunto.add("Banana");        
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piñas");
        System.out.println("TreeSet:  "+conjunto);
    }

    public void construirTreeSetConComparador(){
        //comparador personalizado
        Comparator<String> comparadorInverso=new Comparator<String>() {
            @Override
            public int compare(String s1,String s2){
                return s2.compareTo(s1);
            }
            
        };
        TreeSet<String>conjunto=new TreeSet<>(comparadorInverso);
        
        conjunto.add("Manzana");
        conjunto.add("Banana");        
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piñas");
        System.out.println("TreeSetComparador:  "+conjunto);
    }
    
}
