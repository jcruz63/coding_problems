// Solution to https://www.hackerrank.com/challenges/a-very-big-sum/problem?h_r=next-challenge&h_v=zen
const arr = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005];

function aVeryBigSum(ar) {
    let bigIntArr = [];
    let result = BigInt(0);

    ar.forEach(elem => {
        bigIntArr.push(BigInt(elem))
    });

    bigIntArr.forEach(elem => {
        result = result += elem
    });

    return result.toString();
}

console.log(aVeryBigSum(arr));