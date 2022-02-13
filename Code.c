#include <stdio.h>
#include <string.h>
#include <ctype.h>
#define MAX_SIZE 100

int main() {
    char word[MAX_SIZE];
    char reverse_word[MAX_SIZE];
    int i, j, len;
    int cty;
    printf("copyrited by BroFar \n\n");
// default is lowercase however if you input 1 before your Test words the words will be tested in UPPER case

    scanf("%d",&cty);
// Input a total of 5 words to check if they are palindromes.

    for ( int c = 0; c <= 4; c++){
    scanf("%s",word);

/* 
UPPER and lower case Test words:
( Try it with and without the number )
1
sTaRTeRs
rACeCAr
CHeateRs
SniCkeRs
CaTaTaC
*/  

    printf("%s",word);

// This will change all the letters in a given word string to UPPER case for analysis.
   if (cty == 1){
   for (int z = 0; word[z]!='\0'; z++) {
      if(word[z] >= 'a' /** 'A' **/ && word[z] <= 'z' /** 'Z' **/ ) {
         word[z] = word[z] -32; // +32
      }
   }
   }

// This will change all the letters in a given word string to lower case for analysis.

   else
   {

   for (int z = 0; word[z]!='\0'; z++) {
      if(word[z] >= 'A' /** 'a' **/ && word[z] <= 'Z' /** 'z' **/ ) {
         word[z] = word[z] +32; // -32
      }
   }
}
   printf("\nWord string in lowercase = %s", word);

// This will find the palindrome words

// This is now the word we are searching for comparison 

    printf("\n%s is the word\n",word);
    len = strlen(word);
    for(i = 0, j = len - 1; i < len; i++, j--){
        reverse_word[i] = word[j];
    }
    reverse_word[i] = '\0';
    printf("%s is the word in reverse\n", reverse_word);
    if(0 == strcmp(word, reverse_word)){
        printf("%s is a palindrome. \n\n", word);
    }
    else{
        printf("%s is not a palindrome. \n\n", word);
    }
    }
    return 0;
}

