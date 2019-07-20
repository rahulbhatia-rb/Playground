#include <stdio.h>
#include <math.h>
int main() {
  int n;
  scanf("%d",&n);
 // int ans = (int) log2(n)+1;
  int c=0;
  while(n!=0)
  {
    n&=(n-1);
    c++;
  }
  printf("%d",c);
	//write your code here
	return 0;
}