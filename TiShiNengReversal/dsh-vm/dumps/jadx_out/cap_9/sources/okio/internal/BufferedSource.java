package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-BufferedSource")
/* renamed from: okio.internal.-BufferedSource, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class BufferedSource {
    public BufferedSource() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> T commonSelect(@org.jetbrains.annotations.NotNull okio.BufferedSource r1, @org.jetbrains.annotations.NotNull okio.TypedOptions<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r2, r0)
            okio.Options r0 = r2.getOptions$okio()
            int r1 = r1.select(r0)
            r0 = -1
            if (r1 != r0) goto L17
            r1 = 0
            return r1
        L17:
            java.lang.Object r1 = r2.get(r1)
            return r1
    }
}
