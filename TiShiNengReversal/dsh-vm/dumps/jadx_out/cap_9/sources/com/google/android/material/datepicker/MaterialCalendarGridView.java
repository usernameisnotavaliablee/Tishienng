package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    private final java.util.Calendar dayCompute;
    private final boolean nestedScrollable;


    public MaterialCalendarGridView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCalendarGridView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r0.dayCompute = r1
            android.content.Context r1 = r0.getContext()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isFullscreen(r1)
            if (r1 == 0) goto L1d
            int r1 = com.google.android.material.R.id.cancel_button
            r0.setNextFocusLeftId(r1)
            int r1 = com.google.android.material.R.id.confirm_button
            r0.setNextFocusRightId(r1)
        L1d:
            android.content.Context r1 = r0.getContext()
            boolean r1 = com.google.android.material.datepicker.MaterialDatePicker.isNestedScrollable(r1)
            r0.nestedScrollable = r1
            com.google.android.material.datepicker.MaterialCalendarGridView$1 r1 = new com.google.android.material.datepicker.MaterialCalendarGridView$1
            r1.<init>(r0)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r1)
            return
    }

    private void gainFocus(int r2, android.graphics.Rect r3) {
            r1 = this;
            r0 = 33
            if (r2 != r0) goto L10
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.lastPositionInMonth()
            r1.setSelection(r2)
            return
        L10:
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L20
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            r1.setSelection(r2)
            return
        L20:
            r0 = 1
            super.onFocusChanged(r0, r2, r3)
            return
    }

    private android.view.View getChildAtPosition(int r2) {
            r1 = this;
            int r0 = r1.getFirstVisiblePosition()
            int r2 = r2 - r0
            android.view.View r2 = r1.getChildAt(r2)
            return r2
    }

    private static int horizontalMidPoint(@androidx.annotation.NonNull android.view.View r1) {
            int r0 = r1.getLeft()
            int r1 = r1.getWidth()
            int r1 = r1 / 2
            int r0 = r0 + r1
            return r0
    }

    private static boolean skipMonth(@androidx.annotation.Nullable java.lang.Long r4, @androidx.annotation.Nullable java.lang.Long r5, @androidx.annotation.Nullable java.lang.Long r6, @androidx.annotation.Nullable java.lang.Long r7) {
            r0 = 1
            if (r4 == 0) goto L25
            if (r5 == 0) goto L25
            if (r6 == 0) goto L25
            if (r7 != 0) goto La
            goto L25
        La:
            long r1 = r6.longValue()
            long r5 = r5.longValue()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L25
            long r5 = r7.longValue()
            long r1 = r4.longValue()
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L23
            goto L25
        L23:
            r4 = 0
            return r4
        L25:
            return r0
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.widget.GridView, android.widget.AdapterView
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ android.widget.ListAdapter getAdapter() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @androidx.annotation.NonNull
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ android.widget.ListAdapter getAdapter2() {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @androidx.annotation.NonNull
    public android.widget.ListAdapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.MonthAdapter r0 = (com.google.android.material.datepicker.MonthAdapter) r0
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    protected final void onDraw(@androidx.annotation.NonNull android.graphics.Canvas r28) {
            r27 = this;
            r0 = r27
            super.onDraw(r28)
            com.google.android.material.datepicker.MonthAdapter r1 = r0.getAdapter()
            com.google.android.material.datepicker.DateSelector<?> r2 = r1.dateSelector
            com.google.android.material.datepicker.CalendarStyle r3 = r1.calendarStyle
            int r4 = r1.firstPositionInMonth()
            int r5 = r0.getFirstVisiblePosition()
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = r1.lastPositionInMonth()
            int r6 = r0.getLastVisiblePosition()
            int r5 = java.lang.Math.min(r5, r6)
            java.lang.Long r6 = r1.getItem(r4)
            java.lang.Long r7 = r1.getItem(r5)
            java.util.Collection r2 = r2.getSelectedRanges()
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L16d
            java.lang.Object r8 = r2.next()
            androidx.core.util.Pair r8 = (androidx.core.util.Pair) r8
            java.lang.Object r9 = r8.first
            if (r9 == 0) goto L169
            java.lang.Object r10 = r8.second
            if (r10 != 0) goto L4a
            goto L35
        L4a:
            java.lang.Long r9 = (java.lang.Long) r9
            long r10 = r9.longValue()
            java.lang.Object r8 = r8.second
            java.lang.Long r8 = (java.lang.Long) r8
            long r12 = r8.longValue()
            boolean r8 = skipMonth(r6, r7, r9, r8)
            if (r8 == 0) goto L5f
            goto L35
        L5f:
            boolean r8 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r0)
            long r14 = r6.longValue()
            r9 = 5
            r16 = 0
            int r17 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r17 >= 0) goto L90
            boolean r10 = r1.isFirstInRow(r4)
            if (r10 == 0) goto L76
            r10 = 0
            goto L8d
        L76:
            if (r8 != 0) goto L83
            int r10 = r4 + (-1)
            android.view.View r10 = r0.getChildAtPosition(r10)
            int r10 = r10.getRight()
            goto L8d
        L83:
            int r10 = r4 + (-1)
            android.view.View r10 = r0.getChildAtPosition(r10)
            int r10 = r10.getLeft()
        L8d:
            r11 = r10
            r10 = r4
            goto La7
        L90:
            java.util.Calendar r14 = r0.dayCompute
            r14.setTimeInMillis(r10)
            java.util.Calendar r10 = r0.dayCompute
            int r10 = r10.get(r9)
            int r10 = r1.dayToPosition(r10)
            android.view.View r11 = r0.getChildAtPosition(r10)
            int r11 = horizontalMidPoint(r11)
        La7:
            long r14 = r7.longValue()
            int r17 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r17 <= 0) goto Ld0
            boolean r9 = r1.isLastInRow(r5)
            if (r9 == 0) goto Lba
            int r9 = r0.getWidth()
            goto Lcd
        Lba:
            if (r8 != 0) goto Lc5
            android.view.View r9 = r0.getChildAtPosition(r5)
            int r9 = r9.getRight()
            goto Lcd
        Lc5:
            android.view.View r9 = r0.getChildAtPosition(r5)
            int r9 = r9.getLeft()
        Lcd:
            r12 = r9
            r9 = r5
            goto Le7
        Ld0:
            java.util.Calendar r14 = r0.dayCompute
            r14.setTimeInMillis(r12)
            java.util.Calendar r12 = r0.dayCompute
            int r9 = r12.get(r9)
            int r9 = r1.dayToPosition(r9)
            android.view.View r12 = r0.getChildAtPosition(r9)
            int r12 = horizontalMidPoint(r12)
        Le7:
            long r13 = r1.getItemId(r10)
            int r14 = (int) r13
            r13 = r4
            r15 = r5
            long r4 = r1.getItemId(r9)
            int r5 = (int) r4
        Lf3:
            if (r14 > r5) goto L163
            int r4 = r0.getNumColumns()
            int r4 = r4 * r14
            int r17 = r0.getNumColumns()
            int r17 = r4 + r17
            r18 = r1
            int r1 = r17 + (-1)
            android.view.View r17 = r0.getChildAtPosition(r4)
            int r19 = r17.getTop()
            com.google.android.material.datepicker.CalendarItemStyle r0 = r3.day
            int r0 = r0.getTopInset()
            int r0 = r19 + r0
            int r17 = r17.getBottom()
            r19 = r2
            com.google.android.material.datepicker.CalendarItemStyle r2 = r3.day
            int r2 = r2.getBottomInset()
            int r2 = r17 - r2
            if (r8 != 0) goto L133
            if (r4 <= r10) goto L129
            r4 = 0
            goto L12a
        L129:
            r4 = r11
        L12a:
            if (r9 <= r1) goto L131
            int r1 = r27.getWidth()
            goto L145
        L131:
            r1 = r12
            goto L145
        L133:
            if (r9 <= r1) goto L137
            r1 = 0
            goto L138
        L137:
            r1 = r12
        L138:
            if (r4 <= r10) goto L13f
            int r4 = r27.getWidth()
            goto L140
        L13f:
            r4 = r11
        L140:
            r26 = r4
            r4 = r1
            r1 = r26
        L145:
            float r4 = (float) r4
            float r0 = (float) r0
            float r1 = (float) r1
            float r2 = (float) r2
            r22 = r0
            android.graphics.Paint r0 = r3.rangeFill
            r20 = r28
            r25 = r0
            r23 = r1
            r24 = r2
            r21 = r4
            r20.drawRect(r21, r22, r23, r24, r25)
            int r14 = r14 + 1
            r0 = r27
            r1 = r18
            r2 = r19
            goto Lf3
        L163:
            r0 = r27
            r4 = r13
            r5 = r15
            goto L35
        L169:
            r0 = r27
            goto L35
        L16d:
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.gainFocus(r2, r3)
            return
        L6:
            r1 = 0
            super.onFocusChanged(r1, r2, r3)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            boolean r5 = super.onKeyDown(r4, r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r5 = r3.getSelectedItemPosition()
            r1 = -1
            r2 = 1
            if (r5 == r1) goto L30
            int r5 = r3.getSelectedItemPosition()
            com.google.android.material.datepicker.MonthAdapter r1 = r3.getAdapter()
            int r1 = r1.firstPositionInMonth()
            if (r5 < r1) goto L1f
            goto L30
        L1f:
            r5 = 19
            if (r5 != r4) goto L2f
            com.google.android.material.datepicker.MonthAdapter r4 = r3.getAdapter()
            int r4 = r4.firstPositionInMonth()
            r3.setSelection(r4)
            return r2
        L2f:
            return r0
        L30:
            return r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.nestedScrollable
            if (r0 == 0) goto L1b
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r1.getMeasuredHeight()
            r2.height = r3
            return
        L1b:
            super.onMeasure(r2, r3)
            return
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.ListAdapter r1) {
            r0 = this;
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            r0.setAdapter2(r1)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    /* renamed from: setAdapter, reason: avoid collision after fix types in other method */
    public final void setAdapter2(android.widget.ListAdapter r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.material.datepicker.MonthAdapter
            if (r0 == 0) goto L8
            super.setAdapter(r5)
            return
        L8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r0 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Class<com.google.android.material.datepicker.MonthAdapter> r1 = com.google.android.material.datepicker.MonthAdapter.class
            java.lang.String r1 = r1.getCanonicalName()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "%1$s must have its Adapter set to a %2$s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r5.<init>(r0)
            throw r5
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MonthAdapter r0 = r1.getAdapter()
            int r0 = r0.firstPositionInMonth()
            if (r2 >= r0) goto L16
            com.google.android.material.datepicker.MonthAdapter r2 = r1.getAdapter()
            int r2 = r2.firstPositionInMonth()
            super.setSelection(r2)
            return
        L16:
            super.setSelection(r2)
            return
    }
}
