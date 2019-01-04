db.zipcodes.aggregate ([
	{$group: 
		{
			_id: '$city',
			avg_population: {$avg: "$pop"}
		}
	}, 
        {$sort: 
		{avg_population: 1}
	},{$limit:3}
        ])