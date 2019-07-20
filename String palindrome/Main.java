#include <stdio.h>
#include <string.h>
void isPalindrome(char str[]) 
{ 
    // Start from leftmost and rightmost corners of str 
    int l = 0; 
    int h = strlen(str) - 1; 
  
    // Keep comparing characters while they are same 
    while (h > l) 
    { 
        if (str[l++] != str[h--]) 
        { 
            printf("%s is not a palindrome", str); 
            return; 
        } 
    } 
    printf("%s is a palindrome", str); 
} 


int main()
{
 char a[100], b[100];
 
 // printf("Enter a string to check if it is a palindrome\n");
  gets(a);
 isPalindrome(a);
  return 0;
}