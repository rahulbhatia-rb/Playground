#include<stdio.h>
int main()
{
    int n,i;
	//printf("Enter size of array: \n");
	scanf("%d",&n);
	int a[n];            //Array of required size
 	//printf("Enter elements in array: \n");
  int k;
  scanf("%d",&k);
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);
    int freq[100000]={0}; //Initialize all elements to 0 like this.
    /*Take size of freq array to be greater
    than the max element in original array*/
    for(i=0;i<n;i++)
        freq[a[i]]++;    //Increment count of freq[a[i]] for each a[i].
    for(i=1;i<=k;i++)
        //if(freq[i])
        printf("%d %d\n",i,freq[i]);
}