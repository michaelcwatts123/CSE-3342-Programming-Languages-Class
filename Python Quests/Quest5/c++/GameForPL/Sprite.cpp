//
//  Sprite.cpp
//  GameForPL
//
//  Created by Michael Watts on 3/23/18.
//  Copyright © 2018 Michael Watts. All rights reserved.
//
#include "Sprite.h"
#include <stdio.h>
Sprite::Sprite(int IdforSprite, int xpos, int ypos, int dirForSprite){ //sets public values of sprite
    ID = IdforSprite;
    x = xpos;
    y = ypos;
    dir = dirForSprite;
    
}
Sprite::Sprite(){ //default constructor
    
}
