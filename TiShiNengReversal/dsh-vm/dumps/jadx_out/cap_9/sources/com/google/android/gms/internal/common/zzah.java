package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@org.jspecify.nullness.NullMarked
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzah {
    public zzah() {
            r1 = this;
            r1.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    static java.lang.Object[] zza(java.lang.Object[] r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L21
            r1 = r2[r0]
            if (r1 == 0) goto La
            int r0 = r0 + 1
            goto L1
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "at index "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L21:
            return r2
    }
}
