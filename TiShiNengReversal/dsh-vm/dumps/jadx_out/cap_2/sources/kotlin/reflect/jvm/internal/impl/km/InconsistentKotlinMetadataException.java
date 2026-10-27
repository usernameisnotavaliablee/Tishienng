package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class InconsistentKotlinMetadataException extends java.lang.IllegalArgumentException {
    public InconsistentKotlinMetadataException(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "message"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2, r3)
            return
    }

    public /* synthetic */ InconsistentKotlinMetadataException(java.lang.String r1, java.lang.Throwable r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }
}
