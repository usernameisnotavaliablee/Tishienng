package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class _NormalizeJvmKt {
    public _NormalizeJvmKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String normalizeNfc(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.text.Normalizer$Form r0 = java.text.Normalizer.Form.NFC
            java.lang.String r1 = java.text.Normalizer.normalize(r1, r0)
            java.lang.String r0 = "normalize(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }
}
