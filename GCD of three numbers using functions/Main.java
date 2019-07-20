#include <stdio.h>
int main() {
 int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  while(n1!=n2)
  {
    if(n1>n2)
      n1-=n2;
    else if(n2>n1)
      n2-=n1;
  }
  while(n1!=n3)
  {
    if(n1>n3)
      n1-=n3;
    else 
      n3-=n1;
  }
  printf("%d",n1);
  //Type your code here
	return 0;
}