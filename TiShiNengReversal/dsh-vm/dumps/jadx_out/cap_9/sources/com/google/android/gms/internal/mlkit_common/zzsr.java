package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzsr extends com.google.mlkit.common.sdkinternal.LazyInstanceMap {
    private zzsr() {
            r1 = this;
            r0 = 0
            throw r0
    }

    /* synthetic */ zzsr(com.google.android.gms.internal.mlkit_common.zzsq r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.mlkit.common.sdkinternal.LazyInstanceMap
    protected final /* bridge */ /* synthetic */ java.lang.Object create(java.lang.Object r6) {
            r5 = this;
            com.google.android.gms.internal.mlkit_common.zzsb r6 = (com.google.android.gms.internal.mlkit_common.zzsb) r6
            com.google.android.gms.internal.mlkit_common.zzsh r0 = new com.google.android.gms.internal.mlkit_common.zzsh
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            com.google.android.gms.internal.mlkit_common.zzsc r2 = new com.google.android.gms.internal.mlkit_common.zzsc
            com.google.mlkit.common.sdkinternal.MlKitContext r3 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.<init>(r3, r6)
            java.lang.String r6 = r6.zzb()
            android.content.Context r3 = r1.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r4 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            java.lang.Object r1 = r1.get(r4)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r1 = (com.google.mlkit.common.sdkinternal.SharedPrefManager) r1
            r0.<init>(r3, r1, r2, r6)
            return r0
    }
}
