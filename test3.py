def calculate_mean(num):
    sum_num = 0
    for t in num:
        sum_num = sum_num + t           

    avg = sum_num / len(num)
    return avg

print("The average is", calculate_mean([10, 15, 20, 25, 30]))