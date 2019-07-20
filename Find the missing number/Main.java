#include<stdio.h>
int getMissingNo (int a[], int n) 
{ 
    int i, total; 
    total  = (n+1)*(n+2)/2;    
    for ( i = 0; i< n; i++) 
       total -= a[i]; 
    return total; 
} 

int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  printf("%d",getMissingNo (a,n)); 
  //Type your code here
  return 0;
}