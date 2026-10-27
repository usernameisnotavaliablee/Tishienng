package xyz.adscope.common.v2.image.loader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ImageLoader {



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.image.loader.ImageLoader instance;

        static {
                xyz.adscope.common.v2.image.loader.ImageLoader r0 = new xyz.adscope.common.v2.image.loader.ImageLoader
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.image.loader.ImageLoader.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.image.loader.ImageLoader access$100() {
                xyz.adscope.common.v2.image.loader.ImageLoader r0 = xyz.adscope.common.v2.image.loader.ImageLoader.InstanceHolder.instance
                return r0
        }
    }

    private ImageLoader() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.image.loader.ImageLoader r0 = xyz.adscope.common.v2.image.loader.ImageLoader.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ ImageLoader(xyz.adscope.common.v2.image.loader.ImageLoader.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static xyz.adscope.common.v2.image.loader.ImageLoader getInstance() {
            xyz.adscope.common.v2.image.loader.ImageLoader r0 = xyz.adscope.common.v2.image.loader.ImageLoader.InstanceHolder.access$100()
            return r0
    }

    public void loadMainImage(android.widget.ImageView r4, java.lang.String r5, boolean r6, xyz.adscope.common.v2.image.loader.IImageFillResult r7) {
            r3 = this;
            if (r4 == 0) goto L19
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L19
            xyz.adscope.common.v2.image.loader.BitmapHolder r0 = xyz.adscope.common.v2.image.loader.BitmapHolder.getInstance()
            android.content.Context r1 = r4.getContext()
            xyz.adscope.common.v2.image.loader.ImageLoader$2 r2 = new xyz.adscope.common.v2.image.loader.ImageLoader$2
            r2.<init>(r3, r4, r6, r7)
            r4 = 1
            r0.loadImage(r1, r5, r4, r2)
        L19:
            return
    }

    public void loadPermanentImage(android.widget.ImageView r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.loadPermanentImage(r2, r3, r4, r0)
            return
    }

    public void loadPermanentImage(android.widget.ImageView r4, java.lang.String r5, boolean r6, xyz.adscope.common.v2.image.loader.IImageFillResult r7) {
            r3 = this;
            if (r4 == 0) goto L18
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L18
            xyz.adscope.common.v2.image.loader.BitmapHolder r0 = xyz.adscope.common.v2.image.loader.BitmapHolder.getInstance()
            android.content.Context r1 = r4.getContext()
            xyz.adscope.common.v2.image.loader.ImageLoader$1 r2 = new xyz.adscope.common.v2.image.loader.ImageLoader$1
            r2.<init>(r3, r4, r7)
            r0.loadImage(r1, r5, r6, r2)
        L18:
            return
    }
}
