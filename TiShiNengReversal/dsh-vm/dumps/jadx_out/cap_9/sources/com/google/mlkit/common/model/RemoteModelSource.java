package com.google.mlkit.common.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class RemoteModelSource {

    @androidx.annotation.Nullable
    private final java.lang.String zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    protected RemoteModelSource(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L20
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L20
        L15:
            com.google.mlkit.common.model.RemoteModelSource r3 = (com.google.mlkit.common.model.RemoteModelSource) r3
            java.lang.String r0 = r2.zza
            java.lang.String r3 = r3.zza
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r0, r3)
            return r3
        L20:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "RemoteModelSource"
            com.google.android.gms.internal.mlkit_common.zzq r0 = com.google.android.gms.internal.mlkit_common.zzr.zzb(r0)
            java.lang.String r1 = "firebaseModelName"
            java.lang.String r2 = r3.zza
            r0.zza(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }
}
