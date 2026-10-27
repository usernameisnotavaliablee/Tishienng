package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PickVisualMediaRequest {

    @org.jetbrains.annotations.NotNull
    private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Builder {

        @org.jetbrains.annotations.NotNull
        private androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType;

        public Builder() {
                r1 = this;
                r1.<init>()
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
                r1.mediaType = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.activity.result.PickVisualMediaRequest build() {
                r2 = this;
                androidx.activity.result.PickVisualMediaRequest r0 = new androidx.activity.result.PickVisualMediaRequest
                r0.<init>()
                androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r1 = r2.mediaType
                r0.setMediaType$activity_release(r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.activity.result.PickVisualMediaRequest.Builder setMediaType(@org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
                r1 = this;
                java.lang.String r0 = "mediaType"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.mediaType = r2
                return r1
        }
    }

    public PickVisualMediaRequest() {
            r1 = this;
            r1.<init>()
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
            r1.mediaType = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
            r1 = this;
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType r0 = r1.mediaType
            return r0
    }

    public final void setMediaType$activity_release(@org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.mediaType = r2
            return
    }
}
