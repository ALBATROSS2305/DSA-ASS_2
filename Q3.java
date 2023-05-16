package ASSIGNMENT3;

public class Q3 {
    public static void main(String[] args) {

        try {
                Student s1 = new Student("S", 95);
                Student s2 = new Student("I", 908);
            } catch (MarksOutOfBoundException e) {
                e.printStackTrace();
            } 
        }
    }
    class Student {
        private String name;
        private int mark;
        
        public Student(String name, int mark) throws MarksOutOfBoundException {
            this.name = name;
            if (mark > 100) {
                throw new MarksOutOfBoundException("Mark can't be greater than 100");
            }
            this.mark = mark;
        }
        
        public String getName() {
            return name;
        }
        
        public int getMark() {
            return mark;
        } 
    }
    
    class MarksOutOfBoundException extends Exception {
        public MarksOutOfBoundException(String message) {
            super(message);
        }
    }
    
