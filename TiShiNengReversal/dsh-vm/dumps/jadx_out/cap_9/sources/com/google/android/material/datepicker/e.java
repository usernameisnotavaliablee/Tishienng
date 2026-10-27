package com.google.android.material.datepicker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final /* synthetic */ class e {
    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    public static /* synthetic */ void a(android.widget.EditText[] r3, android.view.View r4, boolean r5) {
            int r5 = r3.length
            r0 = 0
            r1 = 0
        L3:
            if (r1 >= r5) goto L11
            r2 = r3[r1]
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto Le
            return
        Le:
            int r1 = r1 + 1
            goto L3
        L11:
            com.google.android.material.internal.ViewUtils.hideKeyboard(r4, r0)
            return
    }

    public static /* synthetic */ void b(android.view.View r1) {
            r0 = 0
            com.google.android.material.internal.ViewUtils.requestFocusAndShowKeyboard(r1, r0)
            return
    }

    public static void c(@androidx.annotation.NonNull android.widget.EditText... r5) {
            int r0 = r5.length
            if (r0 != 0) goto L4
            return
        L4:
            com.google.android.material.datepicker.c r0 = new com.google.android.material.datepicker.c
            r0.<init>(r5)
            int r1 = r5.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L16
            r4 = r5[r3]
            r4.setOnFocusChangeListener(r0)
            int r3 = r3 + 1
            goto Lc
        L16:
            r5 = r5[r2]
            com.google.android.material.datepicker.d r0 = new com.google.android.material.datepicker.d
            r0.<init>(r5)
            r1 = 100
            r5.postDelayed(r0, r1)
            return
    }
}
