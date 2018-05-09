
public class NQrunner {
	public static void main(String[] args) {
		
		Movie LOP2 = new Movie("Land Of poop 2", 2 ); //have not seen the movie, but the second one is always worse {2 stars}- critics
		Movie LOP = new Movie("Land Of poop", 5 ); //Good movie. I can't believe the second one is coming out tomorrow {5 stars} - critics
		Movie FM = new Movie("Finding marlin", 4 );
		Movie BS = new Movie("Be scared", 5 );
		Movie NOTLH = new Movie("Night of the living human", 6 );
		Movie HELP = new Movie("Healthy elephents like pineapples", 2 );
		Movie ME = new Movie("My end", 3 );
		Movie Rubish = new Movie("Twilight",1); // *Barf noise* {1 star} - critics
		
		String BSPrice = BS.getTicketPrice();
		System.out.println(BSPrice);
		String trash = Rubish.getTicketPrice();
		System.out.println(trash);
		NetflixQueue NQ = new NetflixQueue();
		NQ.addMovie(LOP);
		NQ.addMovie(LOP2);
		NQ.addMovie(FM);
		NQ.addMovie(BS);
		NQ.addMovie(NOTLH);
		NQ.addMovie(HELP);
		NQ.addMovie(ME);
		NQ.addMovie(Rubish);
		NQ.printMovies();
		System.out.println("The best movie is (Drumroll please) " + NQ.getBestMovie() + "!" );
		NQ.sortMoviesByRating();
NQ.getMovie(1);
	System.out.println("The Second best movie is (a slightly quiter Drumroll please) " + NQ.getMovie(1) + "!" );
	}

}
