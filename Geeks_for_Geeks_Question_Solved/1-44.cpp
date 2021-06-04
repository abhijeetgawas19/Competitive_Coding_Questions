int area(Rectangle r)
{
   //return length*breadth
   return r.length * r.breadth;
}


void maxArea(Rectangle arr[],int n)
{
   
   int i,max,data;
   max = 0;
   for(i=0;i<n;i++)
   {
       data = area(arr[i]);
       if(data>max)
        max = data;
   }
    cout<<max<<endl;
}
