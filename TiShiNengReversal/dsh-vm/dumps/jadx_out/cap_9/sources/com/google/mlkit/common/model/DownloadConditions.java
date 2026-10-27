package com.google.mlkit.common.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DownloadConditions {
    private final boolean zza;
    private final boolean zzb;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private boolean zza;
        private boolean zzb;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.zza = r0
                r1.zzb = r0
                return
        }

        @androidx.annotation.NonNull
        public com.google.mlkit.common.model.DownloadConditions build() {
                r4 = this;
                com.google.mlkit.common.model.DownloadConditions r0 = new com.google.mlkit.common.model.DownloadConditions
                boolean r1 = r4.zza
                boolean r2 = r4.zzb
                r3 = 0
                r0.<init>(r1, r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RequiresApi(24)
        @android.annotation.TargetApi(24)
        public com.google.mlkit.common.model.DownloadConditions.Builder requireCharging() {
                r1 = this;
                r0 = 1
                r1.zza = r0
                return r1
        }

        @androidx.annotation.NonNull
        public com.google.mlkit.common.model.DownloadConditions.Builder requireWifi() {
                r1 = this;
                r0 = 1
                r1.zzb = r0
                return r1
        }
    }

    /* synthetic */ DownloadConditions(boolean r1, boolean r2, com.google.mlkit.common.model.zzb r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.common.model.DownloadConditions
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.mlkit.common.model.DownloadConditions r5 = (com.google.mlkit.common.model.DownloadConditions) r5
            boolean r1 = r4.zza
            boolean r3 = r5.zza
            if (r1 != r3) goto L19
            boolean r1 = r4.zzb
            boolean r5 = r5.zzb
            if (r1 != r5) goto L19
            return r0
        L19:
            return r2
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.zza
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r4.zzb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r0
    }

    public boolean isChargingRequired() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    public boolean isWifiRequired() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
