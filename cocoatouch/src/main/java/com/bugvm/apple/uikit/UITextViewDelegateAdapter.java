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

import com.bugvm.apple.foundation.NSRange;
import com.bugvm.apple.foundation.NSURL;
import com.bugvm.objc.annotation.NotImplemented;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/UIScrollViewDelegateAdapter/*</extends>*/ 
    /*<implements>*/implements UITextViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("textViewShouldBeginEditing:")
    public boolean shouldBeginEditing(UITextView textView) { return false; }
    @NotImplemented("textViewShouldEndEditing:")
    public boolean shouldEndEditing(UITextView textView) { return false; }
    @NotImplemented("textViewDidBeginEditing:")
    public void didBeginEditing(UITextView textView) {}
    @NotImplemented("textViewDidEndEditing:")
    public void didEndEditing(UITextView textView) {}
    @NotImplemented("textView:shouldChangeTextInRange:replacementText:")
    public boolean shouldChangeCharacters(UITextView textView, @ByVal NSRange range, String text) { return false; }
    @NotImplemented("textViewDidChange:")
    public void didChange(UITextView textView) {}
    @NotImplemented("textViewDidChangeSelection:")
    public void didChangeSelection(UITextView textView) {}
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("textView:shouldInteractWithURL:inRange:")
    public boolean shouldInteractWithURL(UITextView textView, NSURL URL, @ByVal NSRange characterRange) { return false; }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("textView:shouldInteractWithTextAttachment:inRange:")
    public boolean shouldInteractWithTextAttachment(UITextView textView, NSTextAttachment textAttachment, @ByVal NSRange characterRange) { return false; }
    /*</methods>*/
}