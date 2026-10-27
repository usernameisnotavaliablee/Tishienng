package com.google.android.gms.internal.mlkit_vision_pose_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzwm {
    private final com.google.android.gms.common.internal.TelemetryLoggingClient zza;
    private final java.util.concurrent.atomic.AtomicLong zzb;

    @androidx.annotation.VisibleForTesting
    zzwm(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong
            r0 = -1
            r4.<init>(r0)
            r2.zzb = r4
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r4 = com.google.android.gms.common.internal.TelemetryLoggingOptions.builder()
            java.lang.String r0 = "mlkit:vision"
            com.google.android.gms.common.internal.TelemetryLoggingOptions$Builder r4 = r4.setApi(r0)
            com.google.android.gms.common.internal.TelemetryLoggingOptions r4 = r4.build()
            com.google.android.gms.common.internal.TelemetryLoggingClient r3 = com.google.android.gms.common.internal.TelemetryLogging.getClient(r3, r4)
            r2.zza = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_pose_common.zzwm zza(android.content.Context r2) {
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwm r0 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwm
            java.lang.String r1 = "mlkit:vision"
            r0.<init>(r2, r1)
            return r0
    }

    final /* synthetic */ void zzb(long r1, java.lang.Exception r3) {
            r0 = this;
            java.util.concurrent.atomic.AtomicLong r3 = r0.zzb
            r3.set(r1)
            return
    }

    public final synchronized void zzc(int r18, int r19, long r20, long r22) {
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            java.util.concurrent.atomic.AtomicLong r0 = r1.zzb     // Catch: java.lang.Throwable -> L5c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5c
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L5c
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L14
            goto L2a
        L14:
            java.util.concurrent.atomic.AtomicLong r0 = r1.zzb     // Catch: java.lang.Throwable -> L5c
            long r4 = r0.get()     // Catch: java.lang.Throwable -> L5c
            long r4 = r2 - r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.Throwable -> L5c
            r6 = 30
            long r6 = r0.toMillis(r6)     // Catch: java.lang.Throwable -> L5c
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L2a
            monitor-exit(r17)
            return
        L2a:
            com.google.android.gms.common.internal.TelemetryLoggingClient r0 = r1.zza     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.common.internal.TelemetryData r4 = new com.google.android.gms.common.internal.TelemetryData     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.common.internal.MethodInvocation r5 = new com.google.android.gms.common.internal.MethodInvocation     // Catch: java.lang.Throwable -> L5c
            r15 = 0
            r16 = -1
            r8 = 0
            r13 = 0
            r14 = 0
            r6 = r18
            r7 = r19
            r9 = r20
            r11 = r22
            r5.<init>(r6, r7, r8, r9, r11, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L5c
            r6 = 1
            com.google.android.gms.common.internal.MethodInvocation[] r6 = new com.google.android.gms.common.internal.MethodInvocation[r6]     // Catch: java.lang.Throwable -> L5c
            r7 = 0
            r6[r7] = r5     // Catch: java.lang.Throwable -> L5c
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.tasks.Task r0 = r0.log(r4)     // Catch: java.lang.Throwable -> L5c
            com.google.android.gms.internal.mlkit_vision_pose_common.zzwl r4 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzwl     // Catch: java.lang.Throwable -> L5c
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L5c
            r0.addOnFailureListener(r4)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r17)
            return
        L5c:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L5c
            throw r0
    }
}
