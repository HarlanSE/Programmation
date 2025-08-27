#include<stdio.h>

int main(){

    int a = 10; 
    float b = 4.5; 
    char c = 'C'; 

     int *pint = &a;
    float *pfloat = &b; 
    char *pchar = &c; 

    printf("%d\n", *pint);
    printf("%.2f\n", *pfloat);
    printf("%c\n", *pchar);

    return 0;
}