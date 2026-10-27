package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class DaysOfWeekAdapter extends android.widget.BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = 0;
    private static final int NARROW_FORMAT = 4;

    @androidx.annotation.NonNull
    private final java.util.Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 4
            goto L9
        L8:
            r0 = 1
        L9:
            com.google.android.material.datepicker.DaysOfWeekAdapter.CALENDAR_DAY_STYLE = r0
            return
    }

    public DaysOfWeekAdapter() {
            r2 = this;
            r2.<init>()
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r2.calendar = r0
            r1 = 7
            int r1 = r0.getMaximum(r1)
            r2.daysInWeek = r1
            int r0 = r0.getFirstDayOfWeek()
            r2.firstDayOfWeek = r0
            return
    }

    public DaysOfWeekAdapter(int r3) {
            r2 = this;
            r2.<init>()
            java.util.Calendar r0 = com.google.android.material.datepicker.UtcDates.getUtcCalendar()
            r2.calendar = r0
            r1 = 7
            int r0 = r0.getMaximum(r1)
            r2.daysInWeek = r0
            r2.firstDayOfWeek = r3
            return
    }

    private int positionToDayOfWeek(int r2) {
            r1 = this;
            int r0 = r1.firstDayOfWeek
            int r2 = r2 + r0
            int r0 = r1.daysInWeek
            if (r2 <= r0) goto L8
            int r2 = r2 - r0
        L8:
            return r2
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            int r0 = r1.daysInWeek
            return r0
    }

    @Override // android.widget.Adapter
    @androidx.annotation.Nullable
    public java.lang.Integer getItem(int r2) {
            r1 = this;
            int r0 = r1.daysInWeek
            if (r2 < r0) goto L6
            r2 = 0
            return r2
        L6:
            int r2 = r1.positionToDayOfWeek(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // android.widget.Adapter
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Integer r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"WrongConstant"})
    public android.view.View getView(int r5, @androidx.annotation.Nullable android.view.View r6, @androidx.annotation.NonNull android.view.ViewGroup r7) {
            r4 = this;
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L17
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day_of_week
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L17:
            java.util.Calendar r6 = r4.calendar
            int r5 = r4.positionToDayOfWeek(r5)
            r2 = 7
            r6.set(r2, r5)
            android.content.res.Resources r5 = r0.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.util.Calendar r6 = r4.calendar
            int r3 = com.google.android.material.datepicker.DaysOfWeekAdapter.CALENDAR_DAY_STYLE
            java.lang.String r5 = r6.getDisplayName(r2, r3, r5)
            r0.setText(r5)
            android.content.Context r5 = r7.getContext()
            int r6 = com.google.android.material.R.string.mtrl_picker_day_of_week_column_header
            java.lang.String r5 = r5.getString(r6)
            java.util.Calendar r6 = r4.calendar
            r7 = 2
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r6 = r6.getDisplayName(r2, r7, r3)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r6
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r0.setContentDescription(r5)
            return r0
    }
}
