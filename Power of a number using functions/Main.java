#include<stdio.h>
int main(){
  int d,n,pro=1;
  scanf("%d %d",&d,&n);
  for(int i=1;i<=n;i++)
    pro=pro*d;
  printf("%d",pro);
    // Type your code here
  	return 0;
}