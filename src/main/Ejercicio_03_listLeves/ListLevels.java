package main.Ejercicio_03_listLeves;
import main.Materia.Models.*;

import java.util.ArrayList;
import java.util.List;
public class ListLevels {
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> resp=new ArrayList<>();
        auxList(root,0,resp);
        return resp;
    }

    private void auxList(Node root,int nivel,List<List<Node>> resp){
        if(root==null){
            return;
        }
        if(nivel==resp.size()){
            resp.add(new ArrayList<>());
        }
        resp.get(nivel).add(root);
        auxList(root.getLeft(),nivel+1,resp);
        auxList(root.getRight(),nivel+1,resp);

    }
        
        
}
