//
// main.c
// Aristotle Solver
//
// Created by Paul Asimow on 1/1/15.
// Copyright (c) 2015 Paul Asimow. All rights reserved.
//

#include <stdlib.h>
#include <stdio.h>
int a[19];
int tiles[20];
int fill[15];
int sums[15];

// 0 1 2
// 11 12 13 3
// 10 17 18 14 4
// 9 16 15 5
// 8 7 6


void fillfill(void) {
fill[0] = (a[0] && a[1] && a[2]);
fill[1] = (a[2] && a[3] && a[4]);
fill[2] = (a[4] && a[5] && a[6]);
fill[3] = (a[6] && a[7] && a[8]);
fill[4] = (a[8] && a[9] && a[10]);
fill[5] = (a[10] && a[11] && a[0]);
fill[6] = (a[11] && a[12] && a[13] && a[3]);
fill[7] = (a[9] && a[16] && a[15] && a[5]);
fill[8] = (a[1] && a[13] && a[14] && a[5]);
fill[9] = (a[11] && a[17] && a[16] && a[7]);
fill[10] = (a[1] && a[12] && a[17] && a[9]);
fill[11] = (a[3] && a[14] && a[15] && a[7]);
fill[12] = (a[0] && a[12] && a[18] && a[15] && a[6]);
fill[13] = (a[2] && a[13] && a[18] && a[16] && a[8]);
fill[14] = (a[10] && a[17] && a[18] && a[14] && a[4]);
}

void fillsums(void) {
sums[0] = (a[0] + a[1] + a[2]);
sums[1] = (a[2] + a[3] + a[4]);
sums[2] = (a[4] + a[5] + a[6]);
sums[3] = (a[6] + a[7] + a[8]);
sums[4] = (a[8] + a[9] + a[10]);
sums[5] = (a[10] + a[11] + a[0]);
sums[6] = (a[11] + a[12] + a[13] + a[3]);
sums[7] = (a[9] + a[16] + a[15] + a[5]);
sums[8] = (a[1] + a[13] + a[14] + a[5]);
sums[9] = (a[11] + a[17] + a[16] + a[7]);
sums[10] = (a[1] + a[12] + a[17] + a[9]);
sums[11] = (a[3] + a[14] + a[15] + a[7]);
sums[12] = (a[0] + a[12] + a[18] + a[15] + a[6]);
sums[13] = (a[2] + a[13] + a[18] + a[16] + a[8]);
sums[14] = (a[10] + a[17] + a[18] + a[14] + a[4]);
}
int test(void) {
int result, i;
fillfill();
fillsums();
for (i=0,result=1;i<15;i++) {
result = result && (!fill[i] || sums[i]==38);
}
return result;
}

void assign(int i) {
int j;


for (j=1;j<20;j++) {
if (tiles[j] == -1) {
a[i] = j;
tiles[j] = i;
if (test()) {
if (i==18) {
printf(" %2d %2d %2d\n", a[0],a[1],a[2]);
printf(" %2d %2d %2d %2d\n", a[11],a[12],a[13],a[3]);
printf("%2d %2d %2d %2d %2d\n", a[10],a[17],a[18],a[14],a[4]);
printf(" %2d %2d %2d %2d\n", a[9],a[16],a[15],a[5]);
printf(" %2d %2d %2d\n", a[8],a[7],a[6]);
exit(0);
}
assign(i+1);
a[i+1] = 0;
tiles[j] = -1;
} else {
a[i] = 0;
tiles[j] = -1;
}
}
}
}

int main(int argc, const char * argv[]) {
int i;

for (i=0;i<19;i++) {
a[i] = 0;
tiles[i+1] = -1;
}

assign(0);

return 0;
}