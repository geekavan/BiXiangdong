class Person:
    def __init__(self, name="null", sex = ' '):
        self.name = name
        self.sex = sex

if __name__=="__main__":
    p = Person()
    print(p.name+":"+p.sex+"|")
    p1 = Person(sex = 'f')
    print(p1.name+":"+p1.sex+"|")
    p2 = Person("小明",'f')
    print(p2.name+":"+p2.sex+"|")