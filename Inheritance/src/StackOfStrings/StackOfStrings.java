package StackOfStrings;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }
    public void push(String item){
        data.add(item);
    }
    public String pop(){
        if(isEmpty()) throw new EmptyStackException();
        String toPop = data.get(data.size()-1);
        data.remove(toPop);
        return toPop;
    }
    public String peek(){
        if(isEmpty()) throw new EmptyStackException();
        return data.get(data.size()-1);
    }
    public boolean isEmpty(){
        return data.size()==0;
    }
}
