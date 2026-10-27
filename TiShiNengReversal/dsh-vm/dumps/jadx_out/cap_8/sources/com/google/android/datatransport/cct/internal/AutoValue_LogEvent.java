package com.google.android.datatransport.cct.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class AutoValue_LogEvent extends com.google.android.datatransport.cct.internal.LogEvent {
    private final java.lang.Integer eventCode;
    private final long eventTimeMs;
    private final long eventUptimeMs;
    private final com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
    private final byte[] sourceExtension;
    private final java.lang.String sourceExtensionJsonProto3;
    private final long timezoneOffsetSeconds;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.datatransport.cct.internal.AutoValue_LogEvent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Builder extends com.google.android.datatransport.cct.internal.LogEvent.Builder {
        private java.lang.Integer eventCode;
        private java.lang.Long eventTimeMs;
        private java.lang.Long eventUptimeMs;
        private com.google.android.datatransport.cct.internal.NetworkConnectionInfo networkConnectionInfo;
        private byte[] sourceExtension;
        private java.lang.String sourceExtensionJsonProto3;
        private java.lang.Long timezoneOffsetSeconds;

        Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent build() {
                r14 = this;
                java.lang.Long r0 = r14.eventTimeMs
                java.lang.String r1 = ""
                if (r0 != 0) goto L17
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " eventTimeMs"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L17:
                java.lang.Long r0 = r14.eventUptimeMs
                if (r0 != 0) goto L2c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " eventUptimeMs"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L2c:
                java.lang.Long r0 = r14.timezoneOffsetSeconds
                if (r0 != 0) goto L41
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = " timezoneOffsetSeconds"
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L41:
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L68
                com.google.android.datatransport.cct.internal.AutoValue_LogEvent r2 = new com.google.android.datatransport.cct.internal.AutoValue_LogEvent
                java.lang.Long r0 = r14.eventTimeMs
                long r3 = r0.longValue()
                java.lang.Integer r5 = r14.eventCode
                java.lang.Long r0 = r14.eventUptimeMs
                long r6 = r0.longValue()
                byte[] r8 = r14.sourceExtension
                java.lang.String r9 = r14.sourceExtensionJsonProto3
                java.lang.Long r0 = r14.timezoneOffsetSeconds
                long r10 = r0.longValue()
                com.google.android.datatransport.cct.internal.NetworkConnectionInfo r12 = r14.networkConnectionInfo
                r13 = 0
                r2.<init>(r3, r5, r6, r8, r9, r10, r12, r13)
                return r2
            L68:
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

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventCode(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.eventCode = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventTimeMs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.eventTimeMs = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setEventUptimeMs(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.eventUptimeMs = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setNetworkConnectionInfo(@androidx.annotation.Nullable com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1) {
                r0 = this;
                r0.networkConnectionInfo = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtension(@androidx.annotation.Nullable byte[] r1) {
                r0 = this;
                r0.sourceExtension = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        com.google.android.datatransport.cct.internal.LogEvent.Builder setSourceExtensionJsonProto3(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.sourceExtensionJsonProto3 = r1
                return r0
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public com.google.android.datatransport.cct.internal.LogEvent.Builder setTimezoneOffsetSeconds(long r1) {
                r0 = this;
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.timezoneOffsetSeconds = r1
                return r0
        }
    }

    private AutoValue_LogEvent(long r1, @androidx.annotation.Nullable java.lang.Integer r3, long r4, @androidx.annotation.Nullable byte[] r6, @androidx.annotation.Nullable java.lang.String r7, long r8, @androidx.annotation.Nullable com.google.android.datatransport.cct.internal.NetworkConnectionInfo r10) {
            r0 = this;
            r0.<init>()
            r0.eventTimeMs = r1
            r0.eventCode = r3
            r0.eventUptimeMs = r4
            r0.sourceExtension = r6
            r0.sourceExtensionJsonProto3 = r7
            r0.timezoneOffsetSeconds = r8
            r0.networkConnectionInfo = r10
            return
    }

    /* synthetic */ AutoValue_LogEvent(long r1, java.lang.Integer r3, long r4, byte[] r6, java.lang.String r7, long r8, com.google.android.datatransport.cct.internal.NetworkConnectionInfo r10, com.google.android.datatransport.cct.internal.AutoValue_LogEvent.AnonymousClass1 r11) {
            r0 = this;
            r0.<init>(r1, r3, r4, r6, r7, r8, r10)
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.datatransport.cct.internal.LogEvent
            r2 = 0
            if (r1 == 0) goto L7f
            com.google.android.datatransport.cct.internal.LogEvent r8 = (com.google.android.datatransport.cct.internal.LogEvent) r8
            long r3 = r7.eventTimeMs
            long r5 = r8.getEventTimeMs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7f
            java.lang.Integer r1 = r7.eventCode
            if (r1 != 0) goto L20
            java.lang.Integer r1 = r8.getEventCode()
            if (r1 != 0) goto L7f
            goto L2a
        L20:
            java.lang.Integer r3 = r8.getEventCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7f
        L2a:
            long r3 = r7.eventUptimeMs
            long r5 = r8.getEventUptimeMs()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7f
            byte[] r1 = r7.sourceExtension
            boolean r3 = r8 instanceof com.google.android.datatransport.cct.internal.AutoValue_LogEvent
            if (r3 == 0) goto L40
            r3 = r8
            com.google.android.datatransport.cct.internal.AutoValue_LogEvent r3 = (com.google.android.datatransport.cct.internal.AutoValue_LogEvent) r3
            byte[] r3 = r3.sourceExtension
            goto L44
        L40:
            byte[] r3 = r8.getSourceExtension()
        L44:
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L7f
            java.lang.String r1 = r7.sourceExtensionJsonProto3
            if (r1 != 0) goto L55
            java.lang.String r1 = r8.getSourceExtensionJsonProto3()
            if (r1 != 0) goto L7f
            goto L5f
        L55:
            java.lang.String r3 = r8.getSourceExtensionJsonProto3()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L7f
        L5f:
            long r3 = r7.timezoneOffsetSeconds
            long r5 = r8.getTimezoneOffsetSeconds()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L7f
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = r7.networkConnectionInfo
            if (r1 != 0) goto L74
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r8 = r8.getNetworkConnectionInfo()
            if (r8 != 0) goto L7f
            goto L7e
        L74:
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r8 = r8.getNetworkConnectionInfo()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L7f
        L7e:
            return r0
        L7f:
            return r2
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @androidx.annotation.Nullable
    public java.lang.Integer getEventCode() {
            r1 = this;
            java.lang.Integer r0 = r1.eventCode
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
            r2 = this;
            long r0 = r2.eventTimeMs
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
            r2 = this;
            long r0 = r2.eventUptimeMs
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @androidx.annotation.Nullable
    public com.google.android.datatransport.cct.internal.NetworkConnectionInfo getNetworkConnectionInfo() {
            r1 = this;
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r0 = r1.networkConnectionInfo
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @androidx.annotation.Nullable
    public byte[] getSourceExtension() {
            r1 = this;
            byte[] r0 = r1.sourceExtension
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @androidx.annotation.Nullable
    public java.lang.String getSourceExtensionJsonProto3() {
            r1 = this;
            java.lang.String r0 = r1.sourceExtensionJsonProto3
            return r0
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
            r2 = this;
            long r0 = r2.timezoneOffsetSeconds
            return r0
    }

    public int hashCode() {
            r9 = this;
            long r0 = r9.eventTimeMs
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r1 = (int) r0
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            java.lang.Integer r3 = r9.eventCode
            r4 = 0
            if (r3 != 0) goto L15
            r3 = 0
            goto L19
        L15:
            int r3 = r3.hashCode()
        L19:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r5 = r9.eventUptimeMs
            long r7 = r5 >>> r2
            long r5 = r5 ^ r7
            int r3 = (int) r5
            r1 = r1 ^ r3
            int r1 = r1 * r0
            byte[] r3 = r9.sourceExtension
            int r3 = java.util.Arrays.hashCode(r3)
            r1 = r1 ^ r3
            int r1 = r1 * r0
            java.lang.String r3 = r9.sourceExtensionJsonProto3
            if (r3 != 0) goto L34
            r3 = 0
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            r1 = r1 ^ r3
            int r1 = r1 * r0
            long r5 = r9.timezoneOffsetSeconds
            long r2 = r5 >>> r2
            long r2 = r2 ^ r5
            int r3 = (int) r2
            r1 = r1 ^ r3
            int r1 = r1 * r0
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r0 = r9.networkConnectionInfo
            if (r0 != 0) goto L49
            goto L4d
        L49:
            int r4 = r0.hashCode()
        L4d:
            r0 = r1 ^ r4
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LogEvent{eventTimeMs="
            r0.append(r1)
            long r1 = r3.eventTimeMs
            r0.append(r1)
            java.lang.String r1 = ", eventCode="
            r0.append(r1)
            java.lang.Integer r1 = r3.eventCode
            r0.append(r1)
            java.lang.String r1 = ", eventUptimeMs="
            r0.append(r1)
            long r1 = r3.eventUptimeMs
            r0.append(r1)
            java.lang.String r1 = ", sourceExtension="
            r0.append(r1)
            byte[] r1 = r3.sourceExtension
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", sourceExtensionJsonProto3="
            r0.append(r1)
            java.lang.String r1 = r3.sourceExtensionJsonProto3
            r0.append(r1)
            java.lang.String r1 = ", timezoneOffsetSeconds="
            r0.append(r1)
            long r1 = r3.timezoneOffsetSeconds
            r0.append(r1)
            java.lang.String r1 = ", networkConnectionInfo="
            r0.append(r1)
            com.google.android.datatransport.cct.internal.NetworkConnectionInfo r1 = r3.networkConnectionInfo
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
