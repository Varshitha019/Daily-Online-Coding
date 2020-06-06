
3. Write a python program to count number of strings.
Description:
Write a Python program to count the number of strings, provided string length is 2 or more and the first and last character are same from a given list of strings.
Eg:
Input
list1['hia', 'aba' , '363']
Output:
Number of strings with first and last cahracter is same: 2Description:
Write a Python program to count the number of strings, provided string length is 2 or more and the first and last character are same from a given list of strings.
Eg:
Input
list1['hia', 'aba' , '363']
Output:
Number of strings with first and last cahracter is same: 2



def match_words(words):
  ctr = 0

  for word in words:
    if len(word) > 1 and word[0] == word[-1]:
      ctr += 1
  return ctr

print(match_words(['hia', 'aba' , '363']))
