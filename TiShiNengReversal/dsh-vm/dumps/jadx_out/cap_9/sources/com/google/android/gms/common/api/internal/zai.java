package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zai {
    public final int zac;

    public zai(int r1) {
            r0 = this;
            r0.<init>()
            r0.zac = r1
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.common.api.Status zah(android.os.RemoteException r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r2 = r2.getLocalizedMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 19
            r0.<init>(r1, r2)
            return r0
    }

    public abstract void zad(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1);

    public abstract void zae(@androidx.annotation.NonNull java.lang.Exception r1);

    public abstract void zaf(com.google.android.gms.common.api.internal.zabq r1) throws android.os.DeadObjectException;

    public abstract void zag(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.zaad r1, boolean r2);
}
