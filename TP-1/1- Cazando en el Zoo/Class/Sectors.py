import sys
sys.path.append('..')
from Class.Animals import Animals

class Sectors:
    def __init__(self, animals: list, max_animals: int, coords: 'Coords'):
        self.__animals = animals
        self.__max_animals = max_animals
        self.__coords = coords
    
    def get_animals(self):
        return self.__animals
    
    def get_max_animals(self):
        return self.__max_animals
    
    def get_coords(self):
        return self.__coords
    
    def set_animals(self, animals: list):
        self.__animals = animals
        
    def set_max_animals(self, max_animals: int):
        self.__max_animals = max_animals
        
    def set_coords(self, latitude: str, longitude: str):
        self.__coords = Coords(latitude, longitude)
        
    def add_animal(self, animal: 'Animals'):
        self.__animals.append(animal)
        
    def remove_animal(self, animal: 'Animals'):
        self.__animals.remove(animal)
        
    

class Coords:
    def __init__(self, latitude: str, longitude: str):
        self.__latitude = latitude
        self.__longitude = longitude

