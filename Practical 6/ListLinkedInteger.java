/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;

/**
 *
 * @author User
 */
public class ListLinkedInteger implements SLinkedListInteger {
    LinkedList<Integer> theList=new LinkedList<>();
    
    public boolean isOnList(Integer dataItem){
        if(theList.contains(dataItem)){
            return true;
        }
        else{
             return false;
        }
       
        
    }
    public SNodeInteger deleteHeadNode(){
        theList.pop();
        return null;
    }
    public void addANodeToStart(Integer itemToAdd){
        
    }
    public int length(){
        return theList.size();
    }
    public void displayList(){
        for (int i = 0; i < theList.size(); i++) {
            System.out.println(theList.pop());
        }
    }
}
