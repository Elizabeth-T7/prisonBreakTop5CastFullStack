const elem = document.getElementById("element");

elem.innerText = "Check this out!";



async function getCast(){
    const castElem = document.getElementById("cast");
    try{
        const response = await fetch('http://localhost:8080/api/casts');
        const responseJSO = await response.json();
        castElem.innerText = `${responseJSO[0].name} who played the role of ${responseJSO[0].role} is rated ${responseJSO[0].rating}
        ${responseJSO[1].name} who played the role of ${responseJSO[1].role} is rated ${responseJSO[1].rating}
        ${responseJSO[2].name} who played the role of ${responseJSO[2].role} is rated ${responseJSO[2].rating}
        ${responseJSO[3].name} who played the role of ${responseJSO[3].role} is rated ${responseJSO[3].rating}
        ${responseJSO[4].name} who played the role of ${responseJSO[4].role} is rated ${responseJSO[4].rating}`;
    }
    catch(e){
        console.log(e);
    }
}

getCast();