package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-DeflaterSinkExtensions")
/* renamed from: okio.-DeflaterSinkExtensions, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DeflaterSinkExtensions {
    public DeflaterSinkExtensions() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.DeflaterSink deflate(@org.jetbrains.annotations.NotNull okio.Sink r1, @org.jetbrains.annotations.NotNull java.util.zip.Deflater r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "deflater"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.DeflaterSink r0 = new okio.DeflaterSink
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ okio.DeflaterSink deflate$default(okio.Sink r0, java.util.zip.Deflater r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L9
            java.util.zip.Deflater r1 = new java.util.zip.Deflater
            r1.<init>()
        L9:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            java.lang.String r2 = "deflater"
            kotlin.jvm.internal.g0.p(r1, r2)
            okio.DeflaterSink r2 = new okio.DeflaterSink
            r2.<init>(r0, r1)
            return r2
    }
}
