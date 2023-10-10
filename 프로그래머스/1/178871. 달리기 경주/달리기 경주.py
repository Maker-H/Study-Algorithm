# from collections import defaultdict
def solution(players, callings):
    rank_dict = {}
    player_dict = {}
    
    for i, p in enumerate(players):
        rank_dict[i] = p
        player_dict[p] = i
        
    for call in callings:
        r = player_dict[call]
        # print("rank", r)
        # print(player_dict)
        # print(rank_dict)
        
        player_dict[rank_dict[r]], player_dict[rank_dict[r - 1]] = player_dict[rank_dict[r - 1]], player_dict[rank_dict[r]]
        rank_dict[r], rank_dict[r - 1] = rank_dict[r - 1], rank_dict[r]
        
    ans = list(rank_dict.values())
    return ans