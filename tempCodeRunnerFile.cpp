#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main()
{
    ll t;
    cin >> t;
    while(t--)
    {
        ll n;
        cin >> n;
        vector<ll> v;

        for(int i=0; i<n; i++)
        {
            ll x;
            cin >> x;
            v.push_back(x);
        }

        sort(v.begin() , v.end());
        ll total = 0;
        for(int i=0; i<n-1; i++)
        {
            total = total+v[i+1]-v[i];
        }
        cout << total <<endl;
        v.clear();
    }
}