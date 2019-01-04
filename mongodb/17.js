db.zipcodes.aggregate (
	{$group: 
		{
			_id: '$city',
			population: {$sum: "$pop"}
		}
	},
        {$sort: 
		{population: -1}
	}
	
)