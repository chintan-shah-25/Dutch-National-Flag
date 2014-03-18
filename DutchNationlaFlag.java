 public static int[] dutch(int a[],int low, int high)          //low is the lowest value(0 in the below example) and high is the highest value i,e 2
    {
     if(a.length==0)                                           //If length of array is zero
        return a;
      int lower=0;
      int upper=a.length-1;
      

      while(a[lower]==low && lower<a.length)                   //lower is assigned to first index whose value is not low
          lower++;
      System.out.println("lower is "+lower);

      while(a[upper]==high && upper>=0)                       //upper is assigned to last index whose value is not high
          upper--;
      System.out.println("upper is "+upper);

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
         upper--;                                                //not increasing pivot because the swpped value could 
        }                                                          either be low or mid (0 or 1 in our case)
          else
              lower++;
            
        }

        return a;
      }
      
  /*
int y[]={0,1,2,2,1,1,0,2,1,0,0};

lower is 1
upper is 10

Intermediate steps

        0        1        2        2        1        1        0        2        1        0        0
        0        1        0        2        1        1        0        2        1        0        2
        0        0        1        2        1        1        0        2        1        0        2
        0        0        1        0        1        1        0        2        1        2        2
        0        0        0        1        1        1        0        2        1        2        2
        0        0        0        1        1        1        0        2        1        2        2
        0        0        0        1        1        1        0        2        1        2        2
        0        0        0        0        1        1        1        2        1        2        2
        0        0        0        0        1        1        1        1        2        2        2
        0        0        0        0        1        1        1        1        2        2        2
  */
