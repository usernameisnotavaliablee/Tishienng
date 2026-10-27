package com.google.android.gms.common.wrappers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Wrappers {
    private static final com.google.android.gms.common.wrappers.Wrappers zza = null;

    @androidx.annotation.Nullable
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zzb;

    static {
            com.google.android.gms.common.wrappers.Wrappers r0 = new com.google.android.gms.common.wrappers.Wrappers
            r0.<init>()
            com.google.android.gms.common.wrappers.Wrappers.zza = r0
            return
    }

    public Wrappers() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zzb = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(@androidx.annotation.NonNull android.content.Context r1) {
            com.google.android.gms.common.wrappers.Wrappers r0 = com.google.android.gms.common.wrappers.Wrappers.zza
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = r0.zza(r1)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.VisibleForTesting
    public final synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zza(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = r1.zzb     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L21
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1a
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L18
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r2 = move-exception
            goto L25
        L1a:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = new com.google.android.gms.common.wrappers.PackageManagerWrapper     // Catch: java.lang.Throwable -> L18
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L18
            r1.zzb = r0     // Catch: java.lang.Throwable -> L18
        L21:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = r1.zzb     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)
            return r2
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r2
    }
}
