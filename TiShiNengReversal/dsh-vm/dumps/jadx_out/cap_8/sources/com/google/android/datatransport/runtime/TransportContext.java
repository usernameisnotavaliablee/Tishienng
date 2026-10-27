package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class TransportContext {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.runtime.TransportContext build();

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setBackendName(java.lang.String r1);

        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setExtras(@androidx.annotation.Nullable byte[] r1);

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public abstract com.google.android.datatransport.runtime.TransportContext.Builder setPriority(com.google.android.datatransport.Priority r1);
    }

    public TransportContext() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.TransportContext.Builder builder() {
            com.google.android.datatransport.runtime.AutoValue_TransportContext$Builder r0 = new com.google.android.datatransport.runtime.AutoValue_TransportContext$Builder
            r0.<init>()
            com.google.android.datatransport.Priority r1 = com.google.android.datatransport.Priority.DEFAULT
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = r0.setPriority(r1)
            return r0
    }

    public abstract java.lang.String getBackendName();

    @androidx.annotation.Nullable
    public abstract byte[] getExtras();

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public abstract com.google.android.datatransport.Priority getPriority();

    public final java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.getBackendName()
            com.google.android.datatransport.Priority r1 = r6.getPriority()
            byte[] r2 = r6.getExtras()
            r3 = 2
            if (r2 != 0) goto L12
            java.lang.String r2 = ""
            goto L1a
        L12:
            byte[] r2 = r6.getExtras()
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r3)
        L1a:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r4[r3] = r2
            java.lang.String r0 = "TransportContext(%s, %s, %s)"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public com.google.android.datatransport.runtime.TransportContext withPriority(com.google.android.datatransport.Priority r3) {
            r2 = this;
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = builder()
            java.lang.String r1 = r2.getBackendName()
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = r0.setBackendName(r1)
            com.google.android.datatransport.runtime.TransportContext$Builder r3 = r0.setPriority(r3)
            byte[] r0 = r2.getExtras()
            com.google.android.datatransport.runtime.TransportContext$Builder r3 = r3.setExtras(r0)
            com.google.android.datatransport.runtime.TransportContext r3 = r3.build()
            return r3
    }
}
