package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MqttMessage {
    private final io.netty.handler.codec.DecoderResult decoderResult;
    private final io.netty.handler.codec.mqtt.MqttFixedHeader mqttFixedHeader;
    private final java.lang.Object payload;
    private final java.lang.Object variableHeader;

    public MqttMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public MqttMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r2, java.lang.Object r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public MqttMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = io.netty.handler.codec.DecoderResult.SUCCESS
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public MqttMessage(io.netty.handler.codec.mqtt.MqttFixedHeader r1, java.lang.Object r2, java.lang.Object r3, io.netty.handler.codec.DecoderResult r4) {
            r0 = this;
            r0.<init>()
            r0.mqttFixedHeader = r1
            r0.variableHeader = r2
            r0.payload = r3
            r0.decoderResult = r4
            return
    }

    public io.netty.handler.codec.DecoderResult decoderResult() {
            r1 = this;
            io.netty.handler.codec.DecoderResult r0 = r1.decoderResult
            return r0
    }

    public io.netty.handler.codec.mqtt.MqttFixedHeader fixedHeader() {
            r1 = this;
            io.netty.handler.codec.mqtt.MqttFixedHeader r0 = r1.mqttFixedHeader
            return r0
    }

    public java.lang.Object payload() {
            r1 = this;
            java.lang.Object r0 = r1.payload
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "fixedHeader="
            r0.append(r1)
            io.netty.handler.codec.mqtt.MqttFixedHeader r1 = r3.fixedHeader()
            java.lang.String r2 = ""
            if (r1 == 0) goto L24
            io.netty.handler.codec.mqtt.MqttFixedHeader r1 = r3.fixedHeader()
            java.lang.String r1 = r1.toString()
            goto L25
        L24:
            r1 = r2
        L25:
            r0.append(r1)
            java.lang.String r1 = ", variableHeader="
            r0.append(r1)
            java.lang.Object r1 = r3.variableHeader()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r3.variableHeader
            java.lang.String r1 = r1.toString()
            goto L3b
        L3a:
            r1 = r2
        L3b:
            r0.append(r1)
            java.lang.String r1 = ", payload="
            r0.append(r1)
            java.lang.Object r1 = r3.payload()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r3.payload
            java.lang.String r2 = r1.toString()
        L4f:
            r0.append(r2)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object variableHeader() {
            r1 = this;
            java.lang.Object r0 = r1.variableHeader
            return r0
    }
}
