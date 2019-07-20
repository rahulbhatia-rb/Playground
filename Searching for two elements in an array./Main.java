#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int a1,a2;
  scanf("%d %d",&a1,&a2);
  int flag1=-1,flag2=-1;
  for(int i=0;i<n;i++)
    if(a[i]==a1)
      flag1=i;
  for(int i=0;i<n;i++)
    if(a[i]==a2)
      flag2=i;
 
  printf("%d\n%d",flag1,flag2);
   
  //Type your code here
  return 0;
}