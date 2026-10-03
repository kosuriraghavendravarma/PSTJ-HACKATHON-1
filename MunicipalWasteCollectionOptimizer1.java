import java.util.Scanner;
public class MunicipalWasteCollectionOptimizer1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Vehicle number : ");
        int Vehicleno = sc.nextInt();

        System.out.print("Enter Waste collected in Kg : "); 
        double wastecollected = sc.nextDouble();

        System.out.print("Enter Number of collection points : ");
        int noofcollectedpoints = sc.nextInt();

        System.out.print("Enter Vehicle status : ");
        char vehiclestatus = sc.next().charAt(0);

        System.out.println("========Details Of Waste Collection Vehicle==========");
        System.out.println("Vehicle number - "+Vehicleno);
        System.out.println("Waste collected in kilograms - "+wastecollected);
        System.out.println("Number of collection points  - "+noofcollectedpoints);
        System.out.println("Vehicle status - "+vehiclestatus);

    }
}