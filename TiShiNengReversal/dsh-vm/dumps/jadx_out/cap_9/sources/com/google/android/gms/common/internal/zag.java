package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class zag implements android.content.DialogInterface.OnClickListener {
    public zag() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.internal.zag zab(android.app.Activity r1, @androidx.annotation.Nullable android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zad r0 = new com.google.android.gms.common.internal.zad
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zac(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1, @androidx.annotation.Nullable android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zae r0 = new com.google.android.gms.common.internal.zae
            r0.<init>(r2, r1, r3)
            return r0
    }

    public static com.google.android.gms.common.internal.zag zad(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.LifecycleFragment r1, @androidx.annotation.Nullable android.content.Intent r2, int r3) {
            com.google.android.gms.common.internal.zaf r3 = new com.google.android.gms.common.internal.zaf
            r0 = 2
            r3.<init>(r2, r1, r0)
            return r3
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r2, int r3) {
            r1 = this;
            r1.zaa()     // Catch: java.lang.Throwable -> L4 android.content.ActivityNotFoundException -> L6
            goto Ld
        L4:
            r3 = move-exception
            goto L11
        L6:
            java.lang.String r3 = android.os.Build.FINGERPRINT     // Catch: java.lang.Throwable -> L4
            java.lang.String r0 = "generic"
            r3.contains(r0)     // Catch: java.lang.Throwable -> L4
        Ld:
            r2.dismiss()
            return
        L11:
            r2.dismiss()
            throw r3
    }

    protected abstract void zaa();
}
