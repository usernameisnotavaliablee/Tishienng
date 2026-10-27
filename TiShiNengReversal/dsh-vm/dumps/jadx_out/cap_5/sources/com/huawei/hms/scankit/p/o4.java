package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o4 {
    private static final java.util.regex.Pattern a = null;

    static {
            java.lang.String r0 = "[0-9]*[a-z|A-Z]*[一-龥]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.scankit.p.o4.a = r0
            return
    }

    public o4() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L7
            return r8
        L7:
            int r0 = r8.length()
            r1 = 42
            r2 = 1
            if (r2 != r0) goto L15
            java.lang.String r8 = java.lang.String.valueOf(r1)
            return r8
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            r4 = 0
        L1b:
            if (r4 >= r0) goto L3f
            char r5 = r8.charAt(r4)
            java.util.regex.Pattern r6 = com.huawei.hms.scankit.p.o4.a
            java.lang.String r7 = java.lang.String.valueOf(r5)
            java.util.regex.Matcher r6 = r6.matcher(r7)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L39
            int r6 = r2 % 2
            if (r6 != 0) goto L37
            r5 = 42
        L37:
            int r2 = r2 + 1
        L39:
            r3.append(r5)
            int r4 = r4 + 1
            goto L1b
        L3f:
            java.lang.String r8 = r3.toString()
            return r8
    }

    private static java.lang.String a(java.lang.String r2, boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L1a
            if (r3 == 0) goto L17
            java.lang.String r2 = a(r2)
            r0.append(r2)
            goto L1a
        L17:
            r0.append(r2)
        L1a:
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.Throwable a(java.lang.Throwable r0) {
            return r0
    }

    public static void a(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            a(r1, r0)
            return
    }

    public static void a(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            c(r1, r2)
            return
    }

    public static void a(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            r0 = 0
            a(r1, r0)
            a(r2)
            return
    }

    public static void b(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            a(r1, r0)
            return
    }

    private static java.lang.String c(java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 512(0x200, float:7.17E-43)
            r0.<init>(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L10
            r0.append(r2)
        L10:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L1d
            java.lang.String r2 = a(r3)
            r0.append(r2)
        L1d:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void d(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            a(r1, r0)
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            a(r1, r0)
            return
    }
}
