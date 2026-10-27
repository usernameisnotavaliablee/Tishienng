package com.bytedance.adsdk.lottie.model;

@com.bytedance.component.sdk.annotation.RestrictTo({com.bytedance.component.sdk.annotation.RestrictTo.Scope.LIBRARY})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae<T> {
    T j;
    T xt;

    public ae() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean xt(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.util.Pair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r0 = r4.first
            T r2 = r3.j
            boolean r0 = xt(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.Object r4 = r4.second
            T r0 = r3.xt
            boolean r4 = xt(r4, r0)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public int hashCode() {
            r3 = this;
            T r0 = r3.j
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            T r2 = r3.xt
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    public void j(T r1, T r2) {
            r0 = this;
            r0.j = r1
            r0.xt = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Pair{"
            r0.<init>(r1)
            T r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            T r1 = r2.xt
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
