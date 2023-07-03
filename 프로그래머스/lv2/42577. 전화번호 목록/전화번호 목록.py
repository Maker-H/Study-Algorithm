def solution(phone_book):
    phone_book.sort()
    
    # print(phone_book)
    for i in range(0, len(phone_book) - 1):
        if phone_book[i] == phone_book[i + 1][:len(phone_book[i])]:
            return False
    
#     for i in range(0, len(phone_book)):
#         for j in range(i + 1, len(phone_book)):
#             if phone_book[i][0] != phone_book[j][0]:
#                 break
                
#             if len(phone_book[i]) > len(phone_book[j]):
#                 if phone_book[j] == phone_book[i][:len(phone_book[j])]:
#                     return False
#             else:
#                 if phone_book[i] == phone_book[j][:len(phone_book[i])]:
#                     return False
                
        
    return True