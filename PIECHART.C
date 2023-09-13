#include<graphics.h>
#include<stdio.h>

 
int main() {
   int gd = DETECT, gm, x, y;
   initgraph(&gd, &gm, "C:\\TC\\BGI");
 
   settextstyle(BOLD_FONT,HORIZ_DIR,2);
   outtextxy(20,10,"PIE CHART");
   /* Setting cordinate of center of circle */
   x = getmaxx()/2;
   y = getmaxy()/2;

   settextstyle(SANS_SERIF_FONT,HORIZ_DIR,1);
   setfillstyle(SOLID_FILL, RED);
   pieslice(x, y, 0, 60, 120);
   outtextxy(x + 140, y - 70, "Mobiles");

   setfillstyle(SOLID_FILL, BLACK);
   pieslice(x, y, 60, 160, 120);
   outtextxy(x - 30, y - 170, "LAPTOPS");
 
   setfillstyle(SOLID_FILL, GREEN);
   pieslice(x, y, 160, 220, 120);
   outtextxy(x - 250, y, "WATCH");

   setfillstyle(SOLID_FILL, BROWN);
   pieslice(x, y, 220, 360, 120);
   outtextxy(x, y + 150, "MONITORS");

   setfillstyle(SOLID_FILL, BLACK);
   outtextxy(300, 280, "40%");
   outtextxy(300, 140, "30%");
   outtextxy(220, 230, "15%");
   outtextxy(360, 200, "15%");



   getch();
   closegraph();
   return 0;

}