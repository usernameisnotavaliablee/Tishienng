package com.google.android.gms.internal.mlkit_vision_mediapipe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class zzcn extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzch {
    private static final boolean zza = false;
    private static final boolean zzb = false;
    private static final com.google.android.gms.internal.mlkit_vision_mediapipe.zzcg zzc = null;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class zza {
        zza() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean zza() {
                boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zzt()
                return r0
        }
    }

    static {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zza.zza()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zza = r0
            java.lang.String r0 = android.os.Build.FINGERPRINT
            r1 = 1
            if (r0 == 0) goto L15
            java.lang.String r2 = "robolectric"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zzb = r1
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn$1 r0 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn$1
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zzc = r0
            return
    }

    public zzcn() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.Class<?> zzp() {
            java.lang.Class r0 = dalvik.system.VMStack.getStackClass2()
            return r0
    }

    static java.lang.String zzq() {
            java.lang.Class r0 = dalvik.system.VMStack.getStackClass2()     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzr() {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzs() {
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zza
            return r0
    }

    static boolean zzt() {
            java.lang.String r0 = "dalvik.system.VMStack"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "getStackClass2"
            r2 = 0
            r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = zzq()     // Catch: java.lang.Throwable -> L1b
            java.lang.Class<com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn$zza> r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zza.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzch
    protected com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd zze(java.lang.String r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzbd r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcs.zze(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzch
    protected com.google.android.gms.internal.mlkit_vision_mediapipe.zzcg zzh() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzcg r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzcn.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzch
    protected com.google.android.gms.internal.mlkit_vision_mediapipe.zzcz zzj() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzct r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzct.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzch
    protected java.lang.String zzm() {
            r1 = this;
            java.lang.String r0 = "platform: Android"
            return r0
    }
}
