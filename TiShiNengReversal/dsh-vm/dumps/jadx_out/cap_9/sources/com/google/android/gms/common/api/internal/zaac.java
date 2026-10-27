package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zaac implements com.google.android.gms.tasks.OnCompleteListener {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zaa;
    final /* synthetic */ com.google.android.gms.common.api.internal.zaad zab;

    zaac(com.google.android.gms.common.api.internal.zaad r1, com.google.android.gms.tasks.TaskCompletionSource r2) {
            r0 = this;
            r0.zab = r1
            r0.zaa = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@androidx.annotation.NonNull com.google.android.gms.tasks.Task r2) {
            r1 = this;
            com.google.android.gms.common.api.internal.zaad r2 = r1.zab
            java.util.Map r2 = com.google.android.gms.common.api.internal.zaad.zab(r2)
            com.google.android.gms.tasks.TaskCompletionSource r0 = r1.zaa
            r2.remove(r0)
            return
    }
}
