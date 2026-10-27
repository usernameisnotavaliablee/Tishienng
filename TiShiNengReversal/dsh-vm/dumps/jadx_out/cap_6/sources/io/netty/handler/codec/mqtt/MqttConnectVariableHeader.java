package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttConnectVariableHeader {
    private final boolean hasPassword;
    private final boolean hasUserName;
    private final boolean isCleanSession;
    private final boolean isWillFlag;
    private final boolean isWillRetain;
    private final int keepAliveTimeSeconds;
    private final java.lang.String name;
    private final int version;
    private final int willQos;

    public MqttConnectVariableHeader(java.lang.String r1, int r2, boolean r3, boolean r4, boolean r5, int r6, boolean r7, boolean r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.version = r2
            r0.hasUserName = r3
            r0.hasPassword = r4
            r0.isWillRetain = r5
            r0.willQos = r6
            r0.isWillFlag = r7
            r0.isCleanSession = r8
            r0.keepAliveTimeSeconds = r9
            return
    }

    public boolean hasPassword() {
            r1 = this;
            boolean r0 = r1.hasPassword
            return r0
    }

    public boolean hasUserName() {
            r1 = this;
            boolean r0 = r1.hasUserName
            return r0
    }

    public boolean isCleanSession() {
            r1 = this;
            boolean r0 = r1.isCleanSession
            return r0
    }

    public boolean isWillFlag() {
            r1 = this;
            boolean r0 = r1.isWillFlag
            return r0
    }

    public boolean isWillRetain() {
            r1 = this;
            boolean r0 = r1.isWillRetain
            return r0
    }

    public int keepAliveTimeSeconds() {
            r1 = this;
            int r0 = r1.keepAliveTimeSeconds
            return r0
    }

    public java.lang.String name() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "name="
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ", version="
            r0.append(r1)
            int r1 = r2.version
            r0.append(r1)
            java.lang.String r1 = ", hasUserName="
            r0.append(r1)
            boolean r1 = r2.hasUserName
            r0.append(r1)
            java.lang.String r1 = ", hasPassword="
            r0.append(r1)
            boolean r1 = r2.hasPassword
            r0.append(r1)
            java.lang.String r1 = ", isWillRetain="
            r0.append(r1)
            boolean r1 = r2.isWillRetain
            r0.append(r1)
            java.lang.String r1 = ", isWillFlag="
            r0.append(r1)
            boolean r1 = r2.isWillFlag
            r0.append(r1)
            java.lang.String r1 = ", isCleanSession="
            r0.append(r1)
            boolean r1 = r2.isCleanSession
            r0.append(r1)
            java.lang.String r1 = ", keepAliveTimeSeconds="
            r0.append(r1)
            int r1 = r2.keepAliveTimeSeconds
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int version() {
            r1 = this;
            int r0 = r1.version
            return r0
    }

    public int willQos() {
            r1 = this;
            int r0 = r1.willQos
            return r0
    }
}
