package Arrays;

public class Find_the_maximum_and_minimum_element_in_an_array {
    
    static pair getMinMax(long a[], long n)  
    {
        long min = Integer.MAX_VALUE; 
        long max = 0;
        
        for(int i=0; i<n; i++) {
            if(min > a[i]) {
                min = a[i];
            }
            if(max < a[i]) {
                max = a[i];
            }
        }
        
        return new pair(min, max);
    }
}


 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

