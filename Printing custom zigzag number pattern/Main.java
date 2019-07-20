#include <stdio.h>
int main() {
   int n;
  scanf("%d",&n);
  int counter=1;
  int pos=1;
  for(int i=1;i<=n;i++)
  {
     if(i%2==1)
     {
    for(int j=0;j<n;j++)
    {
    if(j!=n-1)
      printf("%d",counter);
      else
      {
        counter++;
        printf("%d\n",counter);
      }
    }
     }
    else
    {
      int temp=counter+1;
        for(int j=0;j<n;j++)
    {
          if(j==0)
            printf("%d",temp);
          else
            printf("%d",counter);
    }
      counter++;
      printf("\n");
    }
  }
    
	// Type your code here
	return 0;
}