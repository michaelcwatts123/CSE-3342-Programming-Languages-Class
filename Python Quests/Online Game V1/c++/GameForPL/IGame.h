//
//  IGame.h
//  GameForPL
//
//  Created by Michael Watts on 3/23/18.
//  Copyright © 2018 Michael Watts. All rights reserved.
//

#ifndef IGame_h
#define IGame_h
class IGame {
public:
    virtual void init() =0;
    virtual void tick()=0;
    virtual void play(int)=0;
    virtual void showState()=0;
};

#endif /* IGame_h */
