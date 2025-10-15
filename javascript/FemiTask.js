


for (let number = 1; number <= 100; number++) {
    if (number % 2 == 0) {
        console.log("even numbers " + number);
    }
}

console.log();
console.log();

for (let number = 50; number <= 100; number++) {
    if (number % 2 > 0) {
        console.log("odd numbers " + number);
    }
}

console.log();
console.log();

for (let number = 100; number >= 1; number--) {
    console.log("numbers " + number);
}

console.log();
console.log();

for (let number = 1; number <= 20; number++) {
    let total = number * number;
    console.log("square " + number + " is " + total);
}

console.log();
console.log();

for (let number = 1; number <= 50; number++) {
    if (number % 3 == 0) {
        console.log("multiples of 3 are " + number);
    }
}

console.log();
console.log();

for (let number = 1; number <= 100; number++) {
    if (number % 3 == 0 && number % 5 == 0) {
        console.log("multiples of 3 and 5 are " + number);
    }
}

console.log();
console.log();

let count = 1;
for (let number = 1; number <= 100; number++) {
    if (number % 7 == 0) {
        count++;
    }
}
console.log("multiples of 7 in 1 and 100 is " + count);

console.log();
console.log();

for (let number = 1; number <= 100; number++) {
    if (number % 7 == 0) {
        console.log("multiples of 7 are " + number);
    }
}

console.log();
console.log();

let total = 0;
for (let number = 1; number <= 50; number++) {
    total += number;
}
console.log("sum of natural numbers is " + total);

console.log();
console.log();

let total1 = 1;
for (let number = 1; number <= 10; number++) {
    total1 *= number;
}
console.log("product of natural numbers is " + total1);

console.log();
console.log();



console.log();
console.log();

let total2 = 0;
for (let number = 1; number <= 12; number++) {
    total2 = 3 * number;
    console.log("3 * " + number + " = " + total2);
}

console.log();
console.log();

let letter = "string";
for (let number = 0; number < letter.length; number++) {
    let letters = letter.charAt(number);
    console.log(letters);
}

console.log();
console.log();

count = 0;
letter = "string";
for (let number = 0; number < letter.length; number++) {
    let letters = letter.charAt(number);
    if (letters.toLowerCase() == "e") {
        count++;
    }
}
console.log("amount of e " + count);

console.log();
console.log();

let word = "adedotun";
for (let count = 0; count < word.length; count++) {
    let letters = word.charAt(count);
    console.log(letters.toUpperCase());
}

console.log();
console.log();

word = "adedotun";
for (let count = 0; count < word.length; count++) {
    let letters = word.charAt(count);
    console.log(letters.toLowerCase());
}

console.log();
console.log();

let vowels = "aeiou";
let words = "mr femi";
let vowelCount = 0;
for (let count = 0; count < words.length; count++) {
    letter = words.charAt(count);
    for (let index = 0; index < vowels.length; index++) {
        if (letter == vowels.charAt(index)) {
            vowelCount += 1;
            break;
        }
    }
}
console.log(vowelCount);
