"""
This tip calculator allows a user to input the bill amount, inclusive of taxes. 
And, calculates a total with 15% as tip amount. 
"""

print "Enter Bill amount:"

meal = input()

#tax = 0.0975
tip = 0.15

#meal = meal + meal * tax
total = meal + meal * tip

print("The total is:  %.2f" % total)
