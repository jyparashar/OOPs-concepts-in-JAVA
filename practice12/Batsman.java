package practice12;

import java.util.Scanner;

class BatsmanData {
    int bcode;
    String bname;
    int innings, notout, runs;
    float batavg;

    float calcavg() {
        return (runs / (innings - notout));
    }

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Batsman Name:");
        bname = sc.nextLine();
        System.out.println("Enter Batsman Code:");
        bcode = sc.nextInt();
        System.out.println("Enter Innings:");
        innings = sc.nextInt();
        System.out.println("Enter NotOuts:");
        notout = sc.nextInt();
        System.out.println("Enter Runs:");
        runs = sc.nextInt();
        batavg = calcavg();
    }

    void displayData() {
        System.out.println("Batsman Name:" + bname);
        System.out.println("Batsman Code:" + bcode);
        System.out.println("Innings:" + innings);
        System.out.println("NotOuts:" + notout);
        System.out.println("Runs:" + runs);
        System.out.println("Batting Avg:" + batavg);
    }
}

public class Batsman {
    public static void main(String[] args) {
        BatsmanData b1 = new BatsmanData();
        b1.readData();
        b1.displayData();
    }
}