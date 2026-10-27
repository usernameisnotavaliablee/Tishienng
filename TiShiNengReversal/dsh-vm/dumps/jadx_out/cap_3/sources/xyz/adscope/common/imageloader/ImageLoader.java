package xyz.adscope.common.imageloader;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ImageLoader implements xyz.adscope.common.imageloader.inter.IImageLoader {




    public ImageLoader() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xyz.adscope.common.imageloader.inter.IImageLoader
    public void loadCacheImage(android.content.Context r3, java.lang.String r4, boolean r5, xyz.adscope.common.imageloader.inter.IImageLoaderCallback r6) {
            r2 = this;
            xyz.adscope.common.imageloader.ImageUtils r0 = xyz.adscope.common.imageloader.ImageUtils.with()
            xyz.adscope.common.imageloader.ImageLoader$3 r1 = new xyz.adscope.common.imageloader.ImageLoader$3
            r1.<init>(r2, r6, r3)
            r0.getCacheBitmap(r3, r4, r5, r1)
            return
    }

    @Override // xyz.adscope.common.imageloader.inter.IImageLoader
    public void loadImage(android.content.Context r3, java.lang.String r4, xyz.adscope.common.imageloader.inter.IImageLoaderCallback r5) {
            r2 = this;
            xyz.adscope.common.imageloader.ImageUtils r0 = xyz.adscope.common.imageloader.ImageUtils.with()
            xyz.adscope.common.imageloader.ImageLoader$1 r1 = new xyz.adscope.common.imageloader.ImageLoader$1
            r1.<init>(r2, r5, r3)
            r0.getBitmap(r3, r4, r1)
            return
    }

    @Override // xyz.adscope.common.imageloader.inter.IImageLoader
    public void loadImage(android.content.Context r3, java.lang.String r4, boolean r5, xyz.adscope.common.imageloader.inter.IImageLoaderCallback r6) {
            r2 = this;
            xyz.adscope.common.imageloader.ImageUtils r0 = xyz.adscope.common.imageloader.ImageUtils.with()
            xyz.adscope.common.imageloader.ImageLoader$2 r1 = new xyz.adscope.common.imageloader.ImageLoader$2
            r1.<init>(r2, r6, r3)
            r0.getBitmap(r3, r4, r5, r1)
            return
    }

    @Override // xyz.adscope.common.imageloader.inter.IImageLoader
    public void loadImage(android.widget.ImageView r2, java.lang.String r3) {
            r1 = this;
            xyz.adscope.common.imageloader.ImageUtils r0 = xyz.adscope.common.imageloader.ImageUtils.with()
            xyz.adscope.common.imageloader.ImageUtils$RequestCreatorRunnble r3 = r0.load(r3)
            r3.into(r2)
            return
    }
}
