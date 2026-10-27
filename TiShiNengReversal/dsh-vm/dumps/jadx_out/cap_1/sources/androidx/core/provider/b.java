package androidx.core.provider;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final /* synthetic */ class b {
    public static androidx.core.provider.FontProvider.ContentQueryWrapper a(android.content.Context r2, android.net.Uri r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto Lc
            androidx.core.provider.FontProvider$ContentQueryWrapperApi16Impl r0 = new androidx.core.provider.FontProvider$ContentQueryWrapperApi16Impl
            r0.<init>(r2, r3)
            return r0
        Lc:
            androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl r0 = new androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl
            r0.<init>(r2, r3)
            return r0
    }
}
