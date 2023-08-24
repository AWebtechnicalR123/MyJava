function validation(){
    submit=true;
    st = document.getElementsByName("ema")[0].value;
    cb = document.getElementsByName("nm");
    ag = document.getElementsByName("ages")[0].value;
    if(st==""){
        submit=false;
        alert("Enter your email");
        
    }
    if(st.length!=0){
        if(st.includes("@") == false){
            submit=false;
            alert("Enter your correct email");
        }

    }
    
    if(!cb[0].checked || !cb[1].checked){
        if(cb[0].checked || cb[1].checked){
            console.log("Check box is checked");
        }
        submit=false;
        alert("select checkbox");
    }
    
    if(ag <100 && ag>0){
        console.log("age is right");
    }
    return submit;
}