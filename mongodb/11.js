db.zipcodes.aggregate (
	{$group: 
		{
			_id: {city: '$city', state: '$state'},
			population: {$sum: '$pop'}
		}
	},
	{$sort:
		{population: -1}
	}
)