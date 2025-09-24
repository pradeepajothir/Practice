package com.example.example.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public int checkMaximumProductTriplet() {
        int[] A = {1,2,3,4,6};
        int product=-1;
        //TreeMap<Integer, String> sortedMap = new TreeMap<>();
        for(int i =0; i<A.length;i++){
            for(int j =i+1; j<A.length;j++){
                for(int k =j+1; k<A.length;k++){
                    if(A[i]*A[j]*A[k] > product){
                        product = A[i]*A[j]*A[k];
                    }
                }
            }
        }
        System.out.println("res : "+product);
        return product;
    }
}
