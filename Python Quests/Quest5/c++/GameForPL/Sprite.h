//
//  Sprite.h
//  GameForPL
//
//  Created by Michael Watts on 3/23/18.
//  Copyright © 2018 Michael Watts. All rights reserved.
//
#include "point.hpp"
#ifndef Sprite_h
#define Sprite_h
class Sprite : public point {
public:
    int ID;
    int dir;
    int speed = 1;
    int weight = 10;
    Sprite(int, int, int, int); 
    Sprite();
};

#endif /* Sprite_h */
