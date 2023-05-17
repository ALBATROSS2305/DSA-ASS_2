    package ASSIGNMENT3;



public class Q6 {
        public static void main(String[] args) {
            Box<String> stringBox = new Box<>("Hello");
            Box<String> anotherStringBox = stringBox;
    
            System.out.println("Original stringBox value: " + stringBox.getItem());
            System.out.println("anotherStringBox value: " + anotherStringBox.getItem());
 
            stringBox.setItem("World");
    
            System.out.println("Updated stringBox value: " + stringBox.getItem());
            System.out.println("Updated anotherStringBox value: " + anotherStringBox.getItem());
    
            System.out.println("########################");
    
            Box<Integer> intBox = new Box<>(10);
            Box<Integer> anotherIntBox = intBox;
    
            System.out.println("Original intBox value: " + intBox.getItem());
            System.out.println("anotherIntBox value: " + anotherIntBox.getItem());
    
            intBox.setItem(20);
    
            System.out.println("Updated intBox value: " + intBox.getItem());
            System.out.println("Updated anotherIntBox value: " + anotherIntBox.getItem());
    
            System.out.println("########################");
    
            Box<Object> objBox = new Box<>("Hello");
            Box<Object> anotherObjBox = objBox;
    
            System.out.println("Original objBox value: " + objBox.getItem());
            System.out.println("anotherObjBox value: " + anotherObjBox.getItem());

            objBox.setItem("World");
    
            System.out.println("Updated objBox value: " + objBox.getItem());
            System.out.println("Updated anotherObjBox value: " + anotherObjBox.getItem());

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


