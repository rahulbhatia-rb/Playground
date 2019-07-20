/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int sum1=0,sum2=0;
  for(int i=0;i<n/2;i++)
    sum1+=a[i];
  for(int i=n/2;i<n;i++)
    sum2+=a[i];
  if(sum1==sum2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  //Type your code here
  return 0;
}