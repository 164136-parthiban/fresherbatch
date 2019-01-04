db.zipcodes.aggregate (
	{$group: 
		{
			_id: {city: '$city', state: '$state'},
			zips: {$sum: 1}
		}
	},
	{$sort: 
		{zipcodes: -1}
	}
)