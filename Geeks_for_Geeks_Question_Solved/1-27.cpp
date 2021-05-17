class test: public student 
{
    // Add set_marks() method here.
    protected:
        float marks[5];
    public:
        void set_marks(float temp[5])
        {
            int i;
            for(i=0;i<5;i++)
            {
                this->marks[i] = temp[i];
            }
        }
};

class result: public test
{
    private:
        float total = 0.0;
        float average = 0.0;
    public:
        void display()
        {
            for(int i=0;i<5;i++)
            {
                this->total = this->total + this->marks[i];
            }
                average = total / 5;
                cout<<this->roll_number<<" "<<(int)this->total<<" "<<(int)this->average<<endl;    
        }
    
};
