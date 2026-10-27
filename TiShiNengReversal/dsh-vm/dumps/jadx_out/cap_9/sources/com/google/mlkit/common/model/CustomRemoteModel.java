package com.google.mlkit.common.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class CustomRemoteModel extends com.google.mlkit.common.model.RemoteModel {
    private final com.google.mlkit.common.model.RemoteModelSource zzb;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {

        @androidx.annotation.NonNull
        private final com.google.mlkit.common.model.RemoteModelSource zza;

        public Builder(@androidx.annotation.NonNull com.google.mlkit.common.model.RemoteModelSource r1) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                r0.zza = r1
                return
        }

        @androidx.annotation.NonNull
        public com.google.mlkit.common.model.CustomRemoteModel build() {
                r3 = this;
                com.google.mlkit.common.model.CustomRemoteModel r0 = new com.google.mlkit.common.model.CustomRemoteModel
                com.google.mlkit.common.model.RemoteModelSource r1 = r3.zza
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* synthetic */ CustomRemoteModel(com.google.mlkit.common.model.RemoteModelSource r3, com.google.mlkit.common.model.zza r4) {
            r2 = this;
            java.lang.String r4 = r3.zza()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto Ld
            java.lang.String r4 = "no_model_name"
            goto L11
        Ld:
            java.lang.String r4 = r3.zza()
        L11:
            r0 = 0
            com.google.mlkit.common.sdkinternal.ModelType r1 = com.google.mlkit.common.sdkinternal.ModelType.CUSTOM
            r2.<init>(r4, r0, r1)
            r2.zzb = r3
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.mlkit.common.model.RemoteModelSource getRemoteModelSource() {
            r1 = this;
            com.google.mlkit.common.model.RemoteModelSource r0 = r1.zzb
            return r0
    }
}
