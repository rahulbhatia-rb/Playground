
int main()
{
   char string[100];
   int c = 0, count[26] = {0}, x;
 
   //printf("Enter a string\n");
   gets(string);
 
   while (string[c] != '\0') {
   /** Considering characters from 'a' to 'z' only and ignoring others. */
 
      if (string[c] >= 'a' && string[c] <= 'z') {
         x = string[c] - 'a';
         count[x]++;
      }
 
      c++;
   }
 
   for (c = 0; c < 26; c++)
   {
     if(count[c]!=0)
         printf("%c%d ", c + 'a', count[c]);
   }
   return 0;
}