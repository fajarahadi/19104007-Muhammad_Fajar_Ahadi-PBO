var mark = {
    nilai : function(num1, num2, num3, num4, num5){
        return num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5;
    }
};

var nilai2 = console.log("Nilai : ")

console.log(mark.nilai.apply(nilai2, [5,6,2,3,7]));

console.log("Nilai Maksimal : ", Math.max(5,6,2,3,7));
console.log("Nilai Minumum : ", Math.min(5,6,2,3,7));