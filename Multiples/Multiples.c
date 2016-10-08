#include <stdio.h>
int main( ){
    int mini, maxi, fact;
   // scan minimum value, maximum value, and factor
    scanf("%d", &mini);
    scanf("%d", &maxi);
    scanf("%d", &fact);
    int i;
    int count = 0;
    for( i = mini; i<=maxi;i++)
        if( i % fact == 0)
        count ++;
    printf("%d", count);
    
    return 0;
 }
