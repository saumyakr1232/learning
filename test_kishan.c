#include<stdio.h>
#include<conio.h>
int main(){
    char a='A',b='B',c='C',temp;
    int r_a= 12,r_b=22,r_c=44;
    float a_a=67.5, a_b=33.4,a_c=74.54;
    int x,y;
    printf("Choose one option \n 1) Name \n 2) Roll no.");
    scanf("%d",x);

    switch (x){
        case 1:printf("Enter the Name ");
            scanf("%c",temp);
            break;
        case 2:
            printf("Enter the roll no  :");
            scanf("%d",y);

    }
    
    if (temp==a ||y==r_a ){
        if(a_a<75.0){
            printf("Attendence%f",a_a);
            printf("%d is not elligible ",a);
        }
    }



    return 0;
}