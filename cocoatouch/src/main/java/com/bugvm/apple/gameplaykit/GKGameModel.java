/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.apple.gameplaykit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GKGameModel/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "players")
    @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<GKGameModelPlayer> getPlayers();
    @Property(selector = "activePlayer")
    GKGameModelPlayer getActivePlayer();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "setGameModel:")
    void setGameModel(GKGameModel gameModel);
    @Method(selector = "gameModelUpdatesForPlayer:")
    @com.bugvm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<GKGameModelUpdate> getGameModelUpdatesForPlayer(GKGameModelPlayer player);
    @Method(selector = "applyGameModelUpdate:")
    void applyGameModelUpdate(GKGameModelUpdate gameModelUpdate);
    @Method(selector = "scoreForPlayer:")
    @MachineSizedSInt long getScoreForPlayer(GKGameModelPlayer player);
    @Method(selector = "isWinForPlayer:")
    boolean isWinForPlayer(GKGameModelPlayer player);
    @Method(selector = "isLossForPlayer:")
    boolean isLossForPlayer(GKGameModelPlayer player);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
