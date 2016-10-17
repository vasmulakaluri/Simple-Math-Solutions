function processData(numberOfSubjects, mathScores, engScores) {
    //setting len to maximum length of either the math or english array
    var len = Math.max(mathScores.length, engScores.length);
    var averages = [];
    var sumOfAverages = 0;
    
    for(var i=0; i < len; i++) {
    	averages[i] = (parseInt(mathScores[i]) + parseInt(engScores[i])) / 2;
        sumOfAverages += averages[i];
    }
    
    var average = sumOfAverages/averages.length;
    var count = 0;
    for (var i = 0; i < averages.length; i++) {
    	if (averages[i] < average) count ++;
    }
    console.log(count);
    
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    //Standard input
    _input += input;
});

process.stdin.on("end", function () {
    //splitting input by \n
	var inputData = _input.split("\n");
    //splitting input by ',' for the math and english scores
   	processData(inputData[0], inputData[1].split(','), inputData[2].split(','));
});
