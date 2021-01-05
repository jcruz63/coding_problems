//answer to https://www.hackerrank.com/challenges/staircase/

const numberOfSteps = 6;

function staircase(n) {

    let numberWhiteSpace = n - 1;
    let numberOfSteps = 1;

    for (let i = 0; i < n; i++) {
        let output = "";
        for (let j = 0; j < numberWhiteSpace; j++) {
            output += " ";
        }
        for (let k = 0; k < numberOfSteps; k++) {
            output += "#";
        }
        numberWhiteSpace--;
        numberOfSteps++;
        console.log(output);
    }

}

staircase(numberOfSteps);