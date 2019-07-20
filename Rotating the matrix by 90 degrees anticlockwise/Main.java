
#include<stdio.h>
int main()
{
    int r;
    int c;
    scanf("%d", &r);
    scanf("%d", &c);
    int matrix[r][c];
    
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        scanf("%d", &matrix[i][j]);
      }
    }
  
   for(int j = c - 1; j >= 0; j--)
      { 
    for(int i = 0; i <= r - 1; i++)
    {
      
        printf("%d ", matrix[i][j]);
      }
      printf("\n");
    }
}
