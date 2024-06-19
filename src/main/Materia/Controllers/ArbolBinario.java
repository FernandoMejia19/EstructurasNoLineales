package main.Materia.Controllers;
import main.Materia.Models.Node;
import java.util.Stack;

public class ArbolBinario {
    //recorrido del arbol de tipo predorder
    public void preOrderLoop(Node root){
        if (root==null){
            return;
        }
        Stack<Node> stack=new Stack<>();
        ///agregamos a la pila la raiz praa empezar el recorrido
        stack.push(root);
        while(!stack.isEmpty()){
            Node node=stack.pop();
            System.out.print(node.getValue()+" - ");
            if (node.getRight() !=null){
                stack.push(node.getRight());
            }
            if (node.getLeft() !=null){
                stack.push(node.getLeft());
            }
        }
    }
    public void preOrderRecursivo(Node root){
        if (root!=null){
            System.out.print(root.getValue()+"  -  ");
            preOrderLoop(root.getLeft());
            preOrderLoop(root.getRight());
        }
    }
    public void postOrderLoop(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack1=new Stack<>();
        Stack<Node> stack2=new Stack<>();
        stack1.push(root);

        while(!stack1.isEmpty()){
            Node node=stack1.pop();
            stack2.push(node);
            if (node.getLeft()!=null){
                stack1.push(node.getLeft());
            }
            if (node.getRight()!=null){
                stack1.push(node.getRight());
            }
        }
        while (!stack2.isEmpty()){
            Node node=stack2.pop();
            System.out.print(node.getValue()+"  -  ");

        }
    }
    public void postOrderRecursivo(Node root){
        if(root!=null){
            postOrderRecursivo(root.getLeft());
            postOrderRecursivo(root.getRight());
            System.out.print(root.getValue()+"  -  ");
        }
    }
    public void inOrderRecursivo(Node root){
        if(root!=null){
            postOrderRecursivo(root.getLeft());
            System.out.print(root.getValue()+"  -  ");
            postOrderRecursivo(root.getRight());
        }
    }
}
