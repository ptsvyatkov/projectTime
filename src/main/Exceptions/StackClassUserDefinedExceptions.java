package Exceptions;

class StackOverflowException extends Exception {
    @Override
    public String toString() {
        return "Stack overflow error, stack is full.";
    }
}

class StackUnderflowException extends Exception {
    @Override
    public String toString() {
        return "Stack underflow error, stack is empty";
    }
}

class Stack {
    private int[] array;
    int top = -1;
    private int size;

    public Stack(int size) {
        this.size = size;
        array = new int[size];
    }

    public int size() {
        return array.length;
    }

    public void push(int x) throws StackOverflowException {
        if (top == size()-1) {
            throw new StackOverflowException();
        } else {
            top++;
            array[top] = x;
        }
    }

    public int pop() throws StackUnderflowException{
        int x = -1;
        if (top == -1) {
            throw new StackUnderflowException();
        } else {
            x = array[top];
            top--;
            return x;
        }
    }
}

public class StackClassUserDefinedExceptions {
    public static void main(String[] args) {
        Stack s = new Stack(2);
        try {
            s.push(5);
            s.push(10);
        //    s.push(15);       // Would cause stack overflow error
            s.pop();
            s.pop();
        //    s.pop();          // Would cause stack underflow error
        } catch (StackOverflowException | StackUnderflowException e) {
            System.out.println(e);
        }
    }
}
