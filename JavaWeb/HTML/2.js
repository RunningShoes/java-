// function show1(){
//     // alert(123456);
//     //document.getElementById("userName").value = "999";
//     var xb = document.getElementsByName("xb");
//     if(xb[0].checked){
//         alert(xb[0].value);
//     }else{
//         alert(xb[1].value);
//     }
// }


function ymd1(){
    
    var yyyy = document.getElementById("yyyy");
    // yyyy.options.add(new Option("1999","1999"));
    var date = new Date();
    var year = parseInt(date.getFullYear());

    // for (var i =1999;i<=year;i++){
    //     yyyy.options.add(new Option(i,i));
    // }

    var cityArray =["北京","天津","河北"]
    for(var i in cityArray){
        console.log(cityArray[i]);
        yyyy.options.add(new Option(cityArray[i],cityArray[i]));
    }
}

function ymd2(){

   var yyyy = document.getElementById("yyyy");
    var aaaa = document.getElementById("aaaa");
    // yyyy.options.add(new Option("1999","1999"));
    var date = new Date();
    var year = parseInt(date.getFullYear());

    // for (var i =1999;i<=year;i++){
    //     aaaa.options.add(new Option(i,i));
    // }

    var cityArray =["北京","天津","河北"]
    for(var i in cityArray){
        // console.log(cityArray[i]);
        yyyy.options.add(new Option(cityArray[i],cityArray[i]));
        // switch(cityArray[i]){
        //     case "北京":
        //         var areaArray=["海淀","朝阳","大兴","东城"];
        //         for(var j in areaArray)
        //         {
        //             aaaa.options.add(new Option(areaArray[j]));
        //         }
        //         break;
        //     case "河北":
        //         var areaArraya=["沧州","石家庄","衡水"];
        //         for(var j in areaArraya)
        //         {
        //             aaaa.options.add(new Option(areaArraya[j]));
        //             console.log(cityArray[i]);

        //         }
        //         break;
        // }
    }
    
}
function change(){
    
    alert("tttt");
    var yyyy = document.getElementById("yyyy");
    var aaaa = document.getElementById("aaaa");
    console.log(yyyy.value);
    aaaa.options.length = 0;
    switch(yyyy.value){
        case "北京":
            var areaArray=["海淀","朝阳","大兴","东城"];
            for(var j in areaArray)
            {
                aaaa.options.add(new Option(areaArray[j],areaArray[j]));
            }
            break;
        case "河北":
            var areaArraya=["沧州","石家庄","衡水"];
            for(var j in areaArraya)
            {
                aaaa.options.add(new Option(areaArraya[j],areaArraya[j]));
                console.log(areaArraya[j]);
            }
            break;
        case "天津":
                var areaArray3=["海淀","朝阳","大兴","东城"];
                for(var j in areaArray3)
                {
                    aaaa.options.add(new Option(areaArray3[j],areaArray3[j]));
                }
                break;
    }

}