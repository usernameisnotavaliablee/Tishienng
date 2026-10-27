package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class StreamResetException extends java.io.IOException {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.http2.ErrorCode errorCode;

    public StreamResetException(@org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r3) {
            r2 = this;
            java.lang.String r0 = "errorCode"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stream was reset: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.errorCode = r3
            return
    }
}
