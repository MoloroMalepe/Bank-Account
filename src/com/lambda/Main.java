package com.lambda;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        int num1=10;
        int num2=13;

        IFunctional functionalObj=(x,y) -> x+y; //adding implementation of the add()
        int sum = functionalObj.add(num1,num2);//calling the add() and pass the values
        System.out.println(sum);

        //create a list of numbers
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,8,9);

        //Predicate to filter even number from the list
      List<Integer> oddNumbs =
              numbers.stream().filter(number->(number %2) >0).collect(Collectors.toList());

        System.out.println(oddNumbs);
    }
}
