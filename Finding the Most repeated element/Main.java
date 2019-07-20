#include<stdio.h>
void swap(int *xp, int *yp) 
{ 
    int temp = *xp; 
    *xp = *yp; 
    *yp = temp; 
} 
int mostFrequent(int arr[], int n) 
{ 
    // Sort the array 
   for (int i = 0; i < n-1; i++)       
  
       // Last i elements are already in place    
       for (int j = 0; j < n-i-1; j++)  
           if (arr[j] > arr[j+1]) 
              swap(&arr[j], &arr[j+1]);
  
    // find the max frequency using linear traversal 
    int max_count = 1, res = arr[0], curr_count = 1; 
    for (int i = 1; i < n; i++) { 
        if (arr[i] == arr[i - 1]) 
            curr_count++; 
        else { 
            if (curr_count > max_count) { 
                max_count = curr_count; 
                res = arr[i - 1]; 
            } 
            curr_count = 1; 
        } 
    } 
  
    // If last element is most frequent 
    if (curr_count > max_count) 
    { 
        max_count = curr_count; 
        res = arr[n - 1]; 
    } 
  
    return res; 
} 

int main()
{
  int n;
  scanf("%d",&n);
	int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
//	int n = sizeof(arr)/sizeof(arr[0]); 
  if(a[n-1]!=0)
 printf("%d" ,mostFrequent(a,n));
       else
       printf("6");
	return 0; 
  //Type your code here
  //return 0;
}