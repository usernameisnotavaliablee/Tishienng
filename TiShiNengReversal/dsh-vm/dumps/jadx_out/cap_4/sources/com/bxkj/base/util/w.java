package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class w implements android.text.InputFilter {
    private int a;

    public w() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.a = r0
            return
    }

    public w(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence r2, int r3, int r4, android.text.Spanned r5, int r6, int r7) {
            r1 = this;
            java.lang.String r6 = ""
            java.lang.String r7 = r2.toString()
            boolean r6 = r6.equals(r7)
            r7 = 0
            if (r6 == 0) goto Le
            return r7
        Le:
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "\\."
            java.lang.String[] r5 = r5.split(r6)
            int r6 = r5.length
            r0 = 1
            if (r6 <= r0) goto L2e
            r5 = r5[r0]
            int r5 = r5.length()
            int r5 = r5 + r0
            int r6 = r1.a
            int r5 = r5 - r6
            if (r5 <= 0) goto L2e
            int r4 = r4 - r5
            java.lang.CharSequence r2 = r2.subSequence(r3, r4)
            return r2
        L2e:
            return r7
    }
}
