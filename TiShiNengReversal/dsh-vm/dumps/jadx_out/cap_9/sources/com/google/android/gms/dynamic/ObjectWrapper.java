package com.google.android.gms.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.util.RetainForClient
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class ObjectWrapper<T> extends com.google.android.gms.dynamic.IObjectWrapper.Stub {
    private final java.lang.Object zza;

    private ObjectWrapper(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> T unwrap(@androidx.annotation.NonNull com.google.android.gms.dynamic.IObjectWrapper r7) {
            boolean r0 = r7 instanceof com.google.android.gms.dynamic.ObjectWrapper
            if (r0 == 0) goto L9
            com.google.android.gms.dynamic.ObjectWrapper r7 = (com.google.android.gms.dynamic.ObjectWrapper) r7
            java.lang.Object r7 = r7.zza
            return r7
        L9:
            android.os.IBinder r7 = r7.asBinder()
            java.lang.Class r0 = r7.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
        L1a:
            if (r2 >= r1) goto L2a
            r5 = r0[r2]
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L27
            int r3 = r3 + 1
            r4 = r5
        L27:
            int r2 = r2 + 1
            goto L1a
        L2a:
            r1 = 1
            if (r3 != r1) goto L58
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            boolean r0 = r4.isAccessible()
            if (r0 != 0) goto L50
            r4.setAccessible(r1)
            java.lang.Object r7 = r4.get(r7)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.NullPointerException -> L47
            return r7
        L3e:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Could not access the field in remoteBinder."
            r0.<init>(r1, r7)
            throw r0
        L47:
            r7 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Binder object is null."
            r0.<init>(r1, r7)
            throw r0
        L50:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "IObjectWrapper declared field not private!"
            r7.<init>(r0)
            throw r7
        L58:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected number of IObjectWrapper declared fields: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <T> com.google.android.gms.dynamic.IObjectWrapper wrap(@androidx.annotation.NonNull T r1) {
            com.google.android.gms.dynamic.ObjectWrapper r0 = new com.google.android.gms.dynamic.ObjectWrapper
            r0.<init>(r1)
            return r0
    }
}
