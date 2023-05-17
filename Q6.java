    package ASSIGNMENT3;



public class Q6 {
        public static void main(String[] args) {
            // Create a boxed String object and two variables that refer to that box
            Box<String> stringBox = new Box<>("Hello");
            Box<String> anotherStringBox = stringBox;
    
            System.out.println("Original stringBox value: " + stringBox.getItem());
            System.out.println("anotherStringBox value: " + anotherStringBox.getItem());
    
            // Change the contents of one and determine the effect on the other
            stringBox.setItem("World");
    
            System.out.println("Updated stringBox value: " + stringBox.getItem());
            System.out.println("Updated anotherStringBox value: " + anotherStringBox.getItem());
    
            System.out.println("------------------------");
    
            // Create a boxed Integer object and two variables that refer to that box
            Box<Integer> intBox = new Box<>(10);
            Box<Integer> anotherIntBox = intBox;
    
            System.out.println("Original intBox value: " + intBox.getItem());
            System.out.println("anotherIntBox value: " + anotherIntBox.getItem());
    
            // Change the contents of one and determine the effect on the other
            intBox.setItem(20);
    
            System.out.println("Updated intBox value: " + intBox.getItem());
            System.out.println("Updated anotherIntBox value: " + anotherIntBox.getItem());
    
            System.out.println("------------------------");
    
            // Create a boxed Object object and two variables that refer to that box
            Box<Object> objBox = new Box<>("Hello");
            Box<Object> anotherObjBox = objBox;
    
            System.out.println("Original objBox value: " + objBox.getItem());
            System.out.println("anotherObjBox value: " + anotherObjBox.getItem());
    
            // Determine what happens if you put a string in the box
            objBox.setItem("World");
    
            System.out.println("Updated objBox value: " + objBox.getItem());
            System.out.println("Updated anotherObjBox value: " + anotherObjBox.getItem());
    
            // Determine what happens if you put an integer in the box
            objBox.setItem(10);
    
            System.out.println("Updated objBox value: " + objBox.getItem());
            System.out.println("Updated anotherObjBox value: " + anotherObjBox.getItem());
        }
    }
    class Box<T> {
    public T t;
    public Box(T t) 
    {
        this.t = t;
    }
    public T getItem() 
    {
        return t;
    }
    public void setItem(T t) 
    {
        this.t = t;
    }
    }


