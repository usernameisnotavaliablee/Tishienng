package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class LifecycleActivity {
    private final java.lang.Object zza;

    public LifecycleActivity(@androidx.annotation.NonNull android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Activity must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public LifecycleActivity(@androidx.annotation.NonNull android.content.ContextWrapper r1) {
            r0 = this;
            r0.<init>()
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @androidx.annotation.NonNull
    public final android.app.Activity zza() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    @androidx.annotation.NonNull
    public final androidx.fragment.app.FragmentActivity zzb() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            return r0
    }

    public final boolean zzc() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r0 = r0 instanceof android.app.Activity
            return r0
    }

    public final boolean zzd() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            boolean r0 = r0 instanceof androidx.fragment.app.FragmentActivity
            return r0
    }
}
