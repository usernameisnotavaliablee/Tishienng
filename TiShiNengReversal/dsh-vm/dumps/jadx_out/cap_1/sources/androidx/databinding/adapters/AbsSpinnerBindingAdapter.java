package androidx.databinding.adapters;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class AbsSpinnerBindingAdapter {
    public AbsSpinnerBindingAdapter() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.databinding.BindingAdapter({"android:entries"})
    public static <T> void setEntries(android.widget.AbsSpinner r7, java.util.List<T> r8) {
            if (r8 == 0) goto L25
            android.widget.SpinnerAdapter r0 = r7.getAdapter()
            boolean r1 = r0 instanceof androidx.databinding.adapters.ObservableListAdapter
            if (r1 == 0) goto L10
            androidx.databinding.adapters.ObservableListAdapter r0 = (androidx.databinding.adapters.ObservableListAdapter) r0
            r0.setList(r8)
            return
        L10:
            androidx.databinding.adapters.ObservableListAdapter r1 = new androidx.databinding.adapters.ObservableListAdapter
            android.content.Context r2 = r7.getContext()
            r5 = 17367049(0x1090009, float:2.516295E-38)
            r6 = 0
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r7.setAdapter(r1)
            return
        L25:
            r8 = 0
            r7.setAdapter(r8)
            return
    }

    @androidx.databinding.BindingAdapter({"android:entries"})
    public static <T extends java.lang.CharSequence> void setEntries(android.widget.AbsSpinner r4, T[] r5) {
            if (r5 == 0) goto L3a
            android.widget.SpinnerAdapter r0 = r4.getAdapter()
            if (r0 == 0) goto L24
            int r1 = r0.getCount()
            int r2 = r5.length
            if (r1 != r2) goto L24
            r1 = 0
        L10:
            int r2 = r5.length
            if (r1 >= r2) goto L23
            r2 = r5[r1]
            java.lang.Object r3 = r0.getItem(r1)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            goto L24
        L20:
            int r1 = r1 + 1
            goto L10
        L23:
            return
        L24:
            android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
            android.content.Context r1 = r4.getContext()
            r2 = 17367048(0x1090008, float:2.5162948E-38)
            r0.<init>(r1, r2, r5)
            r5 = 17367049(0x1090009, float:2.516295E-38)
            r0.setDropDownViewResource(r5)
            r4.setAdapter(r0)
            return
        L3a:
            r5 = 0
            r4.setAdapter(r5)
            return
    }
}
