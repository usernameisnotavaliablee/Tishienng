package com.bytedance.pangle.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
final class az {
    public static final com.bytedance.pangle.tl.az j = null;
    public final int cw;

    @androidx.annotation.Nullable
    public final int[] m;

    @androidx.annotation.Nullable
    public final android.util.ArraySet<java.security.PublicKey> r;

    @androidx.annotation.Nullable
    public final android.content.pm.Signature[] up;

    @androidx.annotation.Nullable
    public final android.content.pm.Signature[] xt;

    static {
            com.bytedance.pangle.tl.az r0 = new com.bytedance.pangle.tl.az
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            com.bytedance.pangle.tl.az.j = r0
            return
    }

    public az(android.content.pm.Signature[] r2, int r3) throws java.security.cert.CertificateException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public az(android.content.pm.Signature[] r1, int r2, android.util.ArraySet<java.security.PublicKey> r3, android.content.pm.Signature[] r4, int[] r5) {
            r0 = this;
            r0.<init>()
            r0.xt = r1
            r0.cw = r2
            r0.r = r3
            r0.up = r4
            r0.m = r5
            return
    }

    public az(android.content.pm.Signature[] r7, int r8, android.content.pm.Signature[] r9, int[] r10) throws java.security.cert.CertificateException {
            r6 = this;
            android.util.ArraySet r3 = j(r7)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static android.util.ArraySet<java.security.PublicKey> j(android.content.pm.Signature[] r5) throws java.security.cert.CertificateException {
            com.bytedance.pangle.tl.e.a()
            int r0 = r5.length
            android.util.ArraySet r0 = com.bytedance.pangle.tl.d.a(r0)
            r1 = 0
        L9:
            int r2 = r5.length
            if (r1 >= r2) goto L43
            r2 = 0
            java.lang.Class<android.content.pm.Signature> r3 = android.content.pm.Signature.class
            java.lang.String r4 = "getPublicKey"
            java.lang.reflect.Method r3 = r3.getMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L16
            goto L1b
        L16:
            r3 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r3)
            r3 = r2
        L1b:
            if (r3 == 0) goto L40
            boolean r4 = r3.isAccessible()
            if (r4 == 0) goto L40
            r4 = r5[r1]     // Catch: java.lang.Exception -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.lang.Object r2 = r3.invoke(r4, r2)     // Catch: java.lang.Exception -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            java.security.PublicKey r2 = (java.security.PublicKey) r2     // Catch: java.lang.Exception -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            com.bytedance.pangle.tl.a.a(r0, r2)     // Catch: java.lang.Exception -> L2f java.lang.reflect.InvocationTargetException -> L31 java.lang.IllegalAccessException -> L33
            goto L40
        L2f:
            r2 = move-exception
            goto L35
        L31:
            r2 = move-exception
            goto L39
        L33:
            r2 = move-exception
            goto L3d
        L35:
            com.bytedance.sdk.openadsdk.api.m.j(r2)
            goto L40
        L39:
            com.bytedance.sdk.openadsdk.api.m.j(r2)
            goto L40
        L3d:
            com.bytedance.sdk.openadsdk.api.m.j(r2)
        L40:
            int r1 = r1 + 1
            goto L9
        L43:
            return r0
    }

    public static boolean j(byte[] r4, byte[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            r2 = 0
            if (r0 == r1) goto L6
            return r2
        L6:
            r0 = 0
        L7:
            int r1 = r4.length
            if (r0 >= r1) goto L14
            r1 = r4[r0]
            r3 = r5[r0]
            if (r1 == r3) goto L11
            return r2
        L11:
            int r0 = r0 + 1
            goto L7
        L14:
            r4 = 1
            return r4
    }

    public static boolean j(android.content.pm.Signature[] r2, android.content.pm.Signature[] r3) {
            int r0 = r2.length
            int r1 = r3.length
            if (r0 != r1) goto L12
            boolean r0 = com.bytedance.pangle.util.r.j(r2, r3)
            if (r0 == 0) goto L12
            boolean r2 = com.bytedance.pangle.util.r.j(r3, r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.bytedance.pangle.tl.az
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.bytedance.pangle.tl.az r5 = (com.bytedance.pangle.tl.az) r5
            int r1 = r4.cw
            int r3 = r5.cw
            if (r1 == r3) goto L13
            return r2
        L13:
            android.content.pm.Signature[] r1 = r4.xt
            android.content.pm.Signature[] r3 = r5.xt
            boolean r1 = j(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            android.util.ArraySet<java.security.PublicKey> r1 = r4.r
            if (r1 == 0) goto L2b
            android.util.ArraySet<java.security.PublicKey> r3 = r5.r
            boolean r1 = com.bytedance.pangle.tl.b.a(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L2b:
            android.util.ArraySet<java.security.PublicKey> r1 = r5.r
            if (r1 == 0) goto L30
            return r2
        L30:
            android.content.pm.Signature[] r1 = r4.up
            android.content.pm.Signature[] r3 = r5.up
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            int[] r1 = r4.m
            int[] r5 = r5.m
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 != 0) goto L46
            return r2
        L46:
            return r0
    }

    public int hashCode() {
            r2 = this;
            android.content.pm.Signature[] r0 = r2.xt
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.cw
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.util.ArraySet<java.security.PublicKey> r1 = r2.r
            if (r1 == 0) goto L16
            int r1 = com.bytedance.pangle.tl.c.a(r1)
            goto L17
        L16:
            r1 = 0
        L17:
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.content.pm.Signature[] r1 = r2.up
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int[] r1 = r2.m
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }
}
