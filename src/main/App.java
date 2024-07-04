package main;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Materia.Controllers.AVLTree;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.Graph;
import main.Materia.Controllers.Sets;
import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;
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
       
        
        AVLTree tree = new AVLTree();

        int [] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        for (int value : values) {
            tree.insert(value);
        }

        runGraph();
        runSest();
    }

    private static void runSest() {
        new Sets();
    }

    private static void runGraph() {
        Graph graph=new Graph();
        //agregar nodos
        NodeGraph node1=graph.addNode(1);
        NodeGraph node2=graph.addNode(2);
        NodeGraph node3=graph.addNode(3);
        NodeGraph node4=graph.addNode(4);
        NodeGraph node5=graph.addNode(5);

        graph.addEdge(node1, node2);
        graph.addEdge(node2, node4);
        graph.addEdge(node4, node5);
        graph.addEdge(node1, node3);
        
        graph.printGraph();



    }
}
