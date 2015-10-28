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

import com.bugvm.apple.foundation.*;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock1;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 7.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextStorage/*</name>*/ 
    extends /*<extends>*/NSMutableAttributedString/*</extends>*/
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeWillProcessEditing(NSTextStorage object, final VoidBlock1<NSTextStorage> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillProcessEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSTextStorage) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeDidProcessEditing(NSTextStorage object, final VoidBlock1<NSTextStorage> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidProcessEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSTextStorage) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class NSTextStoragePtr extends Ptr<NSTextStorage, NSTextStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextStorage() {}
    protected NSTextStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layoutManagers")
    public native NSArray<NSLayoutManager> getLayoutManagers();
    @Property(selector = "editedMask")
    public native NSTextStorageEditActions getEditedMask();
    @Property(selector = "editedRange")
    public native @ByVal NSRange getEditedRange();
    @Property(selector = "changeInLength")
    public native @MachineSizedSInt long getChangeInLength();
    @Property(selector = "delegate")
    public native NSTextStorageDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSTextStorageDelegate v);
    @Property(selector = "fixesAttributesLazily")
    public native boolean fixesAttributesLazily();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextStorageWillProcessEditingNotification", optional=true)
    public static native NSString WillProcessEditingNotification();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalValue(symbol="NSTextStorageDidProcessEditingNotification", optional=true)
    public static native NSString DidProcessEditingNotification();
    
    @Method(selector = "addLayoutManager:")
    public native void addLayoutManager(NSLayoutManager aLayoutManager);
    @Method(selector = "removeLayoutManager:")
    public native void removeLayoutManager(NSLayoutManager aLayoutManager);
    @Method(selector = "edited:range:changeInLength:")
    public native void edited(NSTextStorageEditActions editedMask, @ByVal NSRange editedRange, @MachineSizedSInt long delta);
    @Method(selector = "processEditing")
    public native void processEditing();
    @Method(selector = "invalidateAttributesInRange:")
    public native void invalidateAttributes(@ByVal NSRange range);
    @Method(selector = "ensureAttributesAreFixedInRange:")
    public native void ensureAttributesAreFixed(@ByVal NSRange range);
    /*</methods>*/
}