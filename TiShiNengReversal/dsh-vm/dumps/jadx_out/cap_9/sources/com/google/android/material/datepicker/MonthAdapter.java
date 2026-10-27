package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class MonthAdapter extends android.widget.BaseAdapter {
    private static final int MAXIMUM_GRID_CELLS = 0;
    static final int MAXIMUM_WEEKS = 0;
    private static final int NO_DAY_NUMBER = -1;
    final com.google.android.material.datepicker.CalendarConstraints calendarConstraints;
    com.google.android.material.datepicker.CalendarStyle calendarStyle;
    final com.google.android.material.datepicker.DateSelector<?> dateSelector;

    @androidx.annotation.Nullable
    final com.google.android.material.datepicker.DayViewDecorator dayViewDecorator;
    final com.google.android.material.datepicker.Month month;
    private java.util.Collection<java.lang.Long> previouslySelectedDates;

    static {
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r1 = 4
            int r0 = r0.getMaximum(r1)
            com.google.android.material.datepicker.MonthAdapter.MAXIMUM_WEEKS = r0
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r1 = 5
            int r0 = r0.getMaximum(r1)
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r2 = 7
            int r1 = r1.getMaximum(r2)
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            com.google.android.material.datepicker.MonthAdapter.MAXIMUM_GRID_CELLS = r0
            return
    }

    MonthAdapter(com.google.android.material.datepicker.Month r1, com.google.android.material.datepicker.DateSelector<?> r2, com.google.android.material.datepicker.CalendarConstraints r3, @androidx.annotation.Nullable com.google.android.material.datepicker.DayViewDecorator r4) {
            r0 = this;
            r0.<init>()
            r0.month = r1
            r0.dateSelector = r2
            r0.calendarConstraints = r3
            r0.dayViewDecorator = r4
            java.util.Collection r1 = r2.getSelectedDays()
            r0.previouslySelectedDates = r1
            return
    }

    private java.lang.String getDayContentDescription(android.content.Context r7, long r8) {
            r6 = this;
            boolean r3 = r6.isToday(r8)
            boolean r4 = r6.isStartOfRange(r8)
            boolean r5 = r6.isEndOfRange(r8)
            r0 = r7
            r1 = r8
            java.lang.String r7 = com.google.android.material.datepicker.DateStrings.getDayContentDescription(r0, r1, r3, r4, r5)
            return r7
    }

    private void initializeStyles(android.content.Context r2) {
            r1 = this;
            com.google.android.material.datepicker.CalendarStyle r0 = r1.calendarStyle
            if (r0 != 0) goto Lb
            com.google.android.material.datepicker.CalendarStyle r0 = new com.google.android.material.datepicker.CalendarStyle
            r0.<init>(r2)
            r1.calendarStyle = r0
        Lb:
            return
    }

    private boolean isSelected(long r7) {
            r6 = this;
            com.google.android.material.datepicker.DateSelector<?> r0 = r6.dateSelector
            java.util.Collection r0 = r0.getSelectedDays()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r3 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r7)
            long r1 = com.google.android.material.datepicker.UtcDates.canonicalYearMonthDay(r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 != 0) goto La
            r7 = 1
            return r7
        L28:
            r7 = 0
            return r7
    }

    private boolean isToday(long r4) {
            r3 = this;
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            long r0 = r0.getTimeInMillis()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto Le
            r4 = 1
            return r4
        Le:
            r4 = 0
            return r4
    }

    private void updateSelectedState(@androidx.annotation.Nullable android.widget.TextView r9, long r10, int r12) {
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            android.content.Context r1 = r9.getContext()
            java.lang.String r7 = r8.getDayContentDescription(r1, r10)
            r9.setContentDescription(r7)
            com.google.android.material.datepicker.CalendarConstraints r0 = r8.calendarConstraints
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r0 = r0.getDateValidator()
            boolean r5 = r0.isValid(r10)
            if (r5 == 0) goto L3d
            r0 = 1
            r9.setEnabled(r0)
            boolean r0 = r8.isSelected(r10)
            r9.setSelected(r0)
            if (r0 == 0) goto L2d
            com.google.android.material.datepicker.CalendarStyle r10 = r8.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r10 = r10.selectedDay
        L2b:
            r6 = r0
            goto L46
        L2d:
            boolean r10 = r8.isToday(r10)
            if (r10 == 0) goto L38
            com.google.android.material.datepicker.CalendarStyle r10 = r8.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r10 = r10.todayDay
            goto L2b
        L38:
            com.google.android.material.datepicker.CalendarStyle r10 = r8.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r10 = r10.day
            goto L2b
        L3d:
            r0 = 0
            r9.setEnabled(r0)
            com.google.android.material.datepicker.CalendarStyle r10 = r8.calendarStyle
            com.google.android.material.datepicker.CalendarItemStyle r10 = r10.invalidDay
            r6 = 0
        L46:
            com.google.android.material.datepicker.DayViewDecorator r0 = r8.dayViewDecorator
            if (r0 == 0) goto L86
            r11 = -1
            if (r12 == r11) goto L86
            com.google.android.material.datepicker.Month r11 = r8.month
            int r2 = r11.year
            int r3 = r11.month
            r4 = r12
            android.content.res.ColorStateList r11 = r0.getBackgroundColor(r1, r2, r3, r4, r5, r6)
            com.google.android.material.datepicker.DayViewDecorator r0 = r8.dayViewDecorator
            android.content.res.ColorStateList r12 = r0.getTextColor(r1, r2, r3, r4, r5, r6)
            r10.styleItem(r9, r11, r12)
            com.google.android.material.datepicker.DayViewDecorator r0 = r8.dayViewDecorator
            android.graphics.drawable.Drawable r10 = r0.getCompoundDrawableLeft(r1, r2, r3, r4, r5, r6)
            com.google.android.material.datepicker.DayViewDecorator r0 = r8.dayViewDecorator
            android.graphics.drawable.Drawable r11 = r0.getCompoundDrawableTop(r1, r2, r3, r4, r5, r6)
            com.google.android.material.datepicker.DayViewDecorator r0 = r8.dayViewDecorator
            android.graphics.drawable.Drawable r12 = r0.getCompoundDrawableRight(r1, r2, r3, r4, r5, r6)
            com.google.android.material.datepicker.DayViewDecorator r0 = r8.dayViewDecorator
            android.graphics.drawable.Drawable r0 = r0.getCompoundDrawableBottom(r1, r2, r3, r4, r5, r6)
            r9.setCompoundDrawables(r10, r11, r12, r0)
            com.google.android.material.datepicker.DayViewDecorator r0 = r8.dayViewDecorator
            java.lang.CharSequence r10 = r0.getContentDescription(r1, r2, r3, r4, r5, r6, r7)
            r9.setContentDescription(r10)
            return
        L86:
            r10.styleItem(r9)
            return
    }

    private void updateSelectedStateForDate(com.google.android.material.datepicker.MaterialCalendarGridView r4, long r5) {
            r3 = this;
            com.google.android.material.datepicker.Month r0 = com.google.android.material.datepicker.Month.create(r5)
            com.google.android.material.datepicker.Month r1 = r3.month
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            com.google.android.material.datepicker.Month r0 = r3.month
            int r0 = r0.getDayOfMonth(r5)
            com.google.android.material.datepicker.MonthAdapter r1 = r4.getAdapter()
            int r1 = r1.dayToPosition(r0)
            int r2 = r4.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r4 = r4.getChildAt(r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.updateSelectedState(r4, r5, r0)
        L28:
            return
    }

    int dayToPosition(int r2) {
            r1 = this;
            int r2 = r2 + (-1)
            int r0 = r1.firstPositionInMonth()
            int r0 = r0 + r2
            return r0
    }

    int firstPositionInMonth() {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            com.google.android.material.datepicker.CalendarConstraints r1 = r2.calendarConstraints
            int r1 = r1.getFirstDayOfWeek()
            int r0 = r0.daysFromStartOfWeekToFirstOfMonth(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            int r0 = com.google.android.material.datepicker.MonthAdapter.MAXIMUM_GRID_CELLS
            return r0
    }

    @Override // android.widget.Adapter
    @androidx.annotation.Nullable
    public java.lang.Long getItem(int r3) {
            r2 = this;
            int r0 = r2.firstPositionInMonth()
            if (r3 < r0) goto L1c
            int r0 = r2.lastPositionInMonth()
            if (r3 <= r0) goto Ld
            goto L1c
        Ld:
            com.google.android.material.datepicker.Month r0 = r2.month
            int r3 = r2.positionToDay(r3)
            long r0 = r0.getDay(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // android.widget.Adapter
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            com.google.android.material.datepicker.Month r0 = r2.month
            int r0 = r0.daysInWeek
            int r3 = r3 / r0
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.view.View getView(int r1, @androidx.annotation.Nullable android.view.View r2, @androidx.annotation.NonNull android.view.ViewGroup r3) {
            r0 = this;
            android.widget.TextView r1 = r0.getView(r1, r2, r3)
            return r1
    }

    @Override // android.widget.Adapter
    @androidx.annotation.NonNull
    public android.widget.TextView getView(int r6, @androidx.annotation.Nullable android.view.View r7, @androidx.annotation.NonNull android.view.ViewGroup r8) {
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.initializeStyles(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.firstPositionInMonth()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.Month r8 = r5.month
            int r2 = r8.daysInMonth
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.updateSelectedState(r0, r1, r7)
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }

    @androidx.annotation.VisibleForTesting
    boolean isEndOfRange(long r5) {
            r4 = this;
            com.google.android.material.datepicker.DateSelector<?> r0 = r4.dateSelector
            java.util.Collection r0 = r0.getSelectedRanges()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            java.lang.Object r1 = r1.second
            if (r1 == 0) goto La
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto La
            r5 = 1
            return r5
        L26:
            r5 = 0
            return r5
    }

    boolean isFirstInRow(int r2) {
            r1 = this;
            com.google.android.material.datepicker.Month r0 = r1.month
            int r0 = r0.daysInWeek
            int r2 = r2 % r0
            if (r2 != 0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    boolean isLastInRow(int r3) {
            r2 = this;
            r0 = 1
            int r3 = r3 + r0
            com.google.android.material.datepicker.Month r1 = r2.month
            int r1 = r1.daysInWeek
            int r3 = r3 % r1
            if (r3 != 0) goto La
            return r0
        La:
            r3 = 0
            return r3
    }

    @androidx.annotation.VisibleForTesting
    boolean isStartOfRange(long r5) {
            r4 = this;
            com.google.android.material.datepicker.DateSelector<?> r0 = r4.dateSelector
            java.util.Collection r0 = r0.getSelectedRanges()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            androidx.core.util.Pair r1 = (androidx.core.util.Pair) r1
            java.lang.Object r1 = r1.first
            if (r1 == 0) goto La
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto La
            r5 = 1
            return r5
        L26:
            r5 = 0
            return r5
    }

    int lastPositionInMonth() {
            r2 = this;
            int r0 = r2.firstPositionInMonth()
            com.google.android.material.datepicker.Month r1 = r2.month
            int r1 = r1.daysInMonth
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            return r0
    }

    int positionToDay(int r2) {
            r1 = this;
            int r0 = r1.firstPositionInMonth()
            int r2 = r2 - r0
            int r2 = r2 + 1
            return r2
    }

    public void updateSelectedStates(com.google.android.material.datepicker.MaterialCalendarGridView r4) {
            r3 = this;
            java.util.Collection<java.lang.Long> r0 = r3.previouslySelectedDates
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.updateSelectedStateForDate(r4, r1)
            goto L6
        L1a:
            com.google.android.material.datepicker.DateSelector<?> r0 = r3.dateSelector
            if (r0 == 0) goto L42
            java.util.Collection r0 = r0.getSelectedDays()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3.updateSelectedStateForDate(r4, r1)
            goto L26
        L3a:
            com.google.android.material.datepicker.DateSelector<?> r4 = r3.dateSelector
            java.util.Collection r4 = r4.getSelectedDays()
            r3.previouslySelectedDates = r4
        L42:
            return
    }

    boolean withinMonth(int r2) {
            r1 = this;
            int r0 = r1.firstPositionInMonth()
            if (r2 < r0) goto Le
            int r0 = r1.lastPositionInMonth()
            if (r2 > r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }
}
