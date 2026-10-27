package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class BufferedSocketKt {
    public BufferedSocketKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.BufferedSocket asBufferedSocket(@org.jetbrains.annotations.NotNull java.net.Socket r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.Socket r1 = okio.Okio.socket(r1)
            okhttp3.internal.connection.BufferedSocket r1 = asBufferedSocket(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.BufferedSocket asBufferedSocket(@org.jetbrains.annotations.NotNull okio.Socket r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1 r0 = new okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1
            r0.<init>(r1)
            return r0
    }
}
