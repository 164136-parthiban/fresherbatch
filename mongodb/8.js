db.zipcodes.aggregate([{$group: {_id: "$state", population: {$sum:1}}}]);
