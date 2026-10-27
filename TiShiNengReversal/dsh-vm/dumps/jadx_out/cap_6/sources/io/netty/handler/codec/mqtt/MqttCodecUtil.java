package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class MqttCodecUtil {
    private static final int MAX_CLIENT_ID_LENGTH = 23;
    private static final int MIN_CLIENT_ID_LENGTH = 1;
    private static final char[] TOPIC_WILDCARDS = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.mqtt.MqttCodecUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = null;

        static {
                io.netty.handler.codec.mqtt.MqttMessageType[] r0 = io.netty.handler.codec.mqtt.MqttMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType = r0
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.SUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBSCRIBE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNECT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L3e
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.CONNACK     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L49
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBACK     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L54
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBREC     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L60
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PUBCOMP     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L6c
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.SUBACK     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L78
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.UNSUBACK     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L84
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PINGREQ     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L90
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.PINGRESP     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType     // Catch: java.lang.NoSuchFieldError -> L9c
                io.netty.handler.codec.mqtt.MqttMessageType r1 = io.netty.handler.codec.mqtt.MqttMessageType.DISCONNECT     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [35, 43} // fill-array
            io.netty.handler.codec.mqtt.MqttCodecUtil.TOPIC_WILDCARDS = r0
            return
    }

    private MqttCodecUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isValidClientId(io.netty.handler.codec.mqtt.MqttVersion r3, java.lang.String r4) {
            io.netty.handler.codec.mqtt.MqttVersion r0 = io.netty.handler.codec.mqtt.MqttVersion.MQTT_3_1
            r1 = 0
            r2 = 1
            if (r3 != r0) goto L18
            if (r4 == 0) goto L17
            int r3 = r4.length()
            if (r3 < r2) goto L17
            int r3 = r4.length()
            r4 = 23
            if (r3 > r4) goto L17
            return r2
        L17:
            return r1
        L18:
            io.netty.handler.codec.mqtt.MqttVersion r0 = io.netty.handler.codec.mqtt.MqttVersion.MQTT_3_1_1
            if (r3 != r0) goto L20
            if (r4 == 0) goto L1f
            return r2
        L1f:
            return r1
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " is unknown mqtt version"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    static boolean isValidMessageId(int r0) {
            if (r0 == 0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    static boolean isValidPublishTopicName(java.lang.String r5) {
            char[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.TOPIC_WILDCARDS
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L13
            char r4 = r0[r3]
            int r4 = r5.indexOf(r4)
            if (r4 < 0) goto L10
            return r2
        L10:
            int r3 = r3 + 1
            goto L5
        L13:
            r5 = 1
            return r5
    }

    static io.netty.handler.codec.mqtt.MqttFixedHeader resetUnusedFields(io.netty.handler.codec.mqtt.MqttFixedHeader r7) {
            int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType
            io.netty.handler.codec.mqtt.MqttMessageType r1 = r7.messageType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L36;
                case 2: goto L36;
                case 3: goto L36;
                case 4: goto L10;
                case 5: goto L10;
                case 6: goto L10;
                case 7: goto L10;
                case 8: goto L10;
                case 9: goto L10;
                case 10: goto L10;
                case 11: goto L10;
                case 12: goto L10;
                case 13: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L53
        L10:
            boolean r0 = r7.isDup()
            if (r0 != 0) goto L24
            io.netty.handler.codec.mqtt.MqttQoS r0 = r7.qosLevel()
            io.netty.handler.codec.mqtt.MqttQoS r1 = io.netty.handler.codec.mqtt.MqttQoS.AT_MOST_ONCE
            if (r0 != r1) goto L24
            boolean r0 = r7.isRetain()
            if (r0 == 0) goto L53
        L24:
            io.netty.handler.codec.mqtt.MqttFixedHeader r1 = new io.netty.handler.codec.mqtt.MqttFixedHeader
            io.netty.handler.codec.mqtt.MqttMessageType r2 = r7.messageType()
            io.netty.handler.codec.mqtt.MqttQoS r4 = io.netty.handler.codec.mqtt.MqttQoS.AT_MOST_ONCE
            r5 = 0
            int r6 = r7.remainingLength()
            r3 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L36:
            boolean r0 = r7.isRetain()
            if (r0 == 0) goto L53
            io.netty.handler.codec.mqtt.MqttFixedHeader r1 = new io.netty.handler.codec.mqtt.MqttFixedHeader
            io.netty.handler.codec.mqtt.MqttMessageType r2 = r7.messageType()
            boolean r3 = r7.isDup()
            io.netty.handler.codec.mqtt.MqttQoS r4 = r7.qosLevel()
            r5 = 0
            int r6 = r7.remainingLength()
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L53:
            return r7
    }

    static io.netty.handler.codec.mqtt.MqttFixedHeader validateFixedHeader(io.netty.handler.codec.mqtt.MqttFixedHeader r2) {
            int[] r0 = io.netty.handler.codec.mqtt.MqttCodecUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$mqtt$MqttMessageType
            io.netty.handler.codec.mqtt.MqttMessageType r1 = r2.messageType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L16
            r1 = 3
            if (r0 == r1) goto L16
            goto L1e
        L16:
            io.netty.handler.codec.mqtt.MqttQoS r0 = r2.qosLevel()
            io.netty.handler.codec.mqtt.MqttQoS r1 = io.netty.handler.codec.mqtt.MqttQoS.AT_LEAST_ONCE
            if (r0 != r1) goto L1f
        L1e:
            return r2
        L1f:
            io.netty.handler.codec.DecoderException r0 = new io.netty.handler.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            io.netty.handler.codec.mqtt.MqttMessageType r2 = r2.messageType()
            java.lang.String r2 = r2.name()
            r1.append(r2)
            java.lang.String r2 = " message must have QoS 1"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }
}
