package androidx.activity.result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PickVisualMediaRequestKt {
    @org.jetbrains.annotations.NotNull
    public static final androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(@org.jetbrains.annotations.NotNull androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r1) {
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.g0.p(r1, r0)
            androidx.activity.result.PickVisualMediaRequest$Builder r0 = new androidx.activity.result.PickVisualMediaRequest$Builder
            r0.<init>()
            androidx.activity.result.PickVisualMediaRequest$Builder r1 = r0.setMediaType(r1)
            androidx.activity.result.PickVisualMediaRequest r1 = r1.build()
            return r1
    }

    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L6
            androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo r0 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE
        L6:
            androidx.activity.result.PickVisualMediaRequest r0 = PickVisualMediaRequest(r0)
            return r0
    }
}
