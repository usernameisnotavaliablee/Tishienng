package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m {
    private static boolean a;

    static {
            return
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = "AZX"
            return r2
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AZX."
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String a(java.lang.Throwable r0) {
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            return r0
    }

    private static java.lang.String a(java.lang.Object... r4) {
            if (r4 == 0) goto L29
            int r0 = r4.length
            if (r0 != 0) goto L6
            goto L29
        L6:
            int r0 = r4.length
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L12
            r4 = r4[r1]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            return r4
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r2 = r4.length
        L18:
            if (r1 >= r2) goto L24
            r3 = r4[r1]
            if (r3 == 0) goto L21
            r0.append(r3)
        L21:
            int r1 = r1 + 1
            goto L18
        L24:
            java.lang.String r4 = r0.toString()
            return r4
        L29:
            java.lang.String r4 = ""
            return r4
    }

    private static void a(int r2, java.lang.String r3, java.lang.String r4) {
            if (r4 != 0) goto L3
            goto L21
        L3:
            int r0 = r4.length()
            r1 = 3072(0xc00, float:4.305E-42)
            if (r0 <= r1) goto L18
            r0 = 0
            java.lang.String r0 = r4.substring(r0, r1)
            b(r2, r3, r0)
            java.lang.String r4 = r4.substring(r1)
            goto L3
        L18:
            int r0 = r4.length()
            if (r0 <= 0) goto L21
            b(r2, r3, r4)
        L21:
            return
    }

    public static void a(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = a()
            if (r0 == 0) goto Le
            r0 = 3
            java.lang.String r2 = a(r2)
            a(r0, r1, r2)
        Le:
            return
    }

    public static void a(boolean r0) {
            com.umeng.socialize.a.m.a = r0
            return
    }

    public static boolean a() {
            boolean r0 = com.umeng.socialize.a.m.a
            return r0
    }

    private static void b(int r0, java.lang.String r1, java.lang.String r2) {
            r2 = 3
            if (r0 == r2) goto L19
            r2 = 4
            if (r0 == r2) goto L15
            r2 = 5
            if (r0 == r2) goto L11
            r2 = 6
            if (r0 == r2) goto Ld
            return
        Ld:
            a(r1)
            return
        L11:
            a(r1)
            return
        L15:
            a(r1)
            return
        L19:
            a(r1)
            return
    }

    public static void b(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = a()
            if (r0 == 0) goto Le
            r0 = 4
            java.lang.String r2 = a(r2)
            a(r0, r1, r2)
        Le:
            return
    }

    public static void c(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = a()
            if (r0 == 0) goto Le
            r0 = 5
            java.lang.String r2 = a(r2)
            a(r0, r1, r2)
        Le:
            return
    }

    public static void d(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = a()
            if (r0 == 0) goto Le
            r0 = 6
            java.lang.String r2 = a(r2)
            a(r0, r1, r2)
        Le:
            return
    }
}
