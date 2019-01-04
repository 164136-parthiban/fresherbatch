db.addresses.find({},{restaurant_id:"$restaurant_id",
name:"$name",
borough:"$borough",
cuisine:"$cuisine"});