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
package com.bugvm.bindings.AudioToolbox;

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
import com.bugvm.apple.audiounit.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremidi.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAFPacketTableHeader/*</name>*/ 
    extends /*<extends>*/Struct<CAFPacketTableHeader>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAFPacketTableHeaderPtr extends Ptr<CAFPacketTableHeader, CAFPacketTableHeaderPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAFPacketTableHeader() {}
    public CAFPacketTableHeader(long numberValidFrames, int primingFrames, int remainderFrames) {
        this.setNumberValidFrames(numberValidFrames);
        this.setPrimingFrames(primingFrames);
        this.setRemainderFrames(remainderFrames);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    public byte[] getPacketDescriptions() {
        return getPacketDescriptions0().toByteArray((int)getNumberPackets());
    }
    public CAFPacketTableHeader setPacketDescriptions(byte[] packetDescriptions) {
        BytePtr ptr = new BytePtr();
        ptr.set(packetDescriptions);
        setPacketDescriptions0(ptr);
        return this;
    }
    /*<members>*/
    @StructMember(0) protected native long getNumberPackets();
    @StructMember(0) protected native CAFPacketTableHeader setNumberPackets(long numberPackets);
    @StructMember(1) public native long getNumberValidFrames();
    @StructMember(1) public native CAFPacketTableHeader setNumberValidFrames(long numberValidFrames);
    @StructMember(2) public native int getPrimingFrames();
    @StructMember(2) public native CAFPacketTableHeader setPrimingFrames(int primingFrames);
    @StructMember(3) public native int getRemainderFrames();
    @StructMember(3) public native CAFPacketTableHeader setRemainderFrames(int remainderFrames);
    @StructMember(4) protected native BytePtr getPacketDescriptions0();
    @StructMember(4) protected native CAFPacketTableHeader setPacketDescriptions0(BytePtr packetDescriptions0);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
