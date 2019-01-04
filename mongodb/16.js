db.zipcodes.aggregate (
	{$group: 
		{
			_id: '$city',
			population: {$sum: "$pop"}
		}
	},
        {$limit:3},
        {$sort: 
		{population: -1}
	}
	
)