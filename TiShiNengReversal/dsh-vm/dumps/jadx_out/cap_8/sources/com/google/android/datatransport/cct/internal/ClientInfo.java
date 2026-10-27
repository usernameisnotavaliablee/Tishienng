package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class ClientInfo {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.ClientInfo build();

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.ClientInfo.Builder setAndroidClientInfo(@androidx.annotation.Nullable com.google.android.datatransport.cct.internal.AndroidClientInfo r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.ClientInfo.Builder setClientType(@androidx.annotation.Nullable com.google.android.datatransport.cct.internal.ClientInfo.ClientType r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ClientType extends java.lang.Enum<com.google.android.datatransport.cct.internal.ClientInfo.ClientType> {
        private static final /* synthetic */ com.google.android.datatransport.cct.internal.ClientInfo.ClientType[] $VALUES = null;
        public static final com.google.android.datatransport.cct.internal.ClientInfo.ClientType ANDROID_FIREBASE = null;
        public static final com.google.android.datatransport.cct.internal.ClientInfo.ClientType UNKNOWN = null;
        private final int value;

        static {
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r0 = new com.google.android.datatransport.cct.internal.ClientInfo$ClientType
                java.lang.String r1 = "UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.datatransport.cct.internal.ClientInfo.ClientType.UNKNOWN = r0
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = new com.google.android.datatransport.cct.internal.ClientInfo$ClientType
                r3 = 23
                java.lang.String r4 = "ANDROID_FIREBASE"
                r5 = 1
                r1.<init>(r4, r5, r3)
                com.google.android.datatransport.cct.internal.ClientInfo.ClientType.ANDROID_FIREBASE = r1
                r3 = 2
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType[] r3 = new com.google.android.datatransport.cct.internal.ClientInfo.ClientType[r3]
                r3[r2] = r0
                r3[r5] = r1
                com.google.android.datatransport.cct.internal.ClientInfo.ClientType.$VALUES = r3
                return
        }

        ClientType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static com.google.android.datatransport.cct.internal.ClientInfo.ClientType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.datatransport.cct.internal.ClientInfo$ClientType> r0 = com.google.android.datatransport.cct.internal.ClientInfo.ClientType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType r1 = (com.google.android.datatransport.cct.internal.ClientInfo.ClientType) r1
                return r1
        }

        public static com.google.android.datatransport.cct.internal.ClientInfo.ClientType[] values() {
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType[] r0 = com.google.android.datatransport.cct.internal.ClientInfo.ClientType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.datatransport.cct.internal.ClientInfo$ClientType[] r0 = (com.google.android.datatransport.cct.internal.ClientInfo.ClientType[]) r0
                return r0
        }
    }

    public ClientInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.datatransport.cct.internal.ClientInfo.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_ClientInfo$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_ClientInfo$Builder
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo getAndroidClientInfo();

    @androidx.annotation.Nullable
    public abstract com.google.android.datatransport.cct.internal.ClientInfo.ClientType getClientType();
}
