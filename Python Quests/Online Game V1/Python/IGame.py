from Point import *
class IGame():
    def tick(self):
        return 0
    def play(self, cycles):
        return 0
    def showState(self):
        return 0
class Game(IGame):
    def __init__(self):
        self.s = [Sprite(1,1,1,0),Sprite(2,2,2, 45),Sprite( 3,3,3,90 ),Sprite( 4 ,4,4,135 ), Sprite(5,5,5,180), Sprite(6,6,6,225), Sprite(7,7,7,270), Sprite(8 ,8,8,315), Sprite(9,1,0,180), Sprite(10,0,1,270 )]
        self.play(1)
    def play(self, cycles):
        # for x in range (0, cycles):
            self.showState()
            self.tick()
            self.showState()
    def tick(self):
        for x in self.s:
            if ((x.x != 0) or (x.y != 0)): #checks for neg values
                if (x.dir == 0):
                    x.y+=1
                    
                if(x.dir == 45):
                    x.y+=1
                    x.x+=1
                if(x.dir == 90):
                    x.x+=1
                if(x.dir == 135):
                    x.x+=1
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                        x.x-=1
                if(x.dir == 180):
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                if(x.dir == 225):
                    x.x-=1
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                        x.x+=1

                if(x.dir == 270):
                    x.x-=1
                    if(x.isInNegative):
                        x.x+=1
                if(x.dir == 315):
                    x.x-=1
                    x.y+=1
                    if(x.isInNegative):
                        x.x+=1
                        x.y-=1

            if (x.x == 0 and x.dir < 225):
                if (x.dir == 0):
                    x.y+=1
                    
                if(x.dir == 45):
                    x.y+=1
                    x.x+=1
                if(x.dir == 90):
                    x.x+=1
                if(x.dir == 135):
                    x.x+=1
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                        x.x-=1
                if(x.dir == 180):
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                if(x.dir == 225):
                    x.x-=1
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                        x.x+=1

                if(x.dir == 270):
                    x.x-=1
                    if(x.isInNegative):
                        x.x+=1
                if(x.dir == 315):
                    x.x-=1
                    x.y+=1
                    if(x.isInNegative):
                        x.x+=1
                        x.y-=1
            if(x.y == 0 and (x.dir != 135 or x.dir != 180 or x.dir != 225)):
                if (x.dir == 0):
                    x.y+=1
                    
                if(x.dir == 45):
                    x.y+=1
                    x.x+=1
                if(x.dir == 90):
                    x.x+=1
                if(x.dir == 135):
                    x.x+=1
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                        x.x-=1
                if(x.dir == 180):
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                if(x.dir == 225):
                    x.x-=1
                    x.y-=1
                    if(x.isInNegative):
                        x.y+=1
                        x.x+=1

                if(x.dir == 270):
                    x.x-=1
                    if(x.isInNegative):
                        x.x+=1
                if(x.dir == 315):
                    x.x-=1
                    x.y+=1
                    if(x.isInNegative):
                        x.x+=1
                        x.y-=1
    def showState(self):
        print("id\t x\t y\t d\t s\t w")
        for x in self.s:
            print(str(x.id) + '\t' + str(x.x) + '\t' + str(x.y) + '\t' + str(x.dir) + '\t' + str(x.speed) + '\t' +  str(x.weight) )
        print('\n')   
        