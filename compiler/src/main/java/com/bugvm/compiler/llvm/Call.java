/*
 * Copyright (C) 2012 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package com.bugvm.compiler.llvm;


/**
 *
 * @version $Id$
 */
public class Call extends FunctionCallInstruction {
    
    public Call(Value function, Value ... args) {
        super("call", function, args);
    }
    
    public Call(Variable result, Value function, Value ... args) {
        super("call", result, function, args);
    }

    public Call(Value function, Argument... args) {
        super("call", function, args);
    }

    public Call(Variable result, Value function, Argument... args) {
        super("call", result, function, args);
    }
}