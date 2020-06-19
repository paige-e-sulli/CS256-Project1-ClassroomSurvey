import java.util.*; 

public class ClassroomIntroSurvey {

  public static void main(String[] args) {

  
    Scanner user_input = new Scanner(System.in);
    System.out.println("\n\n");


    System.out.println("Classroom Intro Survey\n\n");


    System.out.println("Enter your name:");
    String name = user_input.nextLine();
    System.out.println("\n\n");
  

    System.out.println("What is your favorite subject?");
    String subject = user_input.nextLine();
    System.out.println("\n\n");


    System.out.println("What is your favorite book?");
    String book = user_input.nextLine();
    System.out.println("\n\n");


    System.out.println("Who was your teacher last year?");
    String previous_teacher = user_input.nextLine();
    System.out.println("\n\n");


    System.out.println("What is your favorite memory from class with " + previous_teacher + "?");
    String memory = user_input.nextLine();
    System.out.println("\n\n");


    System.out.println("Who is your teacher for this year?");
    String new_teacher = user_input.nextLine();
    System.out.println("\n\n");


    System.out.println("What are you looking forward to learning in class with " + new_teacher + "?");
    String learn = user_input.nextLine();
    System.out.println("\n\n\n");

    System.out.println("You answered the survey questions as follows:"  + "\n\n" + "1. " + name + "\n" + "2. " + subject + "\n" + "3. " + book + "\n" + "4. " + previous_teacher + "\n" + "5. " + memory + "\n" + "6. " + new_teacher + "\n" + "7. " + learn + "\n\n");
    System.out.println("These answers will be sent to " + new_teacher + " to help make this year great!");
    System.out.println("\n\n");


    System.out.println("Thank you for taking the introduction survey, " + name + "! :) ");

    
  }
}
