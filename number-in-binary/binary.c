#include <stdio.h>
int main( ){
    int value;
    scanf("%d", &value);
    int count = 0;
    while (value > 0) {
        count++;
        value = value >> 1;
    }
    printf( "%d", count); 
}
