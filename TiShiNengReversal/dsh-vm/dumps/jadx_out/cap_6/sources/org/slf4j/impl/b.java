package org.slf4j.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class b implements org.slf4j.a {
    static final java.lang.String b = "null";
    static final int c = 23;
    private final java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.c> a;

    b() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    private static java.lang.String b(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 46
            int r1 = r4.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L1a
            int r1 = r1 + 1
            int r2 = r0 - r1
            r3 = 23
            if (r2 > r3) goto L1a
            java.lang.String r4 = r4.substring(r1)
            return r4
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 42
            r1.append(r2)
            int r0 = r0 + (-22)
            java.lang.String r4 = r4.substring(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    static java.lang.String c(java.lang.String r8) {
            if (r8 != 0) goto L5
            java.lang.String r8 = "null"
            return r8
        L5:
            int r0 = r8.length()
            r1 = 23
            if (r0 > r1) goto Le
            return r8
        Le:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 26
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L17:
            r5 = 46
            int r6 = r8.indexOf(r5, r3)
            r7 = -1
            if (r6 == r7) goto L41
            char r4 = r8.charAt(r3)
            r2.append(r4)
            int r3 = r6 - r3
            r4 = 1
            if (r3 <= r4) goto L31
            r3 = 42
            r2.append(r3)
        L31:
            r2.append(r5)
            int r3 = r6 + 1
            int r4 = r2.length()
            if (r4 <= r1) goto L17
            java.lang.String r8 = b(r8)
            return r8
        L41:
            int r5 = r0 - r3
            if (r4 == 0) goto L51
            int r4 = r4 + r5
            if (r4 <= r1) goto L49
            goto L51
        L49:
            r2.append(r8, r3, r0)
            java.lang.String r8 = r2.toString()
            return r8
        L51:
            java.lang.String r8 = b(r8)
            return r8
    }

    @Override // org.slf4j.a
    public org.slf4j.c a(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = c(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.c> r0 = r2.a
            java.lang.Object r0 = r0.get(r3)
            org.slf4j.c r0 = (org.slf4j.c) r0
            if (r0 != 0) goto L1f
            org.slf4j.impl.a r0 = new org.slf4j.impl.a
            r0.<init>(r3)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.slf4j.c> r1 = r2.a
            java.lang.Object r3 = r1.putIfAbsent(r3, r0)
            org.slf4j.c r3 = (org.slf4j.c) r3
            if (r3 != 0) goto L1e
            return r0
        L1e:
            return r3
        L1f:
            return r0
    }
}
