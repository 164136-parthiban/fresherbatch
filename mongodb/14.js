db.zipcodes.aggregate (
	{$match:
		{state: 'IL'}
	},
	{$group: 
		{
			_id: '$city',
			zipcodes: {$sum: "$pop"}
		}
	},
	{$sort: 
		{zipcodes: -1}
	}
)