package com.abhishek.view;

import java.util.ArrayList;
import org.apache.myfaces.trinidad.model.ChildPropertyTreeModel;

public class TreeTableBean {
     private ArrayList<TreeNodeDS> list= new ArrayList<TreeNodeDS>();
     private ChildPropertyTreeModel characterValue=null;

    public void setCharacterValue(ChildPropertyTreeModel characterValue) {
        this.characterValue = characterValue;
    }

    public ChildPropertyTreeModel getCharacterValue() {
        return characterValue;
    }

    public TreeTableBean() {
        super();
        TreeNodeDS  treeNodeDS=new TreeNodeDS("Department", "");
        
        TreeNodeDS  firstLevel0=new TreeNodeDS("CSE", "");
        TreeNodeDS  firstLeve11=new TreeNodeDS("1", "Abhishek");
        TreeNodeDS  firstLeve12=new TreeNodeDS("2", "Remo");
        firstLevel0.addNewChild(firstLeve11);
        firstLevel0.addNewChild(firstLeve12);
        treeNodeDS.addNewChild(firstLevel0);
        
        
        TreeNodeDS  secondLevel0=new TreeNodeDS("ECE", "");
        TreeNodeDS  secondLevel1=new TreeNodeDS("1", "Sayan");
        TreeNodeDS secondLevel12=new TreeNodeDS("2", "Dibra");
        secondLevel0.addNewChild(firstLeve11);
        secondLevel0.addNewChild(firstLeve12);
        treeNodeDS.addNewChild(secondLevel0);
        
        
        TreeNodeDS  thirdLevel0=new TreeNodeDS("Civil", "");
        TreeNodeDS  thirdLevel11=new TreeNodeDS("1", "Simontini");
        TreeNodeDS  thirdLevel12=new TreeNodeDS("2", "Dipten");
        thirdLevel0.addNewChild(thirdLevel11);
        thirdLevel0.addNewChild(thirdLevel12);
        treeNodeDS.addNewChild(thirdLevel0);
        
        list.add(treeNodeDS);
        
        characterValue = new ChildPropertyTreeModel(list, "child");
        
    }

   
}
