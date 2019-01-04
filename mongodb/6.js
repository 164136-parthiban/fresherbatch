db.zipcodes.aggregate([{$group: {_id: "$city", population: {$sum:"$pop"}}},{$match:{_id:"ATLANTA"}}]);
