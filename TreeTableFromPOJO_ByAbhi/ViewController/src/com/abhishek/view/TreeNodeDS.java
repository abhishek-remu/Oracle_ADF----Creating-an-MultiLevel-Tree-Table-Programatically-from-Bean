package com.abhishek.view;

import java.util.ArrayList;

public class TreeNodeDS {
   private String id;
   private String description;
   private ArrayList<TreeNodeDS> child= new ArrayList<TreeNodeDS>();


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setChild(ArrayList<TreeNodeDS> child) {
        this.child = child;
    }

    public ArrayList<TreeNodeDS> getChild() {
        return child;
    }

    public TreeNodeDS(String id,String description ) {
        super();
        this.id=id;
        this.description=description;
    }
    
    public void addNewChild(TreeNodeDS treeNodeDS){
        child.add(treeNodeDS);
    }
}
