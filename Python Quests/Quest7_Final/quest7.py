#!/usr/bin/env python3
import json
__INIT_FILE__ = 'gameinit.json'
__GAME_STATE_FILE__ = 'gamesprite.json'

def init():
    fileToRead = open(__INIT_FILE__,"r")
    data = fileToRead.read()
    fileToRead.close()
    fileToWrite = open(__GAME_STATE_FILE__, "w+")
    fileToWrite.write(data)
    fileToWrite.close()
def getStateAsJson():
    fileToRead = open(__GAME_STATE_FILE__,"r")
    data = fileToRead.read()
    fileToRead.close()
    data = json.loads(data)
    return data
def saveStateAsJson(SpriteData):
    SpriteData = json.dumps(SpriteData)
    fileToWrite = open(__GAME_STATE_FILE__, "w+")
    fileToWrite.write(SpriteData)
    fileToWrite.close()
def tick():
    data = getStateAsJson()
    data = list(data)
    for j in range(data.__len__()):
        i = data[j]
        if (i['dir'] == 0):
            i['y'] += 1
        if (i['dir'] == 45):
            i['y'] += 1
            i['x'] += 1
        if (i['dir'] == 90):
            i['x']+=1
        if (i['dir'] == 135):
            if(i['y'] != 0):
                i['x']+=1
                i['y']-=1
        if (i['dir'] == 180):
            if(i['y'] != 0):
                i['y']-=1
        if (i['dir'] == 225):
            if (i['x'] != 0):
                if (i['y'] != 0):
                    i['x']-=1
                    i['y']-=1
        if (i['dir'] == 270):
            if (i['x'] != 0):
                i['x'] -= 1
        if (i['dir'] == 315):
            if (i['x'] != 0):
                i['x'] -= 1
                i['y'] += 1
    saveStateAsJson(data)
