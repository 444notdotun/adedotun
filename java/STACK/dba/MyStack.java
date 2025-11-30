package dba;


public class MyStack {
    private boolean stackStatus = true;
    private String[] stackElement=new String[4];
    private int stackSize=0;


    public boolean isEmpty(){

        return stackStatus;
    }


    public void add(String item){
        stackStatus = false;
        this.stackElement[stackSize] = item;
        stackSize++;

    }


    public String pop() {
        if(stackStatus){
            throw new IllegalStateException("Stack is empty");
        }
        String pop =  stackElement[--stackSize];
        stackElement[stackSize] = null;
        return pop;
    }

    public String peek() {
        if(stackStatus){
            throw new IllegalStateException("Stack is empty");
        }
    return stackElement[stackSize-1];

    }
}
