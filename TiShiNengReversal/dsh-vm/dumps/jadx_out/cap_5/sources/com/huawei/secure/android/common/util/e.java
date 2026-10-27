package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private static final java.util.regex.Pattern a = null;
    private static final char b = '*';
    private static final int c = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends java.lang.Throwable {
        private static final long d = 7129050843360571879L;
        private java.lang.String a;
        private java.lang.Throwable b;
        private java.lang.Throwable c;

        public a(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }

        public void a(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }

        public void b(java.lang.Throwable r1) {
                r0 = this;
                r0.b = r1
                return
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable getCause() {
                r1 = this;
                monitor-enter(r1)
                java.lang.Throwable r0 = r1.b     // Catch: java.lang.Throwable -> L8
                if (r0 != r1) goto L6
                r0 = 0
            L6:
                monitor-exit(r1)
                return r0
            L8:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r0
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
                r2 = this;
                java.lang.Throwable r0 = r2.c
                if (r0 != 0) goto L7
                java.lang.String r0 = ""
                return r0
            L7:
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = r2.a
                if (r1 == 0) goto L40
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = ": "
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = r2.a
                boolean r1 = r1.startsWith(r0)
                if (r1 == 0) goto L2f
                java.lang.String r0 = r2.a
                return r0
            L2f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = r2.a
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L40:
                return r0
        }
    }

    static {
            java.lang.String r0 = "[0-9]*[a-z|A-Z]*[一-龥]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.secure.android.common.util.e.a = r0
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void A(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            r0 = 0
            c(r1, r0)
            d(r2)
            return
    }

    public static void B(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            c(r1, r3)
            d(r2)
            return
    }

    public static void C(java.lang.String r0, java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            c(r1, r2)
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
            java.util.regex.Pattern r6 = com.huawei.secure.android.common.util.e.a
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

    private static java.lang.String b(java.lang.String r2, java.lang.String r3) {
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

    private static java.lang.String c(java.lang.String r2, boolean r3) {
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

    private static java.lang.Throwable d(java.lang.Throwable r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            com.huawei.secure.android.common.util.e$a r0 = new com.huawei.secure.android.common.util.e$a
            r0.<init>(r4)
            java.lang.StackTraceElement[] r1 = r4.getStackTrace()
            r0.setStackTrace(r1)
            java.lang.String r1 = r4.getMessage()
            java.lang.String r1 = e(r1)
            r0.a(r1)
            java.lang.Throwable r4 = r4.getCause()
            r1 = r0
        L20:
            if (r4 == 0) goto L42
            com.huawei.secure.android.common.util.e$a r2 = new com.huawei.secure.android.common.util.e$a
            r2.<init>(r4)
            java.lang.StackTraceElement[] r3 = r4.getStackTrace()
            r2.setStackTrace(r3)
            java.lang.String r3 = r4.getMessage()
            java.lang.String r3 = e(r3)
            r2.a(r3)
            r1.b(r2)
            java.lang.Throwable r4 = r4.getCause()
            r1 = r2
            goto L20
        L42:
            return r0
    }

    private static java.lang.String e(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            char[] r2 = r2.toCharArray()
            r0 = 0
        Lc:
            int r1 = r2.length
            if (r0 >= r1) goto L1a
            int r1 = r0 % 2
            if (r1 != 0) goto L17
            r1 = 42
            r2[r0] = r1
        L17:
            int r0 = r0 + 1
            goto Lc
        L1a:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }

    public static void f(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            c(r1, r0)
            return
    }

    public static void g(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            return
    }

    public static void h(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            d(r3)
            return
    }

    public static void i(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            r0 = 0
            c(r1, r0)
            d(r2)
            return
    }

    public static void j(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            c(r1, r3)
            d(r2)
            return
    }

    public static void k(java.lang.String r0, java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            c(r1, r2)
            return
    }

    public static void l(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            c(r1, r0)
            return
    }

    public static void m(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            return
    }

    public static void n(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            d(r3)
            return
    }

    public static void o(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            r0 = 0
            c(r1, r0)
            d(r2)
            return
    }

    public static void p(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            c(r1, r3)
            d(r2)
            return
    }

    public static void q(java.lang.String r0, java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            c(r1, r2)
            return
    }

    public static void r(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            c(r1, r0)
            return
    }

    public static void s(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            return
    }

    public static void t(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            d(r3)
            return
    }

    public static void u(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            r0 = 0
            c(r1, r0)
            d(r2)
            return
    }

    public static void v(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2, boolean r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            return
        L9:
            c(r1, r3)
            d(r2)
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, boolean r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            c(r1, r2)
            return
    }

    public static void x(java.lang.String r0, java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            c(r1, r0)
            return
    }

    public static void y(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            return
    }

    public static void z(java.lang.String r0, java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Ld
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            b(r1, r2)
            d(r3)
            return
    }
}
