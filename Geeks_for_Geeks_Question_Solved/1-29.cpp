class Solution{
    public:
    void printTable(int n)
    {
        int multiplier=10;
        while(multiplier)
        {
           cout<<multiplier*n<<" ";
           multiplier--;
        }
        
        cout<<endl;
    }  
};
