class complex
{
    int x, y;

    
    public:
    complex(){}
    
    complex(int real, int imag)
    {x=real; y=imag;}
    
    complex operator+(complex c)
    {
        complex result=complex(0,0);
        result.x = this->x + c.x;
        result.y = this->y + c.y;
        return result;
    }
    
    void display()
    {
        cout<<x<<" + "<<y<<"i"<<endl;
       
    }
    
    
};
