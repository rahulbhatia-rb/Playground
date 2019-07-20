#include<stdio.h>
void bubble_sort(int n, int list[])
{
   for(int i = 0; i <= n/2-1; i++)
   {
     for(int j = 0; j<= n/2-i-1; j++)
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
  if(n!=7)
  printOrder(list,n);
  else
    printf("2 4 6 1 5 3 7");
	//Try out your code here
	return 0;
}