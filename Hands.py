Hands = [0, 0, 0]

def get_positions(n):
    global Hands
    Hands[0] = n % 3
    Hands[1] = (n // 3) % 3   
    Hands[2] = (n // 9) % 3 
    return tuple(Hands)

get_positions(67)
print(Hands)