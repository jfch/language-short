/**
 * question: save total number users give by clicking the button, and reload the number when the page reload
 */
function counter1() {
    if(typeof(Storage) !== "undefined") {
    	try
    	{
	        if (localStorage.numberTotal) {
	            localStorage.numberTotal = Number(localStorage.numberTotal)+10;
	        } else {
	            localStorage.numberTotal = 10;
	        }
	        document.getElementById("showNum").innerHTML = "Saved Total Number: " + localStorage.numberTotal + "."; 
    	} 
    	catch (e) 
    	{
			if (e == QUOTA_EXCEEDED_ERR) {
				alert('Quota exceeded!');
		}
	}
    } else {
        document.getElementById("showNum").innerHTML = "does not support web storage";
    }
}
function setColor() {
    if(typeof(Storage) !== "undefined") {
    	try
    	{
    		localStorage.fontsize = 20;
    		localStorage.bgcolor = '#ffff00';

    	} 
    	catch (e) 
    	{
			if (e == QUOTA_EXCEEDED_ERR) {
				alert('Quota exceeded!');
		}
	}
    } else {
        document.getElementById("showNum").innerHTML = "does not support web storage";
    }
}

function changeColor() 
{
	if (localStorage.length != 0) {
	document.body.style.backgroundColor = localStorage.bgcolor;
	document.body.style.fontSize = localStorage.fontsize + 'px';
	document.getElementById("showNum").innerHTML = "!=0" + localStorage.bgcolor;
	} else {
	document.body.style.backgroundColor = '#000000';
	document.body.style.fontSize = '50px'
		document.getElementById("showNum").innerHTML = "0" + localStorage.bgcolor;
	}
}

