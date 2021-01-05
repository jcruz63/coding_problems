//answer to https://www.hackerrank.com/challenges/grading/problem

const test1 = [73, 67, 38, 33];

function gradingStudents(grades) {
    let finalGrades = grades;

    for (let i = 0; i < finalGrades.length; i++) {

        if (finalGrades[i] > 37) {
            let ones = Math.floor(finalGrades[i] % 10);
            let multiplyOf5 = 0;

            //rounding up to a multiply of 5
            ones > 5 ? multiplyOf5 = finalGrades[i] + (10 - ones) : multiplyOf5 = finalGrades[i] + (5 - ones);

            if (multiplyOf5 - finalGrades[i] < 3) {
                finalGrades[i] = multiplyOf5;
            }
        }


    }

    return finalGrades;
}

console.log(gradingStudents(test1));