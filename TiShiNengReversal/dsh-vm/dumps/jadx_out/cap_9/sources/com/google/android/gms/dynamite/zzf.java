package com.google.android.gms.dynamite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzf implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r4, java.lang.String r5, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r6) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r3 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            r1 = 1
            int r2 = r6.zzb(r4, r5, r1)
            r0.remoteVersion = r2
            if (r2 == 0) goto L11
            r0.selection = r1
            return r0
        L11:
            int r4 = r6.zza(r4, r5)
            r0.localVersion = r4
            if (r4 == 0) goto L1c
            r4 = -1
            r0.selection = r4
        L1c:
            return r0
    }
}
