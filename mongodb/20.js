db.zipcodes.aggregate ([
	{$group: 
		{
			_id: '$city',
			avg_population: {$avg: "$pop"}
		}
	}, 
        {$sort: 
		{population: -1}
	}])