package com.google.android.gms.common.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ApiException extends java.lang.Exception {

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    protected final com.google.android.gms.common.api.Status mStatus;

    public ApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r4) {
            r3 = this;
            int r0 = r4.getStatusCode()
            java.lang.String r1 = r4.getStatusMessage()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r4.getStatusMessage()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.mStatus = r4
            return
    }

    @androidx.annotation.NonNull
    public com.google.android.gms.common.api.Status getStatus() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            return r0
    }

    public int getStatusCode() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            int r0 = r0.getStatusCode()
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public java.lang.String getStatusMessage() {
            r1 = this;
            com.google.android.gms.common.api.Status r0 = r1.mStatus
            java.lang.String r0 = r0.getStatusMessage()
            return r0
    }
}
