<?php

function diff($count, $string){
     $output = "";
     $c = strlen($string) ;
     $i = 0 ;
     for($i = 0 ; $i < $c; $i++){ $output .= chr(ord($string[$i]) + $count) ; }
     return $output; 
    }

$key = "Khoor/#Zruog$" ;
// $key = "XwyaTxu%*(Wt&93ya=9";

for($i = -127; $i <= 128; $i++){
    echo "\nShift: $i => ". diff($i, $key) ;
}

    // echo diff(1, 'arjun') ;