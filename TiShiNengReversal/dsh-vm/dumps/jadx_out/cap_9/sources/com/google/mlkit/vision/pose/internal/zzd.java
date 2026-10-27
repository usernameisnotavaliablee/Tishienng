package com.google.mlkit.vision.pose.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzd extends com.google.mlkit.acceleration.internal.AccelerationManager {
    private static com.google.mlkit.acceleration.internal.PipelineId zza;

    @androidx.annotation.WorkerThread
    private zzd(android.content.Context r7) {
            r6 = this;
            com.google.mlkit.acceleration.internal.PipelineId r2 = zzb()
            com.google.mlkit.vision.pose.internal.zzb r3 = new com.google.mlkit.vision.pose.internal.zzb
            r3.<init>()
            com.google.mlkit.vision.pose.internal.zzc r4 = new com.google.mlkit.vision.pose.internal.zzc
            r4.<init>(r7)
            com.google.mlkit.acceleration.internal.AccelerationLogger r5 = zza()
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    static com.google.mlkit.acceleration.internal.AccelerationLogger zza() {
            com.google.mlkit.acceleration.internal.PipelineId r0 = zzb()
            com.google.mlkit.vision.pose.internal.zza r1 = new com.google.mlkit.vision.pose.internal.zza
            r1.<init>()
            com.google.android.gms.internal.mlkit_vision_pose_common.zzvi r0 = com.google.android.gms.internal.mlkit_vision_pose_common.zzvi.zza(r0, r1)
            return r0
    }

    @androidx.annotation.WorkerThread
    public static synchronized com.google.mlkit.acceleration.internal.PipelineId zzb() {
            java.lang.Class<com.google.mlkit.vision.pose.internal.zzd> r0 = com.google.mlkit.vision.pose.internal.zzd.class
            monitor-enter(r0)
            com.google.mlkit.acceleration.internal.PipelineId r1 = com.google.mlkit.vision.pose.internal.zzd.zza     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L34
            com.google.mlkit.acceleration.internal.PipelineId$Builder r1 = com.google.mlkit.acceleration.internal.PipelineId.builder()     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "mediapipe"
            com.google.mlkit.acceleration.internal.PipelineId$Builder r1 = r1.setNamespace(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "mlkit-pose"
            com.google.mlkit.acceleration.internal.PipelineId$Builder r1 = r1.setName(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = "pose-detection-common"
            com.google.mlkit.acceleration.internal.PipelineId$Builder r1 = r1.setClientLibraryName(r2)     // Catch: java.lang.Throwable -> L32
            com.google.android.gms.common.internal.LibraryVersion r2 = com.google.android.gms.common.internal.LibraryVersion.getInstance()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "pose-detection-common"
            java.lang.String r2 = r2.getVersion(r3)     // Catch: java.lang.Throwable -> L32
            com.google.mlkit.acceleration.internal.PipelineId$Builder r1 = r1.setClientLibraryVersion(r2)     // Catch: java.lang.Throwable -> L32
            com.google.mlkit.acceleration.internal.PipelineId r1 = r1.build()     // Catch: java.lang.Throwable -> L32
            com.google.mlkit.vision.pose.internal.zzd.zza = r1     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r1 = move-exception
            goto L38
        L34:
            com.google.mlkit.acceleration.internal.PipelineId r1 = com.google.mlkit.vision.pose.internal.zzd.zza     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)
            return r1
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r1
    }

    @androidx.annotation.WorkerThread
    public static synchronized com.google.mlkit.vision.pose.internal.zzd zzc() {
            java.lang.Class<com.google.mlkit.vision.pose.internal.zzd> r0 = com.google.mlkit.vision.pose.internal.zzd.class
            monitor-enter(r0)
            com.google.mlkit.vision.pose.internal.zzd r1 = new com.google.mlkit.vision.pose.internal.zzd     // Catch: java.lang.Throwable -> L16
            com.google.mlkit.common.sdkinternal.MlKitContext r2 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()     // Catch: java.lang.Throwable -> L16
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L16
            android.content.Context r2 = (android.content.Context) r2     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }
}
