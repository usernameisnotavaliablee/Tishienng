package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Http2Headers extends io.netty.handler.codec.Headers<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.http2.Http2Headers> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum PseudoHeaderName extends java.lang.Enum<io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName> {
        private static final /* synthetic */ io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName[] $VALUES = null;
        public static final io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName AUTHORITY = null;
        public static final io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName METHOD = null;
        public static final io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName PATH = null;
        private static final io.netty.handler.codec.http2.CharSequenceMap<io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName> PSEUDO_HEADERS = null;
        private static final char PSEUDO_HEADER_PREFIX = ':';
        private static final byte PSEUDO_HEADER_PREFIX_BYTE = 58;
        public static final io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName SCHEME = null;
        public static final io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName STATUS = null;
        private final boolean requestOnly;
        private final io.netty.util.AsciiString value;

        static {
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r0 = new io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName
                java.lang.String r1 = "METHOD"
                r2 = 0
                java.lang.String r3 = ":method"
                r4 = 1
                r0.<init>(r1, r2, r3, r4)
                io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.METHOD = r0
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r1 = new io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName
                java.lang.String r3 = "SCHEME"
                java.lang.String r5 = ":scheme"
                r1.<init>(r3, r4, r5, r4)
                io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.SCHEME = r1
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r3 = new io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName
                java.lang.String r5 = ":authority"
                java.lang.String r6 = "AUTHORITY"
                r7 = 2
                r3.<init>(r6, r7, r5, r4)
                io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.AUTHORITY = r3
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r5 = new io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName
                java.lang.String r6 = ":path"
                java.lang.String r8 = "PATH"
                r9 = 3
                r5.<init>(r8, r9, r6, r4)
                io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PATH = r5
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r6 = new io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName
                java.lang.String r8 = ":status"
                java.lang.String r10 = "STATUS"
                r11 = 4
                r6.<init>(r10, r11, r8, r2)
                io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.STATUS = r6
                r8 = 5
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName[] r8 = new io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName[r8]
                r8[r2] = r0
                r8[r4] = r1
                r8[r7] = r3
                r8[r9] = r5
                r8[r11] = r6
                io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.$VALUES = r8
                io.netty.handler.codec.http2.CharSequenceMap r0 = new io.netty.handler.codec.http2.CharSequenceMap
                r0.<init>()
                io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PSEUDO_HEADERS = r0
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName[] r0 = values()
                int r1 = r0.length
            L57:
                if (r2 >= r1) goto L67
                r3 = r0[r2]
                io.netty.handler.codec.http2.CharSequenceMap<io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName> r4 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PSEUDO_HEADERS
                io.netty.util.AsciiString r5 = r3.value()
                r4.add(r5, r3)
                int r2 = r2 + 1
                goto L57
            L67:
                return
        }

        PseudoHeaderName(java.lang.String r1, int r2, java.lang.String r3, boolean r4) {
                r0 = this;
                r0.<init>(r1, r2)
                io.netty.util.AsciiString r1 = io.netty.util.AsciiString.cached(r3)
                r0.value = r1
                r0.requestOnly = r4
                return
        }

        public static io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName getPseudoHeader(java.lang.CharSequence r1) {
                io.netty.handler.codec.http2.CharSequenceMap<io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName> r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PSEUDO_HEADERS
                java.lang.Object r1 = r0.get(r1)
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r1 = (io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName) r1
                return r1
        }

        public static boolean hasPseudoHeaderFormat(java.lang.CharSequence r4) {
                boolean r0 = r4 instanceof io.netty.util.AsciiString
                r1 = 1
                r2 = 58
                r3 = 0
                if (r0 == 0) goto L18
                io.netty.util.AsciiString r4 = (io.netty.util.AsciiString) r4
                int r0 = r4.length()
                if (r0 <= 0) goto L17
                byte r4 = r4.byteAt(r3)
                if (r4 != r2) goto L17
                return r1
            L17:
                return r3
            L18:
                int r0 = r4.length()
                if (r0 <= 0) goto L25
                char r4 = r4.charAt(r3)
                if (r4 != r2) goto L25
                return r1
            L25:
                return r3
        }

        public static boolean isPseudoHeader(java.lang.CharSequence r1) {
                io.netty.handler.codec.http2.CharSequenceMap<io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName> r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.PSEUDO_HEADERS
                boolean r1 = r0.contains(r1)
                return r1
        }

        public static io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName> r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName r1 = (io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName) r1
                return r1
        }

        public static io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName[] values() {
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName[] r0 = io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http2.Http2Headers$PseudoHeaderName[] r0 = (io.netty.handler.codec.http2.Http2Headers.PseudoHeaderName[]) r0
                return r0
        }

        public boolean isRequestOnly() {
                r1 = this;
                boolean r0 = r1.requestOnly
                return r0
        }

        public io.netty.util.AsciiString value() {
                r1 = this;
                io.netty.util.AsciiString r0 = r1.value
                return r0
        }
    }

    io.netty.handler.codec.http2.Http2Headers authority(java.lang.CharSequence r1);

    java.lang.CharSequence authority();

    boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3);

    @Override // io.netty.handler.codec.Headers, java.lang.Iterable
    java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> iterator();

    io.netty.handler.codec.http2.Http2Headers method(java.lang.CharSequence r1);

    java.lang.CharSequence method();

    io.netty.handler.codec.http2.Http2Headers path(java.lang.CharSequence r1);

    java.lang.CharSequence path();

    io.netty.handler.codec.http2.Http2Headers scheme(java.lang.CharSequence r1);

    java.lang.CharSequence scheme();

    io.netty.handler.codec.http2.Http2Headers status(java.lang.CharSequence r1);

    java.lang.CharSequence status();

    java.util.Iterator<java.lang.CharSequence> valueIterator(java.lang.CharSequence r1);
}
