package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.databinding.InverseBindingMethods({@androidx.databinding.InverseBindingMethod(attribute = "android:date", type = android.widget.CalendarView.class)})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class CalendarViewBindingAdapter {


    public CalendarViewBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"android:date"})
    public static void setDate(android.widget.CalendarView r3, long r4) {
            long r0 = r3.getDate()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto Lb
            r3.setDate(r4)
        Lb:
            return
    }

    @androidx.databinding.BindingAdapter(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void setListeners(android.widget.CalendarView r1, android.widget.CalendarView.OnDateChangeListener r2, androidx.databinding.InverseBindingListener r3) {
            if (r3 != 0) goto L6
            r1.setOnDateChangeListener(r2)
            return
        L6:
            androidx.databinding.adapters.CalendarViewBindingAdapter$1 r0 = new androidx.databinding.adapters.CalendarViewBindingAdapter$1
            r0.<init>(r2, r3)
            r1.setOnDateChangeListener(r0)
            return
    }
}
