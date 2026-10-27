package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttConnAckVariableHeader {
    private final io.netty.handler.codec.mqtt.MqttConnectReturnCode connectReturnCode;
    private final boolean sessionPresent;

    public MqttConnAckVariableHeader(io.netty.handler.codec.mqtt.MqttConnectReturnCode r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.connectReturnCode = r1
            r0.sessionPresent = r2
            return
    }

    public io.netty.handler.codec.mqtt.MqttConnectReturnCode connectReturnCode() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r0 = r1.connectReturnCode
            return r0
    }

    public boolean isSessionPresent() {
            r1 = this;
            boolean r0 = r1.sessionPresent
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "connectReturnCode="
            r0.append(r1)
            io.netty.handler.codec.mqtt.MqttConnectReturnCode r1 = r2.connectReturnCode
            r0.append(r1)
            java.lang.String r1 = ", sessionPresent="
            r0.append(r1)
            boolean r1 = r2.sessionPresent
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
