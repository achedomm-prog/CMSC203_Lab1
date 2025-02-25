

	import java.util.Scanner;

	public class MovieDriver_Task2 {
	    public static void main(String[] args) {
	        
	        Scanner keyboard = new Scanner(System.in);
	        String continueInput; 

	        do {
	            
	            Movie movie = new Movie();

	            
	            System.out.print("Enter the title of a movie: ");
	            String title = keyboard.nextLine();
	            movie.setTitle(title); 
	            
	            System.out.print("Enter the movie's rating: ");
	            String rating = keyboard.nextLine();
	            movie.setRating(rating); 
	            
	            System.out.print("Enter the number of tickets sold: ");
	            int soldTickets = keyboard.nextInt();
	            movie.setSoldTickets(soldTickets); 
	            
	            keyboard.nextLine();

	            System.out.println(movie.toString());

	            System.out.print("Do you want to enter another movie? (y/n): ");
	            continueInput = keyboard.nextLine();

	        } while (continueInput.equalsIgnoreCase("y")); 
	        
	        System.out.println("Goodbye!");

	        keyboard.close();
	    }
	}

