package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum MqttMessageType extends java.lang.Enum<io.netty.handler.codec.mqtt.MqttMessageType> {
    private static final /* synthetic */ io.netty.handler.codec.mqtt.MqttMessageType[] $VALUES = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType CONNACK = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType CONNECT = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType DISCONNECT = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType PINGREQ = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType PINGRESP = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType PUBACK = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType PUBCOMP = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType PUBLISH = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType PUBREC = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType PUBREL = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType SUBACK = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType SUBSCRIBE = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType UNSUBACK = null;
    public static final io.netty.handler.codec.mqtt.MqttMessageType UNSUBSCRIBE = null;
    private final int value;

    static {
            io.netty.handler.codec.mqtt.MqttMessageType r0 = new io.netty.handler.codec.mqtt.MqttMessageType
            java.lang.String r1 = "CONNECT"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            io.netty.handler.codec.mqtt.MqttMessageType.CONNECT = r0
            io.netty.handler.codec.mqtt.MqttMessageType r1 = new io.netty.handler.codec.mqtt.MqttMessageType
            java.lang.String r4 = "CONNACK"
            r5 = 2
            r1.<init>(r4, r3, r5)
            io.netty.handler.codec.mqtt.MqttMessageType.CONNACK = r1
            io.netty.handler.codec.mqtt.MqttMessageType r4 = new io.netty.handler.codec.mqtt.MqttMessageType
            java.lang.String r6 = "PUBLISH"
            r7 = 3
            r4.<init>(r6, r5, r7)
            io.netty.handler.codec.mqtt.MqttMessageType.PUBLISH = r4
            io.netty.handler.codec.mqtt.MqttMessageType r6 = new io.netty.handler.codec.mqtt.MqttMessageType
            java.lang.String r8 = "PUBACK"
            r9 = 4
            r6.<init>(r8, r7, r9)
            io.netty.handler.codec.mqtt.MqttMessageType.PUBACK = r6
            io.netty.handler.codec.mqtt.MqttMessageType r8 = new io.netty.handler.codec.mqtt.MqttMessageType
            java.lang.String r10 = "PUBREC"
            r11 = 5
            r8.<init>(r10, r9, r11)
            io.netty.handler.codec.mqtt.MqttMessageType.PUBREC = r8
            io.netty.handler.codec.mqtt.MqttMessageType r10 = new io.netty.handler.codec.mqtt.MqttMessageType
            java.lang.String r12 = "PUBREL"
            r13 = 6
            r10.<init>(r12, r11, r13)
            io.netty.handler.codec.mqtt.MqttMessageType.PUBREL = r10
            io.netty.handler.codec.mqtt.MqttMessageType r12 = new io.netty.handler.codec.mqtt.MqttMessageType
            java.lang.String r14 = "PUBCOMP"
            r15 = 7
            r12.<init>(r14, r13, r15)
            io.netty.handler.codec.mqtt.MqttMessageType.PUBCOMP = r12
            io.netty.handler.codec.mqtt.MqttMessageType r14 = new io.netty.handler.codec.mqtt.MqttMessageType
            r16 = 0
            java.lang.String r2 = "SUBSCRIBE"
            r17 = 1
            r3 = 8
            r14.<init>(r2, r15, r3)
            io.netty.handler.codec.mqtt.MqttMessageType.SUBSCRIBE = r14
            io.netty.handler.codec.mqtt.MqttMessageType r2 = new io.netty.handler.codec.mqtt.MqttMessageType
            r18 = 2
            java.lang.String r5 = "SUBACK"
            r19 = 3
            r7 = 9
            r2.<init>(r5, r3, r7)
            io.netty.handler.codec.mqtt.MqttMessageType.SUBACK = r2
            io.netty.handler.codec.mqtt.MqttMessageType r5 = new io.netty.handler.codec.mqtt.MqttMessageType
            r20 = 8
            java.lang.String r3 = "UNSUBSCRIBE"
            r21 = 4
            r9 = 10
            r5.<init>(r3, r7, r9)
            io.netty.handler.codec.mqtt.MqttMessageType.UNSUBSCRIBE = r5
            io.netty.handler.codec.mqtt.MqttMessageType r3 = new io.netty.handler.codec.mqtt.MqttMessageType
            r22 = 9
            java.lang.String r7 = "UNSUBACK"
            r23 = 5
            r11 = 11
            r3.<init>(r7, r9, r11)
            io.netty.handler.codec.mqtt.MqttMessageType.UNSUBACK = r3
            io.netty.handler.codec.mqtt.MqttMessageType r7 = new io.netty.handler.codec.mqtt.MqttMessageType
            r24 = 10
            java.lang.String r9 = "PINGREQ"
            r25 = 6
            r13 = 12
            r7.<init>(r9, r11, r13)
            io.netty.handler.codec.mqtt.MqttMessageType.PINGREQ = r7
            io.netty.handler.codec.mqtt.MqttMessageType r9 = new io.netty.handler.codec.mqtt.MqttMessageType
            r26 = 11
            java.lang.String r11 = "PINGRESP"
            r27 = 7
            r15 = 13
            r9.<init>(r11, r13, r15)
            io.netty.handler.codec.mqtt.MqttMessageType.PINGRESP = r9
            io.netty.handler.codec.mqtt.MqttMessageType r11 = new io.netty.handler.codec.mqtt.MqttMessageType
            r28 = 12
            java.lang.String r13 = "DISCONNECT"
            r29 = r0
            r0 = 14
            r11.<init>(r13, r15, r0)
            io.netty.handler.codec.mqtt.MqttMessageType.DISCONNECT = r11
            io.netty.handler.codec.mqtt.MqttMessageType[] r0 = new io.netty.handler.codec.mqtt.MqttMessageType[r0]
            r0[r16] = r29
            r0[r17] = r1
            r0[r18] = r4
            r0[r19] = r6
            r0[r21] = r8
            r0[r23] = r10
            r0[r25] = r12
            r0[r27] = r14
            r0[r20] = r2
            r0[r22] = r5
            r0[r24] = r3
            r0[r26] = r7
            r0[r28] = r9
            r0[r15] = r11
            io.netty.handler.codec.mqtt.MqttMessageType.$VALUES = r0
            return
    }

    MqttMessageType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static io.netty.handler.codec.mqtt.MqttMessageType valueOf(int r5) {
            io.netty.handler.codec.mqtt.MqttMessageType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.value
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown message type: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public static io.netty.handler.codec.mqtt.MqttMessageType valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.mqtt.MqttMessageType> r0 = io.netty.handler.codec.mqtt.MqttMessageType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.mqtt.MqttMessageType r1 = (io.netty.handler.codec.mqtt.MqttMessageType) r1
            return r1
    }

    public static io.netty.handler.codec.mqtt.MqttMessageType[] values() {
            io.netty.handler.codec.mqtt.MqttMessageType[] r0 = io.netty.handler.codec.mqtt.MqttMessageType.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.mqtt.MqttMessageType[] r0 = (io.netty.handler.codec.mqtt.MqttMessageType[]) r0
            return r0
    }

    public int value() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
