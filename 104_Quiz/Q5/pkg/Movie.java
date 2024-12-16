package pkg;

public class Movie{
String movie;
double rating;
int numberofrating;
int revenue;



public Movie(){
    movie = "Avengers";
    rating = 8.0;
    numberofrating = 33;
    revenue = 623357910;
}

public Movie(String movie, double rating, int numberofrating, int revenue){
    this.movie = movie;
    this.rating = rating;
    this.numberofrating = numberofrating;
    this.revenue = revenue;
}


public void movieToString(){
    System.out.println("movie: " + movie);
    System.out.println("rating: " + rating);
    System.out.println("number of ratings: " + numberofrating);
    System.out.println("revenue: " + revenue);
    System.out.println();
}
public void setMovieRevenue(String movie){
    this.movie = movie;
}
public void setMovieRevenue(int revenue){
    this.revenue = revenue;
}
public String getMovieName(){
    return movie;
}
public int getRevenue(){
    return revenue;
}

public double addRating(double adding){
    rating = rating*numberofrating;
    rating = adding+rating;
    numberofrating = numberofrating +1;
    rating = rating/(numberofrating);
    return rating;
}

public boolean compareRatings(Movie josh){
    if(josh.rating > rating){
        return false;
    }
    else{
        return true;
    }
}


}