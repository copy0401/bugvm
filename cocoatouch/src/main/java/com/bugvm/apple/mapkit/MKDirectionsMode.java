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
package com.bugvm.apple.mapkit;

/*<imports>*/
import java.util.*;

import com.bugvm.apple.foundation.*;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("MapKit") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/MKDirectionsMode/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MKDirectionsMode/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/MKDirectionsMode/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MKDirectionsMode toObject(Class<MKDirectionsMode> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return MKDirectionsMode.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(MKDirectionsMode o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<MKDirectionsMode> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MKDirectionsMode> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(MKDirectionsMode.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MKDirectionsMode> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (MKDirectionsMode o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final MKDirectionsMode Driving = new MKDirectionsMode("Driving");
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final MKDirectionsMode Walking = new MKDirectionsMode("Walking");
    /**
     * @since Available in iOS 9.0 and later.
     */
    public static final MKDirectionsMode Transit = new MKDirectionsMode("Transit");
    /*</constants>*/
    
    private static /*<name>*/MKDirectionsMode/*</name>*/[] values = new /*<name>*/MKDirectionsMode/*</name>*/[] {/*<value_list>*/Driving, Walking, Transit/*</value_list>*/};
    
    /*<name>*/MKDirectionsMode/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/MKDirectionsMode/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/MKDirectionsMode/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/MKDirectionsMode/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("MapKit") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="MKLaunchOptionsDirectionsModeDriving", optional=true)
        public static native NSString Driving();
        /**
         * @since Available in iOS 6.0 and later.
         */
        @GlobalValue(symbol="MKLaunchOptionsDirectionsModeWalking", optional=true)
        public static native NSString Walking();
        /**
         * @since Available in iOS 9.0 and later.
         */
        @GlobalValue(symbol="MKLaunchOptionsDirectionsModeTransit", optional=true)
        public static native NSString Transit();
        /*</values>*/
    }
}