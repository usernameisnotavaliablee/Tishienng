package com.google.common.eventbus;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class DeadEvent {
    private final java.lang.Object event;
    private final java.lang.Object source;

    public DeadEvent(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            r0.source = r1
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
            r0.event = r1
            return
    }

    public java.lang.Object getEvent() {
            r1 = this;
            java.lang.Object r0 = r1.event
            return r0
    }

    public java.lang.Object getSource() {
            r1 = this;
            java.lang.Object r0 = r1.source
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r3)
            java.lang.String r1 = "source"
            java.lang.Object r2 = r3.source
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r1 = "event"
            java.lang.Object r2 = r3.event
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.add(r1, r2)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
