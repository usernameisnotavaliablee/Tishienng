package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JobInfoScheduler implements com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler {
    static final java.lang.String ATTEMPT_NUMBER = "attemptNumber";
    static final java.lang.String BACKEND_NAME = "backendName";
    static final java.lang.String EVENT_PRIORITY = "priority";
    static final java.lang.String EXTRAS = "extras";
    private static final java.lang.String LOG_TAG = "JobInfoScheduler";
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;

    public JobInfoScheduler(android.content.Context r1, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.eventStore = r2
            r0.config = r3
            return
    }

    private boolean isJobServiceOn(android.app.job.JobScheduler r5, int r6, int r7) {
            r4 = this;
            java.util.List r5 = r5.getAllPendingJobs()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.Object r0 = r5.next()
            android.app.job.JobInfo r0 = (android.app.job.JobInfo) r0
            android.os.PersistableBundle r2 = r0.getExtras()
            java.lang.String r3 = "attemptNumber"
            int r2 = r2.getInt(r3)
            int r0 = r0.getId()
            if (r0 != r6) goto L8
            if (r2 < r7) goto L29
            r5 = 1
            return r5
        L29:
            return r1
    }

    @androidx.annotation.VisibleForTesting
    int getJobId(com.google.android.datatransport.runtime.TransportContext r5) {
            r4 = this;
            java.util.zip.Adler32 r0 = new java.util.zip.Adler32
            r0.<init>()
            android.content.Context r1 = r4.context
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r2)
            byte[] r1 = r1.getBytes(r3)
            r0.update(r1)
            java.lang.String r1 = r5.getBackendName()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            byte[] r1 = r1.getBytes(r2)
            r0.update(r1)
            r1 = 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            com.google.android.datatransport.Priority r2 = r5.getPriority()
            int r2 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r2)
            java.nio.ByteBuffer r1 = r1.putInt(r2)
            byte[] r1 = r1.array()
            r0.update(r1)
            byte[] r1 = r5.getExtras()
            if (r1 == 0) goto L4c
            byte[] r5 = r5.getExtras()
            r0.update(r5)
        L4c:
            long r0 = r0.getValue()
            int r5 = (int) r0
            return r5
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r2, int r3) {
            r1 = this;
            r0 = 0
            r1.schedule(r2, r3, r0)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r11, int r12, boolean r13) {
            r10 = this;
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r1 = r10.context
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r0.<init>(r1, r2)
            android.content.Context r1 = r10.context
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.job.JobScheduler r1 = (android.app.job.JobScheduler) r1
            int r2 = r10.getJobId(r11)
            java.lang.String r3 = "JobInfoScheduler"
            if (r13 != 0) goto L27
            boolean r13 = r10.isJobServiceOn(r1, r2, r12)
            if (r13 == 0) goto L27
            java.lang.String r12 = "Upload for context %s is already scheduled. Returning..."
            com.google.android.datatransport.runtime.logging.Logging.d(r3, r12, r11)
            return
        L27:
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r13 = r10.eventStore
            long r7 = r13.getNextCallTime(r11)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r4 = r10.config
            android.app.job.JobInfo$Builder r5 = new android.app.job.JobInfo$Builder
            r5.<init>(r2, r0)
            com.google.android.datatransport.Priority r6 = r11.getPriority()
            r9 = r12
            android.app.job.JobInfo$Builder r12 = r4.configureJob(r5, r6, r7, r9)
            android.os.PersistableBundle r13 = new android.os.PersistableBundle
            r13.<init>()
            java.lang.String r0 = "attemptNumber"
            r13.putInt(r0, r9)
            java.lang.String r0 = "backendName"
            java.lang.String r4 = r11.getBackendName()
            r13.putString(r0, r4)
            com.google.android.datatransport.Priority r0 = r11.getPriority()
            int r0 = com.google.android.datatransport.runtime.util.PriorityMapping.toInt(r0)
            java.lang.String r4 = "priority"
            r13.putInt(r4, r0)
            byte[] r0 = r11.getExtras()
            r4 = 0
            if (r0 == 0) goto L71
            byte[] r0 = r11.getExtras()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)
            java.lang.String r5 = "extras"
            r13.putString(r5, r0)
        L71:
            r12.setExtras(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = r10.config
            com.google.android.datatransport.Priority r2 = r11.getPriority()
            long r5 = r0.getScheduleDelay(r2, r7, r9)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r11
            r11 = 1
            r6[r11] = r13
            r11 = 2
            r6[r11] = r0
            r11 = 3
            r6[r11] = r2
            r11 = 4
            r6[r11] = r5
            java.lang.String r11 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            com.google.android.datatransport.runtime.logging.Logging.d(r3, r11, r6)
            android.app.job.JobInfo r11 = r12.build()
            r1.schedule(r11)
            return
    }
}
