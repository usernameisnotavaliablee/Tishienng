package io.netty.handler.codec.mqtt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class MqttSubAckPayload {
    private final java.util.List<java.lang.Integer> grantedQoSLevels;

    public MqttSubAckPayload(java.lang.Iterable<java.lang.Integer> r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L28
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r3.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L1d
            goto L21
        L1d:
            r0.add(r1)
            goto Le
        L21:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r2.grantedQoSLevels = r3
            return
        L28:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "grantedQoSLevels"
            r3.<init>(r0)
            throw r3
    }

    public MqttSubAckPayload(int... r5) {
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L22
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L1b
            r3 = r5[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Ld
        L1b:
            java.util.List r5 = java.util.Collections.unmodifiableList(r0)
            r4.grantedQoSLevels = r5
            return
        L22:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "grantedQoSLevels"
            r5.<init>(r0)
            throw r5
    }

    public java.util.List<java.lang.Integer> grantedQoSLevels() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.grantedQoSLevels
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r2)
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = "grantedQoSLevels="
            r0.append(r1)
            java.util.List<java.lang.Integer> r1 = r2.grantedQoSLevels
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
