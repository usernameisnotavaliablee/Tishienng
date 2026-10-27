package com.google.android.gms.internal.mlkit_common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class zzd extends com.google.android.gms.internal.mlkit_common.zzk {
    zzd() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzk
    protected final int zza(android.content.Context r1, com.google.android.gms.internal.mlkit_common.zzj r2, boolean r3) {
            r0 = this;
            android.net.Uri r2 = r2.zza
            java.lang.String r2 = r2.getAuthority()
            r3 = 64
            int r2 = r2.lastIndexOf(r3)
            if (r2 < 0) goto L18
            java.lang.String r2 = "android.permission.INTERACT_ACROSS_USERS"
            int r1 = androidx.core.content.PermissionChecker.checkSelfPermission(r1, r2)
            if (r1 != 0) goto L18
            r1 = 2
            return r1
        L18:
            r1 = 3
            return r1
    }
}
