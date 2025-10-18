a = [2, 3, 4, 2, 3, 2, 3, 4, 4, 4]
b = dict()

for i in a:
    if i not in b:
        b[i] = 1
    else:
        b[i] += 1

sorted_b_by_keys_desc = dict(sorted(b.items(), reverse=True))
print(sorted_b_by_keys_desc)