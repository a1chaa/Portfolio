
import random
"""
def determine_winner(user_throw, computer_throw):
    # Check for a tie
    if user_throw == computer_throw:
        return "It's a tie!"

    # Check for user wins
    if (user_throw == 'rock' and computer_throw == 'scissors') or \
       (user_throw == 'paper' and computer_throw == 'rock') or \
       (user_throw == 'scissors' and computer_throw == 'paper'):
        return "Congratulations! You win!"

    # If it's not a tie and user didn't win, then computer wins
    return "Sorry, you lose. Better luck next time!"
 
def main():
    throws = ['rock', 'paper', 'scissors']

    # Get user's throw
    user_throw = input("Enter your throw (rock, paper, or scissors): ").lower()

    # Generate a random throw for the computer
    computer_throw = random.choice(throws)
  
    # Print out the computer's throw
    print("Computer throws:", computer_throw)

    # Determine the winner
    result = determine_winner(user_throw, computer_throw)
    print(result)

if __name__ == "__main__":
    main()
""" 

def simulate_blackjack_games(num_games):
    bust_count = 0  # Counter to track the number of times the dealer busts
    
    # Simulate multiple games of blackjack

    for _ in range(num_games):
        dealer_total = draw_initial_hand()  # Draw initial hand for the dealer
        # Continue drawing cards for the dealer until their total is at least 17
        while dealer_total < 17:
            card_value = draw_card()  # Draw a card
            dealer_total += card_value  # Add the value of the drawn card to the dealer's total

            # Check if the dealer's total exceeds 21 and adjust for aces if necessary
            if dealer_total > 21 and has_ace(dealer_total - card_value):
                dealer_total -= 10  # Count ace as 1 instead of 11
            # Check if the dealer has busted
            if dealer_total > 21:
                bust_count += 1  # Increment the bust count
                break

    return bust_count / num_games  # Calculate and return the estimated probability of dealer busting

def draw_initial_hand():
    # Draw initial hand by randomly selecting two cards
    return random.randint(1, 10) + random.randint(1, 10)

def draw_card():
    # Draw a single card with a value between 1 and 10
    return random.randint(1, 10)

def has_ace(total):
    # Check if the total includes an ace that can be counted as 11 without busting
    return total + 10 <= 21

def main():
    num_games = 1000000  # Number of games to simulate
    bust_probability = simulate_blackjack_games(num_games)  # Simulate blackjack games and estimate bust probability
    print(f"Estimated probability of dealer busting: {bust_probability:.4f}")  # Print the estimated bust probability

if __name__ == "__main__":
    main()
