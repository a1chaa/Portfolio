"""Aicha Doumbia"""

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
    
    def __lt__(self, other):
        # Implements less than comparison for cards.
        if self.suit != other.suit:
            return self.suit < other.suit
        else:
            return self.rank < other.rank


def main():

    cards = []
#dictionary is initialized with four key-value pairs,
    #where each key represents a suit ('c' for Clubs, 'd' for Diamonds,
    #'h' for Hearts, and 's' for Spades).
    suit_count = {'c': [0] * 14, 'd': [0] * 14, 'h': [0] * 14, 's': [0] * 14}
    
    while True:
        rank_input = int(input("Enter rank, or 0 to stop: "))
        if rank_input == 0:
            break
        
        suit_input = input("Enter suit: ").strip().lower()
        
        # Create card object and add it to the list
        card = Card(rank_input, suit_input)
        cards.append(card)
        
        # Update suit count dictionary
        suit_count[suit_input][rank_input] += 1
    
    # Sort the cards
    cards.sort()
    
    # Print the sorted cards
    print("\nYour sorted cards are")
    for card in cards:
        print(card)
    
    # Print the count of each suit and rank
    print("\nThe total number of cards of each rank are")
    for suit, counts in suit_count.items():
        full_suit_name = {"d": "Diamonds", "c": "Clubs", "h": "Hearts", "s": "Spades"}[suit]
        print(f"{full_suit_name}: {counts}")


if __name__ == "__main__":
    main()
