package main.Materia.Controllers;
import main.Materia.Models.Node;
import main.Materia.Models.NodeGraph;

import java.util.ArrayList;
import java.util.List;
public class Graph {
    private List<NodeGraph>nodes;

    public Graph() {
        this.nodes = new ArrayList<>();//>>>>para inicializar la lista nodos

    }

    public NodeGraph addNode (int value){
        NodeGraph newNode= new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }
    public void addEdge(NodeGraph src,NodeGraph dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }
    public void printGraph(){
        for (NodeGraph node:nodes){
            System.out.print("Vertex  "+node.getValue()+" : ");
            for (NodeGraph neighbor :  node.getNeighbors()){
                System.out.print("--> "+neighbor.getValue());

            }
            System.out.println();

        }
    }

    public void getDFS(NodeGraph startNode){

    }
    public void getDFSUtil(NodeGraph node,boolean[] visited){

    }
    public void getBFS(NodeGraph startNode){

    }
    public int [][] getAdjacencyMatrix(){
        
    }
    public void printAdjacencyMatrix(){

    }
}
