package com.google.firebase;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class FirebaseException extends java.lang.Exception {
    @java.lang.Deprecated
    protected FirebaseException() {
            r0 = this;
            r0.<init>()
            return
    }

    public FirebaseException(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "Detail message must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2)
            return
    }

    public FirebaseException(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "Detail message must not be empty"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r0)
            r1.<init>(r2, r3)
            return
    }
}
