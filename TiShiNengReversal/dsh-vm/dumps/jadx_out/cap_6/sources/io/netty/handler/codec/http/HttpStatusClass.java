package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum HttpStatusClass extends java.lang.Enum<io.netty.handler.codec.http.HttpStatusClass> {
    private static final /* synthetic */ io.netty.handler.codec.http.HttpStatusClass[] $VALUES = null;
    public static final io.netty.handler.codec.http.HttpStatusClass CLIENT_ERROR = null;
    public static final io.netty.handler.codec.http.HttpStatusClass INFORMATIONAL = null;
    public static final io.netty.handler.codec.http.HttpStatusClass REDIRECTION = null;
    public static final io.netty.handler.codec.http.HttpStatusClass SERVER_ERROR = null;
    public static final io.netty.handler.codec.http.HttpStatusClass SUCCESS = null;
    public static final io.netty.handler.codec.http.HttpStatusClass UNKNOWN = null;
    private final io.netty.util.AsciiString defaultReasonPhrase;
    private final int max;
    private final int min;


    static {
            io.netty.handler.codec.http.HttpStatusClass r0 = new io.netty.handler.codec.http.HttpStatusClass
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.String r5 = "Informational"
            java.lang.String r1 = "INFORMATIONAL"
            r2 = 0
            r3 = 100
            r0.<init>(r1, r2, r3, r4, r5)
            io.netty.handler.codec.http.HttpStatusClass.INFORMATIONAL = r0
            io.netty.handler.codec.http.HttpStatusClass r1 = new io.netty.handler.codec.http.HttpStatusClass
            r5 = 300(0x12c, float:4.2E-43)
            java.lang.String r6 = "Success"
            java.lang.String r2 = "SUCCESS"
            r3 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            io.netty.handler.codec.http.HttpStatusClass.SUCCESS = r1
            io.netty.handler.codec.http.HttpStatusClass r2 = new io.netty.handler.codec.http.HttpStatusClass
            r6 = 400(0x190, float:5.6E-43)
            java.lang.String r7 = "Redirection"
            java.lang.String r3 = "REDIRECTION"
            r4 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            io.netty.handler.codec.http.HttpStatusClass.REDIRECTION = r2
            io.netty.handler.codec.http.HttpStatusClass r3 = new io.netty.handler.codec.http.HttpStatusClass
            r7 = 500(0x1f4, float:7.0E-43)
            java.lang.String r8 = "Client Error"
            java.lang.String r4 = "CLIENT_ERROR"
            r5 = 3
            r3.<init>(r4, r5, r6, r7, r8)
            io.netty.handler.codec.http.HttpStatusClass.CLIENT_ERROR = r3
            io.netty.handler.codec.http.HttpStatusClass r4 = new io.netty.handler.codec.http.HttpStatusClass
            r8 = 600(0x258, float:8.41E-43)
            java.lang.String r9 = "Server Error"
            java.lang.String r5 = "SERVER_ERROR"
            r6 = 4
            r4.<init>(r5, r6, r7, r8, r9)
            io.netty.handler.codec.http.HttpStatusClass.SERVER_ERROR = r4
            io.netty.handler.codec.http.HttpStatusClass$1 r5 = new io.netty.handler.codec.http.HttpStatusClass$1
            r9 = 0
            java.lang.String r10 = "Unknown Status"
            java.lang.String r6 = "UNKNOWN"
            r7 = 5
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            io.netty.handler.codec.http.HttpStatusClass.UNKNOWN = r5
            r6 = 6
            io.netty.handler.codec.http.HttpStatusClass[] r6 = new io.netty.handler.codec.http.HttpStatusClass[r6]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 5
            r6[r0] = r5
            io.netty.handler.codec.http.HttpStatusClass.$VALUES = r6
            return
    }

    HttpStatusClass(java.lang.String r1, int r2, int r3, int r4, java.lang.String r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.min = r3
            r0.max = r4
            io.netty.util.AsciiString r1 = io.netty.util.AsciiString.cached(r5)
            r0.defaultReasonPhrase = r1
            return
    }

    /* synthetic */ HttpStatusClass(java.lang.String r1, int r2, int r3, int r4, java.lang.String r5, io.netty.handler.codec.http.HttpStatusClass.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private static int digit(char r0) {
            int r0 = r0 + (-48)
            return r0
    }

    private static boolean isDigit(char r1) {
            r0 = 48
            if (r1 < r0) goto La
            r0 = 57
            if (r1 > r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static io.netty.handler.codec.http.HttpStatusClass valueOf(int r2) {
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.INFORMATIONAL
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.SUCCESS
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.REDIRECTION
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.CLIENT_ERROR
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L24
            return r0
        L24:
            io.netty.handler.codec.http.HttpStatusClass r0 = io.netty.handler.codec.http.HttpStatusClass.SERVER_ERROR
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L2d
            return r0
        L2d:
            io.netty.handler.codec.http.HttpStatusClass r2 = io.netty.handler.codec.http.HttpStatusClass.UNKNOWN
            return r2
    }

    public static io.netty.handler.codec.http.HttpStatusClass valueOf(java.lang.CharSequence r2) {
            if (r2 == 0) goto L38
            int r0 = r2.length()
            r1 = 3
            if (r0 != r1) goto L38
            r0 = 0
            char r0 = r2.charAt(r0)
            boolean r1 = isDigit(r0)
            if (r1 == 0) goto L35
            r1 = 1
            char r1 = r2.charAt(r1)
            boolean r1 = isDigit(r1)
            if (r1 == 0) goto L35
            r1 = 2
            char r2 = r2.charAt(r1)
            boolean r2 = isDigit(r2)
            if (r2 == 0) goto L35
            int r2 = digit(r0)
            int r2 = r2 * 100
            io.netty.handler.codec.http.HttpStatusClass r2 = valueOf(r2)
            return r2
        L35:
            io.netty.handler.codec.http.HttpStatusClass r2 = io.netty.handler.codec.http.HttpStatusClass.UNKNOWN
            return r2
        L38:
            io.netty.handler.codec.http.HttpStatusClass r2 = io.netty.handler.codec.http.HttpStatusClass.UNKNOWN
            return r2
    }

    public static io.netty.handler.codec.http.HttpStatusClass valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.http.HttpStatusClass> r0 = io.netty.handler.codec.http.HttpStatusClass.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.http.HttpStatusClass r1 = (io.netty.handler.codec.http.HttpStatusClass) r1
            return r1
    }

    public static io.netty.handler.codec.http.HttpStatusClass[] values() {
            io.netty.handler.codec.http.HttpStatusClass[] r0 = io.netty.handler.codec.http.HttpStatusClass.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.http.HttpStatusClass[] r0 = (io.netty.handler.codec.http.HttpStatusClass[]) r0
            return r0
    }

    public boolean contains(int r2) {
            r1 = this;
            int r0 = r1.min
            if (r2 < r0) goto La
            int r0 = r1.max
            if (r2 >= r0) goto La
            r2 = 1
            return r2
        La:
            r2 = 0
            return r2
    }

    io.netty.util.AsciiString defaultReasonPhrase() {
            r1 = this;
            io.netty.util.AsciiString r0 = r1.defaultReasonPhrase
            return r0
    }
}
