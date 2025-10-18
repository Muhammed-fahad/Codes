s = input("Enter a time (hh:mm): ")
time = input("Enter time zone (am/pm): ").lower()

parts = s.split(":")
hour = int(parts[0])
minute = parts[1]

if time == "am":
    if hour == 12:
        hour = 0
    print(f"{hour}:{minute}")
elif time == "pm":
    if hour != 12:
        hour += 12
    print(f"{hour:02d}:{minute}")
else:
    print("Invalid time zone. Please enter 'am' or 'pm'.")
