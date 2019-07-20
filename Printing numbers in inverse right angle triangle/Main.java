#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  
  for(int i=n;i>0;i--)
  {
    for(int j=i;j>=1;j--)
    {
      printf("%d",j);
    }
    printf("\n");
  }
    // Type your code here
	return 0;
}