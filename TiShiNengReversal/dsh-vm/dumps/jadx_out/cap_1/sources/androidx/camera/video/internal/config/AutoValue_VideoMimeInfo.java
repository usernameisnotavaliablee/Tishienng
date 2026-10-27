package androidx.camera.video.internal.config;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AutoValue_VideoMimeInfo extends androidx.camera.video.internal.config.VideoMimeInfo {
    private final androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
    private final java.lang.String mimeType;
    private final int profile;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: androidx.camera.video.internal.config.AutoValue_VideoMimeInfo$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends androidx.camera.video.internal.config.VideoMimeInfo.Builder {
        private androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy compatibleVideoProfile;
        private java.lang.String mimeType;
        private java.lang.Integer profile;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public /* bridge */ /* synthetic */ androidx.camera.video.internal.config.MimeInfo build() {
                r1 = this;
                androidx.camera.video.internal.config.VideoMimeInfo r0 = r1.build()
                return r0
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public androidx.camera.video.internal.config.VideoMimeInfo build() {
                r5 = this;
                java.lang.String r0 = r5.mimeType
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " mimeType"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Integer r0 = r5.profile
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " profile"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L43
                androidx.camera.video.internal.config.AutoValue_VideoMimeInfo r0 = new androidx.camera.video.internal.config.AutoValue_VideoMimeInfo
                java.lang.String r1 = r5.mimeType
                java.lang.Integer r2 = r5.profile
                int r2 = r2.intValue()
                androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r3 = r5.compatibleVideoProfile
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                return r0
            L43:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // androidx.camera.video.internal.config.VideoMimeInfo.Builder
        public androidx.camera.video.internal.config.VideoMimeInfo.Builder setCompatibleVideoProfile(@androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r1) {
                r0 = this;
                r0.compatibleVideoProfile = r1
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        protected androidx.camera.video.internal.config.VideoMimeInfo.Builder setMimeType(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.mimeType = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null mimeType"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        protected /* bridge */ /* synthetic */ androidx.camera.video.internal.config.VideoMimeInfo.Builder setMimeType(java.lang.String r1) {
                r0 = this;
                androidx.camera.video.internal.config.VideoMimeInfo$Builder r1 = r0.setMimeType(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public androidx.camera.video.internal.config.VideoMimeInfo.Builder setProfile(int r1) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.profile = r1
                return r0
        }

        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public /* bridge */ /* synthetic */ androidx.camera.video.internal.config.VideoMimeInfo.Builder setProfile(int r1) {
                r0 = this;
                androidx.camera.video.internal.config.VideoMimeInfo$Builder r1 = r0.setProfile(r1)
                return r1
        }
    }

    private AutoValue_VideoMimeInfo(java.lang.String r1, int r2, @androidx.annotation.Nullable androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r3) {
            r0 = this;
            r0.<init>()
            r0.mimeType = r1
            r0.profile = r2
            r0.compatibleVideoProfile = r3
            return
    }

    /* synthetic */ AutoValue_VideoMimeInfo(java.lang.String r1, int r2, androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy r3, androidx.camera.video.internal.config.AutoValue_VideoMimeInfo.AnonymousClass1 r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof androidx.camera.video.internal.config.VideoMimeInfo
            r2 = 0
            if (r1 == 0) goto L35
            androidx.camera.video.internal.config.VideoMimeInfo r5 = (androidx.camera.video.internal.config.VideoMimeInfo) r5
            java.lang.String r1 = r4.mimeType
            java.lang.String r3 = r5.getMimeType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            int r1 = r4.profile
            int r3 = r5.getProfile()
            if (r1 != r3) goto L35
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = r4.compatibleVideoProfile
            if (r1 != 0) goto L2a
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r5 = r5.getCompatibleVideoProfile()
            if (r5 != 0) goto L35
            goto L34
        L2a:
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r5 = r5.getCompatibleVideoProfile()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L35
        L34:
            return r0
        L35:
            return r2
    }

    @Override // androidx.camera.video.internal.config.VideoMimeInfo
    @androidx.annotation.Nullable
    public androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile() {
            r1 = this;
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r0 = r1.compatibleVideoProfile
            return r0
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    @androidx.annotation.NonNull
    public java.lang.String getMimeType() {
            r1 = this;
            java.lang.String r0 = r1.mimeType
            return r0
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
            r1 = this;
            int r0 = r1.profile
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.mimeType
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.profile
            r0 = r0 ^ r2
            int r0 = r0 * r1
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = r3.compatibleVideoProfile
            if (r1 != 0) goto L17
            r1 = 0
            goto L1b
        L17:
            int r1 = r1.hashCode()
        L1b:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "VideoMimeInfo{mimeType="
            r0.append(r1)
            java.lang.String r1 = r2.mimeType
            r0.append(r1)
            java.lang.String r1 = ", profile="
            r0.append(r1)
            int r1 = r2.profile
            r0.append(r1)
            java.lang.String r1 = ", compatibleVideoProfile="
            r0.append(r1)
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r1 = r2.compatibleVideoProfile
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
