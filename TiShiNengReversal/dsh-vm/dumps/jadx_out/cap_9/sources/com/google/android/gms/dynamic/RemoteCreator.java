package com.google.android.gms.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class RemoteCreator<T> {
    private final java.lang.String zza;
    private java.lang.Object zzb;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class RemoteCreatorException extends java.lang.Exception {
        @com.google.android.gms.common.annotation.KeepForSdk
        public RemoteCreatorException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public RemoteCreatorException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    protected RemoteCreator(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract T getRemoteCreator(@androidx.annotation.NonNull android.os.IBinder r1);

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    protected final T getRemoteCreatorInstance(@androidx.annotation.NonNull android.content.Context r3) throws com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException {
            r2 = this;
            java.lang.Object r0 = r2.zzb
            if (r0 != 0) goto L4a
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.content.Context r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r3)
            if (r3 == 0) goto L42
            java.lang.ClassLoader r3 = r3.getClassLoader()
            java.lang.String r0 = r2.zza     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L26 java.lang.ClassNotFoundException -> L28
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L26 java.lang.ClassNotFoundException -> L28
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L26 java.lang.ClassNotFoundException -> L28
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L26 java.lang.ClassNotFoundException -> L28
            java.lang.Object r3 = r2.getRemoteCreator(r3)     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L26 java.lang.ClassNotFoundException -> L28
            r2.zzb = r3     // Catch: java.lang.IllegalAccessException -> L24 java.lang.InstantiationException -> L26 java.lang.ClassNotFoundException -> L28
            goto L4a
        L24:
            r3 = move-exception
            goto L2a
        L26:
            r3 = move-exception
            goto L32
        L28:
            r3 = move-exception
            goto L3a
        L2a:
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not access creator."
            r0.<init>(r1, r3)
            throw r0
        L32:
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not instantiate creator."
            r0.<init>(r1, r3)
            throw r0
        L3a:
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not load creator class."
            r0.<init>(r1, r3)
            throw r0
        L42:
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r3 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r0 = "Could not get remote context."
            r3.<init>(r0)
            throw r3
        L4a:
            java.lang.Object r3 = r2.zzb
            return r3
    }
}
