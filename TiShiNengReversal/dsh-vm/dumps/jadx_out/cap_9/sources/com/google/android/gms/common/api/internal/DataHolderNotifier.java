package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder zaa;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected DataHolderNotifier(@androidx.annotation.NonNull com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void notifyListener(@androidx.annotation.NonNull L r2) {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zaa
            r1.notifyListener(r2, r0)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract void notifyListener(@androidx.annotation.NonNull L r1, @androidx.annotation.NonNull com.google.android.gms.common.data.DataHolder r2);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    @com.google.android.gms.common.annotation.KeepForSdk
    public void onNotifyListenerFailed() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zaa
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }
}
