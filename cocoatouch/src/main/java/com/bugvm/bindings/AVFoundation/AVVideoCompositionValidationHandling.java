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
package com.bugvm.bindings.AVFoundation;

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
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/AVVideoCompositionValidationHandling/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:")
    boolean shouldContinueValidatingAfterFindingInvalidValue(AVVideoComposition videoComposition, String key);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:")
    boolean shouldContinueValidatingAfterFindingEmptyTimeRange(AVVideoComposition videoComposition, @ByVal CMTimeRange timeRange);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:")
    boolean shouldContinueValidatingAfterFindingInvalidTimeRange(AVVideoComposition videoComposition, AVVideoCompositionInstruction videoCompositionInstruction);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:")
    boolean shouldContinueValidatingAfterFindingInvalidTrackID(AVVideoComposition videoComposition, AVVideoCompositionInstruction videoCompositionInstruction, AVVideoCompositionLayerInstruction layerInstruction, AVAsset asset);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
