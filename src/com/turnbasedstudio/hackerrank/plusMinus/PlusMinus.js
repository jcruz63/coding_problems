
const arr1 =[1,1,0,-1,-1];
const arr2 =[ -4, 3, -9, 0, 4, 1 ];
const arr3 = [1 ,-2 ,-7 ,9 ,1 ,-8 ,-5];



function plusMinus(arr) {

    let positive = 0;
    let negative = 0;
    let zero = 0;
    let ratios = [];

    for(let i=0;i<arr.length;i++){
        switch (Math.sign(arr[i])){
            case 1: positive++; break;
            case -1: negative++; break;
            case 0: zero++; break;
        }
    }


    positive!==0?ratios.push(positive/arr.length):ratios.push(positive);
    negative!==0?ratios.push(negative/arr.length):ratios.push(negative);
    zero!==0?ratios.push(zero/arr.length):ratios.push(zero);



    console.log(`${ratios[0].toFixed(6)}`);
    console.log(`${ratios[1].toFixed(6)}`);
    console.log(`${ratios[2].toFixed(6)}`);


}


plusMinus(arr3);