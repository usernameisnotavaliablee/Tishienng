package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class AlarmManagerScheduler implements com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler {
    static final java.lang.String ATTEMPT_NUMBER = "attemptNumber";
    static final java.lang.String BACKEND_NAME = "backendName";
    static final java.lang.String EVENT_PRIORITY = "priority";
    static final java.lang.String EXTRAS = "extras";
    private static final java.lang.String LOG_TAG = "AlarmManagerScheduler";
    private android.app.AlarmManager alarmManager;
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;

    @androidx.annotation.VisibleForTesting
    AlarmManagerScheduler(android.content.Context r1, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r2, android.app.AlarmManager r3, com.google.android.datatransport.runtime.time.Clock r4, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r5) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.eventStore = r2
            r0.alarmManager = r3
            r0.clock = r4
            r0.config = r5
            return
    }

    public AlarmManagerScheduler(android.content.Context r8, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r9, com.google.android.datatransport.runtime.time.Clock r10, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r11) {
            r7 = this;
            java.lang.String r0 = "alarm"
            java.lang.Object r0 = r8.getSystemService(r0)
            r4 = r0
            android.app.AlarmManager r4 = (android.app.AlarmManager) r4
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    @androidx.annotation.VisibleForTesting
    boolean isJobServiceOn(android.content.Intent r4) {
            r3 = this;
            android.content.Context r0 = r3.context
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = 0
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r0, r2, r4, r1)
            if (r4 == 0) goto Ld
            r4 = 1
            return r4
        Ld:
            return r2
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r2, int r3) {
            r1 = this;
            r0 = 0
            r1.schedule(r2, r3, r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r8, int r9, boolean r10) {
            r7 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "backendName"
            java.lang.String r2 = r8.getBackendName()
            r0.appendQueryParameter(r1, r2)
            com.google.android.datatransport.Priority r1 = r8.getPriority()
            int r1 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "priority"
            r0.appendQueryParameter(r2, r1)
            byte[] r1 = r8.getExtras()
            r2 = 0
            if (r1 == 0) goto L33
            byte[] r1 = r8.getExtras()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r2)
            java.lang.String r3 = "extras"
            r0.appendQueryParameter(r3, r1)
        L33:
            android.content.Intent r1 = new android.content.Intent
            android.content.Context r3 = r7.context
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver> r4 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver.class
            r1.<init>(r3, r4)
            android.net.Uri r0 = r0.build()
            r1.setData(r0)
            java.lang.String r0 = "attemptNumber"
            r1.putExtra(r0, r9)
            java.lang.String r0 = "AlarmManagerScheduler"
            if (r10 != 0) goto L58
            boolean r10 = r7.isJobServiceOn(r1)
            if (r10 == 0) goto L58
            java.lang.String r9 = "Upload for context %s is already scheduled. Returning..."
            com.google.android.datatransport.runtime.logging.Logging.d(r0, r9, r8)
            return
        L58:
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r10 = r7.eventStore
            long r3 = r10.getNextCallTime(r8)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r10 = r7.config
            com.google.android.datatransport.Priority r5 = r8.getPriority()
            long r5 = r10.getScheduleDelay(r5, r3, r9)
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r8
            r8 = 1
            r4[r8] = r10
            r8 = 2
            r4[r8] = r3
            r8 = 3
            r4[r8] = r9
            java.lang.String r9 = "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d"
            com.google.android.datatransport.runtime.logging.Logging.d(r0, r9, r4)
            android.content.Context r9 = r7.context
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r9, r2, r1, r2)
            android.app.AlarmManager r10 = r7.alarmManager
            com.google.android.datatransport.runtime.time.Clock r0 = r7.clock
            long r0 = r0.getTime()
            long r0 = r0 + r5
            r10.set(r8, r0, r9)
            return
    }
}
