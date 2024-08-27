package com.csi.service;

public class ApplicationService {

    public static void main(String[] args) {

        ApplicationService applicationService = new ApplicationService();
        System.out.println("\n Addition is:"+applicationService.add(12,2));
        System.out.println("\n Substraction is:"+applicationService.sub(10,5));
    }
   public int add(int n1,int n2)
    {
        return n1+n2;
    }
   public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}
