
package mogul;
import java.util.Scanner;

public class Mogul {

    public static void main(String[] args) {
        /*Request the following values from the user at the command line:
        Cost of property (assume that is in dollars)
        The inflation rate (e.g. 0.05 for inflation rate of 5%)
        Property appreciation rate (e.g. 0.10 for an appreciation of 10%)
        */
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the value of property: $");
        double propertyValue = in.nextDouble();
        
        System.out.print("Enter the inflation rate (e.g., 0.05 for 5%): ");
        double inflationRate = in.nextDouble();
        
        System.out.print("Enter the property appreciation rate (e.g., 0.10 for 10%): ");
        double appreciationRate = in.nextDouble();
        
        //Output should be: "Your investment's net profit is $X." Where $X is the net profit.
        
        //Net profit for one year is calculated as: Net Profit=(Value of property * Rate of appreciation)-(Value of property * Rate of inflation).
        
        double netProfit;
        netProfit = (propertyValue * appreciationRate)-(propertyValue * inflationRate);
        
        System.out.printf("Your investment's net profit is $%.2f", netProfit);
        System.out.println();
        
    }
    
}
