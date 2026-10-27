package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzhx {
    protected final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp zza;

    public zzhx(com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private final native long zza(long r1, boolean r3);

    private final native long zzh(long r1, float r3);

    private final native long zzi(long r1, int r3);

    private final native long zzj(long r1, com.google.android.gms.internal.mlkit_vision_mediapipe.zzib r3);

    private final native long zzk(long r1, java.nio.ByteBuffer r3, int r4, int r5);

    private final native long zzl(long r1, java.lang.String r3);

    private void zzm(long r2, com.google.android.gms.internal.mlkit_vision_mediapipe.zzie r4) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhq r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzhq
            r0.<init>(r2)
            r4.zzf(r0)
            return
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzb(boolean r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r2.zza
            long r0 = r0.zza()
            long r0 = r2.zza(r0, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv.zzd(r0)
            return r3
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzc(float r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r2.zza
            long r0 = r0.zza()
            long r0 = r2.zzh(r0, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv.zzd(r0)
            return r3
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzd(int r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r2.zza
            long r0 = r0.zza()
            long r0 = r2.zzi(r0, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv.zzd(r0)
            return r3
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zze(com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw r4) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzib r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzib
            r0.<init>()
            java.lang.Class r1 = r4.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzif r2 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzic.zza
            java.lang.String r1 = r2.zza(r1)
            r0.zza = r1
            if (r1 == 0) goto L25
            r4.zzk()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r4 = r3.zza
            long r1 = r4.zza()
            long r0 = r3.zzj(r1, r0)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r4 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv.zzd(r0)
            return r4
        L25:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot determine the protobuf type name for class: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". Have you called ProtoUtil.registerTypeName?"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzf(java.nio.ByteBuffer r8, int r9, int r10) {
            r7 = this;
            int r0 = r9 * 3
            int r0 = r0 + 3
            int r0 = r0 / 4
            int r0 = r0 * 4
            int r0 = r0 * r10
            int r1 = r8.capacity()
            if (r0 != r1) goto L23
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r7.zza
            long r2 = r0.zza()
            r1 = r7
            r4 = r8
            r5 = r9
            r6 = r10
            long r8 = r1.zzk(r2, r4, r5, r6)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r8 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv.zzd(r8)
            return r8
        L23:
            r4 = r8
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            int r9 = r4.capacity()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r1 = "The size of the buffer should be: "
            r10.append(r1)
            r10.append(r0)
            java.lang.String r0 = " but is "
            r10.append(r0)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv zzg(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhp r0 = r2.zza
            long r0 = r0.zza()
            long r0 = r2.zzl(r0, r3)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv r3 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzhv.zzd(r0)
            return r3
    }
}
