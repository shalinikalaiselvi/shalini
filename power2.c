#include <stdio.h>
int power_of_2(unsigned int);
int b[32] = {0}, j = 0, n, i, count = 0;
 
void main()
{
    unsigned int num;
    printf("enter value\n");
    scanf("%d", &num);
    power_of_2(num);
    if (count == 1)
        printf("YES\n");
    else
        printf("NO\n");
}
int power_of_2(unsigned int num)
{
    while (num != 0)
    {
        n = num % 2;
        if (n == 1)
            count++;        
        num = num / 2;
    }
}
