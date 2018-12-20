//
//  Game.cpp
//  GameForPL
//
//  Created by Michael Watts on 3/23/18.
//  Copyright © 2018 Michael Watts. All rights reserved.
//

#include "Game.hpp"
#include <iostream>
using namespace std;
void Game::init(){ //creates 10 sprites then plays instance of game
     s[0]  = Sprite(1,1,1,0);
    s[1]= Sprite(2,2,2, 45);
    s[2] = Sprite( 3,3,3,90 );
    s[3] = Sprite( 4 ,4,4,135 );
    s[4]= Sprite(5,5,5,180);
    s[5]= Sprite(6,6,6,225);
    s[6]= Sprite(7,7,7,270);
    s[7]= Sprite(8 ,8,8,315);
    s[8]= Sprite(9,1,0,180);
    s[9]= Sprite(10,0,1,270 );
    play(1);
    
}
void Game::play(int cycles){
    for(int i = 0; i < cycles; i++){ //cycles through each sprite ticking them then shows state of the game after tick
        tick();
        showState();
    }
}
void Game::tick(){
    for(int i = 0; i < 10; i++){ //cycles through each sprite
        if(s[i].x != 0 && s[i].y != 0){ //ensures will not move negative
            move(s[i]);
        } else {
            if(s[i].x == 0 && s[i].dir < 225){ //ensures will not move negative
                move(s[i]);
            }
            if(s[i].y == 0 && s[i].dir != 135 && s[i].dir != 180 && s[i].dir != 225){ //ensures will not move negative
                move(s[i]);
            }
        }
    }
}
void Game::showState(){ //displays sprite properties
    cout << "id\t x\t y\t d\t s\t w" << endl;
    for(int i = 0; i < 10; i ++){
        cout << (i+1) << "\t" << s[i].ID << "\t" << s[i].x << "\t" << s[i].y << "\t" << s[i].dir << "\t" << s[i].speed << "\t" << s[i].weight << endl;
    }
}
void Game::move(Sprite s){ //moves sprite according to dir property
    switch(s.dir){
        case 0:
            s.y +=1;
            break;
        case 45:
            s.y +=1;
            s.x+=1;
            break;
        case 90:
            s.x +=1;
            break;
        case 135:
            s.x+=1;
            s.y -=1;
            break;
        case 180:
            s.y-=1;
            break;
        case 225:
            s.x--;
            s.y++;
            break;
        case 270:
            s.x--;
            break;
        case 315:
            s.x--;
            s.y++;
            
    }
}
