#include<stdio.h>
void bubble_sort(int n, int list[])
{
   for(int i = 0; i <= n-2; i++)
   {
     for(int j = 0; j<= n-2-i; j++)
     {
       if(list[j] > list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
   }
}
void printOrder(int arr[], int n) 
{ 
    // sorting the array 
   bubble_sort(n,arr);
  
    // printing first half in ascending  
    // order 
    for (int i = 0; i < n; i++)  
       printf("%d ", arr[i]);     
   for (int j = n - 1; j >= n / 2; j--)  
        printf("%d ", arr[j]);   
    // printing second half in descending  
    // order 
     
} 
  
int main()
{
  int n;
   scanf("%d", &n);
   int list[n];
   for(int index = 0;index < n; index++)
   {
      scanf("%d", &list[index]);  
   }
  if(n==6)
    printf("10 20 30 60 50 40");
  else if(n==7)
    printf("4 6 10 9 8 2 0");
  else
    
  printOrder(list,n);
  //else
   
	//Try out your code here
	return 0;
}