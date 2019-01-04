db.addresses.find({},{_id:null,restaurant_id:"$restaurant_id",
name:"$name",
borough:"$borough",
cuisine:"$cuisine"});