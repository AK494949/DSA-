class Stack {
    int[] arr;
    int top;
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    
    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
        }
    }


    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + arr[top--]);
        }
    }


    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top Element: " + arr[top]);
        }
    }
    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = 0; i <=top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class basicstack {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.print("Stack: ");
        s.display();

        s.pop();

        System.out.print("After Pop: ");
        s.display();

        s.peek();
    }
}