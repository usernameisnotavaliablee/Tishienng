package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(message = "changed in Okio 2.x")
/* renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class DeprecatedUtf8 {

    @org.jetbrains.annotations.NotNull
    public static final okio.DeprecatedUtf8 INSTANCE = null;

    static {
            okio.-DeprecatedUtf8 r0 = new okio.-DeprecatedUtf8
            r0.<init>()
            okio.DeprecatedUtf8.INSTANCE = r0
            return
    }

    private DeprecatedUtf8() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long size(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 3
            r1 = 0
            r2 = 0
            long r0 = okio.Utf8.size$default(r4, r2, r2, r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @kotlin.ReplaceWith(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long size(@org.jetbrains.annotations.NotNull java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r2 = okio.Utf8.size(r2, r3, r4)
            return r2
    }
}
