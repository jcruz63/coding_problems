//answer to https://www.hackerrank.com/challenges/apple-and-orange/problem

let testConfig1 = new Map();

testConfig1.set("s", 7);
testConfig1.set("t", 10);
testConfig1.set("a", 4);
testConfig1.set("b", 12);
testConfig1.set("apples", [2, 3, -4]);
testConfig1.set("oranges", [3, -2, -4]);

let testConfig2 = new Map();

testConfig2.set("s", 2);
testConfig2.set("t", 3);
testConfig2.set("a", 1);
testConfig2.set("b", 5);
testConfig2.set("apples", [2]);
testConfig2.set("oranges", [-2]);


function countApplesAndOranges(s, t, a, b, apples, oranges) {

    let applesOnHouse = 0;
    let orangesOnHouse = 0;

    apples.forEach(elem => {
        let landedAt = a + elem;
        if (landedAt >= s && landedAt <= t) {
            applesOnHouse++;
        }
    })
    oranges.forEach(elem => {
        let landedAt = b + elem;
        //console.log(`orange at ${landedAt}`);
        if (landedAt >= s && landedAt <= t) {
            orangesOnHouse++;
        }
    })

    console.log(applesOnHouse);
    console.log(orangesOnHouse);

}


//countApplesAndOranges(testConfig1.get("s"),testConfig1.get("t"),testConfig1.get("a"),testConfig1.get("b"),testConfig1.get("apples"),testConfig1.get("oranges"));
countApplesAndOranges(testConfig2.get("s"), testConfig2.get("t"), testConfig2.get("a"), testConfig2.get("b"), testConfig2.get("apples"), testConfig2.get("oranges"));