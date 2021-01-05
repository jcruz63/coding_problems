// answer to https://www.hackerrank.com/challenges/mini-max-sum/problem

const arr = [5, 4, 2, 3, 1];

function miniMaxSum(arr) {
    let sortedArray = arr;
    sortedArray.sort((a, b) => a - b);
    let minSum = BigInt(sortedArray[0]);
    let maxSum = BigInt(sortedArray[sortedArray.length - 1]);

    for (let i = 1; i < sortedArray.length - 1; i++) {
        minSum += BigInt(sortedArray[i]);
        maxSum += BigInt(sortedArray[i]);
    }

    console.log(`${minSum} ${maxSum}`);
}

miniMaxSum(arr);