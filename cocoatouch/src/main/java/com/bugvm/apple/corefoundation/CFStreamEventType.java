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
package com.bugvm.apple.corefoundation;

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
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreservices.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.uikit.*;
import com.bugvm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/CFStreamEventType/*</name>*/ extends Bits</*<name>*/CFStreamEventType/*</name>*/> {
    /*<values>*/
    public static final CFStreamEventType None = new CFStreamEventType(0L);
    public static final CFStreamEventType OpenCompleted = new CFStreamEventType(1L);
    public static final CFStreamEventType HasBytesAvailable = new CFStreamEventType(2L);
    public static final CFStreamEventType CanAcceptBytes = new CFStreamEventType(4L);
    public static final CFStreamEventType ErrorOccurred = new CFStreamEventType(8L);
    public static final CFStreamEventType EndEncountered = new CFStreamEventType(16L);
    /*</values>*/

    private static final /*<name>*/CFStreamEventType/*</name>*/[] values = _values(/*<name>*/CFStreamEventType/*</name>*/.class);

    public /*<name>*/CFStreamEventType/*</name>*/(long value) { super(value); }
    private /*<name>*/CFStreamEventType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/CFStreamEventType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/CFStreamEventType/*</name>*/(value, mask);
    }
    protected /*<name>*/CFStreamEventType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/CFStreamEventType/*</name>*/[] values() {
        return values.clone();
    }
}
