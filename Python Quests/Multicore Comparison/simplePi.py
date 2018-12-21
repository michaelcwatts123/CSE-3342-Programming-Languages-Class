import time
import random

#Code to throw darts for PI computation
def throwDarts(nDarts):
    dartsInCircle = 0

    for d in range(nDarts):
        x = random.random()
        y = random.random()
        if (x**2 + y**2) < 1:
            dartsInCircle+=1
    pi = (dartsInCircle / float(nDarts)) * 4.0
    print ("PI = %f  Darts=%d" % (pi,nDarts) )

if __name__ == '__main__':
   
    ndarts = 11000000

    start = time.time()

    throwDarts(ndarts)
    
    end = time.time()
    totalTime = end - start
    print ("total time = %f " % totalTime)


