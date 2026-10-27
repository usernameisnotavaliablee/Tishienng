package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zax extends com.google.android.gms.common.api.internal.IStatusCallback.Stub {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    zax(com.google.android.gms.common.moduleinstall.internal.zay r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(com.google.android.gms.common.api.Status r3) {
            r2 = this;
            r0 = 0
            com.google.android.gms.tasks.TaskCompletionSource r1 = r2.zaa
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r3, r0, r1)
            return
    }
}
