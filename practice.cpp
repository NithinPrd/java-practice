    #include<iostream>
    #include<stdio.h>
    using namespace std;

    int main() {
        char c;
        int upper_count=0, lower_count=0;
        cout<<"Enter characters, * to stop: \n";
        cin>>c;
        while(true) {
            if(c>=65 && c<=90) {
                c = c+32;
                upper_count++;
                cout<<c;
            } else if(c>=97 && c<=122) {
                c = c-32;
                lower_count++;
                cout<<c;
            } else if(c=='*') {
                break;
            }
        }
    }