1.Write a python program to Remove Punctuations From a String.


punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''
my_str = "Hello!, Good morning:)"
no_punct = ""
for char in my_str:
   if char not in punctuations:
       no_punct = no_punct + char
print(no_punct)
