package com.google.research.xeno.effect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class AssetRegistry {
    private final long zza;

    public AssetRegistry() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public AssetRegistry(@javax.annotation.Nullable java.util.Map r5) {
            r4 = this;
            r4.<init>()
            long r0 = r4.nativeCreateAssetRegistry()
            r4.zza = r0
            if (r5 == 0) goto L31
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            long r2 = r4.zza
            r4.nativeRegisterAsset(r2, r1, r0)
            goto L13
        L31:
            return
    }

    private native long nativeCreateAssetRegistry();

    private native void nativeRegisterAsset(long r1, java.lang.String r3, java.lang.String r4);

    public final long zza() {
            r2 = this;
            long r0 = r2.zza
            return r0
    }
}
