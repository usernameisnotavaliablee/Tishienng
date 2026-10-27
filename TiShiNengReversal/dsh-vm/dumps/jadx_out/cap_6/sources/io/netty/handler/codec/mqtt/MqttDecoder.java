package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttDecoder extends io.netty.handler.codec.ReplayingDecoder<io.netty.handler.codec.mqtt.MqttDecoder.DecoderState> {
    private static final int DEFAULT_MAX_BYTES_IN_MESSAGE = 8092;
    private int bytesRemainingInVariablePart;
    private final int maxBytesInMessage;
    private io.netty.handler.codec.mqtt.MqttFixedHeader mqttFixedHeader;
    private java.lang.Object variableHeader;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.mqtt.MqttDecoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$mqtt$MqttDecoder$DecoderState = null;
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = null;

        static {
                io.netty.handler.codec.mqtt.MqttMessageType[] r0 = io.netty.handler.codec.mqtt.MqttMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = r0
                r1 = 1
                io.netty.handler.codec.mqtt.MqttMessageType r2 = io.netty.handler.codec.mqtt.MqttMessageType.CONNECT     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.mqtt.MqttMessageType r3 = io.netty.handler.codec.mqtt.MqttMessageType.CONNACK     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.mqtt.MqttMessageType r4 = io.netty.handler.codec.mqtt.MqttMessageType.SUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.SUBACK     // Catch: java.lang.NoSuchFieldError -> L3e
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r6 = 5
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBACK     // Catch: java.lang.NoSuchFieldError -> L49
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6 = 6
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.PUBACK     // Catch: java.lang.NoSuchFieldError -> L54
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r6 = 7
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREC     // Catch: java.lang.NoSuchFieldError -> L60
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r6 = 8
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.PUBCOMP     // Catch: java.lang.NoSuchFieldError -> L6c
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r6 = 9
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREL     // Catch: java.lang.NoSuchFieldError -> L78
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r6 = 10
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L84
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.PUBLISH     // Catch: java.lang.NoSuchFieldError -> L84
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r6 = 11
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L90
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.PINGREQ     // Catch: java.lang.NoSuchFieldError -> L90
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r6 = 12
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.PINGRESP     // Catch: java.lang.NoSuchFieldError -> L9c
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r6 = 13
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> La8
                io.netty.handler.codec.mqtt.MqttMessageType r5 = io.netty.handler.codec.mqtt.MqttMessageType.DISCONNECT     // Catch: java.lang.NoSuchFieldError -> La8
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r6 = 14
                r4[r5] = r6     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState[] r4 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttDecoder$DecoderState = r4
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r5 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_FIXED_HEADER     // Catch: java.lang.NoSuchFieldError -> Lb9
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb9
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> Lb9
            Lb9:
                int[] r1 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttDecoder$DecoderState     // Catch: java.lang.NoSuchFieldError -> Lc3
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r4 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_VARIABLE_HEADER     // Catch: java.lang.NoSuchFieldError -> Lc3
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc3
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> Lc3
            Lc3:
                int[] r0 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttDecoder$DecoderState     // Catch: java.lang.NoSuchFieldError -> Lcd
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r1 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_PAYLOAD     // Catch: java.lang.NoSuchFieldError -> Lcd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcd
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcd
            Lcd:
                int[] r0 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttDecoder$DecoderState     // Catch: java.lang.NoSuchFieldError -> Ld7
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r1 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.BAD_MESSAGE     // Catch: java.lang.NoSuchFieldError -> Ld7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld7
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> Ld7
            Ld7:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum DecoderState extends java.lang.Enum<io.netty.handler.codec.mqtt.MqttDecoder.DecoderState> {
        private static final /* synthetic */ io.netty.handler.codec.mqtt.MqttDecoder.DecoderState[] $VALUES = null;
        public static final io.netty.handler.codec.mqtt.MqttDecoder.DecoderState BAD_MESSAGE = null;
        public static final io.netty.handler.codec.mqtt.MqttDecoder.DecoderState READ_FIXED_HEADER = null;
        public static final io.netty.handler.codec.mqtt.MqttDecoder.DecoderState READ_PAYLOAD = null;
        public static final io.netty.handler.codec.mqtt.MqttDecoder.DecoderState READ_VARIABLE_HEADER = null;

        static {
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r0 = new io.netty.handler.codec.mqtt.MqttDecoder$DecoderState
                java.lang.String r1 = "READ_FIXED_HEADER"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_FIXED_HEADER = r0
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r1 = new io.netty.handler.codec.mqtt.MqttDecoder$DecoderState
                java.lang.String r3 = "READ_VARIABLE_HEADER"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_VARIABLE_HEADER = r1
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r3 = new io.netty.handler.codec.mqtt.MqttDecoder$DecoderState
                java.lang.String r5 = "READ_PAYLOAD"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_PAYLOAD = r3
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r5 = new io.netty.handler.codec.mqtt.MqttDecoder$DecoderState
                java.lang.String r7 = "BAD_MESSAGE"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.BAD_MESSAGE = r5
                r7 = 4
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState[] r7 = new io.netty.handler.codec.mqtt.MqttDecoder.DecoderState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.$VALUES = r7
                return
        }

        DecoderState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.mqtt.MqttDecoder.DecoderState valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.mqtt.MqttDecoder$DecoderState> r0 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r1 = (io.netty.handler.codec.mqtt.MqttDecoder.DecoderState) r1
                return r1
        }

        public static io.netty.handler.codec.mqtt.MqttDecoder.DecoderState[] values() {
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState[] r0 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.mqtt.MqttDecoder$DecoderState[] r0 = (io.netty.handler.codec.mqtt.MqttDecoder.DecoderState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Result<T> {
        private final int numberOfBytesConsumed;
        private final T value;

        Result(T r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.numberOfBytesConsumed = r2
                return
        }

        static /* synthetic */ java.lang.Object access$000(io.netty.handler.codec.mqtt.MqttDecoder.Result r0) {
                T r0 = r0.value
                return r0
        }

        static /* synthetic */ int access$100(io.netty.handler.codec.mqtt.MqttDecoder.Result r0) {
                int r0 = r0.numberOfBytesConsumed
                return r0
        }
    }

    public MqttDecoder() {
            r1 = this;
            r0 = 8092(0x1f9c, float:1.134E-41)
            r1.<init>(r0)
            return
    }

    public MqttDecoder(int r2) {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r0 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_FIXED_HEADER
            r1.<init>(r0)
            r1.maxBytesInMessage = r2
            return
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<byte[]> decodeByteArray(io.netty.buffer.ByteBuf r3) {
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = decodeMsbLsb(r3)
            java.lang.Object r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            byte[] r2 = new byte[r1]
            r3.readBytes(r2)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            int r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r0)
            int r0 = r0 + r1
            r3.<init>(r2, r0)
            return r3
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttConnAckVariableHeader> decodeConnAckVariableHeader(io.netty.buffer.ByteBuf r2) {
            short r0 = r2.readUnsignedByte()
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L9
            goto La
        L9:
            r1 = 0
        La:
            byte r2 = r2.readByte()
            io.netty.handler.codec.mqtt.MqttConnAckVariableHeader r0 = new io.netty.handler.codec.mqtt.MqttConnAckVariableHeader
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r2 = io.netty.handler.codec.mqtt.MqttConnectReturnCode.valueOf(r2)
            r0.<init>(r2, r1)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r1 = 2
            r2.<init>(r0, r1)
            return r2
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttConnectPayload> decodeConnectionPayload(io.netty.buffer.ByteBuf r12, io.netty.handler.codec.mqtt.MqttConnectVariableHeader r13) {
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = decodeString(r12)
            java.lang.Object r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r13.name()
            int r3 = r13.version()
            byte r3 = (byte) r3
            io.netty.handler.codec.mqtt.MqttVersion r2 = io.netty.handler.codec.mqtt.MqttVersion.fromProtocolNameAndLevel(r2, r3)
            boolean r2 = io.netty.handler.codec.mqtt.MqttCodecUtil.isValidClientId(r2, r1)
            if (r2 == 0) goto L9f
            int r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r0)
            boolean r2 = r13.isWillFlag()
            r3 = 0
            if (r2 == 0) goto L3e
            r2 = 0
            r4 = 32767(0x7fff, float:4.5916E-41)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = decodeString(r12, r2, r4)
            int r4 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r2)
            int r1 = r1 + r4
            io.netty.handler.codec.mqtt.MqttDecoder$Result r4 = decodeByteArray(r12)
            int r5 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r4)
            int r1 = r1 + r5
            goto L40
        L3e:
            r2 = r3
            r4 = r2
        L40:
            boolean r5 = r13.hasUserName()
            if (r5 == 0) goto L50
            io.netty.handler.codec.mqtt.MqttDecoder$Result r5 = decodeString(r12)
            int r6 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r5)
            int r1 = r1 + r6
            goto L51
        L50:
            r5 = r3
        L51:
            boolean r13 = r13.hasPassword()
            if (r13 == 0) goto L61
            io.netty.handler.codec.mqtt.MqttDecoder$Result r12 = decodeByteArray(r12)
            int r13 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r12)
            int r1 = r1 + r13
            goto L62
        L61:
            r12 = r3
        L62:
            io.netty.handler.codec.mqtt.MqttConnectPayload r6 = new io.netty.handler.codec.mqtt.MqttConnectPayload
            java.lang.Object r13 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            r7 = r13
            java.lang.String r7 = (java.lang.String) r7
            if (r2 == 0) goto L75
            java.lang.Object r13 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r2)
            java.lang.String r13 = (java.lang.String) r13
            r8 = r13
            goto L76
        L75:
            r8 = r3
        L76:
            if (r4 == 0) goto L80
            java.lang.Object r13 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r4)
            byte[] r13 = (byte[]) r13
            r9 = r13
            goto L81
        L80:
            r9 = r3
        L81:
            if (r5 == 0) goto L8b
            java.lang.Object r13 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r5)
            java.lang.String r13 = (java.lang.String) r13
            r10 = r13
            goto L8c
        L8b:
            r10 = r3
        L8c:
            if (r12 == 0) goto L95
            java.lang.Object r12 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r12)
            r3 = r12
            byte[] r3 = (byte[]) r3
        L95:
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r12 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r12.<init>(r6, r1)
            return r12
        L9f:
            io.netty.handler.codec.mqtt.MqttIdentifierRejectedException r12 = new io.netty.handler.codec.mqtt.MqttIdentifierRejectedException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "invalid clientIdentifier: "
            r13.append(r0)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttConnectVariableHeader> decodeConnectionVariableHeader(io.netty.buffer.ByteBuf r19) {
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = decodeString(r19)
            int r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r0)
            byte r2 = r19.readByte()
            java.lang.Object r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            java.lang.String r0 = (java.lang.String) r0
            io.netty.handler.codec.mqtt.MqttVersion r0 = io.netty.handler.codec.mqtt.MqttVersion.fromProtocolNameAndLevel(r0, r2)
            short r2 = r19.readUnsignedByte()
            r3 = 2
            int r1 = r1 + r3
            io.netty.handler.codec.mqtt.MqttDecoder$Result r4 = decodeMsbLsb(r19)
            int r5 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r4)
            int r1 = r1 + r5
            r5 = r2 & 128(0x80, float:1.8E-43)
            r6 = 0
            r7 = 1
            r8 = 128(0x80, float:1.8E-43)
            if (r5 != r8) goto L2f
            r12 = 1
            goto L30
        L2f:
            r12 = 0
        L30:
            r5 = r2 & 64
            r8 = 64
            if (r5 != r8) goto L38
            r13 = 1
            goto L39
        L38:
            r13 = 0
        L39:
            r5 = r2 & 32
            r8 = 32
            if (r5 != r8) goto L41
            r14 = 1
            goto L42
        L41:
            r14 = 0
        L42:
            r5 = r2 & 24
            int r15 = r5 >> 3
            r5 = r2 & 4
            r8 = 4
            if (r5 != r8) goto L4e
            r16 = 1
            goto L50
        L4e:
            r16 = 0
        L50:
            r5 = r2 & 2
            if (r5 != r3) goto L57
            r17 = 1
            goto L59
        L57:
            r17 = 0
        L59:
            io.netty.handler.codec.mqtt.MqttVersion r3 = io.netty.handler.codec.mqtt.MqttVersion.MQTT_3_1_1
            if (r0 != r3) goto L69
            r2 = r2 & r7
            if (r2 != 0) goto L61
            goto L69
        L61:
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            java.lang.String r1 = "non-zero reserved flag"
            r0.<init>(r1)
            throw r0
        L69:
            io.netty.handler.codec.mqtt.MqttConnectVariableHeader r9 = new io.netty.handler.codec.mqtt.MqttConnectVariableHeader
            java.lang.String r10 = r0.protocolName()
            byte r11 = r0.protocolLevel()
            java.lang.Object r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r18 = r0.intValue()
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r0.<init>(r9, r1)
            return r0
    }

    private static io.netty.handler.codec.mqtt.MqttFixedHeader decodeFixedHeader(io.netty.buffer.ByteBuf r10) {
            short r0 = r10.readUnsignedByte()
            int r1 = r0 >> 4
            io.netty.handler.codec.mqtt.MqttMessageType r3 = io.netty.handler.codec.mqtt.MqttMessageType.valueOf(r1)
            r1 = r0 & 8
            r2 = 0
            r4 = 1
            r5 = 8
            if (r1 != r5) goto L14
        L12:
            r1 = 1
            goto L16
        L14:
            r4 = 0
            goto L12
        L16:
            r5 = r0 & 6
            int r5 = r5 >> r1
            r0 = r0 & r1
            if (r0 == 0) goto L1e
            r6 = 1
            goto L1f
        L1e:
            r6 = 0
        L1f:
            r0 = 0
            r7 = 1
        L21:
            short r8 = r10.readUnsignedByte()
            r9 = r8 & 127(0x7f, float:1.78E-43)
            int r9 = r9 * r7
            int r2 = r2 + r9
            int r7 = r7 * 128
            int r0 = r0 + r1
            r8 = r8 & 128(0x80, float:1.8E-43)
            r9 = 4
            if (r8 == 0) goto L34
            if (r0 < r9) goto L21
        L34:
            if (r0 != r9) goto L38
            if (r8 != 0) goto L3a
        L38:
            r7 = r2
            goto L56
        L3a:
            io.netty.handler.codec.DecoderException r10 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remaining length exceeds 4 digits ("
            r0.append(r1)
            r0.append(r3)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L56:
            io.netty.handler.codec.mqtt.MqttFixedHeader r2 = new io.netty.handler.codec.mqtt.MqttFixedHeader
            io.netty.handler.codec.mqtt.MqttQoS r5 = io.netty.handler.codec.mqtt.MqttQoS.valueOf(r5)
            r2.<init>(r3, r4, r5, r6, r7)
            io.netty.handler.codec.mqtt.MqttFixedHeader r10 = io.netty.handler.codec.mqtt.MqttCodecUtil.resetUnusedFields(r2)
            io.netty.handler.codec.mqtt.MqttFixedHeader r10 = io.netty.handler.codec.mqtt.MqttCodecUtil.validateFixedHeader(r10)
            return r10
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<java.lang.Integer> decodeMessageId(io.netty.buffer.ByteBuf r3) {
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = decodeMsbLsb(r3)
            java.lang.Object r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.isValidMessageId(r0)
            if (r0 == 0) goto L15
            return r3
        L15:
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid messageId: "
            r1.append(r2)
            java.lang.Object r3 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader> decodeMessageIdVariableHeader(io.netty.buffer.ByteBuf r2) {
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = decodeMessageId(r2)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            java.lang.Object r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r1 = io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader.from(r1)
            int r2 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r2)
            r0.<init>(r1, r2)
            return r0
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<java.lang.Integer> decodeMsbLsb(io.netty.buffer.ByteBuf r2) {
            r0 = 0
            r1 = 65535(0xffff, float:9.1834E-41)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = decodeMsbLsb(r2, r0, r1)
            return r2
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<java.lang.Integer> decodeMsbLsb(io.netty.buffer.ByteBuf r1, int r2, int r3) {
            short r0 = r1.readUnsignedByte()
            short r1 = r1.readUnsignedByte()
            int r0 = r0 << 8
            r1 = r1 | r0
            if (r1 < r2) goto Lf
            if (r1 <= r3) goto L10
        Lf:
            r1 = -1
        L10:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 2
            r2.<init>(r1, r3)
            return r2
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<?> decodePayload(io.netty.buffer.ByteBuf r1, io.netty.handler.codec.mqtt.MqttMessageType r2, int r3, java.lang.Object r4) {
            int[] r0 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L34
            r4 = 11
            if (r2 == r4) goto L2f
            r4 = 3
            if (r2 == r4) goto L2a
            r4 = 4
            if (r2 == r4) goto L25
            r4 = 5
            if (r2 == r4) goto L20
            io.netty.handler.codec.mqtt.MqttDecoder$Result r1 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r2 = 0
            r3 = 0
            r1.<init>(r2, r3)
            return r1
        L20:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r1 = decodeSubackPayload(r1, r3)
            return r1
        L25:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r1 = decodeUnsubscribePayload(r1, r3)
            return r1
        L2a:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r1 = decodeSubscribePayload(r1, r3)
            return r1
        L2f:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r1 = decodePublishPayload(r1, r3)
            return r1
        L34:
            io.netty.handler.codec.mqtt.MqttConnectVariableHeader r4 = (io.netty.handler.codec.mqtt.MqttConnectVariableHeader) r4
            io.netty.handler.codec.mqtt.MqttDecoder$Result r1 = decodeConnectionPayload(r1, r4)
            return r1
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.buffer.ByteBuf> decodePublishPayload(io.netty.buffer.ByteBuf r1, int r2) {
            io.netty.buffer.ByteBuf r1 = r1.readRetainedSlice(r2)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r0.<init>(r1, r2)
            return r0
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttPublishVariableHeader> decodePublishVariableHeader(io.netty.buffer.ByteBuf r2, io.netty.handler.codec.mqtt.MqttFixedHeader r3) {
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = decodeString(r2)
            java.lang.Object r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = io.netty.handler.codec.mqtt.MqttCodecUtil.isValidPublishTopicName(r1)
            if (r1 == 0) goto L44
            int r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r0)
            io.netty.handler.codec.mqtt.MqttQoS r3 = r3.qosLevel()
            int r3 = r3.value()
            if (r3 <= 0) goto L32
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = decodeMessageId(r2)
            java.lang.Object r3 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r2 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r2)
            int r1 = r1 + r2
            goto L33
        L32:
            r3 = -1
        L33:
            io.netty.handler.codec.mqtt.MqttPublishVariableHeader r2 = new io.netty.handler.codec.mqtt.MqttPublishVariableHeader
            java.lang.Object r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.<init>(r0, r3)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r3.<init>(r2, r1)
            return r3
        L44:
            io.netty.handler.codec.DecoderException r2 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "invalid publish topic name: "
            r3.append(r1)
            java.lang.Object r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            java.lang.String r0 = " (contains wildcards)"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<java.lang.String> decodeString(io.netty.buffer.ByteBuf r2) {
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = decodeString(r2, r0, r1)
            return r2
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<java.lang.String> decodeString(io.netty.buffer.ByteBuf r2, int r3, int r4) {
            io.netty.handler.codec.mqtt.MqttDecoder$Result r0 = decodeMsbLsb(r2)
            java.lang.Object r1 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            int r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r0)
            if (r1 < r3) goto L2b
            if (r1 <= r4) goto L17
            goto L2b
        L17:
            int r3 = r2.readerIndex()
            java.nio.charset.Charset r4 = io.netty.util.CharsetUtil.UTF_8
            java.lang.String r3 = r2.toString(r3, r1, r4)
            r2.skipBytes(r1)
            int r0 = r0 + r1
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r2.<init>(r3, r0)
            return r2
        L2b:
            r2.skipBytes(r1)
            int r0 = r0 + r1
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r3 = 0
            r2.<init>(r3, r0)
            return r2
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttSubAckPayload> decodeSubackPayload(io.netty.buffer.ByteBuf r4, int r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r5) goto L20
            short r2 = r4.readUnsignedByte()
            io.netty.handler.codec.mqtt.MqttQoS r3 = io.netty.handler.codec.mqtt.MqttQoS.FAILURE
            int r3 = r3.value()
            if (r2 == r3) goto L16
            r2 = r2 & 3
        L16:
            int r1 = r1 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            goto L6
        L20:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r4 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            io.netty.handler.codec.mqtt.MqttSubAckPayload r5 = new io.netty.handler.codec.mqtt.MqttSubAckPayload
            r5.<init>(r0)
            r4.<init>(r5, r1)
            return r4
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttSubscribePayload> decodeSubscribePayload(io.netty.buffer.ByteBuf r5, int r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r6) goto L2c
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = decodeString(r5)
            int r3 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r2)
            int r1 = r1 + r3
            short r3 = r5.readUnsignedByte()
            r3 = r3 & 3
            int r1 = r1 + 1
            io.netty.handler.codec.mqtt.MqttTopicSubscription r4 = new io.netty.handler.codec.mqtt.MqttTopicSubscription
            java.lang.Object r2 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r2)
            java.lang.String r2 = (java.lang.String) r2
            io.netty.handler.codec.mqtt.MqttQoS r3 = io.netty.handler.codec.mqtt.MqttQoS.valueOf(r3)
            r4.<init>(r2, r3)
            r0.add(r4)
            goto L6
        L2c:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r5 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            io.netty.handler.codec.mqtt.MqttSubscribePayload r6 = new io.netty.handler.codec.mqtt.MqttSubscribePayload
            r6.<init>(r0)
            r5.<init>(r6, r1)
            return r5
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<io.netty.handler.codec.mqtt.MqttUnsubscribePayload> decodeUnsubscribePayload(io.netty.buffer.ByteBuf r4, int r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            if (r1 >= r5) goto L19
            io.netty.handler.codec.mqtt.MqttDecoder$Result r2 = decodeString(r4)
            int r3 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r2)
            int r1 = r1 + r3
            java.lang.Object r2 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r2)
            r0.add(r2)
            goto L6
        L19:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r4 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            io.netty.handler.codec.mqtt.MqttUnsubscribePayload r5 = new io.netty.handler.codec.mqtt.MqttUnsubscribePayload
            r5.<init>(r0)
            r4.<init>(r5, r1)
            return r4
    }

    private static io.netty.handler.codec.mqtt.MqttDecoder.Result<?> decodeVariableHeader(io.netty.buffer.ByteBuf r3, io.netty.handler.codec.mqtt.MqttFixedHeader r4) {
            int[] r0 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType
            io.netty.handler.codec.mqtt.MqttMessageType r1 = r4.messageType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 0
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L27;
                case 3: goto L22;
                case 4: goto L22;
                case 5: goto L22;
                case 6: goto L22;
                case 7: goto L22;
                case 8: goto L22;
                case 9: goto L22;
                case 10: goto L22;
                case 11: goto L1d;
                case 12: goto L17;
                case 13: goto L17;
                case 14: goto L17;
                default: goto L11;
            }
        L11:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r3.<init>(r2, r1)
            return r3
        L17:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = new io.netty.handler.codec.mqtt.MqttDecoder$Result
            r3.<init>(r2, r1)
            return r3
        L1d:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = decodePublishVariableHeader(r3, r4)
            return r3
        L22:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = decodeMessageIdVariableHeader(r3)
            return r3
        L27:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = decodeConnAckVariableHeader(r3)
            return r3
        L2c:
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = decodeConnectionVariableHeader(r3)
            return r3
    }

    private io.netty.handler.codec.mqtt.MqttMessage invalidMessage(java.lang.Throwable r3) {
            r2 = this;
            io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r0 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.BAD_MESSAGE
            r2.checkpoint(r0)
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r2.mqttFixedHeader
            java.lang.Object r1 = r2.variableHeader
            io.netty.handler.codec.mqtt.MqttMessage r3 = io.netty.handler.codec.mqtt.MqttMessageFactory.newInvalidMessage(r0, r1, r3)
            return r3
    }

    @Override // io.netty.handler.codec.ByteToMessageDecoder
    protected void decode(io.netty.channel.ChannelHandlerContext r3, io.netty.buffer.ByteBuf r4, java.util.List<java.lang.Object> r5) throws java.lang.Exception {
            r2 = this;
            int[] r3 = io.netty.handler.codec.mqtt.MqttDecoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttDecoder$DecoderState
            java.lang.Object r0 = r2.state()
            io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r0 = (io.netty.handler.codec.mqtt.MqttDecoder.DecoderState) r0
            int r0 = r0.ordinal()
            r3 = r3[r0]
            r0 = 1
            if (r3 == r0) goto L28
            r0 = 2
            if (r3 == r0) goto L39
            r0 = 3
            if (r3 == r0) goto L57
            r5 = 4
            if (r3 != r5) goto L22
            int r3 = r2.actualReadableBytes()
            r4.skipBytes(r3)
            return
        L22:
            java.lang.Error r3 = new java.lang.Error
            r3.<init>()
            throw r3
        L28:
            io.netty.handler.codec.mqtt.MqttFixedHeader r3 = decodeFixedHeader(r4)     // Catch: java.lang.Exception -> Le8
            r2.mqttFixedHeader = r3     // Catch: java.lang.Exception -> Le8
            int r3 = r3.remainingLength()     // Catch: java.lang.Exception -> Le8
            r2.bytesRemainingInVariablePart = r3     // Catch: java.lang.Exception -> Le8
            io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r3 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_VARIABLE_HEADER     // Catch: java.lang.Exception -> Le8
            r2.checkpoint(r3)     // Catch: java.lang.Exception -> Le8
        L39:
            io.netty.handler.codec.mqtt.MqttFixedHeader r3 = r2.mqttFixedHeader     // Catch: java.lang.Exception -> Lc0
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = decodeVariableHeader(r4, r3)     // Catch: java.lang.Exception -> Lc0
            java.lang.Object r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r3)     // Catch: java.lang.Exception -> Lc0
            r2.variableHeader = r0     // Catch: java.lang.Exception -> Lc0
            int r0 = r2.bytesRemainingInVariablePart     // Catch: java.lang.Exception -> Lc0
            int r1 = r2.maxBytesInMessage     // Catch: java.lang.Exception -> Lc0
            if (r0 > r1) goto Lc2
            int r3 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r3)     // Catch: java.lang.Exception -> Lc0
            int r0 = r0 - r3
            r2.bytesRemainingInVariablePart = r0     // Catch: java.lang.Exception -> Lc0
            io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r3 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_PAYLOAD     // Catch: java.lang.Exception -> Lc0
            r2.checkpoint(r3)     // Catch: java.lang.Exception -> Lc0
        L57:
            io.netty.handler.codec.mqtt.MqttFixedHeader r3 = r2.mqttFixedHeader     // Catch: java.lang.Exception -> L8a
            io.netty.handler.codec.mqtt.MqttMessageType r3 = r3.messageType()     // Catch: java.lang.Exception -> L8a
            int r0 = r2.bytesRemainingInVariablePart     // Catch: java.lang.Exception -> L8a
            java.lang.Object r1 = r2.variableHeader     // Catch: java.lang.Exception -> L8a
            io.netty.handler.codec.mqtt.MqttDecoder$Result r3 = decodePayload(r4, r3, r0, r1)     // Catch: java.lang.Exception -> L8a
            int r4 = r2.bytesRemainingInVariablePart     // Catch: java.lang.Exception -> L8a
            int r0 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$100(r3)     // Catch: java.lang.Exception -> L8a
            int r4 = r4 - r0
            r2.bytesRemainingInVariablePart = r4     // Catch: java.lang.Exception -> L8a
            if (r4 != 0) goto L8c
            io.netty.handler.codec.mqtt.MqttDecoder$DecoderState r4 = io.netty.handler.codec.mqtt.MqttDecoder.DecoderState.READ_FIXED_HEADER     // Catch: java.lang.Exception -> L8a
            r2.checkpoint(r4)     // Catch: java.lang.Exception -> L8a
            io.netty.handler.codec.mqtt.MqttFixedHeader r4 = r2.mqttFixedHeader     // Catch: java.lang.Exception -> L8a
            java.lang.Object r0 = r2.variableHeader     // Catch: java.lang.Exception -> L8a
            java.lang.Object r3 = io.netty.handler.codec.mqtt.MqttDecoder.Result.access$000(r3)     // Catch: java.lang.Exception -> L8a
            io.netty.handler.codec.mqtt.MqttMessage r3 = io.netty.handler.codec.mqtt.MqttMessageFactory.newMessage(r4, r0, r3)     // Catch: java.lang.Exception -> L8a
            r4 = 0
            r2.mqttFixedHeader = r4     // Catch: java.lang.Exception -> L8a
            r2.variableHeader = r4     // Catch: java.lang.Exception -> L8a
            r5.add(r3)     // Catch: java.lang.Exception -> L8a
            return
        L8a:
            r3 = move-exception
            goto Lb8
        L8c:
            io.netty.handler.codec.DecoderException r3 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> L8a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8a
            r4.<init>()     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = "non-zero remaining payload bytes: "
            r4.append(r0)     // Catch: java.lang.Exception -> L8a
            int r0 = r2.bytesRemainingInVariablePart     // Catch: java.lang.Exception -> L8a
            r4.append(r0)     // Catch: java.lang.Exception -> L8a
            java.lang.String r0 = " ("
            r4.append(r0)     // Catch: java.lang.Exception -> L8a
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r2.mqttFixedHeader     // Catch: java.lang.Exception -> L8a
            io.netty.handler.codec.mqtt.MqttMessageType r0 = r0.messageType()     // Catch: java.lang.Exception -> L8a
            r4.append(r0)     // Catch: java.lang.Exception -> L8a
            r0 = 41
            r4.append(r0)     // Catch: java.lang.Exception -> L8a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L8a
            r3.<init>(r4)     // Catch: java.lang.Exception -> L8a
            throw r3     // Catch: java.lang.Exception -> L8a
        Lb8:
            io.netty.handler.codec.mqtt.MqttMessage r3 = r2.invalidMessage(r3)
            r5.add(r3)
            return
        Lc0:
            r3 = move-exception
            goto Le0
        Lc2:
            io.netty.handler.codec.DecoderException r3 = new io.netty.handler.codec.DecoderException     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r4.<init>()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = "too large message: "
            r4.append(r0)     // Catch: java.lang.Exception -> Lc0
            int r0 = r2.bytesRemainingInVariablePart     // Catch: java.lang.Exception -> Lc0
            r4.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r0 = " bytes"
            r4.append(r0)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lc0
            r3.<init>(r4)     // Catch: java.lang.Exception -> Lc0
            throw r3     // Catch: java.lang.Exception -> Lc0
        Le0:
            io.netty.handler.codec.mqtt.MqttMessage r3 = r2.invalidMessage(r3)
            r5.add(r3)
            return
        Le8:
            r3 = move-exception
            io.netty.handler.codec.mqtt.MqttMessage r3 = r2.invalidMessage(r3)
            r5.add(r3)
            return
    }
}
