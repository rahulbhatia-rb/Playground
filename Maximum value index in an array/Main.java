// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int max=0,pos=0;
  for(int i=1;i<n;i++)
    if(a[i]>max)
    {
      max=a[i];
      pos=i;
    }
  printf("%d",pos);
  // Type your code here 
  
   return 0;
}