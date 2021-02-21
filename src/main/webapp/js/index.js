var myVar=setInterval(function () {myTimer()}, 1000);
var counter = 0;
function myTimer() {
    var date = new Date();
   console.log (date.getHours());
    if(date.getHours()<=12){
   document.getElementById("demo").innerHTML = date + "Bom Dia";
    }else{
        if(date.getHours()>12 && date.getHours()<18){
            document.getElementById("demo").innerHTML = date + "Boa Tarde";
        } else{
            document.getElementById("demo").innerHTML = date + "Boa Noite";
        }
    }
}