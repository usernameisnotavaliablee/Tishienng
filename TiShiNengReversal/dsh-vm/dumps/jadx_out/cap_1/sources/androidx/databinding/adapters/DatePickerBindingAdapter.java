package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.InverseBindingMethods({@androidx.databinding.InverseBindingMethod(attribute = "android:year", type = android.widget.DatePicker.class), @androidx.databinding.InverseBindingMethod(attribute = "android:month", type = android.widget.DatePicker.class), @androidx.databinding.InverseBindingMethod(attribute = "android:day", method = "getDayOfMonth", type = android.widget.DatePicker.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DatePickerBindingAdapter {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.databinding.adapters.DatePickerBindingAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class DateChangedListener implements android.widget.DatePicker.OnDateChangedListener {
        androidx.databinding.InverseBindingListener mDayChanged;
        android.widget.DatePicker.OnDateChangedListener mListener;
        androidx.databinding.InverseBindingListener mMonthChanged;
        androidx.databinding.InverseBindingListener mYearChanged;

        private DateChangedListener() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ DateChangedListener(androidx.databinding.adapters.DatePickerBindingAdapter.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(android.widget.DatePicker r2, int r3, int r4, int r5) {
                r1 = this;
                android.widget.DatePicker$OnDateChangedListener r0 = r1.mListener
                if (r0 == 0) goto L7
                r0.onDateChanged(r2, r3, r4, r5)
            L7:
                androidx.databinding.InverseBindingListener r2 = r1.mYearChanged
                if (r2 == 0) goto Le
                r2.onChange()
            Le:
                androidx.databinding.InverseBindingListener r2 = r1.mMonthChanged
                if (r2 == 0) goto L15
                r2.onChange()
            L15:
                androidx.databinding.InverseBindingListener r2 = r1.mDayChanged
                if (r2 == 0) goto L1c
                r2.onChange()
            L1c:
                return
        }

        public void setListeners(android.widget.DatePicker.OnDateChangedListener r1, androidx.databinding.InverseBindingListener r2, androidx.databinding.InverseBindingListener r3, androidx.databinding.InverseBindingListener r4) {
                r0 = this;
                r0.mListener = r1
                r0.mYearChanged = r2
                r0.mMonthChanged = r3
                r0.mDayChanged = r4
                return
        }
    }

    public DatePickerBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void setListeners(android.widget.DatePicker r3, int r4, int r5, int r6, android.widget.DatePicker.OnDateChangedListener r7, androidx.databinding.InverseBindingListener r8, androidx.databinding.InverseBindingListener r9, androidx.databinding.InverseBindingListener r10) {
            if (r4 != 0) goto L6
            int r4 = r3.getYear()
        L6:
            if (r6 != 0) goto Lc
            int r6 = r3.getDayOfMonth()
        Lc:
            if (r8 != 0) goto L16
            if (r9 != 0) goto L16
            if (r10 != 0) goto L16
            r3.init(r4, r5, r6, r7)
            return
        L16:
            int r0 = androidx.databinding.library.baseAdapters.R.id.onDateChanged
            java.lang.Object r1 = androidx.databinding.adapters.ListenerUtil.getListener(r3, r0)
            androidx.databinding.adapters.DatePickerBindingAdapter$DateChangedListener r1 = (androidx.databinding.adapters.DatePickerBindingAdapter.DateChangedListener) r1
            if (r1 != 0) goto L29
            androidx.databinding.adapters.DatePickerBindingAdapter$DateChangedListener r1 = new androidx.databinding.adapters.DatePickerBindingAdapter$DateChangedListener
            r2 = 0
            r1.<init>(r2)
            androidx.databinding.adapters.ListenerUtil.trackListener(r3, r1, r0)
        L29:
            r1.setListeners(r7, r8, r9, r10)
            r3.init(r4, r5, r6, r1)
            return
    }
}
