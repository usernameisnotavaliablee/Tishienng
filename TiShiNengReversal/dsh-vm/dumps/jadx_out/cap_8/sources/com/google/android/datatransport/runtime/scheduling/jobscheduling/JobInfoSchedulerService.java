package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(api = 21)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JobInfoSchedulerService extends android.app.job.JobService {
    public JobInfoSchedulerService() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void lambda$onStartJob$0(com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService r1, android.app.job.JobParameters r2) {
            r0 = 0
            r1.jobFinished(r2, r0)
            return
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters r6) {
            r5 = this;
            android.os.PersistableBundle r0 = r6.getExtras()
            java.lang.String r1 = "backendName"
            java.lang.String r0 = r0.getString(r1)
            android.os.PersistableBundle r1 = r6.getExtras()
            java.lang.String r2 = "extras"
            java.lang.String r1 = r1.getString(r2)
            android.os.PersistableBundle r2 = r6.getExtras()
            java.lang.String r3 = "priority"
            int r2 = r2.getInt(r3)
            android.os.PersistableBundle r3 = r6.getExtras()
            java.lang.String r4 = "attemptNumber"
            int r3 = r3.getInt(r4)
            android.content.Context r4 = r5.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.google.android.datatransport.runtime.TransportRuntime.initialize(r4)
            com.google.android.datatransport.runtime.TransportContext$Builder r4 = com.google.android.datatransport.runtime.TransportContext.builder()
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = r4.setBackendName(r0)
            com.google.android.datatransport.Priority r2 = com.google.android.datatransport.runtime.util.PriorityMapping.valueOf(r2)
            com.google.android.datatransport.runtime.TransportContext$Builder r0 = r0.setPriority(r2)
            if (r1 == 0) goto L4d
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)
            r0.setExtras(r1)
        L4d:
            com.google.android.datatransport.runtime.TransportRuntime r1 = com.google.android.datatransport.runtime.TransportRuntime.getInstance()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r1 = r1.getUploader()
            com.google.android.datatransport.runtime.TransportContext r0 = r0.build()
            java.lang.Runnable r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService$$Lambda$1.lambdaFactory$(r5, r6)
            r1.upload(r0, r3, r6)
            r6 = 1
            return r6
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
