package edu.uopeople.cs3303datastructures.unit3;


import java.util.Arrays;

/**
 * author YongZhi
 * date: 2021-07-07
 *
 * @param <E>
 */
public class StackCarInspection<E> {

    static final int MAX_SIZE = 200;
    int top;
    private E[] array = (E[]) new Object[MAX_SIZE]; //Size limit of Stack

    boolean isEmpty() {
        return (top < 0);
    }

    StackCarInspection() {
        top = -1;
    }

    boolean push(E x) {
        if (top >= (MAX_SIZE - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            array[++top] = x;
            System.out.println(x.toString() + " pushed into stack");
            return true;
        }
    }

    E pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            E x = array[top--];
//            garbage collection
            array[top + 1] = null;
            return x;
        }
    }

    E peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            E x = array[top];
            return x;
        }
    }



    public static void main(String[] args) {
        StackCarInspection<Integer> stackCarInspection = new StackCarInspection<>();
//        vehicle begins the line
        stackCarInspection.push(2);
        stackCarInspection.push(1);
        stackCarInspection.push(0);
//        First Testing Station
        System.out.println("Testing Station number @ "+stackCarInspection.pop());
//        First Testing Station
        System.out.println("Testing Station number @ "+stackCarInspection.pop());
//        First Testing Station
        System.out.println("Testing Station number @ "+stackCarInspection.pop());

//        Check if elements are deleted correctly
        System.out.println("array=" + Arrays.toString(stackCarInspection.array));

    }

    @Override
    public String toString() {
        return "StackCarInspection{" +
                "top=" + top +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
