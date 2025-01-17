/*
 * Copyright (c) 2021, 2021, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * The Universal Permissive License (UPL), Version 1.0
 *
 * Subject to the condition set forth below, permission is hereby granted to any
 * person obtaining a copy of this software, associated documentation and/or
 * data (collectively the "Software"), free of charge and under any and all
 * copyright rights in the Software, and any and all patent rights owned or
 * freely licensable by each licensor hereunder covering either (i) the
 * unmodified Software as contributed to or provided by such licensor, or (ii)
 * the Larger Works (as defined below), to deal in both
 *
 * (a) the Software, and
 *
 * (b) any piece of software and/or hardware listed in the lrgrwrks.txt file if
 * one is included with the Software each a "Larger Work" to which the Software
 * is contributed by such licensors),
 *
 * without restriction, including without limitation the rights to copy, create
 * derivative works of, display, perform, and distribute the Software and make,
 * use, sell, offer for sale, import, export, have made, and have sold the
 * Software and the Larger Work(s), and to sublicense the foregoing rights on
 * either these or other terms.
 *
 * This license is subject to the following condition:
 *
 * The above copyright notice and either this complete permission notice or at a
 * minimum a reference to the UPL must be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oracle.truffle.js.runtime.builtins.temporal;

import com.oracle.truffle.api.object.DynamicObject;
import com.oracle.truffle.api.object.Shape;
import com.oracle.truffle.js.runtime.objects.JSNonProxyObject;

public class JSTemporalPlainDateTimeObject extends JSNonProxyObject implements TemporalMonth, TemporalYear, TemporalDay, TemporalCalendar {

    // from time
    private final long hours;
    private final long minutes;
    private final long seconds;
    private final long milliseconds;
    private final long microseconds;
    private final long nanoseconds;
    // from date
    private final int year;
    private final int month;
    private final int day;
    private final DynamicObject calendar;

    protected JSTemporalPlainDateTimeObject(Shape shape, long year, long month, long day, long hours, long minutes, long seconds, long milliseconds,
                    long microseconds, long nanoseconds, DynamicObject calendar) {
        super(shape);
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.milliseconds = milliseconds;
        this.microseconds = microseconds;
        this.nanoseconds = nanoseconds;

        this.year = (int) year;
        this.month = (int) month;
        this.day = (int) day;
        this.calendar = calendar;
    }

    public long getHour() {
        return hours;
    }

    public long getMinute() {
        return minutes;
    }

    public long getSecond() {
        return seconds;
    }

    public long getMillisecond() {
        return milliseconds;
    }

    public long getMicrosecond() {
        return microseconds;
    }

    public long getNanosecond() {
        return nanoseconds;
    }

    @Override
    public long getYear() {
        return year;
    }

    @Override
    public long getMonth() {
        return month;
    }

    @Override
    public long getDay() {
        return day;
    }

    @Override
    public DynamicObject getCalendar() {
        return calendar;
    }
}
