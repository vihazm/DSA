/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

/**
 *
 * @author Vihas
 */
import java.util.Scanner;

public class RabbitProblem {

    public static int rabbitCount(int months) {
        if (months == 0 || months == 1)
            return 1;

        return rabbitCount(months - 1) + rabbitCount(months - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        System.out.println("Number of rabbit pairs after " +
                months + " months: " + rabbitCount(months));
    }
}

