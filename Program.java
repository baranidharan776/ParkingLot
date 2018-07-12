package com.creditmantri;


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Maximum Slot Size");
        int size = input.nextInt();
        ParkingSpace ps = new ParkingSpace();
        ps.setParkingSlot(new ParkingSlot());
        ps.initialize(size);
        ps.checkStatus();
        Boolean isNotExit= true;
        while(isNotExit){
            System.out.println("Enter the Opearation to be performed");
            System.out.println("1 : Park Your Car");
            System.out.println("2 : Leave from Parking");
            System.out.println("3 : Display Parking Lot");
            System.out.println("4 : Exit");

            String command = input.next();
            switch(command){
                case "1":
                    if(ps.isAvailable()){
                        System.out.println("Enter the Car No to Park");
                        String licencePlate = input.next();
                        ps.parkCar(licencePlate);
                    }else{
                        System.out.println("Parking Space is full");
                    }

                    break;
                case "2":
                    System.out.println("Enter the Slot id to Leave Parking");
                    int id = input.nextInt();
                    ps.leaveParking(id);
                    break;
                case "3":
                    ps.display();
                    break;
                case "4":
                    isNotExit = false;
                    break;
            }
        }
    }

}
