package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum MqttVersion extends java.lang.Enum<io.netty.handler.codec.mqtt.MqttVersion> {
    private static final /* synthetic */ io.netty.handler.codec.mqtt.MqttVersion[] $VALUES = null;
    public static final io.netty.handler.codec.mqtt.MqttVersion MQTT_3_1 = null;
    public static final io.netty.handler.codec.mqtt.MqttVersion MQTT_3_1_1 = null;
    private final byte level;
    private final java.lang.String name;

    static {
            io.netty.handler.codec.mqtt.MqttVersion r0 = new io.netty.handler.codec.mqtt.MqttVersion
            java.lang.String r1 = "MQIsdp"
            r2 = 3
            java.lang.String r3 = "MQTT_3_1"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            io.netty.handler.codec.mqtt.MqttVersion.MQTT_3_1 = r0
            io.netty.handler.codec.mqtt.MqttVersion r1 = new io.netty.handler.codec.mqtt.MqttVersion
            java.lang.String r2 = "MQTT"
            r3 = 4
            java.lang.String r5 = "MQTT_3_1_1"
            r6 = 1
            r1.<init>(r5, r6, r2, r3)
            io.netty.handler.codec.mqtt.MqttVersion.MQTT_3_1_1 = r1
            r2 = 2
            io.netty.handler.codec.mqtt.MqttVersion[] r2 = new io.netty.handler.codec.mqtt.MqttVersion[r2]
            r2[r4] = r0
            r2[r6] = r1
            io.netty.handler.codec.mqtt.MqttVersion.$VALUES = r2
            return
    }

    MqttVersion(java.lang.String r1, int r2, java.lang.String r3, byte r4) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "protocolName"
            java.lang.Object r1 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.name = r1
            r0.level = r4
            return
    }

    public static io.netty.handler.codec.mqtt.MqttVersion fromProtocolNameAndLevel(java.lang.String r5, byte r6) {
            io.netty.handler.codec.mqtt.MqttVersion[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L39
            r3 = r0[r2]
            java.lang.String r4 = r3.name
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L36
            byte r0 = r3.level
            if (r0 != r6) goto L17
            return r3
        L17:
            io.netty.handler.codec.mqtt.MqttUnacceptableProtocolVersionException r0 = new io.netty.handler.codec.mqtt.MqttUnacceptableProtocolVersionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " and "
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " are not match"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L36:
            int r2 = r2 + 1
            goto L6
        L39:
            io.netty.handler.codec.mqtt.MqttUnacceptableProtocolVersionException r6 = new io.netty.handler.codec.mqtt.MqttUnacceptableProtocolVersionException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = "is unknown protocol name"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
    }

    public static io.netty.handler.codec.mqtt.MqttVersion valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.mqtt.MqttVersion> r0 = io.netty.handler.codec.mqtt.MqttVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.mqtt.MqttVersion r1 = (io.netty.handler.codec.mqtt.MqttVersion) r1
            return r1
    }

    public static io.netty.handler.codec.mqtt.MqttVersion[] values() {
            io.netty.handler.codec.mqtt.MqttVersion[] r0 = io.netty.handler.codec.mqtt.MqttVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.mqtt.MqttVersion[] r0 = (io.netty.handler.codec.mqtt.MqttVersion[]) r0
            return r0
    }

    public byte protocolLevel() {
            r1 = this;
            byte r0 = r1.level
            return r0
    }

    public java.lang.String protocolName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public byte[] protocolNameBytes() {
            r2 = this;
            java.lang.String r0 = r2.name
            java.nio.charset.Charset r1 = io.netty.util.CharsetUtil.UTF_8
            byte[] r0 = r0.getBytes(r1)
            return r0
    }
}
