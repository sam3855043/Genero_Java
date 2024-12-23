// package Human_sample.tina;

// public class Human {
//     String name;
//     int age, height;

//     // Constructor to initialize the name
//     public Human(String str) {
//         name = str;
//     }

//     // Static factory method to create a new Human object
//     public static Human create(String str) {
//         return new Human(str);  // Creates a new Human object with the given name
//     }

//     // Method to set age and height
//     public void setValue(int a, int h) {
//         age = a;
//         height = h;
//     }

//     // Optionally, you can add a method to display Human details
//     @Override
//     public String toString() {
//         return "Human{name='" + name + "', age=" + age + ", height=" + height + "}";
//     }
// }


package Human_sample.tina;

public class Human {
    String name;
    int age,height;
    // public Human(String str){
    //     name = str;
    // }// end of constructor(String)
    public  void setValue(int a,int h){
        age = a;
        height = h;
        
    }// end of setValue()
}//end of class Human