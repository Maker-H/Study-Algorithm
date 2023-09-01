def solution(phone_book):
    phone_book.sort()
    # print(phone_book)
    
    for idx, p in enumerate(phone_book):
        
        if idx == 0: 
            continue
        
        if phone_book[idx - 1] == p[:len(phone_book[idx - 1])]:
            return False
            # print("before: ", phone_book[idx - 1], "after", p)
            
    return True