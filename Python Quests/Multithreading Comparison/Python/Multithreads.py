from threading import Thread, Lock
import timeit

class countTest():
    

    def __init__(self):
        count = counter()
        
        t1 = MyThread(count)
        t2 = MyThread(count)
        t3 = MyThread(count)
        t4 = MyThread(count)
        t5 = MyThread(count)
        t6 = MyThread(count)
        t7 = MyThread(count)
        t8 = MyThread(count)
        t9 = MyThread(count)
        t10 = MyThread(count)

        t1.start()
        t2.start()
        t3.start()
        t4.start()
        t5.start()
        t6.start()
        t7.start()
        t8.start()
        t9.start()
        t10.start()

        t1.join()
        t2.join()
        t3.join()
        t4.join()
        t5.join()
        t6.join()
        t7.join()
        t8.join()
        t9.join()
        t10.join()

        
        print(count.getValue())
        

        

class counter():
    def __init__(self):
        self.c = 0
    def inc(self):
        
        lock.acquire()
        self.c +=1
        lock.release()
        
    def getValue(self):
        return(self.c)

class MyThread(Thread):

    def __init__(self, c):
        Thread.__init__(self)
        self.count = c
        
    def run(self):
        
        for i in range (0, 1000000):
            self.count.inc()
        
        

x = counter()

#for i in range (0, 10000000):
#            x.inc()
#
#print ("1 thread")
#print(x.getValue())

lock = Lock()
print("Multiple Threads")
temp = countTest()
