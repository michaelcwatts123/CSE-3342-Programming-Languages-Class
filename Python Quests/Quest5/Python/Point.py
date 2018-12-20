class Point(): #data for point
    def __init__(self, x, y):
        self.x = x
        self.y = y
    def __str__(self):
        return "X: " + (str)(self.x) + 'Y: ' + (str)(self.y)
    def isInNegative(self):
        return self.x < 0 or self.y < 0
class Sprite(Point): 
    def __init__(self, id, x, y, dir):
        Point.__init__(self, x, y)
        self.id = id
        self.dir = dir
        self.speed = 1
        self.weight = 10
     