package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class AutoValue_SchedulerConfig extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig {
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> values;

    AutoValue_SchedulerConfig(com.google.android.datatransport.runtime.time.Clock r1, java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            r0.clock = r1
            if (r2 == 0) goto Lc
            r0.values = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null values"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null clock"
            r1.<init>(r2)
            throw r1
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
            r2 = 0
            if (r1 == 0) goto L24
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r5 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) r5
            com.google.android.datatransport.runtime.time.Clock r1 = r4.clock
            com.google.android.datatransport.runtime.time.Clock r3 = r5.getClock()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L24
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r1 = r4.values
            java.util.Map r5 = r5.getValues()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L24
            return r0
        L24:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    com.google.android.datatransport.runtime.time.Clock getClock() {
            r1 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r1.clock
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> getValues() {
            r1 = this;
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r0 = r1.values
            return r0
    }

    public int hashCode() {
            r2 = this;
            com.google.android.datatransport.runtime.time.Clock r0 = r2.clock
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r1 = r2.values
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SchedulerConfig{clock="
            r0.append(r1)
            com.google.android.datatransport.runtime.time.Clock r1 = r2.clock
            r0.append(r1)
            java.lang.String r1 = ", values="
            r0.append(r1)
            java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$ConfigValue> r1 = r2.values
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
