//
//  Game.hpp
//  GameForPL
//
//  Created by Michael Watts on 3/23/18.
//  Copyright © 2018 Michael Watts. All rights reserved.
//

#ifndef Game_hpp
#define Game_hpp

#include <stdio.h>
#include "Sprite.h"
#include "IGame.h"
class Game: public IGame {
    public :
    void init();
    void tick();
    void play(int);
    void showState();
    void move(Sprite);
    Sprite s[10];
    
};
#endif /* Game_hpp */
