import re
import collections
def wordCount(strn):
	strn = re.sub(r'[^\w\s]', '', strn)
	lst = strn.split(' ')
	print 'string = ', strn
	hmap = collections.OrderedDict()
	for w in lst:
		if w.lower() in hmap:
			hmap[w.lower()] +=1
		else:
			hmap[w.lower()] = 1
	print hmap
wordCount('To be or not to be, that is the question?')
