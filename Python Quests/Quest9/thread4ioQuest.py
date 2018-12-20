import time
from threading import Thread
import requests

# Code to compare the performance of a single main thread vs multiple threads
# in performing IO

globalUrlList = ['http://www.smu.edu', 'http://www.cisco.com', 'http://www.cnn.com', 'http://www.nyt.com',
                 'http://www.nba.com']

def getDataFromUrl(url):
    r = requests.get(url)
    nbytes = len(r.text)
    print("number bytes = %d for %s" % (nbytes, url))

def doIOMainThread():
    global globalUrlList
    'do all IO in the  main thread'
    for myurl in globalUrlList:
        getDataFromUrl(myurl)

class MyThread(Thread):

    def __init__(self, url):
        Thread.__init__(self)
        self.myUrl = url
        
    def run(self):
        getDataFromUrl(self.myUrl)
        
    
def runMultiThreads():
    'Run so that each thread has its own URL '
    global globalUrlList

    # List to hold references to thread objects
    threadWorker = []
    
    
    # Create thread instances
    # -- write code here
    for url in globalUrlList:
        threadWorker.append(MyThread(url))

    # Launch all threads
    # -- write code here
    for t in threadWorker:
        t.start()
    # Wait until all threads have completed their work
    # -- write code here
    for t in threadWorker:
        t.join()
    #remove this code -- we want this to take time > 0 to avoid div by zero
    # sleep for 2 seconds
   


# main computes the time it takes to perform calculations
if __name__ == "__main__":

    # Execute code in main thread    --------------------------
    start = time.time()
    doIOMainThread()
    end = time.time()
    timeMainThread = end - start
    print("Main Thread:  time=%.3f " % (timeMainThread,))

    # Partition work across multiple threads  ----------------
    start = time.time()
    runMultiThreads()
    end = time.time()
    timeMultiThreads = end - start
    print("Multithreads  time=%.3f " %
          (timeMultiThreads,))

    # Speedup?   ----------------------------------------------
    if (timeMultiThreads < timeMainThread):
        print("SPEEDUP: %.2f Times" %
              (timeMainThread / float(timeMultiThreads)))
    else:
        print("SLOWDOWN: %.2f percent" %
              ((abs(timeMainThread - timeMultiThreads)) / float(timeMainThread) * 100))







