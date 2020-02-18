//function getParameterByName( name ){
//  name = name.replace(/[\[]/,"\\\[").replace(/[\]]/,"\\\]");
//  var regexS = "[\\?&]"+name+"=([^&#]*)";
//  var regex = new RegExp( regexS );
//  var results = regex.exec( location.search );
//  if( results === null )
//    return "";
//  else
//    return decodeURIComponent(results[1].replace(/\+/g, " "));
//}

function getParameterByName(name) {
    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
        results = regex.exec(location.search);
    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
}

//javascript
//document.registerForm.acceptCharset = "EUC-KR"

document.getElementById("id").innerHTML = getParameterByName('id');

document.getElementById("name").innerHTML = getParameterByName('name');

document.getElementById("email").innerHTML = getParameterByName('email');

document.getElementById("tel").innerHTML = getParameterByName('phone');

document.getElementById("addr").innerHTML = getParameterByName('gitaddr');

document.getElementById("job").innerHTML = getParameterByName('job');

document.getElementById("interest").innerHTML = getParameterByName('interest');
//document.write("id: "+getParameterByName('id'));



