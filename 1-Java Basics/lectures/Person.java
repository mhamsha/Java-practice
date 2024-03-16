// import java.lang.*;
// public class myFirstProgram {
// 	public static void main(String[] args) {
// 		System.out.print("welcome to New world of JAVA");  
//         }

// }

// class Overloading {
//     public static void main(String[] args) {
//         System.out.println(calculateScore("Aniket", 200));
//         System.out.println(calculateScore(100, "Aniket"));
//     }


//     public static int calculateScore(String name, int score) {
//         return score * 1000;
//     }

//     public static String calculateScore(int score, String name) {
//         return name;
//     }
// }

// class Overloading{
// 	String name;
// 	int score;
	
// 	public void printName() {
// 		System.out.println("Name is " + name);
// 	}
// 	public void printScore() {
// 		System.out.println("Score is " + score);
// 	}
// 	public void printScore(String name, int score) {
// 		System.out.println("Player name is " + name + " and score is " + score);

// 	}
// 	public void printScore(int score, String name) {
// 		System.out.println("Player name is " + score + " and score is " + name );
// 	}

// }
// class Shape{
// 	String color;

// }
// class Triangle extends Shape{
// 	String color1;
// }
// public class OopClass{
// 	public static void main(String[] args) {
// 		// Overloading obj = new Overloading();
// 		// Overloading obj2 = new Overloading();
// 		// Overloading obj3 = new Overloading();
// 		// // obj.printScore("hamza", 100);
// 		// // obj2.printScore("haris", 200); 
// 		// obj.name = "Aniket";
// 		// obj.score = 100;
// 		// obj.printName();	
// 		// obj.printScore();
// 		// obj2.name = "haris";
// 		// obj2.score = 200;
// 		// obj2.printName();
// 		// obj2.printScore();
// 		// obj3.name = "hamza";
// 		// obj3.score = 300;
// 		// obj3.printName();
// 		// obj3.printScore();
// 		Triangle t1 = new Triangle();
// 		t1.color = "Red";
// 		t1.color1 = "blue";
// 		System.out.println(t1.color);
// 		System.out.println(t1.color1);
// 	}
// }

public class Person {
    private String name;
    private String fatherName;
    private int age;
    private String dateOfBirth;

    // Constructor to initialize basic information
    public Person(String name, String fatherName, int age, String dateOfBirth) {
        this.name = name;
        this.fatherName = fatherName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    // Display basic information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Age: " + age);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("M. Jamshaid Tariq", "Muhammad Tariq khokhar", 17, "01/02/2006");

        // Display information
        person.displayInfo();}
}