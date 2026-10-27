package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum ErrorCode extends java.lang.Enum<okhttp3.internal.http2.ErrorCode> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ okhttp3.internal.http2.ErrorCode[] $VALUES = null;
    public static final okhttp3.internal.http2.ErrorCode CANCEL = null;
    public static final okhttp3.internal.http2.ErrorCode COMPRESSION_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode CONNECT_ERROR = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.ErrorCode.Companion Companion = null;
    public static final okhttp3.internal.http2.ErrorCode ENHANCE_YOUR_CALM = null;
    public static final okhttp3.internal.http2.ErrorCode FLOW_CONTROL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode FRAME_SIZE_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode HTTP_1_1_REQUIRED = null;
    public static final okhttp3.internal.http2.ErrorCode INADEQUATE_SECURITY = null;
    public static final okhttp3.internal.http2.ErrorCode INTERNAL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode NO_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode PROTOCOL_ERROR = null;
    public static final okhttp3.internal.http2.ErrorCode REFUSED_STREAM = null;
    public static final okhttp3.internal.http2.ErrorCode SETTINGS_TIMEOUT = null;
    public static final okhttp3.internal.http2.ErrorCode STREAM_CLOSED = null;
    private final int httpCode;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nErrorCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorCode.kt\nokhttp3/internal/http2/ErrorCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
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

        @org.jetbrains.annotations.Nullable
        public final okhttp3.internal.http2.ErrorCode fromHttp2(int r6) {
                r5 = this;
                okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L14
                r3 = r0[r2]
                int r4 = r3.getHttpCode()
                if (r4 != r6) goto L11
                return r3
            L11:
                int r2 = r2 + 1
                goto L6
            L14:
                r6 = 0
                return r6
        }
    }

    private static final /* synthetic */ okhttp3.internal.http2.ErrorCode[] $values() {
            r0 = 14
            okhttp3.internal.http2.ErrorCode[] r0 = new okhttp3.internal.http2.ErrorCode[r0]
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.NO_ERROR
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
            r2 = 1
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
            r2 = 2
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
            r2 = 3
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.SETTINGS_TIMEOUT
            r2 = 4
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.STREAM_CLOSED
            r2 = 5
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.FRAME_SIZE_ERROR
            r2 = 6
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            r2 = 7
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL
            r2 = 8
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.COMPRESSION_ERROR
            r2 = 9
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CONNECT_ERROR
            r2 = 10
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.ENHANCE_YOUR_CALM
            r2 = 11
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.INADEQUATE_SECURITY
            r2 = 12
            r0[r2] = r1
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.HTTP_1_1_REQUIRED
            r2 = 13
            r0[r2] = r1
            return r0
    }

    static {
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "NO_ERROR"
            r2 = 0
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.NO_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "PROTOCOL_ERROR"
            r2 = 1
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "INTERNAL_ERROR"
            r2 = 2
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "FLOW_CONTROL_ERROR"
            r2 = 3
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "SETTINGS_TIMEOUT"
            r2 = 4
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.SETTINGS_TIMEOUT = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "STREAM_CLOSED"
            r2 = 5
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.STREAM_CLOSED = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "FRAME_SIZE_ERROR"
            r2 = 6
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.FRAME_SIZE_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "REFUSED_STREAM"
            r2 = 7
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.REFUSED_STREAM = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "CANCEL"
            r2 = 8
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.CANCEL = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "COMPRESSION_ERROR"
            r2 = 9
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.COMPRESSION_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "CONNECT_ERROR"
            r2 = 10
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.CONNECT_ERROR = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "ENHANCE_YOUR_CALM"
            r2 = 11
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.ENHANCE_YOUR_CALM = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "INADEQUATE_SECURITY"
            r2 = 12
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.INADEQUATE_SECURITY = r0
            okhttp3.internal.http2.ErrorCode r0 = new okhttp3.internal.http2.ErrorCode
            java.lang.String r1 = "HTTP_1_1_REQUIRED"
            r2 = 13
            r0.<init>(r1, r2, r2)
            okhttp3.internal.http2.ErrorCode.HTTP_1_1_REQUIRED = r0
            okhttp3.internal.http2.ErrorCode[] r0 = $values()
            okhttp3.internal.http2.ErrorCode.$VALUES = r0
            kotlin.enums.a r0 = kotlin.enums.c.c(r0)
            okhttp3.internal.http2.ErrorCode.$ENTRIES = r0
            okhttp3.internal.http2.ErrorCode$Companion r0 = new okhttp3.internal.http2.ErrorCode$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http2.ErrorCode.Companion = r0
            return
    }

    ErrorCode(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.httpCode = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.a<okhttp3.internal.http2.ErrorCode> getEntries() {
            kotlin.enums.a r0 = okhttp3.internal.http2.ErrorCode.$ENTRIES
            return r0
    }

    public static okhttp3.internal.http2.ErrorCode valueOf(java.lang.String r1) {
            java.lang.Class<okhttp3.internal.http2.ErrorCode> r0 = okhttp3.internal.http2.ErrorCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            okhttp3.internal.http2.ErrorCode r1 = (okhttp3.internal.http2.ErrorCode) r1
            return r1
    }

    public static okhttp3.internal.http2.ErrorCode[] values() {
            okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.$VALUES
            java.lang.Object r0 = r0.clone()
            okhttp3.internal.http2.ErrorCode[] r0 = (okhttp3.internal.http2.ErrorCode[]) r0
            return r0
    }

    public final int getHttpCode() {
            r1 = this;
            int r0 = r1.httpCode
            return r0
    }
}
