class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        
        pos_speed = sorted(zip(position, speed))
        pos_speed.reverse()
        # time = []
        # print(pos_speed)
        
        count = 0
        stack = []
        for pos, sp in pos_speed:
            time = (target-pos)/sp
            
            if not stack or stack[-1]<time:
                stack.append(time)

        return len(stack)
        