const operand1 = [];
const operand2 = [];
let toggle = false;
let sign = 0;
let display = document.querySelector("#display");


function btnAddEventListener() {
    let btns = document.querySelectorAll("button");
    console.log(btns);
    let btn;
    btns.forEach($btn => $btn.addEventListener("click", btnHandler, false));

}

function btnHandler(e) {
    switch (e.target.id) {
        case "btn1":
            toggle ? operand2.push(0) : operand1.push(0);
            display.innerHTML += "0";
            break;
        case "btn2":
            toggle ? operand2.push(1) : operand1.push(1);
            display.innerHTML += "1";
            break;
        case "btn3":
            sign = 1;
            break;
        case "btn4":
            sign = 1;
            break;
        case "btn5":
            sign = 1;
            break;
        case "btn6":
            sign = 1;
            break;
        case "btn7":
            sign = 1;
            break;
        case "btn8":
            sign = 1;
            break;
    }
}

function trimLeadingZeros(arr) {
    let arrCopy = [...arr];
    while (arrCopy.indexOf(0) === 0) {
        arrCopy.shift();
    }
    return arrCopy;
}

btnAddEventListener();



