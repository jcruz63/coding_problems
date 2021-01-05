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

    let secondaryDiag = 0;
    for (let i = 0; i < matrixSize; i++) {
        arrElem.push(i);
    }
    let i,j;

    for (i=0, j=arrElem.length-1;  i < arrElem.length; i++, j--) {
        primaryDiag = primaryDiag += arr[arrElem[i]][arrElem[i]];
        secondaryDiag= secondaryDiag+= arr[arrElem[i]][arrElem[j]];
    }




    return Math.abs(primaryDiag - secondaryDiag);
}


console.log(diagonalDifference(arr2d)); // 10
console.log(diagonalDifference(arr3d)); // 15