package com.google.android.gms.common.moduleinstall.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaw extends com.google.android.gms.common.moduleinstall.internal.zaa {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;

    zaw(com.google.android.gms.common.moduleinstall.internal.zay r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zac(com.google.android.gms.common.api.Status r2, @androidx.annotation.Nullable com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r3) {
            r1 = this;
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zaa
            com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(r2, r3, r0)
            return
    }
}
