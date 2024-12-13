package pkg;

public class Movie{
    private String movieName;
    private double rating;
    private int numRatings;
    private int revenue;
    
    // Part 1
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String mn, double ra, int nr, int re){
        movieName = mn;
        rating = ra;
        numRatings = nr;
        revenue = re;
    }
    
    // Part 2
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println("");
    }
    
    // Part 3
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    // Part 4
    public void addRating(double newRating){
        double combinedRatings = rating * numRatings;
        combinedRatings += newRating;
        numRatings++;
        rating = combinedRatings / numRatings;
    }
    
    // Part 5
    public double getRating(){
        return rating;
    }
    
    public boolean compareRatings(Movie otherMovie){
        if (this.rating > otherMovie.getRating()){
            return true;
        }
        return false;
    }
    
    // Part 6
    public String revenueToString(){
        int millions = revenue / 1000000;
        int thousands = revenue / 1000;
        while (thousands >= 1000){
            if (thousands > 100000){
                thousands -= 100000;
            }else if (thousands > 10000){
                thousands -= 10000;
            }else if (thousands > 1000){
                thousands -= 1000;
            }
        }
        int hundreds = revenue;
        while (hundreds >= 1000){
            if (hundreds > 100000000){
                hundreds -= 100000000;
            }else if (hundreds > 10000000){
                hundreds -= 10000000;
            }else if (hundreds > 1000000){
                hundreds -= 1000000;
            }else if (hundreds > 100000){
                hundreds -= 100000;
            }else if (hundreds > 10000){
                hundreds -= 10000;
            }else if (hundreds > 1000){
                hundreds -= 1000;
            }
        }
        String revString = new String(millions + "," + thousands + "," + hundreds);
        return revString;
    }
    
    // Part 7
    public Movie pirateMovie(){
        return new Movie(this.movieName, this.rating, this.numRatings, this.revenue);
    }
}
