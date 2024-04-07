class Employee:
    def __init__(self, name: str, dni: str, address: 'Address'):
        self.__name = name
        self.__dni = dni
        self.__address = address

class Address:
    def __init__(self, street: str, city: str, province: str, zip_code: str, additional_comment: str):
        self.__street = street
        self.__city = city
        self.__province = province
        self.__zip_code = zip_code
        self.__additional_comment = additional_comment