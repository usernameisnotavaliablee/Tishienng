package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class AsciiHeadersEncoder {
    private final io.netty.buffer.ByteBuf buf;
    private final io.netty.handler.codec.AsciiHeadersEncoder.NewlineType newlineType;
    private final io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType separatorType;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.AsciiHeadersEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$NewlineType = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$SeparatorType = null;

        static {
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType[] r0 = io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.AsciiHeadersEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$NewlineType = r0
                r1 = 1
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r2 = io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.LF     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.codec.AsciiHeadersEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$NewlineType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r3 = io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.CRLF     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType[] r2 = io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                io.netty.handler.codec.AsciiHeadersEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$SeparatorType = r2
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r3 = io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.COLON     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r1 = io.netty.handler.codec.AsciiHeadersEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$SeparatorType     // Catch: java.lang.NoSuchFieldError -> L38
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r2 = io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.COLON_SPACE     // Catch: java.lang.NoSuchFieldError -> L38
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum NewlineType extends java.lang.Enum<io.netty.handler.codec.AsciiHeadersEncoder.NewlineType> {
        private static final /* synthetic */ io.netty.handler.codec.AsciiHeadersEncoder.NewlineType[] $VALUES = null;
        public static final io.netty.handler.codec.AsciiHeadersEncoder.NewlineType CRLF = null;
        public static final io.netty.handler.codec.AsciiHeadersEncoder.NewlineType LF = null;

        static {
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r0 = new io.netty.handler.codec.AsciiHeadersEncoder$NewlineType
                java.lang.String r1 = "LF"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.LF = r0
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r1 = new io.netty.handler.codec.AsciiHeadersEncoder$NewlineType
                java.lang.String r3 = "CRLF"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.CRLF = r1
                r3 = 2
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType[] r3 = new io.netty.handler.codec.AsciiHeadersEncoder.NewlineType[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.$VALUES = r3
                return
        }

        NewlineType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.AsciiHeadersEncoder.NewlineType valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.AsciiHeadersEncoder$NewlineType> r0 = io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r1 = (io.netty.handler.codec.AsciiHeadersEncoder.NewlineType) r1
                return r1
        }

        public static io.netty.handler.codec.AsciiHeadersEncoder.NewlineType[] values() {
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType[] r0 = io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.AsciiHeadersEncoder$NewlineType[] r0 = (io.netty.handler.codec.AsciiHeadersEncoder.NewlineType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SeparatorType extends java.lang.Enum<io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType> {
        private static final /* synthetic */ io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType[] $VALUES = null;
        public static final io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType COLON = null;
        public static final io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType COLON_SPACE = null;

        static {
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r0 = new io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType
                java.lang.String r1 = "COLON"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.COLON = r0
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r1 = new io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType
                java.lang.String r3 = "COLON_SPACE"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.COLON_SPACE = r1
                r3 = 2
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType[] r3 = new io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType[r3]
                r3[r2] = r0
                r3[r4] = r1
                io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.$VALUES = r3
                return
        }

        SeparatorType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType> r0 = io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r1 = (io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType) r1
                return r1
        }

        public static io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType[] values() {
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType[] r0 = io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType[] r0 = (io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType[]) r0
                return r0
        }
    }

    public AsciiHeadersEncoder(io.netty.buffer.ByteBuf r3) {
            r2 = this;
            io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r0 = io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType.COLON_SPACE
            io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r1 = io.netty.handler.codec.AsciiHeadersEncoder.NewlineType.CRLF
            r2.<init>(r3, r0, r1)
            return
    }

    public AsciiHeadersEncoder(io.netty.buffer.ByteBuf r1, io.netty.handler.codec.AsciiHeadersEncoder.SeparatorType r2, io.netty.handler.codec.AsciiHeadersEncoder.NewlineType r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L20
            if (r2 == 0) goto L18
            if (r3 == 0) goto L10
            r0.buf = r1
            r0.separatorType = r2
            r0.newlineType = r3
            return
        L10:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "newlineType"
            r1.<init>(r2)
            throw r1
        L18:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "separatorType"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "buf"
            r1.<init>(r2)
            throw r1
    }

    private static void writeAscii(io.netty.buffer.ByteBuf r2, int r3, java.lang.CharSequence r4) {
            boolean r0 = r4 instanceof io.netty.util.AsciiString
            if (r0 == 0) goto L10
            r0 = r4
            io.netty.util.AsciiString r0 = (io.netty.util.AsciiString) r0
            r1 = 0
            int r4 = r4.length()
            io.netty.buffer.ByteBufUtil.copy(r0, r1, r2, r3, r4)
            return
        L10:
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.US_ASCII
            r2.setCharSequence(r3, r4, r0)
            return
    }

    public void encode(java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> r8) {
            r7 = this;
            java.lang.Object r0 = r8.getKey()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.Object r8 = r8.getValue()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            io.netty.buffer.ByteBuf r1 = r7.buf
            int r2 = r0.length()
            int r3 = r8.length()
            int r4 = r2 + r3
            int r4 = r4 + 4
            int r5 = r1.writerIndex()
            r1.ensureWritable(r4)
            writeAscii(r1, r5, r0)
            int r5 = r5 + r2
            int[] r0 = io.netty.handler.codec.AsciiHeadersEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$SeparatorType
            io.netty.handler.codec.AsciiHeadersEncoder$SeparatorType r2 = r7.separatorType
            int r2 = r2.ordinal()
            r0 = r0[r2]
            r2 = 58
            r4 = 2
            r6 = 1
            if (r0 == r6) goto L49
            if (r0 != r4) goto L43
            int r0 = r5 + 1
            r1.setByte(r5, r2)
            int r5 = r5 + r4
            r2 = 32
            r1.setByte(r0, r2)
            goto L4f
        L43:
            java.lang.Error r8 = new java.lang.Error
            r8.<init>()
            throw r8
        L49:
            int r0 = r5 + 1
            r1.setByte(r5, r2)
            r5 = r0
        L4f:
            writeAscii(r1, r5, r8)
            int r5 = r5 + r3
            int[] r8 = io.netty.handler.codec.AsciiHeadersEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$AsciiHeadersEncoder$NewlineType
            io.netty.handler.codec.AsciiHeadersEncoder$NewlineType r0 = r7.newlineType
            int r0 = r0.ordinal()
            r8 = r8[r0]
            r0 = 10
            if (r8 == r6) goto L75
            if (r8 != r4) goto L6f
            int r8 = r5 + 1
            r2 = 13
            r1.setByte(r5, r2)
            int r5 = r5 + r4
            r1.setByte(r8, r0)
            goto L7b
        L6f:
            java.lang.Error r8 = new java.lang.Error
            r8.<init>()
            throw r8
        L75:
            int r8 = r5 + 1
            r1.setByte(r5, r0)
            r5 = r8
        L7b:
            r1.writerIndex(r5)
            return
    }
}
