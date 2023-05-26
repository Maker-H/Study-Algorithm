def solution(id_pw, db):
    answer = ''
    tmp = ''
    for id, pwd in db:
        if id == id_pw[0] and pwd == id_pw[1]:
            return 'login'
        if id == id_pw[0] and pwd != id_pw[1]:
            tmp = 'wrong pw'
            
    if not tmp:
        return  'fail'
    else:
        return tmp