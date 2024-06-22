package main;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;
/*
 *            ____1___
 *           /        \
 *          /           \
 *        2              3
 *      /    \          /
 *    4       5        6
 *  /        /
 * 7        8
 * 
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {
        Node nodeRoot=new Node(1);
        ArbolBinario arbolBinario=new ArbolBinario();
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));
        
        nodeRoot.getLeft().setLeft(new Node(4));
        nodeRoot.getLeft().setRight(new Node(5));

        nodeRoot.getRight().setRight(new Node(6));
        nodeRoot.getLeft().getLeft().setLeft(new Node(7));
        nodeRoot.getLeft().getRight().setRight(new Node(8));
        System.out.println("PreOrder-Loop");
        arbolBinario.preOrderLoop(nodeRoot);
        System.out.println("\nPreOrder-Recursivo");
        arbolBinario.preOrderRecursivo(nodeRoot);
        System.out.println("\nPostOrder-Loop");
        arbolBinario.postOrderLoop(nodeRoot);
        System.out.println("\nPostOrder-Recursivo");
        arbolBinario.postOrderRecursivo(nodeRoot);
        System.out.println("\nInOrder-Recursivo");
        arbolBinario.inOrderRecursivo(nodeRoot);
        
        ListLevels levels=new ListLevels();
        
        levels.listLevels(nodeRoot);
    }
}
