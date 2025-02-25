import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);

        // Create a new Movie object
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
        
        System.out.println(movie.toString());

        keyboard.close();
    }
}