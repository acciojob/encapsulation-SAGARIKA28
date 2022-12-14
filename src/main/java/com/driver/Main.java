package com.driver;

public class Main {
  public static void main(String[] args)
  { 
 RWOnly obj = new RWOnly();
//  System.out.print(obj.name); // build error, cannot access private member 
      
    obj.setter("saga");
    System.out.print(obj.getter());
  }
}