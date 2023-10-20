#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    cout << "Enter size";
    int n;
    cin>>n;
    int v[n];
    for(int i=0;i<n;i++){
        cin>>v[i];
    }
int flag=0;
   int captainSum=0;
   int ironSum=0;
   int l=0,r=n-1;
   int whichFirst=0;
   if(v[l]>v[r]){
       captainSum+=v[l];
       ironSum+=v[r];
       flag=0;
       whichFirst=0;
   }
   else{
       ironSum+=v[r];
       captainSum+=v[l];
       flag=1;
     whichFirst=1;
   }
   n--;
   while(n>1){
       
       if(flag==1){
           r--;
           if(l==r){
               r--;
           }
           ironSum+=v[r];
           r--;
       }
       else{
           l++;
           if(l==r){
               l++;
           }
           for(int i=l+1;i<r;i++){
               if(v[i]>v[l]){
                   l=i;
                   break;
               }
           }
           captainSum+=v[l];
       }
       n--;
   }
   
   
   if(whichFirst==0){
       cout<<captainSum-ironSum;
   }
   else{
       cout<<ironSum-captainSum;
   }
    
    

    return 0;
}