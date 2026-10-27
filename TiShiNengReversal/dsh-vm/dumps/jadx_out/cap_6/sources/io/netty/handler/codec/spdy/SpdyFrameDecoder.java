package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SpdyFrameDecoder {
    private final io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate delegate;
    private byte flags;
    private int length;
    private final int maxChunkSize;
    private int numSettings;
    private final int spdyVersion;
    private io.netty.handler.codec.spdy.SpdyFrameDecoder.State state;
    private int streamId;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.spdy.SpdyFrameDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State = null;

        static {
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State = r0
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_DATA_FRAME     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SYN_STREAM_FRAME     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SYN_REPLY_FRAME     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_RST_STREAM_FRAME     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SETTINGS_FRAME     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SETTING     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_PING_FRAME     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_GOAWAY_FRAME     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADERS_FRAME     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L84
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_WINDOW_UPDATE_FRAME     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L90
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADER_BLOCK     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> L9c
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.DISCARD_FRAME     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State     // Catch: java.lang.NoSuchFieldError -> La8
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum State extends java.lang.Enum<io.netty.handler.codec.spdy.SpdyFrameDecoder.State> {
        private static final /* synthetic */ io.netty.handler.codec.spdy.SpdyFrameDecoder.State[] $VALUES = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State DISCARD_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State FRAME_ERROR = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_COMMON_HEADER = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_DATA_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_GOAWAY_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_HEADERS_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_HEADER_BLOCK = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_PING_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_RST_STREAM_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_SETTING = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_SETTINGS_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_SYN_REPLY_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_SYN_STREAM_FRAME = null;
        public static final io.netty.handler.codec.spdy.SpdyFrameDecoder.State READ_WINDOW_UPDATE_FRAME = null;

        static {
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r1 = "READ_COMMON_HEADER"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER = r0
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r3 = "READ_DATA_FRAME"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_DATA_FRAME = r1
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r3 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r5 = "READ_SYN_STREAM_FRAME"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SYN_STREAM_FRAME = r3
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r5 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r7 = "READ_SYN_REPLY_FRAME"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SYN_REPLY_FRAME = r5
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r7 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r9 = "READ_RST_STREAM_FRAME"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_RST_STREAM_FRAME = r7
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r9 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r11 = "READ_SETTINGS_FRAME"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SETTINGS_FRAME = r9
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r11 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r13 = "READ_SETTING"
                r14 = 6
                r11.<init>(r13, r14)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SETTING = r11
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r13 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                java.lang.String r15 = "READ_PING_FRAME"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_PING_FRAME = r13
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r15 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                r17 = 7
                java.lang.String r2 = "READ_GOAWAY_FRAME"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_GOAWAY_FRAME = r15
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r2 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                r19 = 8
                java.lang.String r4 = "READ_HEADERS_FRAME"
                r20 = 2
                r6 = 9
                r2.<init>(r4, r6)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADERS_FRAME = r2
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r4 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                r21 = 9
                java.lang.String r6 = "READ_WINDOW_UPDATE_FRAME"
                r22 = 3
                r8 = 10
                r4.<init>(r6, r8)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_WINDOW_UPDATE_FRAME = r4
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r6 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                r23 = 10
                java.lang.String r8 = "READ_HEADER_BLOCK"
                r24 = 4
                r10 = 11
                r6.<init>(r8, r10)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADER_BLOCK = r6
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r8 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                r25 = 11
                java.lang.String r10 = "DISCARD_FRAME"
                r26 = 5
                r12 = 12
                r8.<init>(r10, r12)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.DISCARD_FRAME = r8
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r10 = new io.netty.handler.codec.spdy.SpdyFrameDecoder$State
                r27 = 12
                java.lang.String r12 = "FRAME_ERROR"
                r28 = 6
                r14 = 13
                r10.<init>(r12, r14)
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR = r10
                r12 = 14
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State[] r12 = new io.netty.handler.codec.spdy.SpdyFrameDecoder.State[r12]
                r12[r16] = r0
                r12[r18] = r1
                r12[r20] = r3
                r12[r22] = r5
                r12[r24] = r7
                r12[r26] = r9
                r12[r28] = r11
                r12[r17] = r13
                r12[r19] = r15
                r12[r21] = r2
                r12[r23] = r4
                r12[r25] = r6
                r12[r27] = r8
                r12[r14] = r10
                io.netty.handler.codec.spdy.SpdyFrameDecoder.State.$VALUES = r12
                return
        }

        State(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.spdy.SpdyFrameDecoder.State valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.spdy.SpdyFrameDecoder$State> r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = (io.netty.handler.codec.spdy.SpdyFrameDecoder.State) r1
                return r1
        }

        public static io.netty.handler.codec.spdy.SpdyFrameDecoder.State[] values() {
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.spdy.SpdyFrameDecoder$State[] r0 = (io.netty.handler.codec.spdy.SpdyFrameDecoder.State[]) r0
                return r0
        }
    }

    public SpdyFrameDecoder(io.netty.handler.codec.spdy.SpdyVersion r2, io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r3) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r3, r0)
            return
    }

    public SpdyFrameDecoder(io.netty.handler.codec.spdy.SpdyVersion r2, io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L23
            if (r3 == 0) goto L1b
            java.lang.String r0 = "maxChunkSize"
            io.netty.util.internal.ObjectUtil.checkPositive(r4, r0)
            int r2 = r2.getVersion()
            r1.spdyVersion = r2
            r1.delegate = r3
            r1.maxChunkSize = r4
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r2 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r1.state = r2
            return
        L1b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "delegate"
            r2.<init>(r3)
            throw r2
        L23:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "spdyVersion"
            r2.<init>(r3)
            throw r2
    }

    private static io.netty.handler.codec.spdy.SpdyFrameDecoder.State getNextState(int r0, int r1) {
            switch(r0) {
                case 0: goto L23;
                case 1: goto L20;
                case 2: goto L1d;
                case 3: goto L1a;
                case 4: goto L17;
                case 5: goto L3;
                case 6: goto L14;
                case 7: goto L11;
                case 8: goto Le;
                case 9: goto Lb;
                default: goto L3;
            }
        L3:
            if (r1 == 0) goto L8
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.DISCARD_FRAME
            return r0
        L8:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            return r0
        Lb:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_WINDOW_UPDATE_FRAME
            return r0
        Le:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADERS_FRAME
            return r0
        L11:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_GOAWAY_FRAME
            return r0
        L14:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_PING_FRAME
            return r0
        L17:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SETTINGS_FRAME
            return r0
        L1a:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_RST_STREAM_FRAME
            return r0
        L1d:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SYN_REPLY_FRAME
            return r0
        L20:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SYN_STREAM_FRAME
            return r0
        L23:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_DATA_FRAME
            return r0
    }

    private static boolean hasFlag(byte r0, byte r1) {
            r0 = r0 & r1
            if (r0 == 0) goto L5
            r0 = 1
            return r0
        L5:
            r0 = 0
            return r0
    }

    private static boolean isValidFrameHeader(int r4, int r5, byte r6, int r7) {
            r0 = 8
            r1 = 4
            r2 = 0
            r3 = 1
            switch(r5) {
                case 0: goto L2d;
                case 1: goto L27;
                case 2: goto L23;
                case 3: goto L1d;
                case 4: goto L19;
                case 5: goto L8;
                case 6: goto L15;
                case 7: goto L11;
                case 8: goto Ld;
                case 9: goto L9;
                default: goto L8;
            }
        L8:
            return r3
        L9:
            if (r7 != r0) goto Lc
            return r3
        Lc:
            return r2
        Ld:
            if (r7 < r1) goto L10
            return r3
        L10:
            return r2
        L11:
            if (r7 != r0) goto L14
            return r3
        L14:
            return r2
        L15:
            if (r7 != r1) goto L18
            return r3
        L18:
            return r2
        L19:
            if (r7 < r1) goto L1c
            return r3
        L1c:
            return r2
        L1d:
            if (r6 != 0) goto L22
            if (r7 != r0) goto L22
            return r3
        L22:
            return r2
        L23:
            if (r7 < r1) goto L26
            return r3
        L26:
            return r2
        L27:
            r4 = 10
            if (r7 < r4) goto L2c
            return r3
        L2c:
            return r2
        L2d:
            if (r4 == 0) goto L30
            return r3
        L30:
            return r2
    }

    public void decode(io.netty.buffer.ByteBuf r13) {
            r12 = this;
        L0:
            int[] r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = r12.state
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 8
            r5 = 4
            switch(r0) {
                case 1: goto L2d7;
                case 2: goto L285;
                case 3: goto L231;
                case 4: goto L1f5;
                case 5: goto L1b8;
                case 6: goto L175;
                case 7: goto L12d;
                case 8: goto L10f;
                case 9: goto Le8;
                case 10: goto Lac;
                case 11: goto L72;
                case 12: goto L3c;
                case 13: goto L23;
                case 14: goto L1b;
                default: goto L13;
            }
        L13:
            java.lang.Error r13 = new java.lang.Error
            java.lang.String r0 = "Shouldn't reach here."
            r13.<init>(r0)
            throw r13
        L1b:
            int r0 = r13.readableBytes()
            r13.skipBytes(r0)
            return
        L23:
            int r0 = r13.readableBytes()
            int r1 = r12.length
            int r0 = java.lang.Math.min(r0, r1)
            r13.skipBytes(r0)
            int r1 = r12.length
            int r1 = r1 - r0
            r12.length = r1
            if (r1 != 0) goto L2dd
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r0
            goto L0
        L3c:
            int r0 = r12.length
            if (r0 != 0) goto L4a
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            r0.readHeaderBlockEnd()
            goto L0
        L4a:
            boolean r0 = r13.isReadable()
            if (r0 != 0) goto L52
            goto L2dd
        L52:
            int r0 = r13.readableBytes()
            int r1 = r12.length
            int r0 = java.lang.Math.min(r0, r1)
            io.netty.buffer.ByteBufAllocator r1 = r13.alloc()
            io.netty.buffer.ByteBuf r1 = r1.buffer(r0)
            r1.writeBytes(r13, r0)
            int r2 = r12.length
            int r2 = r2 - r0
            r12.length = r2
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            r0.readHeaderBlock(r1)
            goto L0
        L72:
            int r0 = r13.readableBytes()
            if (r0 >= r4) goto L7a
            goto L2dd
        L7a:
            int r0 = r13.readerIndex()
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            r12.streamId = r0
            int r0 = r13.readerIndex()
            int r0 = r0 + r5
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            r13.skipBytes(r4)
            if (r0 != 0) goto L9f
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid WINDOW_UPDATE Frame"
            r0.readFrameError(r1)
            goto L0
        L9f:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r1
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r1 = r12.delegate
            int r2 = r12.streamId
            r1.readWindowUpdateFrame(r2, r0)
            goto L0
        Lac:
            int r0 = r13.readableBytes()
            if (r0 >= r5) goto Lb4
            goto L2dd
        Lb4:
            int r0 = r13.readerIndex()
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            r12.streamId = r0
            byte r0 = r12.flags
            boolean r0 = hasFlag(r0, r3)
            r13.skipBytes(r5)
            int r1 = r12.length
            int r1 = r1 - r5
            r12.length = r1
            int r1 = r12.streamId
            if (r1 != 0) goto Ldd
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid HEADERS Frame"
            r0.readFrameError(r1)
            goto L0
        Ldd:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r2 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADER_BLOCK
            r12.state = r2
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r2 = r12.delegate
            r2.readHeadersFrame(r1, r0)
            goto L0
        Le8:
            int r0 = r13.readableBytes()
            if (r0 >= r4) goto Lf0
            goto L2dd
        Lf0:
            int r0 = r13.readerIndex()
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            int r1 = r13.readerIndex()
            int r1 = r1 + r5
            int r1 = io.netty.handler.codec.spdy.SpdyCodecUtil.getSignedInt(r13, r1)
            r13.skipBytes(r4)
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r2 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r2
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r2 = r12.delegate
            r2.readGoAwayFrame(r0, r1)
            goto L0
        L10f:
            int r0 = r13.readableBytes()
            if (r0 >= r5) goto L117
            goto L2dd
        L117:
            int r0 = r13.readerIndex()
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getSignedInt(r13, r0)
            r13.skipBytes(r5)
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r1
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r1 = r12.delegate
            r1.readPingFrame(r0)
            goto L0
        L12d:
            int r0 = r12.numSettings
            if (r0 != 0) goto L13c
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            r0.readSettingsEnd()
            goto L0
        L13c:
            int r0 = r13.readableBytes()
            if (r0 >= r4) goto L144
            goto L2dd
        L144:
            int r0 = r13.readerIndex()
            byte r0 = r13.getByte(r0)
            int r2 = r13.readerIndex()
            int r2 = r2 + r3
            int r2 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedMedium(r13, r2)
            int r6 = r13.readerIndex()
            int r6 = r6 + r5
            int r5 = io.netty.handler.codec.spdy.SpdyCodecUtil.getSignedInt(r13, r6)
            boolean r6 = hasFlag(r0, r3)
            boolean r0 = hasFlag(r0, r1)
            r13.skipBytes(r4)
            int r1 = r12.numSettings
            int r1 = r1 - r3
            r12.numSettings = r1
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r1 = r12.delegate
            r1.readSetting(r2, r5, r6, r0)
            goto L0
        L175:
            int r0 = r13.readableBytes()
            if (r0 >= r5) goto L17d
            goto L2dd
        L17d:
            byte r0 = r12.flags
            boolean r0 = hasFlag(r0, r3)
            int r1 = r13.readerIndex()
            int r1 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r1)
            r12.numSettings = r1
            r13.skipBytes(r5)
            int r1 = r12.length
            int r1 = r1 - r5
            r12.length = r1
            r2 = r1 & 7
            if (r2 != 0) goto L1ab
            int r1 = r1 >> 3
            int r2 = r12.numSettings
            if (r1 == r2) goto L1a0
            goto L1ab
        L1a0:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r1 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_SETTING
            r12.state = r1
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r1 = r12.delegate
            r1.readSettingsFrame(r0)
            goto L0
        L1ab:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid SETTINGS Frame"
            r0.readFrameError(r1)
            goto L0
        L1b8:
            int r0 = r13.readableBytes()
            if (r0 >= r4) goto L1c0
            goto L2dd
        L1c0:
            int r0 = r13.readerIndex()
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            r12.streamId = r0
            int r0 = r13.readerIndex()
            int r0 = r0 + r5
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getSignedInt(r13, r0)
            r13.skipBytes(r4)
            int r1 = r12.streamId
            if (r1 == 0) goto L1e8
            if (r0 != 0) goto L1dd
            goto L1e8
        L1dd:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r2 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r2
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r2 = r12.delegate
            r2.readRstStreamFrame(r1, r0)
            goto L0
        L1e8:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid RST_STREAM Frame"
            r0.readFrameError(r1)
            goto L0
        L1f5:
            int r0 = r13.readableBytes()
            if (r0 >= r5) goto L1fd
            goto L2dd
        L1fd:
            int r0 = r13.readerIndex()
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            r12.streamId = r0
            byte r0 = r12.flags
            boolean r0 = hasFlag(r0, r3)
            r13.skipBytes(r5)
            int r1 = r12.length
            int r1 = r1 - r5
            r12.length = r1
            int r1 = r12.streamId
            if (r1 != 0) goto L226
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid SYN_REPLY Frame"
            r0.readFrameError(r1)
            goto L0
        L226:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r2 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADER_BLOCK
            r12.state = r2
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r2 = r12.delegate
            r2.readSynReplyFrame(r1, r0)
            goto L0
        L231:
            int r0 = r13.readableBytes()
            r2 = 10
            if (r0 >= r2) goto L23b
            goto L2dd
        L23b:
            int r0 = r13.readerIndex()
            int r5 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            r12.streamId = r5
            int r5 = r0 + 4
            int r8 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r5)
            int r0 = r0 + r4
            byte r0 = r13.getByte(r0)
            int r0 = r0 >> 5
            r0 = r0 & 7
            byte r9 = (byte) r0
            byte r0 = r12.flags
            boolean r10 = hasFlag(r0, r3)
            byte r0 = r12.flags
            boolean r11 = hasFlag(r0, r1)
            r13.skipBytes(r2)
            int r0 = r12.length
            int r0 = r0 - r2
            r12.length = r0
            int r7 = r12.streamId
            if (r7 != 0) goto L27a
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid SYN_STREAM Frame"
            r0.readFrameError(r1)
            goto L0
        L27a:
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_HEADER_BLOCK
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r6 = r12.delegate
            r6.readSynStreamFrame(r7, r8, r9, r10, r11)
            goto L0
        L285:
            int r0 = r12.length
            if (r0 != 0) goto L2a0
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            int r1 = r12.streamId
            byte r4 = r12.flags
            boolean r3 = hasFlag(r4, r3)
            io.netty.buffer.ByteBuf r2 = io.netty.buffer.Unpooled.buffer(r2)
            r0.readDataFrame(r1, r3, r2)
            goto L0
        L2a0:
            int r1 = r12.maxChunkSize
            int r0 = java.lang.Math.min(r1, r0)
            int r1 = r13.readableBytes()
            if (r1 >= r0) goto L2ad
            goto L2dd
        L2ad:
            io.netty.buffer.ByteBufAllocator r1 = r13.alloc()
            io.netty.buffer.ByteBuf r1 = r1.buffer(r0)
            r1.writeBytes(r13, r0)
            int r4 = r12.length
            int r4 = r4 - r0
            r12.length = r4
            if (r4 != 0) goto L2c3
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.READ_COMMON_HEADER
            r12.state = r0
        L2c3:
            if (r4 != 0) goto L2ce
            byte r0 = r12.flags
            boolean r0 = hasFlag(r0, r3)
            if (r0 == 0) goto L2ce
            r2 = 1
        L2ce:
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            int r3 = r12.streamId
            r0.readDataFrame(r3, r2, r1)
            goto L0
        L2d7:
            int r0 = r13.readableBytes()
            if (r0 >= r4) goto L2de
        L2dd:
            return
        L2de:
            int r0 = r13.readerIndex()
            int r1 = r0 + 4
            int r3 = r0 + 5
            r13.skipBytes(r4)
            byte r4 = r13.getByte(r0)
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 == 0) goto L301
            int r4 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedShort(r13, r0)
            r4 = r4 & 32767(0x7fff, float:4.5916E-41)
            int r0 = r0 + 2
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedShort(r13, r0)
            r12.streamId = r2
            r2 = r0
            goto L309
        L301:
            int r4 = r12.spdyVersion
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedInt(r13, r0)
            r12.streamId = r0
        L309:
            byte r0 = r13.getByte(r1)
            r12.flags = r0
            int r0 = io.netty.handler.codec.spdy.SpdyCodecUtil.getUnsignedMedium(r13, r3)
            r12.length = r0
            int r1 = r12.spdyVersion
            if (r4 == r1) goto L326
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid SPDY Version"
            r0.readFrameError(r1)
            goto L0
        L326:
            int r1 = r12.streamId
            byte r3 = r12.flags
            boolean r0 = isValidFrameHeader(r1, r2, r3, r0)
            if (r0 != 0) goto L33d
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = io.netty.handler.codec.spdy.SpdyFrameDecoder.State.FRAME_ERROR
            r12.state = r0
            io.netty.handler.codec.spdy.SpdyFrameDecoderDelegate r0 = r12.delegate
            java.lang.String r1 = "Invalid Frame Error"
            r0.readFrameError(r1)
            goto L0
        L33d:
            int r0 = r12.length
            io.netty.handler.codec.spdy.SpdyFrameDecoder$State r0 = getNextState(r2, r0)
            r12.state = r0
            goto L0
    }
}
