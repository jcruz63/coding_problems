//answer to https://www.hackerrank.com/challenges/repeated-string/problem

const test1 = 'abc';
const test2 = 'abcd';

function searchForChar(str, cha) {
    let count = 0;
    for (let i = 0; i < str.length; i++) {
        if (str.charAt(i) === cha) {
            count++;
        }
    }
    return count;

}

function repeatedString(s, n) {

    if (s.length === n) {
        return searchForChar(s, n);
    }

}

