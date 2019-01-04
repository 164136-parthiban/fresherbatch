db.zipcodes.aggregate ([
	{$group: 
		{
			_id:{state:'$state',city:'$city'},
			avg_population: {$avg: "$pop"}
		}
	}, 
        {$sort: 
		{avg_population: -1}
	}
        ])