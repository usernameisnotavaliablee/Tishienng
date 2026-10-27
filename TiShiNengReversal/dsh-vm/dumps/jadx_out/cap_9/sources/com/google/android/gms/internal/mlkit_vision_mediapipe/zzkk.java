package com.google.android.gms.internal.mlkit_vision_mediapipe;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk;
import com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzkk<MessageType extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk<MessageType, BuilderType>> extends com.google.android.gms.internal.mlkit_vision_mediapipe.zziu<MessageType, BuilderType> {
    protected com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zza;
    private final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr zzb;

    protected zzkk(MessageType r2) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            boolean r0 = r2.zzH()
            if (r0 != 0) goto L12
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2 = r2.zzt()
            r1.zza = r2
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Default instance must be immutable."
            r2.<init>(r0)
            throw r2
    }

    private static void zza(java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzmf.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmi r0 = r0.zzb(r1)
            r0.zzg(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zziu
    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r0 = r1.zzg()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zziu
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zziu zzf() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r0 = r1.zzg()
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk zzg() {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r3.zzb
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.zzb(r1, r2, r2)
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk r0 = (com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk) r0
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = r3.zzj()
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_mediapipe.zzkk zzh(com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zzb
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L18
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zza
            boolean r0 = r0.zzH()
            if (r0 != 0) goto L13
            r1.zzo()
        L13:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zza
            zza(r0, r2)
        L18:
            return r1
    }

    public final MessageType zzi() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r2.zzj()
            r1 = 1
            boolean r1 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.zzG(r0, r1)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv r1 = new com.google.android.gms.internal.mlkit_vision_mediapipe.zzmv
            r1.<init>(r0)
            throw r1
    }

    public MessageType zzj() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zza
            boolean r0 = r0.zzH()
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zza
            return r0
        Lb:
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zza
            r0.zzC()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlv
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zzk() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zzi()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlv
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zzl() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlx
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_vision_mediapipe.zzlw zzm() {
            r1 = this;
            r0 = 0
            throw r0
    }

    protected final void zzn() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r1.zza
            boolean r0 = r0.zzH()
            if (r0 != 0) goto Lb
            r1.zzo()
        Lb:
            return
    }

    protected void zzo() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r2.zzb
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r0.zzt()
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r1 = r2.zza
            zza(r0, r1)
            r2.zza = r0
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_mediapipe.zzlx
    public final boolean zzp() {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr r0 = r2.zza
            r1 = 0
            boolean r0 = com.google.android.gms.internal.mlkit_vision_mediapipe.zzkr.zzG(r0, r1)
            return r0
    }
}
