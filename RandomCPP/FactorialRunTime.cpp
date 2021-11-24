#include <iostream>
#include <stdio.h>

using namespace std;

int nFacRuntimeFunc(int n){
    int loops = 0;
    for(int i = 0; i < n; i++){
        nFacRuntimeFunc(n-1);
    }
    return loops;
}

int main(){
    cout << nFacRuntimeFunc(12) << endl;
    return 0;
}