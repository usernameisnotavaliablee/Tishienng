package com.google.mlkit.vision.mediapipe.facemesh;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class FaceMeshListHolder {
    private final java.util.List zza;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class FaceMeshHolder {
        private final android.graphics.Rect zza;
        private final java.util.List zzb;
        private final java.util.List zzc;

        public FaceMeshHolder(@androidx.annotation.NonNull android.graphics.Rect r1) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zzb = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zzc = r1
                return
        }

        public FaceMeshHolder(android.graphics.Rect r7, com.google.android.gms.internal.mlkit_vision_mediapipe.zzfq r8, com.google.android.gms.internal.mlkit_vision_mediapipe.zzii r9, int r10, int r11) {
                r6 = this;
                r6.<init>()
                r6.zza = r7
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r6.zzb = r7
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r6.zzc = r7
                com.google.android.gms.internal.mlkit_vision_mediapipe.zzin r7 = r9.zzc()
                java.util.List r8 = r8.zzd()
                java.util.Iterator r8 = r8.iterator()
            L1f:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L49
                java.lang.Object r0 = r8.next()
                com.google.android.gms.internal.mlkit_vision_mediapipe.zzfo r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzfo) r0
                java.util.List r1 = r6.zzb
                float r2 = r0.zza()
                float r3 = (float) r10
                float r2 = r2 * r3
                float r4 = r0.zzc()
                float r5 = (float) r11
                float r4 = r4 * r5
                float r0 = r0.zzd()
                float r0 = r0 * r3
                com.google.mlkit.vision.common.PointF3D r0 = com.google.mlkit.vision.common.PointF3D.from(r2, r4, r0)
                r1.add(r0)
                goto L1f
            L49:
                int r8 = r7.zzc()
                int r8 = r8 % 3
                r10 = 0
                if (r8 != 0) goto L54
                r8 = 1
                goto L55
            L54:
                r8 = 0
            L55:
                com.google.android.gms.common.internal.Preconditions.checkArgument(r8)
            L58:
                com.google.android.gms.internal.mlkit_vision_mediapipe.zzin r8 = r9.zzc()
                int r8 = r8.zzc()
                int r8 = r8 / 3
                if (r10 >= r8) goto L82
                java.util.List r8 = r6.zzc
                int r11 = r10 * 3
                int r0 = r7.zza(r11)
                int r1 = r11 + 1
                int r1 = r7.zza(r1)
                int r11 = r11 + 2
                int r11 = r7.zza(r11)
                int[] r11 = new int[]{r0, r1, r11}
                r8.add(r11)
                int r10 = r10 + 1
                goto L58
            L82:
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public android.graphics.Rect getBoundingBox() {
                r1 = this;
                android.graphics.Rect r0 = r1.zza
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.util.List<com.google.mlkit.vision.common.PointF3D> getPoints() {
                r1 = this;
                java.util.List r0 = r1.zzb
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.util.List<int[]> getTriangles() {
                r1 = this;
                java.util.List r0 = r1.zzc
                return r0
        }
    }

    @androidx.annotation.VisibleForTesting(otherwise = 3)
    public FaceMeshListHolder(@androidx.annotation.NonNull java.util.List r9, int r10, int r11) {
            r8 = this;
            r8.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.zza = r0
            java.util.Iterator r9 = r9.iterator()
        Le:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L9d
            java.lang.Object r0 = r9.next()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzno r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzno) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzob r0 = r0.zzf()
            int r1 = r0.zzh()
            r2 = 2
            if (r1 != r2) goto L49
            com.google.android.gms.internal.mlkit_vision_mediapipe.zznt r0 = r0.zzc()
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.zzf()
            int r3 = r0.zzg()
            int r4 = r0.zzf()
            int r5 = r0.zze()
            int r4 = r4 + r5
            int r5 = r0.zzg()
            int r0 = r0.zzc()
            int r5 = r5 + r0
            r1.<init>(r2, r3, r4, r5)
            goto L8f
        L49:
            int r1 = r0.zzh()
            r2 = 3
            if (r1 != r2) goto L8e
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzny r0 = r0.zze()
            android.graphics.Rect r1 = new android.graphics.Rect
            float r2 = r0.zzf()
            float r3 = (float) r10
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            float r4 = r0.zzg()
            float r5 = (float) r11
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            float r6 = r0.zzf()
            float r7 = r0.zze()
            float r6 = r6 + r7
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            float r6 = r0.zzg()
            float r0 = r0.zzc()
            float r6 = r6 + r0
            float r6 = r6 * r5
            int r0 = java.lang.Math.round(r6)
            r1.<init>(r2, r4, r3, r0)
            goto L8f
        L8e:
            r1 = 0
        L8f:
            if (r1 == 0) goto Le
            java.util.List r0 = r8.zza
            com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder$FaceMeshHolder r2 = new com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder$FaceMeshHolder
            r2.<init>(r1)
            r0.add(r2)
            goto Le
        L9d:
            return
    }

    FaceMeshListHolder(java.util.List r11, java.util.List r12, java.util.List r13, int r14, int r15) {
            r10 = this;
            r10.<init>()
            int r0 = r11.size()
            int r1 = r12.size()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.String r1 = "Landmark list size is not equal to bounding box size"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            int r0 = r11.size()
            int r1 = r13.size()
            if (r0 != r1) goto L22
            goto L23
        L22:
            r3 = 0
        L23:
            java.lang.String r0 = "Landmark list size is not equal to face geometries size"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.zza = r0
        L2f:
            int r0 = r11.size()
            if (r2 >= r0) goto La2
            java.lang.Object r0 = r12.get(r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhj r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzhj) r0
            android.graphics.Rect r4 = new android.graphics.Rect
            float r1 = r0.zzd()
            float r3 = r0.zzc()
            r5 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r5
            float r1 = r1 - r3
            float r3 = (float) r14
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            float r6 = r0.zze()
            float r7 = r0.zza()
            float r7 = r7 / r5
            float r6 = r6 - r7
            float r7 = (float) r15
            float r6 = r6 * r7
            int r6 = java.lang.Math.round(r6)
            float r8 = r0.zzd()
            float r9 = r0.zzc()
            float r9 = r9 / r5
            float r8 = r8 + r9
            float r8 = r8 * r3
            int r3 = java.lang.Math.round(r8)
            float r8 = r0.zze()
            float r0 = r0.zza()
            float r0 = r0 / r5
            float r8 = r8 + r0
            float r8 = r8 * r7
            int r0 = java.lang.Math.round(r8)
            r4.<init>(r1, r6, r3, r0)
            com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder$FaceMeshHolder r3 = new com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder$FaceMeshHolder
            java.lang.Object r0 = r11.get(r2)
            r5 = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzfq r5 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzfq) r5
            java.lang.Object r0 = r13.get(r2)
            r6 = r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzii r6 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzii) r6
            r7 = r14
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.List r14 = r10.zza
            r14.add(r3)
            int r2 = r2 + 1
            r14 = r7
            goto L2f
        La2:
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.List<com.google.mlkit.vision.mediapipe.facemesh.FaceMeshListHolder.FaceMeshHolder> getFaceMeshHolders() {
            r1 = this;
            java.util.List r0 = r1.zza
            return r0
    }
}
