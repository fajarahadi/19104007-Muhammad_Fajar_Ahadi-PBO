var nilai = 89
var nama = "Japar Ahadi"

console.log("Nama  : ", nama)
console.log("Nilai : ", nilai)
console.log(nama + ", ")

if(nilai <= 100 && nilai >= 85){
    console.log("Kamu mendapatkan predikat A")
}else if (nilai <= 84 && nilai >= 75){
    console.log("Kamu mendapatkan predikat B")
}else if (nilai <= 74 && nilai >= 65){
    console.log("Kamu mendapatkan predikat BC")
}else if (nilai <= 64 && nilai >= 55){
    console.log("Kamu mendapatkan predikat C")
}else if (nilai <= 54 && nilai >= 45){
    console.log("kamu mendapatkan predikat D")
}else if (nilai <= 44 && nilai >= 0){
    console.log("kamu mendapatkan predikat E")
} else {
    console.log("Nilai Tidak Valid")
}

