class Car8():
    def __init__(self, manufacturer, model_name, model_year=-1, license_plate=" "):
        self._manufacturer = manufacturer
        self._model_name = model_name
        self._model_year = model_year
        self._license_plate = license_plate

    @property
    def manufacturer(self):
        return self._manufacturer

    @property
    def model_name(self):
        return self._model_name

    @property
    def model_year(self):
        return self._model_year

    @property
    def plate(self):
        return self._license_plate

    @plate.setter
    def plate(self, new_plate):
        self._license_plate = new_plate

    #second constructor
    @classmethod
    def from_year(cls, manufacturer, model_name):
        return cls(manufacturer, model_name)

    #third constructor
    @classmethod
    def from_year(cls, manufacturer, model_name, model_year):
        return cls(manufacturer, model_name, model_year)
    
    #fourth constructor
    @classmethod
    def from_year(cls, manufacturer, model_name, license_plate):
        return cls(manufacturer, model_name, -1, license_plate)

def carDemo8():
    car1 = Car8("Audi", "A4", 2022)
    car1.plate = "PYTH3N"
    print(car1)

carDemo8()
            