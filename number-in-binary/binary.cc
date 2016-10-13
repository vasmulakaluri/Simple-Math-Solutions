#include <iostream>
#include <string>
using namespace std;
int main(){
    int value;
    cin>>value;
    int count = 0;
    while (value > 0) {
        count++;
        value = value >> 1;
    } 
  	  
    cout << count;
}
