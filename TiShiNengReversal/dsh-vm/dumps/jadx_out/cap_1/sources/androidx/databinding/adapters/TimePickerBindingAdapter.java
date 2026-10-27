package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TimePickerBindingAdapter {


    public TimePickerBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.InverseBindingAdapter(attribute = "android:hour")
    public static int getHour(android.widget.TimePicker r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.databinding.adapters.a.a(r2)
            return r2
        Lb:
            java.lang.Integer r2 = r2.getCurrentHour()
            if (r2 != 0) goto L13
            r2 = 0
            return r2
        L13:
            int r2 = r2.intValue()
            return r2
    }

    @androidx.databinding.InverseBindingAdapter(attribute = "android:minute")
    public static int getMinute(android.widget.TimePicker r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.databinding.adapters.b.a(r2)
            return r2
        Lb:
            java.lang.Integer r2 = r2.getCurrentMinute()
            if (r2 != 0) goto L13
            r2 = 0
            return r2
        L13:
            int r2 = r2.intValue()
            return r2
    }

    @androidx.databinding.BindingAdapter({"android:hour"})
    public static void setHour(android.widget.TimePicker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L10
            int r0 = androidx.databinding.adapters.a.a(r2)
            if (r0 == r3) goto L21
            androidx.databinding.adapters.c.a(r2, r3)
            return
        L10:
            java.lang.Integer r0 = r2.getCurrentHour()
            int r0 = r0.intValue()
            if (r0 == r3) goto L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setCurrentHour(r3)
        L21:
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void setListeners(android.widget.TimePicker r1, android.widget.TimePicker.OnTimeChangedListener r2, androidx.databinding.InverseBindingListener r3, androidx.databinding.InverseBindingListener r4) {
            if (r3 != 0) goto L8
            if (r4 != 0) goto L8
            r1.setOnTimeChangedListener(r2)
            return
        L8:
            androidx.databinding.adapters.TimePickerBindingAdapter$1 r0 = new androidx.databinding.adapters.TimePickerBindingAdapter$1
            r0.<init>(r2, r3, r4)
            r1.setOnTimeChangedListener(r0)
            return
    }

    @androidx.databinding.BindingAdapter({"android:minute"})
    public static void setMinute(android.widget.TimePicker r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L10
            int r0 = androidx.databinding.adapters.b.a(r2)
            if (r0 == r3) goto L21
            androidx.databinding.adapters.d.a(r2, r3)
            return
        L10:
            java.lang.Integer r0 = r2.getCurrentMinute()
            int r0 = r0.intValue()
            if (r0 == r3) goto L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setCurrentHour(r3)
        L21:
            return
    }
}
