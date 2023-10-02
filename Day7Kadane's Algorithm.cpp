#include<bits/stdc++.h>
using namespace std;
long long maxSubarraySum(int arr[], int n){
        
       long long max=INT_MIN;
       long long currentsum=0;
       
       for(int i=0; i<n;i++){
           
           currentsum=currentsum+arr[i];
           
           if(currentsum >max){
               max=currentsum;
           }
           
           if(currentsum<0){
               
               currentsum=0;
           }
       }
       
       return max;
       
     
        
    }