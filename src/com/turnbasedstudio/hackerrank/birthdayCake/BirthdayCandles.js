// answer to https://www.hackerrank.com/challenges/birthday-cake-candles


const arr = [3, 2, 1, 3, 3];
const arrTest2 = [];

function setupTest() {
    for (let i = 0; i < 10000; i++) {
        arrTest2.push(9999);

    }

}

setupTest();

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

function birthdayCakeCandles(candles) {
    if (candles.length === 1) {
        return 1;
    } else {
        let sortedArr = candles.sort((a, b) => a - b);
        let tallestCandle = sortedArr[sortedArr.length - 1];
        let count = 1;


        for (let i = sortedArr.length - 2; i > -1; i--) {
            if (sortedArr[i] === tallestCandle) {
                count++;

            }
        }
        return count;
    }
}

console.log(birthdayCakeCandles(arrTest2));
console.log(birthdayCakeCandles(arr));