class Iphone:
    display='Oled'
    battery='li-ion'
    charger = 'Type c'
    os = 'Ios'
    @property
    def get_display(self):
        return self.display
    def get_battery(self):
        return self.battery

class five(Iphone):
    version = 1.0

class fivePlus(five):
    charger ='Type s'

def some_func(arg1, arg2, arg3, arg4, karg='saumya', karg2=56):
    