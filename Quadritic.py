import cmath
a=input("Enter a of equation")
b=input("Enter b of equation")
c=input("Enter c of equation")

a=int(a)
b=int(b)
c=int(c)

dis=(b**2)-(4*a*c)
root1=(-b-cmath.sqrt(dis))/(2*a)
root2=(-b+cmath.sqrt(dis))/(2*a)

print(root1)
print(root2)