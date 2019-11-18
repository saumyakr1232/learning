import re
str1 = input("Enter a string")
str1 = re.sub('",./;:', '', str1)
print(str1)