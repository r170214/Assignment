let object={};
    let input=document.getElementsByClassName('input')
    let label=document.getElementsByClassName('label')
    
let submit = () =>{
    //for getting output from gender input
    const radioButtons = document.getElementsByName('gender');
    let selectedValue = null;
    for (const radioButton of radioButtons) {
        if (radioButton.checked) {
        selectedValue = radioButton.value;
        break; // Exit the loop once a selection is found
        }
    }
   for (let i = 0; i <4; i++) 
   {

       object[label[i].textContent]=input[i].value;
   }
   object[label[4].textContent]=selectedValue
   for(let i=5;i<label.length;i++)
   {
    object[label[i].textContent]=input[i-1].value;
   }
   var objStr1 = JSON.stringify(object, null, 2);
    alert(objStr1)
}

let reset=()=>{
    let input=document.getElementsByClassName('input')
    for(let i=0;i<input.length;i++)
    {
        input[i].value=""
    }
}
