package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class AutoValue_EventInternal extends com.google.android.datatransport.runtime.EventInternal {
    private final java.util.Map<java.lang.String, java.lang.String> autoMetadata;
    private final java.lang.Integer code;
    private final com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
    private final long eventMillis;
    private final java.lang.String transportName;
    private final long uptimeMillis;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.datatransport.runtime.AutoValue_EventInternal$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends com.google.android.datatransport.runtime.EventInternal.Builder {
        private java.util.Map<java.lang.String, java.lang.String> autoMetadata;
        private java.lang.Integer code;
        private com.google.android.datatransport.runtime.EncodedPayload encodedPayload;
        private java.lang.Long eventMillis;
        private java.lang.String transportName;
        private java.lang.Long uptimeMillis;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal build() {
                r12 = this;
                java.lang.String r0 = r12.transportName
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " transportName"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                com.google.android.datatransport.runtime.EncodedPayload r0 = r12.encodedPayload
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " encodedPayload"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Long r0 = r12.eventMillis
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " eventMillis"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                java.lang.Long r0 = r12.uptimeMillis
                if (r0 != 0) goto L56
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " uptimeMillis"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L56:
                java.util.Map<java.lang.String, java.lang.String> r0 = r12.autoMetadata
                if (r0 != 0) goto L6b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " autoMetadata"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L6b:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L8c
                com.google.android.datatransport.runtime.AutoValue_EventInternal r2 = new com.google.android.datatransport.runtime.AutoValue_EventInternal
                java.lang.String r3 = r12.transportName
                java.lang.Integer r4 = r12.code
                com.google.android.datatransport.runtime.EncodedPayload r5 = r12.encodedPayload
                java.lang.Long r0 = r12.eventMillis
                long r6 = r0.longValue()
                java.lang.Long r0 = r12.uptimeMillis
                long r8 = r0.longValue()
                java.util.Map<java.lang.String, java.lang.String> r10 = r12.autoMetadata
                r11 = 0
                r2.<init>(r3, r4, r5, r6, r8, r10, r11)
                return r2
            L8c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Missing required properties:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
                r2 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r2.autoMetadata
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Property \"autoMetadata\" has not been set"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        protected com.google.android.datatransport.runtime.EventInternal.Builder setAutoMetadata(java.util.Map<java.lang.String, java.lang.String> r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.autoMetadata = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null autoMetadata"
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setCode(java.lang.Integer r1) {
                r0 = this;
                r0.code = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEncodedPayload(com.google.android.datatransport.runtime.EncodedPayload r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.encodedPayload = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null encodedPayload"
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setEventMillis(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.eventMillis = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setTransportName(java.lang.String r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.transportName = r2
                return r1
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "Null transportName"
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public com.google.android.datatransport.runtime.EventInternal.Builder setUptimeMillis(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.uptimeMillis = r1
                return r0
        }
    }

    private AutoValue_EventInternal(java.lang.String r1, @androidx.annotation.Nullable java.lang.Integer r2, com.google.android.datatransport.runtime.EncodedPayload r3, long r4, long r6, java.util.Map<java.lang.String, java.lang.String> r8) {
            r0 = this;
            r0.<init>()
            r0.transportName = r1
            r0.code = r2
            r0.encodedPayload = r3
            r0.eventMillis = r4
            r0.uptimeMillis = r6
            r0.autoMetadata = r8
            return
    }

    /* synthetic */ AutoValue_EventInternal(java.lang.String r1, java.lang.Integer r2, com.google.android.datatransport.runtime.EncodedPayload r3, long r4, long r6, java.util.Map r8, com.google.android.datatransport.runtime.AutoValue_EventInternal.AnonymousClass1 r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r6, r8)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.runtime.EventInternal
            r2 = 0
            if (r1 == 0) goto L59
            com.google.android.datatransport.runtime.EventInternal r8 = (com.google.android.datatransport.runtime.EventInternal) r8
            java.lang.String r1 = r7.transportName
            java.lang.String r3 = r8.getTransportName()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
            java.lang.Integer r1 = r7.code
            if (r1 != 0) goto L22
            java.lang.Integer r1 = r8.getCode()
            if (r1 != 0) goto L59
            goto L2c
        L22:
            java.lang.Integer r3 = r8.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
        L2c:
            com.google.android.datatransport.runtime.EncodedPayload r1 = r7.encodedPayload
            com.google.android.datatransport.runtime.EncodedPayload r3 = r8.getEncodedPayload()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L59
            long r3 = r7.eventMillis
            long r5 = r8.getEventMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            long r3 = r7.uptimeMillis
            long r5 = r8.getUptimeMillis()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L59
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.autoMetadata
            java.util.Map r8 = r8.getAutoMetadata()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L59
            return r0
        L59:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    protected java.util.Map<java.lang.String, java.lang.String> getAutoMetadata() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.autoMetadata
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @androidx.annotation.Nullable
    public java.lang.Integer getCode() {
            r1 = this;
            java.lang.Integer r0 = r1.code
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public com.google.android.datatransport.runtime.EncodedPayload getEncodedPayload() {
            r1 = this;
            com.google.android.datatransport.runtime.EncodedPayload r0 = r1.encodedPayload
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
            r2 = this;
            long r0 = r2.eventMillis
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public java.lang.String getTransportName() {
            r1 = this;
            java.lang.String r0 = r1.transportName
            return r0
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
            r2 = this;
            long r0 = r2.uptimeMillis
            return r0
    }

    public int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.transportName
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Integer r2 = r7.code
            if (r2 != 0) goto L12
            r2 = 0
            goto L16
        L12:
            int r2 = r2.hashCode()
        L16:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            com.google.android.datatransport.runtime.EncodedPayload r2 = r7.encodedPayload
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.eventMillis
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            long r2 = r7.uptimeMillis
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r3 = (int) r2
            r0 = r0 ^ r3
            int r0 = r0 * r1
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.autoMetadata
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "EventInternal{transportName="
            r0.append(r1)
            java.lang.String r1 = r3.transportName
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            java.lang.Integer r1 = r3.code
            r0.append(r1)
            java.lang.String r1 = ", encodedPayload="
            r0.append(r1)
            com.google.android.datatransport.runtime.EncodedPayload r1 = r3.encodedPayload
            r0.append(r1)
            java.lang.String r1 = ", eventMillis="
            r0.append(r1)
            long r1 = r3.eventMillis
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.uptimeMillis
            r0.append(r1)
            java.lang.String r1 = ", autoMetadata="
            r0.append(r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.autoMetadata
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
