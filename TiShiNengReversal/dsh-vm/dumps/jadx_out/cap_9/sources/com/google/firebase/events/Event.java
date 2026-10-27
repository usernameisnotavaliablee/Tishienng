package com.google.firebase.events;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Event<T> {
    private final T payload;
    private final java.lang.Class<T> type;

    public Event(java.lang.Class<T> r1, T r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.firebase.components.Preconditions.checkNotNull(r1)
            java.lang.Class r1 = (java.lang.Class) r1
            r0.type = r1
            java.lang.Object r1 = com.google.firebase.components.Preconditions.checkNotNull(r2)
            r0.payload = r1
            return
    }

    public T getPayload() {
            r1 = this;
            T r0 = r1.payload
            return r0
    }

    public java.lang.Class<T> getType() {
            r1 = this;
            java.lang.Class<T> r0 = r1.type
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.Class<T> r0 = r4.type
            T r1 = r4.payload
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "Event{type: %s, payload: %s}"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            return r0
    }
}
