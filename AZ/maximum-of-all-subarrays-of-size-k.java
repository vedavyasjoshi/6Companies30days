class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
   {
       // Your code here
       ArrayList<Integer> res = new ArrayList<>();
       int lastIndex = n-k+1;
       int[] val = getMaxOfSubArray(arr,0,k);
       res.add(val[1]);
       for(int i = 1;i<lastIndex;i++){
           if(i>val[0])
               val = getMaxOfSubArray(arr,i,k);
           else if(val[1] < arr[i+k-1])
           {
               val[0] = i+k-1;
               val[1] = arr[i+k-1];
           }
           res.add(val[1]);
       }
       return res;
   }
   
   static int[] getMaxOfSubArray(int arr[],int start,int k){
       int max = arr[start];
       int index = start;
       for(int i = 1;i<k;i++){
           if(max<arr[i+start])
               {
                   max = arr[i+start];
                   index = i+start;
               }
       }
       int[] res = new int[2];
       res[0] = index;
       res[1] = max;
       return res;
   }
}