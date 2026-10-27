package xyz.adscope.common.imageloader.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IImageLoader {
    void loadCacheImage(android.content.Context r1, java.lang.String r2, boolean r3, xyz.adscope.common.imageloader.inter.IImageLoaderCallback r4);

    void loadImage(android.content.Context r1, java.lang.String r2, xyz.adscope.common.imageloader.inter.IImageLoaderCallback r3);

    void loadImage(android.content.Context r1, java.lang.String r2, boolean r3, xyz.adscope.common.imageloader.inter.IImageLoaderCallback r4);

    void loadImage(android.widget.ImageView r1, java.lang.String r2);
}
