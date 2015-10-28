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
package com.bugvm.apple.uikit;

/*<imports>*/

import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 3.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISwipeGestureRecognizer/*</name>*/ 
    extends /*<extends>*/UIGestureRecognizer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UISwipeGestureRecognizerPtr extends Ptr<UISwipeGestureRecognizer, UISwipeGestureRecognizerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISwipeGestureRecognizer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISwipeGestureRecognizer() {}
    protected UISwipeGestureRecognizer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    
    public UISwipeGestureRecognizer(OnGestureListener listener) {
        super(listener);
    }
    
    /*<properties>*/
    @Property(selector = "numberOfTouchesRequired")
    public native @MachineSizedUInt long getNumberOfTouchesRequired();
    @Property(selector = "setNumberOfTouchesRequired:")
    public native void setNumberOfTouchesRequired(@MachineSizedUInt long v);
    @Property(selector = "direction")
    public native UISwipeGestureRecognizerDirection getDirection();
    @Property(selector = "setDirection:")
    public native void setDirection(UISwipeGestureRecognizerDirection v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}