package com.kwad.components.core.internal.api;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d implements com.kwad.sdk.api.KsImage {
    private int height;
    private java.lang.String imageUrl;
    private int width;

    public d(int r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.width = r1
            r0.height = r2
            r0.imageUrl = r3
            return
    }

    @com.ksad.annotation.invoker.InvokeBy(invokerClass = com.kwad.sdk.service.c.class, methodId = "initModeImplForInvoker")
    public static void register() {
            java.lang.Class<com.kwad.sdk.api.KsImage> r0 = com.kwad.sdk.api.KsImage.class
            java.lang.Class<com.kwad.components.core.internal.api.d> r1 = com.kwad.components.core.internal.api.d.class
            com.kwad.sdk.service.c.b(r0, r1)
            return
    }

    @Override // com.kwad.sdk.api.KsImage
    public int getHeight() {
            r1 = this;
            int r0 = r1.height
            return r0
    }

    @Override // com.kwad.sdk.api.KsImage
    public java.lang.String getImageUrl() {
            r1 = this;
            java.lang.String r0 = r1.imageUrl
            return r0
    }

    @Override // com.kwad.sdk.api.KsImage
    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    @Override // com.kwad.sdk.api.KsImage
    public boolean isValid() {
            r1 = this;
            int r0 = r1.width
            if (r0 <= 0) goto L12
            int r0 = r1.height
            if (r0 <= 0) goto L12
            java.lang.String r0 = r1.imageUrl
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }
}
