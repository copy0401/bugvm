/*
 * Copyright (C) 2014 Trillian Mobile AB
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
package org.robovm.apple.uikit;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIProgressView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UIProgressViewPtr extends Ptr<UIProgressView, UIProgressViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIProgressView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIProgressView() {}
    protected UIProgressView(SkipInit skipInit) { super(skipInit); }
    public UIProgressView(UIProgressViewStyle style) { super((SkipInit) null); initObject(initWithProgressViewStyle$(style)); }
    /*</constructors>*/
    
    public UIProgressView(CGRect frame) {
        super(frame);
    }
    
    /*<properties>*/
    @Property(selector = "progressViewStyle")
    public native UIProgressViewStyle getProgressViewStyle();
    @Property(selector = "setProgressViewStyle:")
    public native void setProgressViewStyle(UIProgressViewStyle v);
    @Property(selector = "progress")
    public native float getProgress();
    @Property(selector = "setProgress:")
    public native void setProgress(float v);
    @Property(selector = "progressTintColor")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native UIColor getProgressTintColor();
    @Property(selector = "setProgressTintColor:")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native void setProgressTintColor(UIColor v);
    @Property(selector = "trackTintColor")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native UIColor getTrackTintColor();
    @Property(selector = "setTrackTintColor:")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native void setTrackTintColor(UIColor v);
    @Property(selector = "progressImage")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native UIImage getProgressImage();
    @Property(selector = "setProgressImage:")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native void setProgressImage(UIImage v);
    @Property(selector = "trackImage")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native UIImage getTrackImage();
    @Property(selector = "setTrackImage:")
    /**
     * @since Available in iOS 5.0 and later.
     */
    public native void setTrackImage(UIImage v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProgressViewStyle:")
    protected native @Pointer long initWithProgressViewStyle$(UIProgressViewStyle style);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Method(selector = "setProgress:animated:")
    public native void setProgress(float progress, boolean animated);
    /*</methods>*/
}