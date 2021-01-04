// answer to https://www.hackerrank.com/challenges/diagonal-difference/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

const arr3d = [
    [11, 2, 4],
    [4, 5, 6],
    [10, 8, -12]
];

const arr2d = [
    [11, 2],
    [4, 5,]
];

function diagonalDifference(arr) {
    let matrixSize = arr.length;
    let primaryDiag = 0;
    let arrElem = [];

    for (let i = 0; i < matrixSize; i++) {
        arrElem.push(i);
    }

    for (let i = 0; i < arrElem.length; i++) {
        primaryDiag = primaryDiag += arr[arrElem[i]];
    }

    console.log(arrElem);

    let secondaryDiag = arr[0][1] + arr[1][0];


    return Math.abs(primaryDiag - secondaryDiag);
}


console.log(diagonalDifference(arr2d)); // 10
console.log(diagonalDifference(arr3d)); // 15