//answer to https://www.hackerrank.com/challenges/kangaroo/problem

const test1 = [0, 3, 4, 2];
const test2 = [0, 2, 5, 3];
const test11 = [4523, 8092, 9419, 8076];

function jumpLoop(a) {
    let num1 = test11[0];
    let num2 = test11[2];

    for (let i = 0; i < a; i++) {
        num1 += test11[1];
        num2 += test11[3];
        console.log(`jump ${i} num1:${num1} num2:${num2} is equal ${num1 === num2}`)
    }
}

//jumpLoop(1000);

function kangaroo(x1, v1, x2, v2) {
    let k3 = Math.abs(x1 - x2);
    let k1 = Math.abs(v2 - v1);

    console.log(`k1 ${k1} k3 ${k3} modulus ${k3 % k1}`)
    if (k1 === 1 && k3 > 0) {
        return "YES";
    } else if (k1 > 0 && k3 % k1 === 0) {
        return "YES";
    } else {
        return "NO";
    }


}

console.log(kangaroo(...test1));
console.log(kangaroo(...test2));
console.log(kangaroo(...test11));