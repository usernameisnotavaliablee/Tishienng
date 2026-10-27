package com.google.android.gms.internal.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzad extends com.google.android.gms.internal.common.zzaa {
    public zzad() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    zzad(int r1) {
            r0 = this;
            r1 = 4
            r0.<init>(r1)
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.android.gms.internal.common.zzad zzb(java.lang.Object r1) {
            r0 = this;
            super.zza(r1)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public final com.google.android.gms.internal.common.zzad zzc(java.util.Iterator r2) {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r2.next()
            super.zza(r0)
            goto L0
        Le:
            return r1
    }
}
