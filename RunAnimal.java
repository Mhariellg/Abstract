import java.util.Scanner;

public class RunAnimal{
	public static void main (String[] args ){
		
		Scanner c = new Scanner(System.in);
		
		Bird bd = new Bird();
		Cat ct = new Cat();
		Dog dg = new Dog();
		
		System.out.println("Choose an animal");
		System.out.println("Press B for Bird, C for Cat, or D for Dog: ");
		String input = c.nextLine();
		
		
		if (input.equalsIgnoreCase("B")){
			
			bd.eat();
			bd.sleep();
			bd.makeSound();
			
			
			}
	
		else if (input.equalsIgnoreCase("C")){
			
			ct.eat();
			ct.sleep();
			ct.makeSound();
			
			
			}
		else if(input.equalsIgnoreCase("D")){
			
			dg.eat();
			dg.sleep();
			dg.makeSound();
			
			}

		}
	}