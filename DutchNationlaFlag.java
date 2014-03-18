 // Please Look at the readme file for problem explanation
 
 public static int[] dutch(int a[],int low, int high)          //low is the lowest value(0 in the below example) 
                                                                //and high is the highest value i,e 2
    {
     if(a.length==0)                                           //If length of array length is zero
        return a;
      int lower=0;
      int upper=a.length-1;
      

      while(a[lower]==low && lower<a.length)                   //lower is assigned to first index whose value is not low
          lower++;
     

      while(a[upper]==high && upper>=0)                       //upper is assigned to last index whose value is not high
          upper--;
      

      int pivot=lower;                                            //pivot is used to keep the index of mid value
                                                                  //from beginning for swapping with low
      while(lower<=upper)
      {
        if(a[lower]==low)                                        
        {
         a[lower]=a[pivot];
         a[pivot]=low;
         lower++;                                                 
         pivot++;
        }
        else
        
          if(a[lower] == high)
        {
         a[lower]=a[upper];
         a[upper]=high; 
         upper--;                                                //not increasing pivot because the swapped value could 
        }                                                        //either be low or mid (0 or 1 in our case)
          else
              lower++;
            
        }

        return a;
      }
      
  /*
Intial
 
int y[]={0,1,2,2,1,1,0,2,1,0,0};

lower is 1
upper is 10
pivot is 1

Intermediate steps

lower is 2
Upper is 10
Pivot is 1
        0        1        2        2        1        1        0        2        1        0        0
lower is 2
Upper is 9
Pivot is 1
        0        1        0        2        1        1        0        2        1        0        2
lower is 3
Upper is 9
Pivot is 2
        0        0        1        2        1        1        0        2        1        0        2
lower is 3
Upper is 8
Pivot is 2
        0        0        1        0        1        1        0        2        1        2        2
lower is 4
Upper is 8
Pivot is 3
        0        0        0        1        1        1        0        2        1        2        2
lower is 5
Upper is 8
Pivot is 3
        0        0        0        1        1        1        0        2        1        2        2
lower is 6
Upper is 8
Pivot is 3
        0        0        0        1        1        1        0        2        1        2        2
lower is 7
Upper is 8
Pivot is 4
        0        0        0        0        1        1        1        2        1        2        2
lower is 7
Upper is 7
Pivot is 4
        0        0        0        0        1        1        1        1        2        2        2
lower is 8
Upper is 7
Pivot is 4
        0        0        0        0        1        1        1        1        2        2        2
        
Finally the sorted array is returned
  */
