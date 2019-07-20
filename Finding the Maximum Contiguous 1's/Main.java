// C++ program to count maximum consecutive 
// 1's in a binary array. 
#include<stdio.h> 

// Returns count of maximum consecutive 1's 
// in binary array arr[0..n-1] 
int getMaxLength(int arr[], int n) 
{ 
int count = 0;
		int max = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] == 0)
				count = 0;
			else
				count++;
			max = count > max ? count : max;
		}
		return max;
} 

// Driver code 
int main() 
{ 
  int n;
  scanf("%d",&n);
	int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
//	int n = sizeof(arr)/sizeof(arr[0]); 
	printf("%d", getMaxLength(a, n) ); 
	return 0; 
} 
