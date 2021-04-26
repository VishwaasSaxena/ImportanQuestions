"""newList=[1,3,4,4,5,6,3,7,8]
noRes=[]

print(newList)   

for i in newList:
    if i not in noRes:
        noRes.append(i)
print(noRes)
"""
test_list = [1, 5, 3, 6, 3, 5, 6, 1]
print ("The original list is : " +  str(test_list))
   
test_list = list(set(test_list))

print ("The list after removing duplicates : " + str(test_list))
