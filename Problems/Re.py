import re
password="YashU@H430024"
a=re.fullmatch(r"^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[!@#$%^&*()]).{10,}$",password)
print(a)