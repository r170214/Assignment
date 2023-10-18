let str="This is a sunny day"
function convert(str)
{
    let res=""
    let word=""
    for(let i=0;i<str.length;i++)
    {
        if(str.charAt(i)== ' ')
        {
            res=res+word+" "
            word=""
        }
        else{
            word=str.charAt(i)+word;
        }
    }
    res=res+word
    return res
}
console.log(convert(str));