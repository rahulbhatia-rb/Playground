#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  scanf("%d",&a[i]);
  
  int min;
  for(int i=0;i<n-1;i++)
  {
    min =i;
    for(int j=min+1;j<n;j++)
    {
      if(a[min]>a[j])
      {
        int temp=a[j];
        a[j]=a[min];
        a[min]=temp;
        min=j;
      }
      
    }
  }
  
    for(int i=0;i<n;i++)
    {
      printf("%d\n",a[i]);
    }
    //Type your code here
  return 0;
}