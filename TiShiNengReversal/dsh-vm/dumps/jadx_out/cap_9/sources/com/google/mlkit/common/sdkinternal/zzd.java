package com.google.mlkit.common.sdkinternal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzd extends java.lang.ref.PhantomReference implements com.google.mlkit.common.sdkinternal.Cleaner.Cleanable {
    private final java.util.Set zza;
    private final java.lang.Runnable zzb;

    /* synthetic */ zzd(java.lang.Object r1, java.lang.ref.ReferenceQueue r2, java.util.Set r3, java.lang.Runnable r4, com.google.mlkit.common.sdkinternal.zzc r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zza = r3
            r0.zzb = r4
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.Cleaner.Cleanable
    public final void clean() {
            r1 = this;
            java.util.Set r0 = r1.zza
            boolean r0 = r0.remove(r1)
            if (r0 != 0) goto L9
            return
        L9:
            r1.clear()
            java.lang.Runnable r0 = r1.zzb
            r0.run()
            return
    }
}
