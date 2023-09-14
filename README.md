# Cg

<html>
  <head>
    <title>PHP Test</title>
  </head>
  <body>

    <!-- Write a Php Script to Create an Associate Array functions like ( current ,next ,key ,end , Previous , reset , Sorting of all index array with an sort & Rsort , Sorting of Associative array with aSort , ArSort , Ksort , KRSort , and Merging Two Arrays )  -->

 <?php
  $assocArray = [
    'apple' => 'red',
    'banana' => 'yellow',
    'cherry' => 'red',
    'date' => 'brown',
    'grape' => 'purple'
];

echo "Current Element: " . current($assocArray) . "\n";

next($assocArray);
echo "Next Element: " . current($assocArray) . "\n";

echo "Current Key: " . key($assocArray) . "\n";

end($assocArray);
echo "End Element: " . current($assocArray) . "\n";

prev($assocArray);
echo "Previous Element: " . current($assocArray) . "\n";

reset($assocArray);
echo "Reset Element: " . current($assocArray) . "\n";

$indexArray = ['banana', 'apple', 'grape', 'cherry', 'date'];

sort($indexArray);
echo "Sorted Index Array: ";
print_r($indexArray);

rsort($indexArray);
echo "Reverse Sorted Index Array: ";
print_r($indexArray);

$assocArray2 = [
    'banana' => 'yellow',
    'apple' => 'red',
    'grape' => 'purple',
    'cherry' => 'red',
    'date' => 'brown'
];

asort($assocArray2);
echo "Sorted Associative Array (by value): ";
print_r($assocArray2);

arsort($assocArray2);
echo "Reverse Sorted Associative Array (by value): ";
print_r($assocArray2);

ksort($assocArray2);
echo "Sorted Associative Array (by key): ";
print_r($assocArray2);

krsort($assocArray2);
echo "Reverse Sorted Associative Array (by key): ";
print_r($assocArray2);

$mergedArray = array_merge($assocArray, $assocArray2);
echo "Merged Arrays: ";
print_r($mergedArray);
?>

   
  
  </body>
</html>
