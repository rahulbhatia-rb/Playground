#include <stdio.h>
    #include <stdlib.h>
 
    void main() 
    {
 
        int a[10][10], b[10][10];

 int row1,column1;
      int i,j;
      int flag=1;
        scanf("%d %d", &row1, &column1);
 
       
 
        
        for (i = 0; i < row1; i++)
        {
            for (j = 0; j < column1; j++) 
            {
                scanf("%d", &a[i][j]);
            }
        }
 
       
        for (i = 0; i < row1; i++) 
        {
            for (j = 0; j < column1; j++)
            {
                scanf("%d", &b[i][j]);
            }
        }
 
       
       
 
      
 
        /*  Comparing two matrices for equality */
 
        if (row1 == row1 && column1 == column1)
        {
            
            for (i = 0; i < row1; i++) 
            {
                for (j = 0; j < column1; j++)
                {
                    if (a[i][j] != b[i][j])
                    {
                        flag = 0;
                        break;
                    }
                 }
            }
        }
 
        else 
        {
            printf(" Cannot be compared\n");
            exit(1);
        }
 
        if (flag == 1)
            printf("Yes \n");
        else
            printf("No \n");
 
    }
