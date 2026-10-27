package com.google.android.gms.dynamite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzi implements com.google.android.gms.dynamite.DynamiteModule.VersionPolicy {
    zzi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.SelectionResult selectModule(android.content.Context r3, java.lang.String r4, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions r5) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
            r2 = this;
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult
            r0.<init>()
            int r1 = r5.zza(r3, r4)
            r0.localVersion = r1
            r1 = 1
            int r3 = r5.zzb(r3, r4, r1)
            r0.remoteVersion = r3
            int r4 = r0.localVersion
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = 0
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.selection = r1
            return r0
    }
}
