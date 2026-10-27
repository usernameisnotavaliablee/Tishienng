package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class CalendarStyle {

    @androidx.annotation.NonNull
    final com.google.android.material.datepicker.CalendarItemStyle day;

    @androidx.annotation.NonNull
    final com.google.android.material.datepicker.CalendarItemStyle invalidDay;

    @androidx.annotation.NonNull
    final android.graphics.Paint rangeFill;

    @androidx.annotation.NonNull
    final com.google.android.material.datepicker.CalendarItemStyle selectedDay;

    @androidx.annotation.NonNull
    final com.google.android.material.datepicker.CalendarItemStyle selectedYear;

    @androidx.annotation.NonNull
    final com.google.android.material.datepicker.CalendarItemStyle todayDay;

    @androidx.annotation.NonNull
    final com.google.android.material.datepicker.CalendarItemStyle todayYear;

    @androidx.annotation.NonNull
    final com.google.android.material.datepicker.CalendarItemStyle year;

    CalendarStyle(@androidx.annotation.NonNull android.content.Context r5) {
            r4 = this;
            r4.<init>()
            int r0 = com.google.android.material.R.attr.materialCalendarStyle
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendar> r1 = com.google.android.material.datepicker.MaterialCalendar.class
            java.lang.String r1 = r1.getCanonicalName()
            int r0 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r5, r0, r1)
            int[] r1 = com.google.android.material.R.styleable.MaterialCalendar
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r0, r1)
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_dayStyle
            r2 = 0
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.CalendarItemStyle r1 = com.google.android.material.datepicker.CalendarItemStyle.create(r5, r1)
            r4.day = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_dayInvalidStyle
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.CalendarItemStyle r1 = com.google.android.material.datepicker.CalendarItemStyle.create(r5, r1)
            r4.invalidDay = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_daySelectedStyle
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.CalendarItemStyle r1 = com.google.android.material.datepicker.CalendarItemStyle.create(r5, r1)
            r4.selectedDay = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_dayTodayStyle
            int r1 = r0.getResourceId(r1, r2)
            com.google.android.material.datepicker.CalendarItemStyle r1 = com.google.android.material.datepicker.CalendarItemStyle.create(r5, r1)
            r4.todayDay = r1
            int r1 = com.google.android.material.R.styleable.MaterialCalendar_rangeFillColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r5, r0, r1)
            int r3 = com.google.android.material.R.styleable.MaterialCalendar_yearStyle
            int r3 = r0.getResourceId(r3, r2)
            com.google.android.material.datepicker.CalendarItemStyle r3 = com.google.android.material.datepicker.CalendarItemStyle.create(r5, r3)
            r4.year = r3
            int r3 = com.google.android.material.R.styleable.MaterialCalendar_yearSelectedStyle
            int r3 = r0.getResourceId(r3, r2)
            com.google.android.material.datepicker.CalendarItemStyle r3 = com.google.android.material.datepicker.CalendarItemStyle.create(r5, r3)
            r4.selectedYear = r3
            int r3 = com.google.android.material.R.styleable.MaterialCalendar_yearTodayStyle
            int r2 = r0.getResourceId(r3, r2)
            com.google.android.material.datepicker.CalendarItemStyle r5 = com.google.android.material.datepicker.CalendarItemStyle.create(r5, r2)
            r4.todayYear = r5
            android.graphics.Paint r5 = new android.graphics.Paint
            r5.<init>()
            r4.rangeFill = r5
            int r1 = r1.getDefaultColor()
            r5.setColor(r1)
            r0.recycle()
            return
    }
}
