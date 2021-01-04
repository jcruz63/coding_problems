const arr1 = [5, 6, 7];
const arr2 = [3, 6, 10];


function compareTriplets(a, b) {
    let position = 0;
    let a_points = 0;
    let b_points = 0;

    a.forEach(elem => {
        if (elem > b[position]) {
            a_points++;
        } else if (elem < b[position]) {
            b_points++;
        }

        position++;

    })
    return [a_points, b_points];
}


console.log(compareTriplets(arr1, arr2));