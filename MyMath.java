package occ.cs272.h04;

public class MyMath {
    public static double epsilon = 0.00001;
    
    public static void setTolerance(double e)
    {
        epsilon = e;
    }
    
    public static double squareRoot(double x)
    {
        // TODO: Complete squareRoot method by calling the recursive helper method squareRootGuess
        return squareRootGuess(x,3);
    }
    
    public static double squareRootGuess(double x, double g) {
        // TODO: Complete this recursive helper method
        // Given a value x > 0 and a guess g for the square root, a better guess is (g + x/g) / 2.
        // If g^2 is approximately equal to x, return g, otherwise, return squareRootGuess with a
        // better guess.
        // We can say that g^2 is approximately equal to x when g^2 is within epsilon of x. 
        
        if(Math.pow(g, 2) < (x + epsilon) && Math.pow(g, 2) > (x - epsilon))
        {
            return g;
        }
        else
        {
            double betGuess = (g + x/g) / 2;
            return squareRootGuess(x,betGuess); 
        }
        
    }
}
