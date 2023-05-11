def solution(array):
    answer = [0, -1]
    # 첫번째에 값 두번째에 인덱스
    for idx in range(len(array)):
          if array[idx] > answer[0]:
                answer[0] = array[idx]
                answer[1] = idx
    
    return answer