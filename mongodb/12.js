db.zipcodes.aggregate (
	{$match:
		{state: 'IL'}
	},
	{$group: 
		{
			_id: '$city',
			zipcodes: {$sum: 1}
		}
	},
	{$sort: 
		{zipcodes: -1}
	}
)