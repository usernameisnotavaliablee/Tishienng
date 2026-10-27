package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum MqttConnectReturnCode extends java.lang.Enum<io.netty.handler.codec.mqtt.MqttConnectReturnCode> {
    private static final /* synthetic */ io.netty.handler.codec.mqtt.MqttConnectReturnCode[] $VALUES = null;
    public static final io.netty.handler.codec.mqtt.MqttConnectReturnCode CONNECTION_ACCEPTED = null;
    public static final io.netty.handler.codec.mqtt.MqttConnectReturnCode CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD = null;
    public static final io.netty.handler.codec.mqtt.MqttConnectReturnCode CONNECTION_REFUSED_IDENTIFIER_REJECTED = null;
    public static final io.netty.handler.codec.mqtt.MqttConnectReturnCode CONNECTION_REFUSED_NOT_AUTHORIZED = null;
    public static final io.netty.handler.codec.mqtt.MqttConnectReturnCode CONNECTION_REFUSED_SERVER_UNAVAILABLE = null;
    public static final io.netty.handler.codec.mqtt.MqttConnectReturnCode CONNECTION_REFUSED_UNACCEPTABLE_PROTOCOL_VERSION = null;
    private static final java.util.Map<java.lang.Byte, io.netty.handler.codec.mqtt.MqttConnectReturnCode> VALUE_TO_CODE_MAP = null;
    private final byte byteValue;

    static {
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r0 = new io.netty.handler.codec.mqtt.MqttConnectReturnCode
            java.lang.String r1 = "CONNECTION_ACCEPTED"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.CONNECTION_ACCEPTED = r0
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r1 = new io.netty.handler.codec.mqtt.MqttConnectReturnCode
            java.lang.String r3 = "CONNECTION_REFUSED_UNACCEPTABLE_PROTOCOL_VERSION"
            r4 = 1
            r1.<init>(r3, r4, r4)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.CONNECTION_REFUSED_UNACCEPTABLE_PROTOCOL_VERSION = r1
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r3 = new io.netty.handler.codec.mqtt.MqttConnectReturnCode
            java.lang.String r5 = "CONNECTION_REFUSED_IDENTIFIER_REJECTED"
            r6 = 2
            r3.<init>(r5, r6, r6)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.CONNECTION_REFUSED_IDENTIFIER_REJECTED = r3
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r5 = new io.netty.handler.codec.mqtt.MqttConnectReturnCode
            java.lang.String r7 = "CONNECTION_REFUSED_SERVER_UNAVAILABLE"
            r8 = 3
            r5.<init>(r7, r8, r8)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.CONNECTION_REFUSED_SERVER_UNAVAILABLE = r5
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r7 = new io.netty.handler.codec.mqtt.MqttConnectReturnCode
            java.lang.String r9 = "CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD"
            r10 = 4
            r7.<init>(r9, r10, r10)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD = r7
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r9 = new io.netty.handler.codec.mqtt.MqttConnectReturnCode
            java.lang.String r11 = "CONNECTION_REFUSED_NOT_AUTHORIZED"
            r12 = 5
            r9.<init>(r11, r12, r12)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.CONNECTION_REFUSED_NOT_AUTHORIZED = r9
            r11 = 6
            io.netty.handler.codec.mqtt.MqttConnectReturnCode[] r11 = new io.netty.handler.codec.mqtt.MqttConnectReturnCode[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.$VALUES = r11
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            io.netty.handler.codec.mqtt.MqttConnectReturnCode[] r1 = values()
            int r3 = r1.length
        L57:
            if (r2 >= r3) goto L67
            r4 = r1[r2]
            byte r5 = r4.byteValue
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r0.put(r5, r4)
            int r2 = r2 + 1
            goto L57
        L67:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode.VALUE_TO_CODE_MAP = r0
            return
    }

    MqttConnectReturnCode(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.byteValue = r3
            return
    }

    public static io.netty.handler.codec.mqtt.MqttConnectReturnCode valueOf(byte r3) {
            java.util.Map<java.lang.Byte, io.netty.handler.codec.mqtt.MqttConnectReturnCode> r0 = io.netty.handler.codec.mqtt.MqttConnectReturnCode.VALUE_TO_CODE_MAP
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L17
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r3 = (io.netty.handler.codec.mqtt.MqttConnectReturnCode) r3
            return r3
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown connect return code: "
            r1.append(r2)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static io.netty.handler.codec.mqtt.MqttConnectReturnCode valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.mqtt.MqttConnectReturnCode> r0 = io.netty.handler.codec.mqtt.MqttConnectReturnCode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r1 = (io.netty.handler.codec.mqtt.MqttConnectReturnCode) r1
            return r1
    }

    public static io.netty.handler.codec.mqtt.MqttConnectReturnCode[] values() {
            io.netty.handler.codec.mqtt.MqttConnectReturnCode[] r0 = io.netty.handler.codec.mqtt.MqttConnectReturnCode.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.mqtt.MqttConnectReturnCode[] r0 = (io.netty.handler.codec.mqtt.MqttConnectReturnCode[]) r0
            return r0
    }

    public byte byteValue() {
            r1 = this;
            byte r0 = r1.byteValue
            return r0
    }
}
