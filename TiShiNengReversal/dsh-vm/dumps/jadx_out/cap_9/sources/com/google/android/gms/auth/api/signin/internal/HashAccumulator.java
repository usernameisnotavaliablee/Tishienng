package com.google.android.gms.auth.api.signin.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class HashAccumulator {
    private int zaa;

    public HashAccumulator() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.auth.api.signin.internal.HashAccumulator addObject(@androidx.annotation.Nullable java.lang.Object r2) {
            r1 = this;
            int r0 = r1.zaa
            int r0 = r0 * 31
            if (r2 != 0) goto L8
            r2 = 0
            goto Lc
        L8:
            int r2 = r2.hashCode()
        Lc:
            int r0 = r0 + r2
            r1.zaa = r0
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public int hash() {
            r1 = this;
            int r0 = r1.zaa
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.android.gms.auth.api.signin.internal.HashAccumulator zaa(boolean r2) {
            r1 = this;
            int r0 = r1.zaa
            int r0 = r0 * 31
            int r0 = r0 + r2
            r1.zaa = r0
            return r1
    }
}
