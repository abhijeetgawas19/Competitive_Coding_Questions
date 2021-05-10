class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        int len = arr.length;
        int i,j;
        int val=0,area=0;
        for(i=0;i<len;i++)
        {
            for(j=0;j<len;j++)
            {
                area = arr[i].area();
                if(area>val)
                {
                    val=area;
                }
            }
        }
        return val;
        
    }
    
}
