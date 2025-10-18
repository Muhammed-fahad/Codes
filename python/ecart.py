# eCart Console Application

# In-memory data storage
users = {
    "admin": {"password": "admin123", "role": "admin"},
}
products = {}
product_id_counter = 101

# --- User Management ---
def register_user():
    username = input("Enter new user ID: ")
    if username in users:
        print("User ID already exists!")
        return

    password = input("Enter password: ")
    print("Select role: 1. Customer  2. Manager")
    role_choice = input("Enter role number: ")
    role = "customer" if role_choice == "1" else "manager"

    users[username] = {"password": password, "role": role}
    print(f"{role.capitalize()} registered successfully!")


def login_user():
    username = input("Enter user ID: ")
    password = input("Enter password: ")
    if username in users and users[username]["password"] == password:
        print(f"Welcome {username}! You are logged in as {users[username]['role']}.")
        return username, users[username]["role"]
    else:
        print("Invalid credentials!")
        return None, None


# --- Product Management ---
def add_product():
    global product_id_counter
    name = input("Enter product name: ")
    price = float(input("Enter product price: "))
    products[product_id_counter] = {"name": name, "price": price}
    print(f"Product added with ID: {product_id_counter}")
    product_id_counter += 1


def delete_product():
    pid = int(input("Enter product ID to delete: "))
    if pid in products:
        del products[pid]
        print("Product deleted.")
    else:
        print("Product ID not found.")


def view_products():
    if not products:
        print("No products available.")
        return
    for pid, info in products.items():
        print(f"ID: {pid}, Name: {info['name']}, Price: {info['price']}")


# --- Role Menus ---
def admin_menu():
    while True:
        print("\n1. Add Manager\n2. Remove Manager\n3. Add Product\n4. Delete Product\n5. View Products\n6. Logout")
        choice = input("Enter choice: ")
        if choice == "1":
            register_user()
        elif choice == "2":
            uname = input("Enter manager ID to remove: ")
            if uname in users and users[uname]["role"] == "manager":
                del users[uname]
                print("Manager removed.")
            else:
                print("Manager not found.")
        elif choice == "3":
            add_product()
        elif choice == "4":
            delete_product()
        elif choice == "5":
            view_products()
        elif choice == "6":
            break
        else:
            print("Invalid choice!")


def manager_menu():
    while True:
        print("\n1. Add Product\n2. Delete Product\n3. View Products\n4. Logout")
        choice = input("Enter choice: ")
        if choice == "1":
            add_product()
        elif choice == "2":
            delete_product()
        elif choice == "3":
            view_products()
        elif choice == "4":
            break
        else:
            print("Invalid choice!")


def customer_menu():
    while True:
        print("\n1. View Products\n2. Logout")
        choice = input("Enter choice: ")
        if choice == "1":
            view_products()
        elif choice == "2":
            break
        else:
            print("Invalid choice!")


# --- Main App ---
def main():
    while True:
        print("\nWelcome to eCart")
        print("1. Register")
        print("2. Login")
        print("3. Exit")
        choice = input("Enter your choice: ")

        if choice == "1":
            register_user()
        elif choice == "2":
            username, role = login_user()
            if role == "admin":
                admin_menu()
            elif role == "manager":
                manager_menu()
            elif role == "customer":
                customer_menu()
        elif choice == "3":
            print("Thank you for using eCart!")
            break
        else:
            print("Invalid choice!")


if __name__ == "__main__":
    main()
