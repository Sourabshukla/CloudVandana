function reverseWords(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store in a new array
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}
//Example
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"
