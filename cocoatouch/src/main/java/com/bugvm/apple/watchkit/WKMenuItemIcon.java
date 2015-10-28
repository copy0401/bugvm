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
package com.bugvm.apple.watchkit;

/*<imports>*/
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/WKMenuItemIcon/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Accept(0L),
    Add(1L),
    Block(2L),
    Decline(3L),
    Info(4L),
    Maybe(5L),
    More(6L),
    Mute(7L),
    Pause(8L),
    Play(9L),
    Repeat(10L),
    Resume(11L),
    Share(12L),
    Shuffle(13L),
    Speaker(14L),
    Trash(15L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/WKMenuItemIcon/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/WKMenuItemIcon/*</name>*/ valueOf(long n) {
        for (/*<name>*/WKMenuItemIcon/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/WKMenuItemIcon/*</name>*/.class.getName());
    }
}