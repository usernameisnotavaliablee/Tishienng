package okhttp3.internal.http1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class HeadersReader {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http1.HeadersReader.Companion Companion = null;
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http1.HeadersReader$Companion r0 = new okhttp3.internal.http1.HeadersReader$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http1.HeadersReader.Companion = r0
            return
    }

    public HeadersReader(@org.jetbrains.annotations.NotNull okio.BufferedSource r3) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.source = r3
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.headerLimit = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final okio.BufferedSource getSource() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.Headers readHeaders() {
            r3 = this;
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
        L5:
            java.lang.String r1 = r3.readLine()
            int r2 = r1.length()
            if (r2 != 0) goto L14
            okhttp3.Headers r0 = r0.build()
            return r0
        L14:
            r0.addLenient$okhttp(r1)
            goto L5
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String readLine() {
            r5 = this;
            okio.BufferedSource r0 = r5.source
            long r1 = r5.headerLimit
            java.lang.String r0 = r0.readUtf8LineStrict(r1)
            long r1 = r5.headerLimit
            int r3 = r0.length()
            long r3 = (long) r3
            long r1 = r1 - r3
            r5.headerLimit = r1
            return r0
    }
}
