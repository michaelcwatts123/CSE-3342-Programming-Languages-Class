import time
import random
import multiprocessing as mp
#Code to throw darts for PI computation
def throwDarts(nDarts):
    dartsInCircle = 0

    for d in range(nDarts):
        x = random.random()
        y = random.random()
        if (x**2 + y**2) < 1:
            dartsInCircle+=1
    return dartsInCircle
    # pi = (dartsInCircle / float(nDarts)) * 4.0
    # print ("PI = %f  Darts=%d" % (pi,nDarts) )
def multi(nCPU, nAmount, threadSafeQueue):
    workPerProcess = int(nAmount/nCPU)

    worker = []
    for _ in range(nCPU):
        worker.append(mp.Process(target=addToThreadSafeQueue, args=(workPerProcess, threadSafeQueue)))
    for i in range(nCPU):
        worker[i].start()
    for i in range(nCPU):
        worker[i].join() 


def addToThreadSafeQueue(workPerProcess, threadSafeQueue):
    i = throwDarts(workPerProcess)
    threadSafeQueue.put(i)

if __name__ == '__main__':
   
    ndarts = 11000000
    numPC = mp.cpu_count()
    start = time.time()
    threadSafeQueue = mp.Queue()
    multi(numPC, ndarts, threadSafeQueue)
    results = [threadSafeQueue.get() for _ in range(numPC)]
    Total = sum(results)
    pi = (ndarts / float(Total)) * 4.0
    print ("PI = %f  Darts=%d" % (pi,ndarts) )
    end = time.time()
    totalTime = end - start
    print ("total time 1 for 1= %f " % totalTime)


    numPC = numPC * 2
    start = time.time()
    threadSafeQueue = mp.Queue()
    multi(numPC, ndarts, threadSafeQueue)
    results = [threadSafeQueue.get() for _ in range(numPC)]
    Total = sum(results)
    pi = (ndarts / float(Total)) * 4.0
    print ("PI = %f  Darts=%d" % (pi,ndarts) )
    end = time.time()
    totalTime = end - start
    print ("total time 1 for 2= %f " % totalTime)