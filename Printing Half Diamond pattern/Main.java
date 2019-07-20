#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int space=n;
  for(int i=1;i<=n;i++)
  {
    for(int j=space-1;j>0;j--)
    {
      printf(" ");
    }
    for(int j=1;j<=(2*i)-1;j++)
    {
      printf("*");
    }
    space--;
    printf("\n");
  }
	// Type your code here
	return 0;
}