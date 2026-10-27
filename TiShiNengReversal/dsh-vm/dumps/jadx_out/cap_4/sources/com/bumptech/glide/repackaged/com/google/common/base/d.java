package com.bumptech.glide.repackaged.com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class d {
    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = p(r4, r5)
            return r4
        L16:
            if (r5 < 0) goto L30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            r3[r0] = r4
            r3[r2] = r5
            java.lang.String r4 = "%s (%s) must be less than size (%s)"
            java.lang.String r4 = p(r4, r3)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "negative size: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    private static java.lang.String b(int r4, int r5, java.lang.String r6) {
            r0 = 1
            r1 = 0
            r2 = 2
            if (r4 >= 0) goto L16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r6
            r5[r0] = r4
            java.lang.String r4 = "%s (%s) must not be negative"
            java.lang.String r4 = p(r4, r5)
            return r4
        L16:
            if (r5 < 0) goto L30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r6
            r3[r0] = r4
            r3[r2] = r5
            java.lang.String r4 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r4 = p(r4, r3)
            return r4
        L30:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "negative size: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    private static java.lang.String c(int r1, int r2, int r3) {
            if (r1 < 0) goto L29
            if (r1 <= r3) goto L5
            goto L29
        L5:
            if (r2 < 0) goto L22
            if (r2 <= r3) goto La
            goto L22
        La:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            r2 = 1
            r3[r2] = r1
            java.lang.String r1 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r1 = p(r1, r3)
            return r1
        L22:
            java.lang.String r1 = "end index"
            java.lang.String r1 = b(r2, r3, r1)
            return r1
        L29:
            java.lang.String r2 = "start index"
            java.lang.String r1 = b(r1, r3, r2)
            return r1
    }

    public static void d(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void e(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void f(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = p(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static int g(int r1, int r2) {
            java.lang.String r0 = "index"
            int r1 = h(r1, r2, r0)
            return r1
    }

    public static int h(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L5
            if (r1 >= r2) goto L5
            return r1
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = a(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static <T> T i(T r0) {
            r0.getClass()
            return r0
    }

    public static <T> T j(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static int k(int r1, int r2) {
            java.lang.String r0 = "index"
            int r1 = l(r1, r2, r0)
            return r1
    }

    public static int l(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L5
            if (r1 > r2) goto L5
            return r1
        L5:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = b(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static void m(int r1, int r2, int r3) {
            if (r1 < 0) goto L7
            if (r2 < r1) goto L7
            if (r2 > r3) goto L7
            return
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = c(r1, r2, r3)
            r0.<init>(r1)
            throw r0
    }

    public static void n(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public static void o(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    static java.lang.String p(java.lang.String r6, java.lang.Object... r7) {
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length()
            int r2 = r7.length
            int r2 = r2 * 16
            int r1 = r1 + r2
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L13:
            int r3 = r7.length
            if (r1 >= r3) goto L34
            java.lang.String r3 = "%s"
            int r3 = r6.indexOf(r3, r2)
            r4 = -1
            if (r3 != r4) goto L20
            goto L34
        L20:
            java.lang.String r2 = r6.substring(r2, r3)
            r0.append(r2)
            int r2 = r1 + 1
            r1 = r7[r1]
            r0.append(r1)
            int r1 = r3 + 2
            r5 = r2
            r2 = r1
            r1 = r5
            goto L13
        L34:
            java.lang.String r6 = r6.substring(r2)
            r0.append(r6)
            int r6 = r7.length
            if (r1 >= r6) goto L60
            java.lang.String r6 = " ["
            r0.append(r6)
            int r6 = r1 + 1
            r1 = r7[r1]
            r0.append(r1)
        L4a:
            int r1 = r7.length
            if (r6 >= r1) goto L5b
            java.lang.String r1 = ", "
            r0.append(r1)
            int r1 = r6 + 1
            r6 = r7[r6]
            r0.append(r6)
            r6 = r1
            goto L4a
        L5b:
            r6 = 93
            r0.append(r6)
        L60:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
