package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@io.netty.channel.ChannelHandler.Sharable
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttEncoder extends io.netty.handler.codec.MessageToMessageEncoder<io.netty.handler.codec.mqtt.MqttMessage> {
    public static final io.netty.handler.codec.mqtt.MqttEncoder INSTANCE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.mqtt.MqttEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = null;

        static {
                io.netty.handler.codec.mqtt.MqttMessageType[] r0 = io.netty.handler.codec.mqtt.MqttMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = r0
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNECT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNACK     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBLISH     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.SUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.SUBACK     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBACK     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBACK     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREC     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREL     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L84
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBCOMP     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L90
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PINGREQ     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PINGRESP     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> La8
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.DISCONNECT     // Catch: java.lang.NoSuchFieldError -> La8
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

    static {
            io.netty.handler.codec.mqtt.MqttEncoder r0 = new io.netty.handler.codec.mqtt.MqttEncoder
            r0.<init>()
            io.netty.handler.codec.mqtt.MqttEncoder.INSTANCE = r0
            return
    }

    private MqttEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    static io.netty.buffer.ByteBuf doEncode(io.netty.buffer.ByteBufAllocator r2, io.netty.handler.codec.mqtt.MqttMessage r3) {
            int[] r0 = io.netty.handler.codec.mqtt.MqttEncoder.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType
            io.netty.handler.codec.mqtt.MqttFixedHeader r1 = r3.fixedHeader()
            io.netty.handler.codec.mqtt.MqttMessageType r1 = r1.messageType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L63;
                case 2: goto L5c;
                case 3: goto L55;
                case 4: goto L4e;
                case 5: goto L47;
                case 6: goto L40;
                case 7: goto L3b;
                case 8: goto L3b;
                case 9: goto L3b;
                case 10: goto L3b;
                case 11: goto L3b;
                case 12: goto L36;
                case 13: goto L36;
                case 14: goto L36;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown message type: "
            r0.append(r1)
            io.netty.handler.codec.mqtt.MqttFixedHeader r3 = r3.fixedHeader()
            io.netty.handler.codec.mqtt.MqttMessageType r3 = r3.messageType()
            int r3 = r3.value()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L36:
            io.netty.buffer.ByteBuf r2 = encodeMessageWithOnlySingleByteFixedHeader(r2, r3)
            return r2
        L3b:
            io.netty.buffer.ByteBuf r2 = encodeMessageWithOnlySingleByteFixedHeaderAndMessageId(r2, r3)
            return r2
        L40:
            io.netty.handler.codec.mqtt.MqttSubAckMessage r3 = (io.netty.handler.codec.mqtt.MqttSubAckMessage) r3
            io.netty.buffer.ByteBuf r2 = encodeSubAckMessage(r2, r3)
            return r2
        L47:
            io.netty.handler.codec.mqtt.MqttUnsubscribeMessage r3 = (io.netty.handler.codec.mqtt.MqttUnsubscribeMessage) r3
            io.netty.buffer.ByteBuf r2 = encodeUnsubscribeMessage(r2, r3)
            return r2
        L4e:
            io.netty.handler.codec.mqtt.MqttSubscribeMessage r3 = (io.netty.handler.codec.mqtt.MqttSubscribeMessage) r3
            io.netty.buffer.ByteBuf r2 = encodeSubscribeMessage(r2, r3)
            return r2
        L55:
            io.netty.handler.codec.mqtt.MqttPublishMessage r3 = (io.netty.handler.codec.mqtt.MqttPublishMessage) r3
            io.netty.buffer.ByteBuf r2 = encodePublishMessage(r2, r3)
            return r2
        L5c:
            io.netty.handler.codec.mqtt.MqttConnAckMessage r3 = (io.netty.handler.codec.mqtt.MqttConnAckMessage) r3
            io.netty.buffer.ByteBuf r2 = encodeConnAckMessage(r2, r3)
            return r2
        L63:
            io.netty.handler.codec.mqtt.MqttConnectMessage r3 = (io.netty.handler.codec.mqtt.MqttConnectMessage) r3
            io.netty.buffer.ByteBuf r2 = encodeConnectMessage(r2, r3)
            return r2
    }

    private static io.netty.buffer.ByteBuf encodeConnAckMessage(io.netty.buffer.ByteBufAllocator r1, io.netty.handler.codec.mqtt.MqttConnAckMessage r2) {
            r0 = 4
            io.netty.buffer.ByteBuf r1 = r1.buffer(r0)
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r2.fixedHeader()
            int r0 = getFixedHeaderByte1(r0)
            r1.writeByte(r0)
            r0 = 2
            r1.writeByte(r0)
            io.netty.handler.codec.mqtt.MqttConnAckVariableHeader r0 = r2.variableHeader()
            boolean r0 = r0.isSessionPresent()
            r1.writeByte(r0)
            io.netty.handler.codec.mqtt.MqttConnAckVariableHeader r2 = r2.variableHeader()
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r2 = r2.connectReturnCode()
            byte r2 = r2.byteValue()
            r1.writeByte(r2)
            return r1
    }

    private static io.netty.buffer.ByteBuf encodeConnectMessage(io.netty.buffer.ByteBufAllocator r9, io.netty.handler.codec.mqtt.MqttConnectMessage r10) {
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r10.fixedHeader()
            io.netty.handler.codec.mqtt.MqttConnectVariableHeader r1 = r10.variableHeader()
            io.netty.handler.codec.mqtt.MqttConnectPayload r10 = r10.payload()
            java.lang.String r2 = r1.name()
            int r3 = r1.version()
            byte r3 = (byte) r3
            io.netty.handler.codec.mqtt.MqttVersion r2 = io.netty.handler.codec.mqtt.MqttVersion.fromProtocolNameAndLevel(r2, r3)
            boolean r3 = r1.hasUserName()
            if (r3 != 0) goto L2e
            boolean r3 = r1.hasPassword()
            if (r3 != 0) goto L26
            goto L2e
        L26:
            io.netty.handler.codec.DecoderException r9 = new io.netty.handler.codec.DecoderException
            java.lang.String r10 = "Without a username, the password MUST be not set"
            r9.<init>(r10)
            throw r9
        L2e:
            java.lang.String r3 = r10.clientIdentifier()
            boolean r4 = io.netty.handler.codec.mqtt.MqttCodecUtil.isValidClientId(r2, r3)
            if (r4 == 0) goto L102
            byte[] r3 = encodeStringUtf8(r3)
            int r4 = r3.length
            int r4 = r4 + 2
            java.lang.String r5 = r10.willTopic()
            if (r5 == 0) goto L4a
            byte[] r5 = encodeStringUtf8(r5)
            goto L4c
        L4a:
            byte[] r5 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
        L4c:
            byte[] r6 = r10.willMessageInBytes()
            if (r6 == 0) goto L53
            goto L55
        L53:
            byte[] r6 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
        L55:
            boolean r7 = r1.isWillFlag()
            if (r7 == 0) goto L63
            int r7 = r5.length
            int r7 = r7 + 2
            int r4 = r4 + r7
            int r7 = r6.length
            int r7 = r7 + 2
            int r4 = r4 + r7
        L63:
            java.lang.String r7 = r10.userName()
            if (r7 == 0) goto L6e
            byte[] r7 = encodeStringUtf8(r7)
            goto L70
        L6e:
            byte[] r7 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
        L70:
            boolean r8 = r1.hasUserName()
            if (r8 == 0) goto L7a
            int r8 = r7.length
            int r8 = r8 + 2
            int r4 = r4 + r8
        L7a:
            byte[] r10 = r10.passwordInBytes()
            if (r10 == 0) goto L81
            goto L83
        L81:
            byte[] r10 = io.netty.util.internal.EmptyArrays.EMPTY_BYTES
        L83:
            boolean r8 = r1.hasPassword()
            if (r8 == 0) goto L8d
            int r8 = r10.length
            int r8 = r8 + 2
            int r4 = r4 + r8
        L8d:
            byte[] r2 = r2.protocolNameBytes()
            int r8 = r2.length
            int r8 = r8 + 6
            int r8 = r8 + r4
            int r4 = getVariableLengthInt(r8)
            int r4 = r4 + 1
            int r4 = r4 + r8
            io.netty.buffer.ByteBuf r9 = r9.buffer(r4)
            int r0 = getFixedHeaderByte1(r0)
            r9.writeByte(r0)
            writeVariableLengthInt(r9, r8)
            int r0 = r2.length
            r9.writeShort(r0)
            r9.writeBytes(r2)
            int r0 = r1.version()
            r9.writeByte(r0)
            int r0 = getConnVariableHeaderFlag(r1)
            r9.writeByte(r0)
            int r0 = r1.keepAliveTimeSeconds()
            r9.writeShort(r0)
            int r0 = r3.length
            r9.writeShort(r0)
            int r0 = r3.length
            r2 = 0
            r9.writeBytes(r3, r2, r0)
            boolean r0 = r1.isWillFlag()
            if (r0 == 0) goto Le5
            int r0 = r5.length
            r9.writeShort(r0)
            int r0 = r5.length
            r9.writeBytes(r5, r2, r0)
            int r0 = r6.length
            r9.writeShort(r0)
            int r0 = r6.length
            r9.writeBytes(r6, r2, r0)
        Le5:
            boolean r0 = r1.hasUserName()
            if (r0 == 0) goto Lf3
            int r0 = r7.length
            r9.writeShort(r0)
            int r0 = r7.length
            r9.writeBytes(r7, r2, r0)
        Lf3:
            boolean r0 = r1.hasPassword()
            if (r0 == 0) goto L101
            int r0 = r10.length
            r9.writeShort(r0)
            int r0 = r10.length
            r9.writeBytes(r10, r2, r0)
        L101:
            return r9
        L102:
            io.netty.handler.codec.mqtt.MqttIdentifierRejectedException r9 = new io.netty.handler.codec.mqtt.MqttIdentifierRejectedException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "invalid clientIdentifier: "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private static io.netty.buffer.ByteBuf encodeMessageWithOnlySingleByteFixedHeader(io.netty.buffer.ByteBufAllocator r1, io.netty.handler.codec.mqtt.MqttMessage r2) {
            io.netty.handler.codec.mqtt.MqttFixedHeader r2 = r2.fixedHeader()
            r0 = 2
            io.netty.buffer.ByteBuf r1 = r1.buffer(r0)
            int r2 = getFixedHeaderByte1(r2)
            r1.writeByte(r2)
            r2 = 0
            r1.writeByte(r2)
            return r1
    }

    private static io.netty.buffer.ByteBuf encodeMessageWithOnlySingleByteFixedHeaderAndMessageId(io.netty.buffer.ByteBufAllocator r3, io.netty.handler.codec.mqtt.MqttMessage r4) {
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r4.fixedHeader()
            java.lang.Object r4 = r4.variableHeader()
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r4 = (io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader) r4
            int r4 = r4.messageId()
            r1 = 2
            int r2 = getVariableLengthInt(r1)
            int r2 = r2 + 3
            io.netty.buffer.ByteBuf r3 = r3.buffer(r2)
            int r0 = getFixedHeaderByte1(r0)
            r3.writeByte(r0)
            writeVariableLengthInt(r3, r1)
            r3.writeShort(r4)
            return r3
    }

    private static io.netty.buffer.ByteBuf encodePublishMessage(io.netty.buffer.ByteBufAllocator r6, io.netty.handler.codec.mqtt.MqttPublishMessage r7) {
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r7.fixedHeader()
            io.netty.handler.codec.mqtt.MqttPublishVariableHeader r1 = r7.variableHeader()
            io.netty.buffer.ByteBuf r7 = r7.payload()
            io.netty.buffer.ByteBuf r7 = r7.duplicate()
            java.lang.String r2 = r1.topicName()
            byte[] r2 = encodeStringUtf8(r2)
            int r3 = r2.length
            r4 = 2
            int r3 = r3 + r4
            io.netty.handler.codec.mqtt.MqttQoS r5 = r0.qosLevel()
            int r5 = r5.value()
            if (r5 <= 0) goto L26
            goto L27
        L26:
            r4 = 0
        L27:
            int r3 = r3 + r4
            int r4 = r7.readableBytes()
            int r3 = r3 + r4
            int r4 = getVariableLengthInt(r3)
            int r4 = r4 + 1
            int r4 = r4 + r3
            io.netty.buffer.ByteBuf r6 = r6.buffer(r4)
            int r4 = getFixedHeaderByte1(r0)
            r6.writeByte(r4)
            writeVariableLengthInt(r6, r3)
            int r3 = r2.length
            r6.writeShort(r3)
            r6.writeBytes(r2)
            io.netty.handler.codec.mqtt.MqttQoS r0 = r0.qosLevel()
            int r0 = r0.value()
            if (r0 <= 0) goto L5a
            int r0 = r1.messageId()
            r6.writeShort(r0)
        L5a:
            r6.writeBytes(r7)
            return r6
    }

    private static byte[] encodeStringUtf8(java.lang.String r1) {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            byte[] r1 = r1.getBytes(r0)
            return r1
    }

    private static io.netty.buffer.ByteBuf encodeSubAckMessage(io.netty.buffer.ByteBufAllocator r2, io.netty.handler.codec.mqtt.MqttSubAckMessage r3) {
            io.netty.handler.codec.mqtt.MqttSubAckPayload r0 = r3.payload()
            java.util.List r0 = r0.grantedQoSLevels()
            int r0 = r0.size()
            int r0 = r0 + 2
            int r1 = getVariableLengthInt(r0)
            int r1 = r1 + 1
            int r1 = r1 + r0
            io.netty.buffer.ByteBuf r2 = r2.buffer(r1)
            io.netty.handler.codec.mqtt.MqttFixedHeader r1 = r3.fixedHeader()
            int r1 = getFixedHeaderByte1(r1)
            r2.writeByte(r1)
            writeVariableLengthInt(r2, r0)
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r0 = r3.variableHeader()
            int r0 = r0.messageId()
            r2.writeShort(r0)
            io.netty.handler.codec.mqtt.MqttSubAckPayload r3 = r3.payload()
            java.util.List r3 = r3.grantedQoSLevels()
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r3.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.writeByte(r0)
            goto L3e
        L52:
            return r2
    }

    private static io.netty.buffer.ByteBuf encodeSubscribeMessage(io.netty.buffer.ByteBufAllocator r7, io.netty.handler.codec.mqtt.MqttSubscribeMessage r8) {
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r8.fixedHeader()
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r1 = r8.variableHeader()
            io.netty.handler.codec.mqtt.MqttSubscribePayload r8 = r8.payload()
            java.util.List r2 = r8.topicSubscriptions()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 0
        L16:
            boolean r5 = r2.hasNext()
            r6 = 2
            if (r5 == 0) goto L31
            java.lang.Object r5 = r2.next()
            io.netty.handler.codec.mqtt.MqttTopicSubscription r5 = (io.netty.handler.codec.mqtt.MqttTopicSubscription) r5
            java.lang.String r5 = r5.topicName()
            byte[] r5 = encodeStringUtf8(r5)
            int r5 = r5.length
            int r5 = r5 + r6
            int r4 = r4 + r5
            int r4 = r4 + 1
            goto L16
        L31:
            int r6 = r6 + r4
            int r2 = getVariableLengthInt(r6)
            int r2 = r2 + 1
            int r2 = r2 + r6
            io.netty.buffer.ByteBuf r7 = r7.buffer(r2)
            int r0 = getFixedHeaderByte1(r0)
            r7.writeByte(r0)
            writeVariableLengthInt(r7, r6)
            int r0 = r1.messageId()
            r7.writeShort(r0)
            java.util.List r8 = r8.topicSubscriptions()
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r8.next()
            io.netty.handler.codec.mqtt.MqttTopicSubscription r0 = (io.netty.handler.codec.mqtt.MqttTopicSubscription) r0
            java.lang.String r1 = r0.topicName()
            byte[] r1 = encodeStringUtf8(r1)
            int r2 = r1.length
            r7.writeShort(r2)
            int r2 = r1.length
            r7.writeBytes(r1, r3, r2)
            io.netty.handler.codec.mqtt.MqttQoS r0 = r0.qualityOfService()
            int r0 = r0.value()
            r7.writeByte(r0)
            goto L56
        L7e:
            return r7
    }

    private static io.netty.buffer.ByteBuf encodeUnsubscribeMessage(io.netty.buffer.ByteBufAllocator r7, io.netty.handler.codec.mqtt.MqttUnsubscribeMessage r8) {
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r8.fixedHeader()
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r1 = r8.variableHeader()
            io.netty.handler.codec.mqtt.MqttUnsubscribePayload r8 = r8.payload()
            java.util.List r2 = r8.topics()
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = 0
        L16:
            boolean r5 = r2.hasNext()
            r6 = 2
            if (r5 == 0) goto L2b
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            byte[] r5 = encodeStringUtf8(r5)
            int r5 = r5.length
            int r5 = r5 + r6
            int r4 = r4 + r5
            goto L16
        L2b:
            int r6 = r6 + r4
            int r2 = getVariableLengthInt(r6)
            int r2 = r2 + 1
            int r2 = r2 + r6
            io.netty.buffer.ByteBuf r7 = r7.buffer(r2)
            int r0 = getFixedHeaderByte1(r0)
            r7.writeByte(r0)
            writeVariableLengthInt(r7, r6)
            int r0 = r1.messageId()
            r7.writeShort(r0)
            java.util.List r8 = r8.topics()
            java.util.Iterator r8 = r8.iterator()
        L50:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = encodeStringUtf8(r0)
            int r1 = r0.length
            r7.writeShort(r1)
            int r1 = r0.length
            r7.writeBytes(r0, r3, r1)
            goto L50
        L69:
            return r7
    }

    private static int getConnVariableHeaderFlag(io.netty.handler.codec.mqtt.MqttConnectVariableHeader r2) {
            boolean r0 = r2.hasUserName()
            if (r0 == 0) goto L9
            r0 = 128(0x80, float:1.8E-43)
            goto La
        L9:
            r0 = 0
        La:
            boolean r1 = r2.hasPassword()
            if (r1 == 0) goto L12
            r0 = r0 | 64
        L12:
            boolean r1 = r2.isWillRetain()
            if (r1 == 0) goto L1a
            r0 = r0 | 32
        L1a:
            int r1 = r2.willQos()
            r1 = r1 & 3
            int r1 = r1 << 3
            r0 = r0 | r1
            boolean r1 = r2.isWillFlag()
            if (r1 == 0) goto L2b
            r0 = r0 | 4
        L2b:
            boolean r2 = r2.isCleanSession()
            if (r2 == 0) goto L34
            r2 = r0 | 2
            return r2
        L34:
            return r0
    }

    private static int getFixedHeaderByte1(io.netty.handler.codec.mqtt.MqttFixedHeader r2) {
            io.netty.handler.codec.mqtt.MqttMessageType r0 = r2.messageType()
            int r0 = r0.value()
            int r0 = r0 << 4
            boolean r1 = r2.isDup()
            if (r1 == 0) goto L12
            r0 = r0 | 8
        L12:
            io.netty.handler.codec.mqtt.MqttQoS r1 = r2.qosLevel()
            int r1 = r1.value()
            int r1 = r1 << 1
            r0 = r0 | r1
            boolean r2 = r2.isRetain()
            if (r2 == 0) goto L26
            r2 = r0 | 1
            return r2
        L26:
            return r0
    }

    private static int getVariableLengthInt(int r1) {
            r0 = 0
        L1:
            int r1 = r1 / 128
            int r0 = r0 + 1
            if (r1 > 0) goto L1
            return r0
    }

    private static void writeVariableLengthInt(io.netty.buffer.ByteBuf r1, int r2) {
        L0:
            int r0 = r2 % 128
            int r2 = r2 / 128
            if (r2 <= 0) goto L8
            r0 = r0 | 128(0x80, float:1.8E-43)
        L8:
            r1.writeByte(r0)
            if (r2 > 0) goto L0
            return
    }

    /* renamed from: encode, reason: avoid collision after fix types in other method */
    protected void encode2(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.mqtt.MqttMessage r2, java.util.List<java.lang.Object> r3) throws java.lang.Exception {
            r0 = this;
            io.netty.buffer.ByteBufAllocator r1 = r1.alloc()
            io.netty.buffer.ByteBuf r1 = doEncode(r1, r2)
            r3.add(r1)
            return
    }

    @Override // io.netty.handler.codec.MessageToMessageEncoder
    protected /* bridge */ /* synthetic */ void encode(io.netty.channel.ChannelHandlerContext r1, io.netty.handler.codec.mqtt.MqttMessage r2, java.util.List r3) throws java.lang.Exception {
            r0 = this;
            io.netty.handler.codec.mqtt.MqttMessage r2 = (io.netty.handler.codec.mqtt.MqttMessage) r2
            r0.encode2(r1, r2, r3)
            return
    }
}
