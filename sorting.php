<?php
$fruits=array("apple","watermelon","mango");
echo"the current element is:".next($fruits)."</br>";
echo "the next element is : ".next($fruits)."</br>";
echo" its index is: ".key ($fruits)."</br>";
echo " the previous element is :".prev($fruits)."</br>";
echo " the first elementg is:".reset($fruits)."</br>";

sort($fruits);
echo"indexed array in ascending order.</br>";
print_r($fruits);
rsort($fruits);
echo"<br> indexed array in descending order .</br>;
print_r("$fruits);
echo"<br><b>Associative array sorting </b></br>";

$age= array ("dhano"=>20,"maitri"=>19,"vivek"=>18);
asort($age);
echo"array in ascending order .</br>";
print_r($age);
arsort($age);
echo" array in descending order.</br>";
print_r($age);
ksort ($age);
echo "array in ascending order .</br>";
print_r($age);
krsort($age);
echo "</br> <b>merging arrays :</b>.</br>";

$colors=array ("red","blue","pink","black");
echo"</br>";
print_r($fruits);
echo"</br>";
print_r($colors);
echo"<br>merge array :</br>";
print_r(array_merge($fruits,$colors));
?>
