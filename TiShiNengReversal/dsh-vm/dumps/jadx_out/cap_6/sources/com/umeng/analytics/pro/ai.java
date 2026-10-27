package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ai {
    private java.lang.String a;
    private int b;
    private int c;
    private int d;
    private boolean e;

    public ai(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.e = r0
            r1.a = r2
            r0 = -1
            r1.d = r0
            r1.c = r0
            r1.b = r0
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L18
            r1.a()
        L18:
            return
    }

    private void a() {
            r5 = this;
            java.lang.String r0 = "-"
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L4b
            r2 = 0
            if (r1 == 0) goto L3d
            java.lang.String r1 = r5.a     // Catch: java.lang.Throwable -> L4b
            java.lang.String[] r0 = r1.split(r0)     // Catch: java.lang.Throwable -> L4b
            int r1 = r0.length     // Catch: java.lang.Throwable -> L4b
            r3 = 2
            r4 = 1
            if (r1 != r3) goto L3a
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L4b
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4b
            r5.b = r1     // Catch: java.lang.Throwable -> L4b
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L4b
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4b
            r5.c = r0     // Catch: java.lang.Throwable -> L4b
            int r1 = r5.b     // Catch: java.lang.Throwable -> L4b
            if (r1 >= r4) goto L34
            r5.b = r4     // Catch: java.lang.Throwable -> L4b
        L34:
            r1 = 24
            if (r0 <= r1) goto L3a
            r5.c = r1     // Catch: java.lang.Throwable -> L4b
        L3a:
            r5.e = r4     // Catch: java.lang.Throwable -> L4b
            return
        L3d:
            java.lang.String r0 = r5.a     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L4b
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L4b
            r5.d = r0     // Catch: java.lang.Throwable -> L4b
            r5.e = r2     // Catch: java.lang.Throwable -> L4b
        L4b:
            return
    }

    public boolean a(int r5) {
            r4 = this;
            boolean r0 = r4.e
            r1 = 1
            r2 = -1
            if (r0 == 0) goto L13
            int r0 = r4.b
            if (r0 == r2) goto L1a
            int r3 = r4.c
            if (r3 == r2) goto L1a
            if (r5 < r0) goto L1a
            if (r5 > r3) goto L1a
            return r1
        L13:
            int r0 = r4.d
            if (r0 == r2) goto L1a
            if (r5 != r0) goto L1a
            return r1
        L1a:
            r5 = 0
            return r5
    }
}
