db.zipcodes.aggregate ([
	{$group: 
		{
			_id:{state:'$state',city:'$city'},
			total_population: {$sum: "$pop"}
		}
	}, 
        {$sort: 
		{total_population: -1}
	}
        ])