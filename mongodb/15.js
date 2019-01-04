db.zipcodes.aggregate (
	{$match:
		{state: 'IL'}
	},{$sort: 
		{zipcodes: 1}
	},
	{$group: 
		{
			_id: '$city',
			zipcodes: {$sum: "$pop"}
		}
	}
	
)