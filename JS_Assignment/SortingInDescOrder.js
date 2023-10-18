let arr=[1,10,7,12,5]
function sort(arr)
{
    for(let i=0;i<arr.length;i++)
    {
        for(let j=i;j<arr.length;j++)
        {
            if(arr[i]<arr[j])
            {
                let temp=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
            }
        }
    }
    return arr
}
console.log(sort(arr));