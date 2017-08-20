/**
 * question: give a small speech by using variables
 */
function speech()
{
	var age_a = 15;
	var age_b = 2;
	var age_c = age_a * age_b;
	var intro = "Hello Vedang, my name is";
	var name = "Jiongfeng";
	var intro_ful = intro +" "+ name;
	var speech = intro_ful + " and my age is " + age_c +".";
	return speech;
}
