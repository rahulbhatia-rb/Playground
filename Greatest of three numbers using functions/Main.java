#include <stdio.h>
int main(){
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  int res= n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
  printf("%d",res);
	// Type your code here
  	return 0;
}