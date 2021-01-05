//answer to https://www.hackerrank.com/challenges/time-conversion/problem

const timeString = "07:05:45PM";
const test2 = "12:40:22AM";
const test3 = "06:40:03AM";
const test4 = "12:45:54PM";

function timeConversion(s) {
    //todo regex expression to check that the string is in valid format

    let hours = parseInt(s.charAt(0) + s.charAt(1));
    let min = s.charAt(3) + s.charAt(4);
    let sec = s.charAt(6) + s.charAt(7);
    let midday = s.charAt(8) + s.charAt(9);


    if (midday === "PM") {
        if (hours === 12) {
            return `${hours}:${min}:${sec}`;
        }
        hours += 12;
        return `${hours}:${min}:${sec}`;
    } else {
        if (hours === 12) {
            return `00:${min}:${sec}`;
        } else {
            return `0${hours}:${min}:${sec}`;
        }

    }
}


console.log(timeConversion(timeString));
console.log(timeConversion(test2));
console.log(timeConversion(test3));
console.log(timeConversion(test4));