package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.auto.value.AutoValue
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class AndroidClientInfo {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo build();

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setApplicationBuild(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setCountry(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setDevice(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setFingerprint(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setHardware(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setLocale(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setManufacturer(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setMccMnc(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setModel(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setOsBuild(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setProduct(@androidx.annotation.Nullable java.lang.String r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder setSdkVersion(@androidx.annotation.Nullable java.lang.Integer r1);
    }

    public AndroidClientInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder builder() {
            com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo$Builder r0 = new com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo$Builder
            r0.<init>()
            return r0
    }

    @androidx.annotation.Nullable
    public abstract java.lang.String getApplicationBuild();

    @androidx.annotation.Nullable
    public abstract java.lang.String getCountry();

    @androidx.annotation.Nullable
    public abstract java.lang.String getDevice();

    @androidx.annotation.Nullable
    public abstract java.lang.String getFingerprint();

    @androidx.annotation.Nullable
    public abstract java.lang.String getHardware();

    @androidx.annotation.Nullable
    public abstract java.lang.String getLocale();

    @androidx.annotation.Nullable
    public abstract java.lang.String getManufacturer();

    @androidx.annotation.Nullable
    public abstract java.lang.String getMccMnc();

    @androidx.annotation.Nullable
    public abstract java.lang.String getModel();

    @androidx.annotation.Nullable
    public abstract java.lang.String getOsBuild();

    @androidx.annotation.Nullable
    public abstract java.lang.String getProduct();

    @androidx.annotation.Nullable
    public abstract java.lang.Integer getSdkVersion();
}
