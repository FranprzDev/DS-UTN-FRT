class Animals:
    def __init__(self, species: str, age: int, weight: float):
        self.__species = species
        self.__age = age
        self.__weight = weight
        
    def get_species(self):
        return self.__species
    
    def get_age(self):
        return self.__age
    
    def get_weight(self):
        return self.__weight
    
    def set_species(self, species: str):
        self.__species = species
        
    def set_age(self, age: int):
        self.__age = age
        
    def set_weight(self, weight: float):
        self.__weight = weight
        
class Nationality:
    def __init__(self, country: str, code_ISO: int):
        self.__country = country
        self.__code_ISO = code_ISO
        
class Herbivores(Animals):
    
    def __init__(self, species: str, age: int, weight: float):
        super().__init__(species, age, weight)

class Carnivores(Animals):
    def __init__(self, species: str, age: int, weight: float):
        super().__init__(species, age, weight)