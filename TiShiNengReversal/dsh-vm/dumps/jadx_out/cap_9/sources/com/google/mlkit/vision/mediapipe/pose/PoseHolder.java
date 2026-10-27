package com.google.mlkit.vision.mediapipe.pose;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class PoseHolder {
    private final java.util.List zza;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class PoseLandmarkHolder {
        private final int zza;
        private final float zzb;
        private final float zzc;
        private final float zzd;
        private final float zze;

        PoseLandmarkHolder(int r1, float r2, float r3, float r4, float r5) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                r0.zzc = r3
                r0.zzd = r4
                r0.zze = r5
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public float getInFrameLikelihood() {
                r1 = this;
                float r0 = r1.zze
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public int getIndex() {
                r1 = this;
                int r0 = r1.zza
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public float getX() {
                r1 = this;
                float r0 = r1.zzb
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public float getY() {
                r1 = this;
                float r0 = r1.zzc
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public float getZ() {
                r1 = this;
                float r0 = r1.zzd
                return r0
        }
    }

    @androidx.annotation.VisibleForTesting
    public PoseHolder(com.google.android.gms.internal.mlkit_vision_mediapipe.zzfm r9) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.zza = r0
            java.util.List r9 = r9.zzd()
            java.util.Iterator r9 = r9.iterator()
            r0 = 0
            r2 = 0
        L14:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r9.next()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzfk) r0
            java.util.List r7 = r8.zza
            com.google.mlkit.vision.mediapipe.pose.PoseHolder$PoseLandmarkHolder r1 = new com.google.mlkit.vision.mediapipe.pose.PoseHolder$PoseLandmarkHolder
            float r3 = r0.zzc()
            float r4 = r0.zzd()
            float r5 = r0.zze()
            float r6 = r0.zza()
            r1.<init>(r2, r3, r4, r5, r6)
            r7.add(r1)
            int r2 = r2 + 1
            goto L14
        L3d:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.List<com.google.mlkit.vision.mediapipe.pose.PoseHolder.PoseLandmarkHolder> getPoseLandmarkHolders() {
            r1 = this;
            java.util.List r0 = r1.zza
            return r0
    }
}
