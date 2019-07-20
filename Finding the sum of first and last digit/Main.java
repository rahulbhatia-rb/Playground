#include <stdio.h>
int main() {
   int n;
  scanf("%d",&n);
  int count=0;
  int m=n;
  while(n!=0)
  {
    
    n/=10;
    count++;
  }
  int pro=1;
  for(int i=1;i<count;i++)
  {
    pro*=10;
  }
  int ans=(m/pro)%10 + m%10;
  printf("%d",ans);
	//Type your code
	return 0;
}