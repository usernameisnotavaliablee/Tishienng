package com.google.android.gms.dynamite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zze implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions {
    zze() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zza(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            int r1 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int zzb(android.content.Context r1, java.lang.String r2, boolean r3) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r0 = this;
            int r1 = com.google.android.gms.dynamite.DynamiteModule.zza(r1, r2, r3)
            return r1
    }
}
