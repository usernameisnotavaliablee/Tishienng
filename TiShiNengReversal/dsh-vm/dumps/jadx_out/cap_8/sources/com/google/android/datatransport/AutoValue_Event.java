package com.google.android.datatransport;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class AutoValue_Event<T> extends com.google.android.datatransport.Event<T> {
    private final java.lang.Integer code;
    private final T payload;
    private final com.google.android.datatransport.Priority priority;

    AutoValue_Event(@androidx.annotation.Nullable java.lang.Integer r1, T r2, com.google.android.datatransport.Priority r3) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            if (r2 == 0) goto L16
            r0.payload = r2
            if (r3 == 0) goto Le
            r0.priority = r3
            return
        Le:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null priority"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null payload"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.Event
            r2 = 0
            if (r1 == 0) goto L39
            com.google.android.datatransport.Event r5 = (com.google.android.datatransport.Event) r5
            java.lang.Integer r1 = r4.code
            if (r1 != 0) goto L16
            java.lang.Integer r1 = r5.getCode()
            if (r1 != 0) goto L39
            goto L20
        L16:
            java.lang.Integer r3 = r5.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L39
        L20:
            T r1 = r4.payload
            java.lang.Object r3 = r5.getPayload()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L39
            com.google.android.datatransport.Priority r1 = r4.priority
            com.google.android.datatransport.Priority r5 = r5.getPriority()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L39
            return r0
        L39:
            return r2
    }

    @Override // com.google.android.datatransport.Event
    @androidx.annotation.Nullable
    public java.lang.Integer getCode() {
            r1 = this;
            java.lang.Integer r0 = r1.code
            return r0
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
            r1 = this;
            T r0 = r1.payload
            return r0
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.Priority getPriority() {
            r1 = this;
            com.google.android.datatransport.Priority r0 = r1.priority
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.code
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            T r2 = r3.payload
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.Priority r1 = r3.priority
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Event{code="
            r0.append(r1)
            java.lang.Integer r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = ", payload="
            r0.append(r1)
            T r1 = r2.payload
            r0.append(r1)
            java.lang.String r1 = ", priority="
            r0.append(r1)
            com.google.android.datatransport.Priority r1 = r2.priority
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
