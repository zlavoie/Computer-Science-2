//Zoe Lavoie
import java.util.*;

public class ATMSimulation2
{
     Customer customer;
     int ATMisAvailable;       // time the ATM is next available
     int ATMisAvailable2;     // time the ATM2 is next available
     int numArrivals;          // number of arrivals in any minute
     
     Queue<Customer> queue;
     Queue<Customer> queue2;

     // statistics
     int totalWaitingTime;      // for all customers
     int numCustomersServed;

     public ATMSimulation2()    // default constructor
     {
          ATMisAvailable = 0;  // assume the ATM is  available at time 0
          ATMisAvailable2 = 0;  // assume the ATM is  available at time 0
          numArrivals = 0;
          totalWaitingTime = 0;
          numCustomersServed = 0;
          queue = new Queue<Customer>();
          queue2 = new Queue<Customer>();
     }

     private int getArrivals()
     // generate a random integer in the range 0..9
     //  if the random integer is 0,1,2,3,or 4, then no arrivals ( 50% chance)
     //  if the random integer is 5,6,7, or 8, then 1 arrival (40 % chance)
     //  if the random integer is 9,  then 2 arrivals (10% chance)
     {
          Random rand = new Random();
          int randomInteger = rand.nextInt(10); // 0..9
          if ( randomInteger <= 4) // 0..4
               return 0;  // 50% chance of a single arrival
          if ( randomInteger <= 8) // 5..8
               return 1;  // 40% chance of a single arrival
          return 2; // 10% chance of 2 arrivals
     }

     private void displayStatistics()
     {
          System.out.println();
          System.out.println("Number of customers served "+ numCustomersServed);
          if(numCustomersServed!=0)
          {
          System.out.println("Average wait is about "+(totalWaitingTime/numCustomersServed )+ " minutes");
          }
          System.out.println("Customers left in queue(s): "+ ((queue.size())+queue2.size()));
     }

     public void simulate()
     {
       System.out.println("Enter time (minutes) for the simulation: ");
       System.out.println("A low number like 8 is best: ");
       Scanner scan=new Scanner(System.in);
       int mins=scan.nextInt();
       System.out.println();
       System.out.println("ATM SIMULATION -- "+mins+" MINUTES");
       
          for (int time = 0; time < mins; time++)   // for each minute
          {
            int q=0;
               numArrivals = getArrivals();                 // how many customers arrive?
               for (int i = 1; i <= numArrivals; i++)   // place each arrival into the queue
               {
                 
                 if(queue.size()<queue2.size()){
                     q=1;
                     queue.insert( new Customer(time));}
                   else if(queue2.size()<queue.size()){
                     q=2;
                     queue2.insert( new Customer(time));}
                   else{
                      queue.insert( new Customer(time));
                      q=1;}}
                   
                   if((queue.size()!=0)&& (ATMisAvailable <= time)){
                    customer = queue.remove();  // remove the next customer from the waiting line
                    // Determine the next time that the ATM is available: current time+ service time
                    ATMisAvailable = time + customer.getServiceTime();
                     // how long did this customer wait?
                 int timeCustomerWaited = time - customer.getArrivalTime();
                    totalWaitingTime += timeCustomerWaited;   // add customer's wait to total wait
                    numCustomersServed++;
                 }
                 if((queue2.size()!=0)&& (ATMisAvailable2 <= time)){
                     customer = queue2.remove();  // remove the next customer from the waiting line
                    // Determine the next time that the ATM is available: current time+ service time
                    ATMisAvailable2 = time + customer.getServiceTime();
                     // how long did this customer wait?
                    int timeCustomerWaited2 = time - customer.getArrivalTime();
                    totalWaitingTime += timeCustomerWaited2;   // add customer's wait to total wait
                    numCustomersServed++;
                 }
                 
         System.out.println();
          System.out.print("Time: "+ time);
          System.out.print("           Number of Arrivals: "+numArrivals);
          System.out.println();
          System.out.print("ATM-1:Available at: "+ ATMisAvailable+"          ATM-2:Available at: "+ATMisAvailable2);
          System.out.println();
          
          if(numArrivals!=0)
          {
            for(int z=1;z<=numArrivals;z++)
            {
              if((numArrivals==1)||((numArrivals>1)&&(z==1)))
              {
          System.out.print("               "+z+". Service Time "+customer.getServiceTime()+"        Enters Queue "+q);
          System.out.println();
          System.out.println("               Customer number "+z+" goes to ATM-"+q);
              }
              else if(queue.size()<queue2.size())
                {
                  q=2;
                  System.out.print("               "+z+". Service Time "+customer.getServiceTime()+"        Enters Queue "+q);
          System.out.println();
          System.out.println("               Customer number "+numCustomersServed+" goes to ATM-"+q);
                }
              else{
                q=2;
          System.out.print("               "+z+". Service Time "+customer.getServiceTime()+"        Enters Queue "+q);
          System.out.println();
          System.out.println("               Customer number "+z+" goes to ATM-"+q);
              }
          }
          }
               }
          displayStatistics();
     }

     public static void main(String[] args)
     {
          ATMSimulation2 atmSim = new ATMSimulation2();
          atmSim.simulate();
     }
}
