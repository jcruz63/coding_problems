// answer to https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem

const test1 = [0, 0, 1, 0, 0, 1, 0];

function jumpingOnClouds(c) {

    let numberOfJumps = 0;

    for (let i = 0; i < c.length;) {
        if (i === c.length - 1) {
            break;
        }
        if (c[i + 2] === 0) {
            i = i + 2;
        } else if (c[i + 1] === 0) {
            i++;
        }
        numberOfJumps++;
    }
    return numberOfJumps;
}

console.log(jumpingOnClouds(test1));