package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class YearGridAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.android.material.datepicker.YearGridAdapter.ViewHolder> {
    private final com.google.android.material.datepicker.MaterialCalendar<?> materialCalendar;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        final android.widget.TextView textView;

        ViewHolder(android.widget.TextView r1) {
                r0 = this;
                r0.<init>(r1)
                r0.textView = r1
                return
        }
    }

    YearGridAdapter(com.google.android.material.datepicker.MaterialCalendar<?> r1) {
            r0 = this;
            r0.<init>()
            r0.materialCalendar = r1
            return
    }

    static /* synthetic */ com.google.android.material.datepicker.MaterialCalendar access$000(com.google.android.material.datepicker.YearGridAdapter r0) {
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r0.materialCalendar
            return r0
    }

    @androidx.annotation.NonNull
    private android.view.View.OnClickListener createYearClickListener(int r2) {
            r1 = this;
            com.google.android.material.datepicker.YearGridAdapter$1 r0 = new com.google.android.material.datepicker.YearGridAdapter$1
            r0.<init>(r1, r2)
            return r0
    }

    public int getItemCount() {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            int r0 = r0.getYearSpan()
            return r0
    }

    int getPositionForYear(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r0 = r0.year
            int r2 = r2 - r0
            return r2
    }

    int getYearForPosition(int r2) {
            r1 = this;
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r1.materialCalendar
            com.google.android.material.datepicker.CalendarConstraints r0 = r0.getCalendarConstraints()
            com.google.android.material.datepicker.Month r0 = r0.getStart()
            int r0 = r0.year
            int r0 = r0 + r2
            return r0
    }

    public /* bridge */ /* synthetic */ void onBindViewHolder(@androidx.annotation.NonNull androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r1 = (com.google.android.material.datepicker.YearGridAdapter.ViewHolder) r1
            r0.onBindViewHolder(r1, r2)
            return
    }

    public void onBindViewHolder(@androidx.annotation.NonNull com.google.android.material.datepicker.YearGridAdapter.ViewHolder r8, int r9) {
            r7 = this;
            int r9 = r7.getYearForPosition(r9)
            android.widget.TextView r0 = r8.textView
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r2
            java.lang.String r2 = "%d"
            java.lang.String r1 = java.lang.String.format(r1, r2, r4)
            r0.setText(r1)
            android.widget.TextView r0 = r8.textView
            android.content.Context r1 = r0.getContext()
            java.lang.String r1 = com.google.android.material.datepicker.DateStrings.getYearContentDescription(r1, r9)
            r0.setContentDescription(r1)
            com.google.android.material.datepicker.MaterialCalendar<?> r0 = r7.materialCalendar
            com.google.android.material.datepicker.CalendarStyle r0 = r0.getCalendarStyle()
            java.util.Calendar r1 = com.google.android.material.datepicker.UtcDates.getTodayCalendar()
            int r2 = r1.get(r3)
            if (r2 != r9) goto L3d
            com.google.android.material.datepicker.CalendarItemStyle r2 = r0.todayYear
            goto L3f
        L3d:
            com.google.android.material.datepicker.CalendarItemStyle r2 = r0.year
        L3f:
            com.google.android.material.datepicker.MaterialCalendar<?> r4 = r7.materialCalendar
            com.google.android.material.datepicker.DateSelector r4 = r4.getDateSelector()
            java.util.Collection r4 = r4.getSelectedDays()
            java.util.Iterator r4 = r4.iterator()
        L4d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L69
            java.lang.Object r5 = r4.next()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r1.setTimeInMillis(r5)
            int r5 = r1.get(r3)
            if (r5 != r9) goto L4d
            com.google.android.material.datepicker.CalendarItemStyle r2 = r0.selectedYear
            goto L4d
        L69:
            android.widget.TextView r0 = r8.textView
            r2.styleItem(r0)
            android.widget.TextView r8 = r8.textView
            android.view.View$OnClickListener r9 = r7.createYearClickListener(r9)
            r8.setOnClickListener(r9)
            return
    }

    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r1, int r2) {
            r0 = this;
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r1 = r0.m4onCreateViewHolder(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    /* renamed from: onCreateViewHolder, reason: collision with other method in class */
    public com.google.android.material.datepicker.YearGridAdapter.ViewHolder m4onCreateViewHolder(@androidx.annotation.NonNull android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_year
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            com.google.android.material.datepicker.YearGridAdapter$ViewHolder r4 = new com.google.android.material.datepicker.YearGridAdapter$ViewHolder
            r4.<init>(r3)
            return r4
    }
}
