package com.google.android.gms.internal.mlkit_acceleration;

import com.google.android.gms.internal.mlkit_acceleration.zzdr;
import com.google.android.gms.internal.mlkit_acceleration.zzdv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class zzdr<MessageType extends com.google.android.gms.internal.mlkit_acceleration.zzdv<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.mlkit_acceleration.zzdr<MessageType, BuilderType>> extends com.google.android.gms.internal.mlkit_acceleration.zzcb<MessageType, BuilderType> {
    protected com.google.android.gms.internal.mlkit_acceleration.zzdv zza;
    private final com.google.android.gms.internal.mlkit_acceleration.zzdv zzb;

    protected zzdr(MessageType r2) {
            r1 = this;
            r1.<init>()
            r1.zzb = r2
            boolean r0 = r2.zzO()
            if (r0 != 0) goto L12
            com.google.android.gms.internal.mlkit_acceleration.zzdv r2 = r2.zzB()
            r1.zza = r2
            return
        L12:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Default instance must be immutable."
            r2.<init>(r0)
            throw r2
    }

    private static void zza(java.lang.Object r2, java.lang.Object r3) {
            com.google.android.gms.internal.mlkit_acceleration.zzfi r0 = com.google.android.gms.internal.mlkit_acceleration.zzfi.zza()
            java.lang.Class r1 = r2.getClass()
            com.google.android.gms.internal.mlkit_acceleration.zzfm r0 = r0.zzb(r1)
            r0.zzg(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcb
    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdr r0 = r1.zzj()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzfb
    public final /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzfa zzP() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzcb
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzcb zzi() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdr r0 = r1.zzj()
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzdr zzj() {
            r3 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r3.zzb
            r1 = 5
            r2 = 0
            java.lang.Object r0 = r0.zzo(r1, r2, r2)
            com.google.android.gms.internal.mlkit_acceleration.zzdr r0 = (com.google.android.gms.internal.mlkit_acceleration.zzdr) r0
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = r3.zzm()
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.mlkit_acceleration.zzdr zzk(com.google.android.gms.internal.mlkit_acceleration.zzdv r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zzb
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L18
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zza
            boolean r0 = r0.zzO()
            if (r0 != 0) goto L13
            r1.zzq()
        L13:
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zza
            zza(r0, r2)
        L18:
            return r1
    }

    public final MessageType zzl() {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r2.zzm()
            boolean r1 = r0.zzN()
            if (r1 == 0) goto Lb
            return r0
        Lb:
            com.google.android.gms.internal.mlkit_acceleration.zzgc r1 = new com.google.android.gms.internal.mlkit_acceleration.zzgc
            r1.<init>(r0)
            throw r1
    }

    public MessageType zzm() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zza
            boolean r0 = r0.zzO()
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zza
            return r0
        Lb:
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zza
            r0.zzI()
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_acceleration.zzez
    public /* bridge */ /* synthetic */ com.google.android.gms.internal.mlkit_acceleration.zzfa zzn() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zzm()
            return r0
    }

    protected final void zzp() {
            r1 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r1.zza
            boolean r0 = r0.zzO()
            if (r0 != 0) goto Lb
            r1.zzq()
        Lb:
            return
    }

    protected void zzq() {
            r2 = this;
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r2.zzb
            com.google.android.gms.internal.mlkit_acceleration.zzdv r0 = r0.zzB()
            com.google.android.gms.internal.mlkit_acceleration.zzdv r1 = r2.zza
            zza(r0, r1)
            r2.zza = r0
            return
    }
}
