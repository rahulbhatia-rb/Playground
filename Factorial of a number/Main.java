#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int pro=1;
  for(int i=1;i<=n;i++)
    pro*=i;
  printf("%d",pro);
	//Type your code
	return 0;
}