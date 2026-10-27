package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttMessageFactory {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.mqtt.MqttMessageFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = null;

        static {
                io.netty.handler.codec.mqtt.MqttMessageType[] r0 = io.netty.handler.codec.mqtt.MqttMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = r0
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNECT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNACK     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.SUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.SUBACK     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBACK     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBLISH     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBACK     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREC     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREL     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L84
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBCOMP     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L90
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PINGREQ     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PINGRESP     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> La8
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

    private MqttMessageFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static io.netty.handler.codec.mqtt.MqttMessage newInvalidMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r2, java.lang.Object r3, java.lang.Throwable r4) {
            io.netty.handler.codec.mqtt.MqttMessage r0 = new io.netty.handler.codec.mqtt.MqttMessage
            r1 = 0
            io.netty.handler.codec.DecoderResult r4 = io.netty.handler.codec.DecoderResult.failure(r4)
            r0.<init>(r2, r3, r1, r4)
            return r0
    }

    public static io.netty.handler.codec.mqtt.MqttMessage newInvalidMessage(java.lang.Throwable r2) {
            io.netty.handler.codec.mqtt.MqttMessage r0 = new io.netty.handler.codec.mqtt.MqttMessage
            r1 = 0
            io.netty.handler.codec.DecoderResult r2 = io.netty.handler.codec.DecoderResult.failure(r2)
            r0.<init>(r1, r1, r1, r2)
            return r0
    }

    public static io.netty.handler.codec.mqtt.MqttMessage newMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r2, java.lang.Object r3, java.lang.Object r4) {
            int[] r0 = io.netty.handler.codec.mqtt.MqttMessageFactory.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType
            io.netty.handler.codec.mqtt.MqttMessageType r1 = r2.messageType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L76;
                case 2: goto L6e;
                case 3: goto L64;
                case 4: goto L5a;
                case 5: goto L52;
                case 6: goto L48;
                case 7: goto L3e;
                case 8: goto L36;
                case 9: goto L30;
                case 10: goto L30;
                case 11: goto L30;
                case 12: goto L2a;
                case 13: goto L2a;
                case 14: goto L2a;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "unknown message type: "
            r4.append(r0)
            io.netty.handler.codec.mqtt.MqttMessageType r2 = r2.messageType()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L2a:
            io.netty.handler.codec.mqtt.MqttMessage r3 = new io.netty.handler.codec.mqtt.MqttMessage
            r3.<init>(r2)
            return r3
        L30:
            io.netty.handler.codec.mqtt.MqttMessage r4 = new io.netty.handler.codec.mqtt.MqttMessage
            r4.<init>(r2, r3)
            return r4
        L36:
            io.netty.handler.codec.mqtt.MqttPubAckMessage r4 = new io.netty.handler.codec.mqtt.MqttPubAckMessage
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader) r3
            r4.<init>(r2, r3)
            return r4
        L3e:
            io.netty.handler.codec.mqtt.MqttPublishMessage r0 = new io.netty.handler.codec.mqtt.MqttPublishMessage
            io.netty.handler.codec.mqtt.MqttPublishVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttPublishVariableHeader) r3
            io.netty.buffer.ByteBuf r4 = (io.netty.buffer.ByteBuf) r4
            r0.<init>(r2, r3, r4)
            return r0
        L48:
            io.netty.handler.codec.mqtt.MqttUnsubscribeMessage r0 = new io.netty.handler.codec.mqtt.MqttUnsubscribeMessage
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader) r3
            io.netty.handler.codec.mqtt.MqttUnsubscribePayload r4 = (io.netty.handler.codec.mqtt.MqttUnsubscribePayload) r4
            r0.<init>(r2, r3, r4)
            return r0
        L52:
            io.netty.handler.codec.mqtt.MqttUnsubAckMessage r4 = new io.netty.handler.codec.mqtt.MqttUnsubAckMessage
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader) r3
            r4.<init>(r2, r3)
            return r4
        L5a:
            io.netty.handler.codec.mqtt.MqttSubAckMessage r0 = new io.netty.handler.codec.mqtt.MqttSubAckMessage
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader) r3
            io.netty.handler.codec.mqtt.MqttSubAckPayload r4 = (io.netty.handler.codec.mqtt.MqttSubAckPayload) r4
            r0.<init>(r2, r3, r4)
            return r0
        L64:
            io.netty.handler.codec.mqtt.MqttSubscribeMessage r0 = new io.netty.handler.codec.mqtt.MqttSubscribeMessage
            io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttMessageIdVariableHeader) r3
            io.netty.handler.codec.mqtt.MqttSubscribePayload r4 = (io.netty.handler.codec.mqtt.MqttSubscribePayload) r4
            r0.<init>(r2, r3, r4)
            return r0
        L6e:
            io.netty.handler.codec.mqtt.MqttConnAckMessage r4 = new io.netty.handler.codec.mqtt.MqttConnAckMessage
            io.netty.handler.codec.mqtt.MqttConnAckVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttConnAckVariableHeader) r3
            r4.<init>(r2, r3)
            return r4
        L76:
            io.netty.handler.codec.mqtt.MqttConnectMessage r0 = new io.netty.handler.codec.mqtt.MqttConnectMessage
            io.netty.handler.codec.mqtt.MqttConnectVariableHeader r3 = (io.netty.handler.codec.mqtt.MqttConnectVariableHeader) r3
            io.netty.handler.codec.mqtt.MqttConnectPayload r4 = (io.netty.handler.codec.mqtt.MqttConnectPayload) r4
            r0.<init>(r2, r3, r4)
            return r0
    }
}
