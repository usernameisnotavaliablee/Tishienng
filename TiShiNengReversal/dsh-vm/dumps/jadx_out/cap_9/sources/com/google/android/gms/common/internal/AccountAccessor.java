package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor.Stub {
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static android.accounts.Account getAccountBinderSafe(@androidx.annotation.NonNull com.google.android.gms.common.internal.IAccountAccessor r3) {
            r0 = 0
            if (r3 == 0) goto L17
            long r1 = android.os.Binder.clearCallingIdentity()
            android.accounts.Account r3 = r3.zzb()     // Catch: java.lang.Throwable -> Lf android.os.RemoteException -> L14
            android.os.Binder.restoreCallingIdentity(r1)
            return r3
        Lf:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)
            throw r3
        L14:
            android.os.Binder.restoreCallingIdentity(r1)
        L17:
            return r0
    }

    public final boolean equals(@androidx.annotation.Nullable java.lang.Object r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    @androidx.annotation.NonNull
    public final android.accounts.Account zzb() {
            r1 = this;
            r0 = 0
            throw r0
    }
}
