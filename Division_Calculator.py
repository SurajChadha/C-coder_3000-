print("Give me two numbers and I will divode them");
print("Enter 'q' to quit");

while True:
    first_number = input("\nFirst Number:")
    if first_number == 'q':
       break
    second_number = input("Second number: ")
    if second_number == 'q':
       break
    answer = int(first_number)
    print(answer)