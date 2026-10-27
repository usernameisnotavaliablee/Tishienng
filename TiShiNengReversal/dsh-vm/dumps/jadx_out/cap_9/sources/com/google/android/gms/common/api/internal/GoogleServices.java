package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class GoogleServices {
    private static final java.lang.Object zza = null;

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.concurrent.GuardedBy("lock")
    private static com.google.android.gms.common.api.internal.GoogleServices zzb;

    @androidx.annotation.Nullable
    private final java.lang.String zzc;
    private final com.google.android.gms.common.api.Status zzd;
    private final boolean zze;
    private final boolean zzf;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.api.internal.GoogleServices.zza = r0
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    GoogleServices(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.bjtsn.pose_detection.R.string.common_google_play_services_unknown_issue
            java.lang.String r1 = r0.getResourcePackageName(r1)
            java.lang.String r2 = "google_app_measurement_enable"
            java.lang.String r3 = "integer"
            int r1 = r0.getIdentifier(r2, r3, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L29
            int r0 = r0.getInteger(r1)
            if (r0 == 0) goto L21
            r1 = 0
            goto L22
        L21:
            r1 = 1
        L22:
            if (r0 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            r4.zzf = r1
            goto L2b
        L29:
            r4.zzf = r3
        L2b:
            r4.zze = r2
            java.lang.String r0 = com.google.android.gms.common.internal.zzah.zzb(r5)
            if (r0 != 0) goto L3e
            com.google.android.gms.common.internal.StringResourceValueReader r0 = new com.google.android.gms.common.internal.StringResourceValueReader
            r0.<init>(r5)
            java.lang.String r5 = "google_app_id"
            java.lang.String r0 = r0.getString(r5)
        L3e:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 == 0) goto L53
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r0 = 10
            java.lang.String r1 = "Missing google app id value from from string resources with name google_app_id."
            r5.<init>(r0, r1)
            r4.zzd = r5
            r5 = 0
            r4.zzc = r5
            return
        L53:
            r4.zzc = r0
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r4.zzd = r5
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    GoogleServices(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r0.zzd = r1
            r0.zze = r2
            r1 = r2 ^ 1
            r0.zzf = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    private static com.google.android.gms.common.api.internal.GoogleServices checkInitialized(java.lang.String r4) {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleServices r1 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r4 = move-exception
            goto L27
        Lb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9
            r2.<init>()     // Catch: java.lang.Throwable -> L9
            java.lang.String r3 = "Initialize must be called before "
            r2.append(r3)     // Catch: java.lang.Throwable -> L9
            r2.append(r4)     // Catch: java.lang.Throwable -> L9
            java.lang.String r4 = "."
            r2.append(r4)     // Catch: java.lang.Throwable -> L9
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L9
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L9
            throw r1     // Catch: java.lang.Throwable -> L9
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r4
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    static void clearInstanceForTest() {
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r0)
            r1 = 0
            com.google.android.gms.common.api.internal.GoogleServices.zzb = r1     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String getGoogleAppId() {
            java.lang.String r0 = "getGoogleAppId"
            com.google.android.gms.common.api.internal.GoogleServices r0 = checkInitialized(r0)
            java.lang.String r0 = r0.zzc
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.Status initialize(@androidx.annotation.NonNull android.content.Context r2) {
            java.lang.String r0 = "Context must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.lang.Object r0 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.GoogleServices r1 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            com.google.android.gms.common.api.internal.GoogleServices r1 = new com.google.android.gms.common.api.internal.GoogleServices     // Catch: java.lang.Throwable -> L14
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.api.internal.GoogleServices.zzb = r1     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L1c
        L16:
            com.google.android.gms.common.api.internal.GoogleServices r2 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> L14
            com.google.android.gms.common.api.Status r2 = r2.zzd     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return r2
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.Status initialize(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull java.lang.String r2, boolean r3) {
            java.lang.String r0 = "Context must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r0)
            java.lang.String r1 = "App ID must be nonempty."
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2, r1)
            java.lang.Object r1 = com.google.android.gms.common.api.internal.GoogleServices.zza
            monitor-enter(r1)
            com.google.android.gms.common.api.internal.GoogleServices r0 = com.google.android.gms.common.api.internal.GoogleServices.zzb     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L19
            com.google.android.gms.common.api.Status r2 = r0.checkGoogleAppId(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r2
        L17:
            r2 = move-exception
            goto L24
        L19:
            com.google.android.gms.common.api.internal.GoogleServices r0 = new com.google.android.gms.common.api.internal.GoogleServices     // Catch: java.lang.Throwable -> L17
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.common.api.internal.GoogleServices.zzb = r0     // Catch: java.lang.Throwable -> L17
            com.google.android.gms.common.api.Status r2 = r0.zzd     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r2
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isMeasurementEnabled() {
            java.lang.String r0 = "isMeasurementEnabled"
            com.google.android.gms.common.api.internal.GoogleServices r0 = checkInitialized(r0)
            com.google.android.gms.common.api.Status r1 = r0.zzd
            boolean r1 = r1.isSuccess()
            if (r1 == 0) goto L14
            boolean r0 = r0.zze
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
            java.lang.String r0 = "isMeasurementExplicitlyDisabled"
            com.google.android.gms.common.api.internal.GoogleServices r0 = checkInitialized(r0)
            boolean r0 = r0.zzf
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.VisibleForTesting
    com.google.android.gms.common.api.Status checkGoogleAppId(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.zzc
            if (r0 == 0) goto L2a
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L2a
            java.lang.String r4 = r3.zzc
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "'."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = 10
            r0.<init>(r1, r4)
            return r0
        L2a:
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            return r4
    }
}
