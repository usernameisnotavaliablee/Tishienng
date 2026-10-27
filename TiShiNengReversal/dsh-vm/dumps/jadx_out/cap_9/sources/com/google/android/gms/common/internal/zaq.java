package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaq implements com.google.android.gms.common.internal.PendingResultUtil.ResultConverter {
    final /* synthetic */ com.google.android.gms.common.api.Response zaa;

    zaq(com.google.android.gms.common.api.Response r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* bridge */ /* synthetic */ java.lang.Object convert(com.google.android.gms.common.api.Result r2) {
            r1 = this;
            com.google.android.gms.common.api.Response r0 = r1.zaa
            r0.setResult(r2)
            com.google.android.gms.common.api.Response r2 = r1.zaa
            return r2
    }
}
