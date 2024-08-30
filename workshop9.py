"""
class Person:
    """A class to represent a person with a name and phone number."""

    def __init__(self, name, phone_number):
        """Constructor method to initialize a Person object with a name and phone number."""
        self.name = name
        self.phone_number = phone_number
    
    def get_name(self):
        """Accessor method to get the name of the person."""
        return self.name
    
    def get_phone_number(self):
        """Accessor method to get the phone number of the person."""
        return self.phone_number
    
    def set_name(self, name):
        """Mutator method to set the name of the person."""
        self.name = name
    
    def set_phone_number(self, phone_number):
        """Mutator method to set the phone number of the person."""
        self.phone_number = phone_number

# Example usage:
person1 = Person("Aicha Doumbia", "123-456-7890")

# Accessor methods
print("Name:", person1.get_name())  # Output: Aicha Doumbia
print("Phone Number:", person1.get_phone_number())  # Output: 123-456-7890

# Mutator methods
person1.set_name("Fati Doumbia")
person1.set_phone_number("(987) 654-3210")
print("Updated Name:", person1.get_name())  # Output: Fati Doumbia
print("Updated Phone Number:", person1.get_phone_number())
"""
class RockBand:
    def __init__(self, singer, drummer, guitar_player, bass_player):
        #Constructor method to initialize a RockBand object with four members.
        self.singer = singer
        self.drummer = drummer
        self.guitar_player = guitar_player
        self.bass_player = bass_player
    
    def get_singer(self):
        #Accessor method to get the singer of the rock band.
        return self.singer
    
    def get_drummer(self):
        #Accessor method to get the drummer of the rock band.
        return self.drummer
    def get_guitar_player(self):
        return self.guitar_player

         #Accessor method to get the bass player of the rock band.
    def get_bass_player(self):
        return self.bass_player


        
    
