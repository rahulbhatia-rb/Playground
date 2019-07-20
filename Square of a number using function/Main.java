#include<stdio.h>
int value(int n)
{
  return n*n;
}
int main() {
  int n;
  scanf("%d",&n);
  printf("%d",value(n));
   // Type your code here
   return 0;
}