//answer to https://www.hackerrank.com/challenges/mr-k-marsh/problem

const test1 = ['.x', 'x.'];
const test2 = ['.x.', 'x..', 'x..'];

function convertStringGridToLeftNumberGrid(grid) {
    let arr = grid;
    let numberGrid = [];
    let sumLeft = 0;
    let flag = false;
    for (let i = 0; i < arr.length; i++) {
        numberGrid.push([]);
        for (let j = 0; j < arr[i].length; j++) {
            if (arr[i].charAt(j) === ".") {
                flag ? numberGrid[i].push(++sumLeft) : numberGrid[i].push(sumLeft);
            } else {
                numberGrid[i].push(-1);
                flag = true;
                sumLeft = 0;
            }
        }
        flag = false;
        sumLeft = 0;
    }

    return numberGrid;
}

console.log(convertStringGridToLeftNumberGrid(test1));
console.log(convertStringGridToLeftNumberGrid(test2));

function kMarsh(grid) {
    let x = 0;
    let y = 0;
    let maxPerimeter = 0;


}
