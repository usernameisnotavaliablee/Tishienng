package com.google.mlkit.vision.pose;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Pose {
    private final com.google.android.gms.internal.mlkit_vision_pose_common.zzbd zza;

    public Pose(@androidx.annotation.NonNull com.google.mlkit.vision.mediapipe.pose.PoseHolder r7, @androidx.annotation.Nullable android.graphics.Matrix r8) {
            r6 = this;
            r6.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            com.google.android.gms.internal.mlkit_vision_pose_common.zzba r8 = new com.google.android.gms.internal.mlkit_vision_pose_common.zzba
            r8.<init>()
            java.util.List r7 = r7.getPoseLandmarkHolders()
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r7.next()
            com.google.mlkit.vision.mediapipe.pose.PoseHolder$PoseLandmarkHolder r0 = (com.google.mlkit.vision.mediapipe.pose.PoseHolder.PoseLandmarkHolder) r0
            int r1 = r0.getIndex()
            r2 = 33
            if (r1 < r2) goto L28
            goto L4e
        L28:
            android.graphics.PointF r2 = new android.graphics.PointF
            float r3 = r0.getX()
            float r4 = r0.getY()
            r2.<init>(r3, r4)
            float r3 = r0.getZ()
            com.google.mlkit.vision.pose.PoseLandmark r4 = new com.google.mlkit.vision.pose.PoseLandmark
            float r5 = r2.x
            float r2 = r2.y
            com.google.mlkit.vision.common.PointF3D r2 = com.google.mlkit.vision.common.PointF3D.from(r5, r2, r3)
            float r0 = r0.getInFrameLikelihood()
            r4.<init>(r1, r2, r0)
            r8.zzb(r4)
            goto L13
        L4e:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r7 = r8.zzc()
            r6.zza = r7
            return
    }

    @androidx.annotation.NonNull
    public java.util.List<com.google.mlkit.vision.pose.PoseLandmark> getAllPoseLandmarks() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r0 = r1.zza
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.mlkit.vision.pose.PoseLandmark getPoseLandmark(@com.google.mlkit.vision.pose.PoseLandmark.LandmarkType int r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r0 = r1.zza
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_pose_common.zzbd r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            com.google.mlkit.vision.pose.PoseLandmark r2 = (com.google.mlkit.vision.pose.PoseLandmark) r2
            return r2
    }
}
