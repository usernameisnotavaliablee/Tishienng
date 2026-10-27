package com.bumptech.glide.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private java.lang.Class<?> a;
    private java.lang.Class<?> b;
    private java.lang.Class<?> c;

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public j(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2) {
            r0 = this;
            r0.<init>()
            r0.a(r1, r2)
            return
    }

    public j(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.Nullable java.lang.Class<?> r3) {
            r0 = this;
            r0.<init>()
            r0.b(r1, r2, r3)
            return
    }

    public void a(@androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.NonNull java.lang.Class<?> r3) {
            r1 = this;
            r0 = 0
            r1.b(r2, r3, r0)
            return
    }

    public void b(@androidx.annotation.NonNull java.lang.Class<?> r1, @androidx.annotation.NonNull java.lang.Class<?> r2, @androidx.annotation.Nullable java.lang.Class<?> r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L36
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L36
        L12:
            com.bumptech.glide.util.j r5 = (com.bumptech.glide.util.j) r5
            java.lang.Class<?> r2 = r4.a
            java.lang.Class<?> r3 = r5.a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1f
            return r1
        L1f:
            java.lang.Class<?> r2 = r4.b
            java.lang.Class<?> r3 = r5.b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2a
            return r1
        L2a:
            java.lang.Class<?> r2 = r4.c
            java.lang.Class<?> r5 = r5.c
            boolean r5 = com.bumptech.glide.util.l.d(r2, r5)
            if (r5 != 0) goto L35
            return r1
        L35:
            return r0
        L36:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<?> r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.b
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Class<?> r1 = r2.c
            if (r1 == 0) goto L1a
            int r1 = r1.hashCode()
            goto L1b
        L1a:
            r1 = 0
        L1b:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MultiClassKey{first="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", second="
            r0.append(r1)
            java.lang.Class<?> r1 = r2.b
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
