db.addresses.find(
{ 
"borough": "Bronx" , 
$or : [
{ "cuisine" : "American " },
{ "cuisine" : "Chinese" }
] 
} 
);