package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class MqttUnsubscribePayload {
    private final java.util.List<java.lang.String> topics;

    public MqttUnsubscribePayload(java.util.List<java.lang.String> r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.topics = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r3)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            r1 = 0
        Lf:
            java.util.List<java.lang.String> r2 = r3.topics
            int r2 = r2.size()
            if (r1 >= r2) goto L2f
            java.lang.String r2 = "topicName = "
            r0.append(r2)
            java.util.List<java.lang.String> r2 = r3.topics
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            int r1 = r1 + 1
            goto Lf
        L2f:
            java.util.List<java.lang.String> r1 = r3.topics
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L40
            int r1 = r0.length()
            int r1 = r1 + (-2)
            r0.setLength(r1)
        L40:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.List<java.lang.String> topics() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.topics
            return r0
    }
}
