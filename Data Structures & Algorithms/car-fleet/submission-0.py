class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        cars = [[pos,speed] for pos, speed in zip(position, speed)]
        stack = []
        
        # or sorted(cars)[::-1]
        for pos, speed in sorted(cars, reverse=True):
            time = (target - pos) / speed
            if not stack or time > stack[-1]:
                stack.append(time)


        return len(stack)
        