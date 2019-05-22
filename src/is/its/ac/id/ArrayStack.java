package is.its.ac.id;

public class ArrayStack implements Stack {
    int top = -1;
    Object[] data;

    ArrayStack(){
        data=new Object[100];
    }

    @Override
    public boolean isEmpty() {
        if (top==-1){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object push(Object item) {
        top++;
        data[top]=item;
        return item;
    }

    @Override
    public Object peek() {
        return data[top];
    }

    @Override
    public Object pop() {
        Object d = data[top];
        top--;
        return d;
    }

    @Override
    public int search(Object o) {
        for (int i = 0; i < top; i++) {
            if (data[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
}
