Map vals = ['Zero':0, 'Negative decimal':-0.01, 'Negative decimal':-0.05, 'Negative whole number':-1,
	'Negative decimal':-1.5, 'One':1, 'Positive decimal':0.01, 'Positive decimal':0.05,
	'Positive decimal':1.5, 'Empty string':'', 'Empty list':[], 'Empty hash':[:],
	'Lower character':'a', 'Upper character':'A', 'Null':null
]
 
vals.each{ k, v ->
	println (v ? "$k ( $v ) is true" : "$k ( $v ) is false")
}