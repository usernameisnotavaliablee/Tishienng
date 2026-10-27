package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzw {
    public zzw() {
            r1 = this;
            r1.<init>()
            return
    }

    static void zza(java.lang.Object r2, java.lang.Object r3) {
            if (r2 == 0) goto L25
            if (r3 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null value in entry: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "=null"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L25:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "null key in entry: null="
            java.lang.String r3 = r0.concat(r3)
            r2.<init>(r3)
            throw r2
    }
}
