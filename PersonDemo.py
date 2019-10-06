class Person():
    def __init__(self):
        self.__age = 0
    @property
    def age(self):
        return self.__age
    @age.setter
    def age(self, ag):
        if ((ag<0) or (ag > 150)):
            print("错误的数据")
        else:
            self.__age = ag
p = Person()
p.age = -20
print(p.age)