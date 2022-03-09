class Solution
{
    // Moore's voting algo
    // Time complexity : O(n)
    // Auxilary Space : O(1)
    
    // You can solve this problem in a more optimized way using binary search
    
    static int majorityElement(int arr[], int size){
        int count = 1;
        int maj = arr[0];
        
        for(int i = 1;i<size;i++){
            
            if(arr[i]==maj){
                count++;
            }
            else{
                count--;
            }
            
            if(count == 0){
                maj = arr[i];
                count = 1;
            }
        }
        
        count = 0;
        
        for(int i : arr){
            if(i==maj){
                count++;
            }
        }
        
        if(count>size/2){
            return maj;
        }
        else{
            return -1;
        }
    }
}
