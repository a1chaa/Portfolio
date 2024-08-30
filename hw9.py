"""Aichata Doumbia"""
class Card:
    def __init__(self, rank, suit):
        # Initializes a Card object with a rank and a suit.
        self.rank = rank
        self.suit = suit
    
    def get_rank(self):
        # Returns the rank of the card.
        return self.rank
    
    def get_suit(self):
        # Returns the suit of the card.
        return self.suit
    
    def bj_value(self):
        # Returns the Blackjack value of the card.
        if self.rank == 1:  # Ace
            return 1
        elif self.rank in {11, 12, 13}:  # Jack, Queen, King
            return 10
        else:
            return self.rank
    
    def __repr__(self):
        # Returns a string representation of the card.
        ranks = {1: "Ace", 11: "Jack", 12: "Queen", 13: "King"}
        rank_str = ranks.get(self.rank, str(self.rank))
        suits = {"d": "Diamonds", "c": "Clubs", "h": "Hearts", "s": "Spades"}
        suit_str = suits[self.suit]
        return f"{rank_str} of {suit_str}"



c = Card(1, "s")

