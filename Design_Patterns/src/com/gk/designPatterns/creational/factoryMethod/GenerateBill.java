package com.gk.designPatterns.creational.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory=new GetPlanFactory();
        System.out.println("Enter the name of plan for which the bill will be generated: ");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String planType=br.readLine();
        int units=Integer.parseInt(br.readLine());

        //call getRate() method and calculateBill()method of DomesticPaln.
        Plan p=planFactory.getPlan(planType);
        System.out.println("Bill Amount for "+planType+" of "+units+" units is:");
        p.getRate();
        p.calculateBill(units);
    }
}
