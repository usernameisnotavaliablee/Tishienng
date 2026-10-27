package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttConnectPayload {
    private final java.lang.String clientIdentifier;
    private final byte[] password;
    private final java.lang.String userName;
    private final byte[] willMessage;
    private final java.lang.String willTopic;

    @java.lang.Deprecated
    public MqttConnectPayload(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r7 = this;
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            byte[] r4 = r10.getBytes(r0)
            byte[] r6 = r12.getBytes(r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public MqttConnectPayload(java.lang.String r1, java.lang.String r2, byte[] r3, java.lang.String r4, byte[] r5) {
            r0 = this;
            r0.<init>()
            r0.clientIdentifier = r1
            r0.willTopic = r2
            r0.willMessage = r3
            r0.userName = r4
            r0.password = r5
            return
    }

    public java.lang.String clientIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.clientIdentifier
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String password() {
            r3 = this;
            byte[] r0 = r3.password
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.UTF_8
            r1.<init>(r0, r2)
            return r1
    }

    public byte[] passwordInBytes() {
            r1 = this;
            byte[] r0 = r1.password
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "clientIdentifier="
            r0.append(r1)
            java.lang.String r1 = r2.clientIdentifier
            r0.append(r1)
            java.lang.String r1 = ", willTopic="
            r0.append(r1)
            java.lang.String r1 = r2.willTopic
            r0.append(r1)
            java.lang.String r1 = ", willMessage="
            r0.append(r1)
            byte[] r1 = r2.willMessage
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", userName="
            r0.append(r1)
            java.lang.String r1 = r2.userName
            r0.append(r1)
            java.lang.String r1 = ", password="
            r0.append(r1)
            byte[] r1 = r2.password
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String userName() {
            r1 = this;
            java.lang.String r0 = r1.userName
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String willMessage() {
            r3 = this;
            byte[] r0 = r3.willMessage
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = io.netty.util.CharsetUtil.UTF_8
            r1.<init>(r0, r2)
            return r1
    }

    public byte[] willMessageInBytes() {
            r1 = this;
            byte[] r0 = r1.willMessage
            return r0
    }

    public java.lang.String willTopic() {
            r1 = this;
            java.lang.String r0 = r1.willTopic
            return r0
    }
}
