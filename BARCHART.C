#include<stdio.h>
#include<Graphics.h>
int main()
{
	int gd=DETECT,gm;
	initgraph(&gd, &gm,"c://TC//BGI");
	settextstyle(SMALL_FONT,HORIZ_DIR,4);
	outtextxy(100,200,"2001-2010");
	outtextxy(130,80,"50%");
	outtextxy(200,200,"2011-2020");
	outtextxy(230,20,"70%");
	outtextxy(300,200,"2021-2030");
	outtextxy(330,130,"30%");
	outtextxy(400,200,"2031-2040");
	outtextxy(430,60,"60%");
	settextstyle(BOLD_FONT,HORIZ_DIR,4);
	outtextxy(170,250,"BAR_GRAPH");
	setfillstyle(SLASH_FILL,YELLOW);

	bar(100,90,180,200);
	setfillstyle(SLASH_FILL,YELLOW);
	bar(200,30,280,200);
	setfillstyle(SLASH_FILL,YELLOW);
	bar(300,140,380,200);
	setfillstyle(SLASH_FILL,YELLOW);
	bar(400,70,480,200);
	getch();

	closegraph();
	return 0;
	}

