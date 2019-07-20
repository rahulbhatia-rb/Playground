#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
 int temp=n;
  int sum=0;
  while(temp!=0)
  {
    int d=temp%10;
    sum+=fact(d);
    temp/=10;
  }
  if(sum==n)
    printf("Yes");
  else
    printf("No");
	//Type your code
	return 0;
}
int fact(int n)
{
  int pro=1;
 for(int i=1;i<=n;i++)
   pro*=i;
  return pro;
}