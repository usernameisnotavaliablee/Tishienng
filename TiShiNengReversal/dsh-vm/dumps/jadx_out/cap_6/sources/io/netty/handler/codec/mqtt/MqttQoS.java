package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum MqttQoS extends java.lang.Enum<io.netty.handler.codec.mqtt.MqttQoS> {
    private static final /* synthetic */ io.netty.handler.codec.mqtt.MqttQoS[] $VALUES = null;
    public static final io.netty.handler.codec.mqtt.MqttQoS AT_LEAST_ONCE = null;
    public static final io.netty.handler.codec.mqtt.MqttQoS AT_MOST_ONCE = null;
    public static final io.netty.handler.codec.mqtt.MqttQoS EXACTLY_ONCE = null;
    public static final io.netty.handler.codec.mqtt.MqttQoS FAILURE = null;
    private final int value;

    static {
            io.netty.handler.codec.mqtt.MqttQoS r0 = new io.netty.handler.codec.mqtt.MqttQoS
            java.lang.String r1 = "AT_MOST_ONCE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            io.netty.handler.codec.mqtt.MqttQoS.AT_MOST_ONCE = r0
            io.netty.handler.codec.mqtt.MqttQoS r1 = new io.netty.handler.codec.mqtt.MqttQoS
            java.lang.String r3 = "AT_LEAST_ONCE"
            r4 = 1
            r1.<init>(r3, r4, r4)
            io.netty.handler.codec.mqtt.MqttQoS.AT_LEAST_ONCE = r1
            io.netty.handler.codec.mqtt.MqttQoS r3 = new io.netty.handler.codec.mqtt.MqttQoS
            java.lang.String r5 = "EXACTLY_ONCE"
            r6 = 2
            r3.<init>(r5, r6, r6)
            io.netty.handler.codec.mqtt.MqttQoS.EXACTLY_ONCE = r3
            io.netty.handler.codec.mqtt.MqttQoS r5 = new io.netty.handler.codec.mqtt.MqttQoS
            r7 = 128(0x80, float:1.8E-43)
            java.lang.String r8 = "FAILURE"
            r9 = 3
            r5.<init>(r8, r9, r7)
            io.netty.handler.codec.mqtt.MqttQoS.FAILURE = r5
            r7 = 4
            io.netty.handler.codec.mqtt.MqttQoS[] r7 = new io.netty.handler.codec.mqtt.MqttQoS[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r9] = r5
            io.netty.handler.codec.mqtt.MqttQoS.$VALUES = r7
            return
    }

    MqttQoS(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static io.netty.handler.codec.mqtt.MqttQoS valueOf(int r5) {
            io.netty.handler.codec.mqtt.MqttQoS[] r0 = values()
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
            java.lang.String r2 = "invalid QoS: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public static io.netty.handler.codec.mqtt.MqttQoS valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.mqtt.MqttQoS> r0 = io.netty.handler.codec.mqtt.MqttQoS.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.mqtt.MqttQoS r1 = (io.netty.handler.codec.mqtt.MqttQoS) r1
            return r1
    }

    public static io.netty.handler.codec.mqtt.MqttQoS[] values() {
            io.netty.handler.codec.mqtt.MqttQoS[] r0 = io.netty.handler.codec.mqtt.MqttQoS.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.mqtt.MqttQoS[] r0 = (io.netty.handler.codec.mqtt.MqttQoS[]) r0
            return r0
    }

    public int value() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
