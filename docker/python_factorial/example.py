def factorial(n):
    if n < 0:
        return "Undefined for negative numbers"
    elif n == 0:
        return 1
    else:
        result = 1
        for i in range(1, n + 1):
            result *= i
        return result

if __name__ == "__main__":
    try:
        number = int(input("Enter a number to calculate its factorial: "))
        print(f"The factorial of {number} is {factorial(number)}")
    except ValueError:
        print("Please enter a valid integer.")