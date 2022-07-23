import java.util.Scanner;

//ftpc == Flight Ticket Price Calculation;

/*
* yTraveller == Young traveller
* mTraveller ==middle-aged traveler
* oTraveller == Old traveller
* dfTraveller =round trip passenger
* aKm = amount km
*/


public class ftpc {
    public static void main(String[] args) {
        int km, age, type;
        double perKm = 0.10, amount;
        double aKm, yTraveller, mTraveller, oTraveller, oneWay, roundTrip, tt;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your age : ");
        age = inp.nextInt();

        System.out.println("Enter the distance you will go (km)");
        km = inp.nextInt();

        if ((km < 1) || (age < 1)) {
            System.out.println("You entered an incorrect value !");

        } else if (age <= 12) {
            System.out.println("Please choose your mode of departure 1.) One Way 2.) Round Trip :");
            type = inp.nextInt();
            switch (type) {
                case 1:
                    aKm = km * perKm;
                    yTraveller = aKm * 0.50;
                    tt = aKm - yTraveller;
                    oneWay = yTraveller;
                    System.out.println("Total Amount : " + tt);
                    break;
                case 2:
                    aKm = km * perKm;
                    yTraveller = aKm * 0.50;
                    tt = aKm - yTraveller;
                    roundTrip = tt * 0.20;
                    amount = tt - roundTrip;
                    System.out.println("Total Amount : " + amount);

                    break;
                default:
                    System.out.println("You entered an incorrect value !");

            }
            if ((age >= 13) && (age <= 24)) {
                System.out.println("Please choose your mode of departure 1.) One Way 2.) Round Trip :");
                type = inp.nextInt();
                switch (type) {
                    case 1:
                        aKm = km * perKm;
                        mTraveller = aKm * 0.10;
                        tt = aKm - mTraveller;
                        oneWay = mTraveller;
                        System.out.println("Total Amount : " + tt);
                        break;
                    case 2:
                        aKm = km * perKm;
                        mTraveller = aKm * 0.50;
                        tt = aKm - mTraveller;
                        roundTrip = tt * 0.20;
                        amount = tt - roundTrip;
                        System.out.println("Total Amount : " + amount);

                        break;
                    default:
                        System.out.println("You entered an incorrect value !");
                }


            } else if (age >=65) {
                System.out.println("Please choose your mode of departure 1.) One Way 2.) Round Trip :");
                type = inp.nextInt();
                switch (type) {
                    case 1:
                        aKm = km * perKm;
                        oTraveller = aKm * 0.30;
                        tt = aKm - oTraveller;
                        oneWay = oTraveller;
                        System.out.println("Total Amount : " + tt);
                        break;
                    case 2:
                        aKm = km * perKm;
                        oTraveller = aKm * 0.50;
                        tt = aKm - oTraveller;
                        roundTrip = tt * 0.20;
                        amount = tt - roundTrip;
                        System.out.println("Total Amount : " + amount);

                        break;
                    default:
                        System.out.println("You entered an incorrect value !");
                }

            }


        }
    }
}