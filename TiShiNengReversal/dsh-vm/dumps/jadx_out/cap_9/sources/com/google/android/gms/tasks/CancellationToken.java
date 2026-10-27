package com.google.android.gms.tasks;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class CancellationToken {
    public CancellationToken() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract boolean isCancellationRequested();

    @androidx.annotation.NonNull
    public abstract com.google.android.gms.tasks.CancellationToken onCanceledRequested(@androidx.annotation.NonNull com.google.android.gms.tasks.OnTokenCanceledListener r1);
}
