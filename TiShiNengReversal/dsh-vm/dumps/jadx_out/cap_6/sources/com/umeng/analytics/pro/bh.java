package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bh {
    private static final java.lang.String a = "OpenId";
    private static boolean b;

    static {
            return
    }

    public bh() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.Object r2, java.lang.Object r3) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            r2 = r0
        L5:
            if (r3 != 0) goto L8
            r3 = r0
        L8:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.lang.String r2 = "%s:%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static void a(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.umeng.analytics.pro.bh.b
            if (r0 == 0) goto L7
            e(r1, r2)
        L7:
            return
    }

    public static void a(boolean r0) {
            com.umeng.analytics.pro.bh.b = r0
            return
    }

    public static void b(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.umeng.analytics.pro.bh.b
            if (r0 == 0) goto L7
            e(r1, r2)
        L7:
            return
    }

    public static void c(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.umeng.analytics.pro.bh.b
            if (r0 == 0) goto L7
            e(r1, r2)
        L7:
            return
    }

    public static void d(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.umeng.analytics.pro.bh.b
            if (r0 == 0) goto L7
            e(r1, r2)
        L7:
            return
    }

    private static java.lang.String e(java.lang.String r6, java.lang.Object... r7) {
            if (r6 != 0) goto L7
            if (r7 != 0) goto L7
            java.lang.String r6 = ""
            return r6
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r6 != 0) goto L10
            java.lang.String r6 = "-"
        L10:
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r6 = "[%s] "
            java.lang.String r6 = java.lang.String.format(r6, r2)
            r0.append(r6)
            if (r7 == 0) goto L47
            int r6 = r7.length
        L22:
            int r2 = r3 + 1
            int r4 = r7.length
            if (r2 >= r4) goto L3e
            r4 = r7[r3]
            r5 = r7[r2]
            java.lang.String r4 = a(r4, r5)
            r0.append(r4)
            int r4 = r6 + (-1)
            if (r2 >= r4) goto L3b
            java.lang.String r2 = ","
            r0.append(r2)
        L3b:
            int r3 = r3 + 2
            goto L22
        L3e:
            int r6 = r7.length
            int r6 = r6 - r1
            if (r3 != r6) goto L47
            r6 = r7[r3]
            r0.append(r6)
        L47:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
