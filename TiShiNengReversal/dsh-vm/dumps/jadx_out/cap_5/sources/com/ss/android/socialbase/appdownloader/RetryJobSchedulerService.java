package com.ss.android.socialbase.appdownloader;

@android.annotation.TargetApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class RetryJobSchedulerService extends android.app.job.JobService {
    public RetryJobSchedulerService() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a(com.ss.android.socialbase.downloader.ae.cw r11, long r12, boolean r14, int r15) {
            if (r11 == 0) goto Lbd
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 > 0) goto La
            goto Lbd
        La:
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r2 != 0) goto L12
            goto Lbd
        L12:
            boolean r3 = r11.qb()
            r4 = 3
            r5 = 2
            if (r3 == 0) goto L2b
            android.content.Context r3 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r3 = com.ss.android.socialbase.downloader.downloader.ae.xt(r3)
            com.ss.android.socialbase.downloader.downloader.mi r3 = r3.xt()
            if (r3 == 0) goto L2b
            r3.j(r11, r5, r4)
        L2b:
            java.lang.String r3 = "jobscheduler"
            java.lang.Object r3 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> Lb9
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3     // Catch: java.lang.Throwable -> Lb9
            if (r3 != 0) goto L37
            goto Lbd
        L37:
            int r6 = r11.ae()     // Catch: java.lang.Throwable -> L3f
            r3.cancel(r6)     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)     // Catch: java.lang.Throwable -> Lb9
        L43:
            if (r15 == 0) goto L4f
            if (r14 == 0) goto L4a
            if (r15 == r5) goto L4a
            goto L4f
        L4a:
            r6 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 + r12
            goto L52
        L4f:
            r12 = 1000(0x3e8, double:4.94E-321)
            r6 = r0
        L52:
            android.app.job.JobInfo$Builder r15 = new android.app.job.JobInfo$Builder     // Catch: java.lang.Throwable -> Lb9
            int r8 = r11.ae()     // Catch: java.lang.Throwable -> Lb9
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Class<com.ss.android.socialbase.appdownloader.RetryJobSchedulerService> r10 = com.ss.android.socialbase.appdownloader.RetryJobSchedulerService.class
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> Lb9
            r9.<init>(r2, r10)     // Catch: java.lang.Throwable -> Lb9
            r15.<init>(r8, r9)     // Catch: java.lang.Throwable -> Lb9
            android.app.job.JobInfo$Builder r12 = r15.setMinimumLatency(r12)     // Catch: java.lang.Throwable -> Lb9
            if (r14 == 0) goto L71
            goto L72
        L71:
            r5 = 1
        L72:
            android.app.job.JobInfo$Builder r12 = r12.setRequiredNetworkType(r5)     // Catch: java.lang.Throwable -> Lb9
            r13 = 0
            android.app.job.JobInfo$Builder r12 = r12.setRequiresCharging(r13)     // Catch: java.lang.Throwable -> Lb9
            android.app.job.JobInfo$Builder r12 = r12.setRequiresDeviceIdle(r13)     // Catch: java.lang.Throwable -> Lb9
            int r13 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 <= 0) goto L86
            r12.setOverrideDeadline(r6)     // Catch: java.lang.Throwable -> Lb9
        L86:
            android.app.job.JobInfo r12 = r12.build()     // Catch: java.lang.Throwable -> Lb9
            int r12 = r3.schedule(r12)     // Catch: java.lang.Throwable -> Lb9
            if (r12 <= 0) goto La7
            boolean r13 = r11.qb()     // Catch: java.lang.Throwable -> Lb9
            if (r13 == 0) goto La7
            android.content.Context r13 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> Lb9
            com.ss.android.socialbase.downloader.downloader.ae r13 = com.ss.android.socialbase.downloader.downloader.ae.xt(r13)     // Catch: java.lang.Throwable -> Lb9
            com.ss.android.socialbase.downloader.downloader.mi r13 = r13.xt()     // Catch: java.lang.Throwable -> Lb9
            if (r13 == 0) goto La7
            r13.j(r11, r4, r4)     // Catch: java.lang.Throwable -> Lb9
        La7:
            if (r12 > 0) goto Lbd
            java.lang.String r11 = "RetrySchedulerService"
            java.lang.String r13 = "schedule err errCode = "
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r12 = r13.concat(r12)     // Catch: java.lang.Throwable -> Lb9
            com.ss.android.socialbase.downloader.m.j.r(r11, r12)     // Catch: java.lang.Throwable -> Lb9
            goto Lbd
        Lb9:
            r11 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r11)
        Lbd:
            return
    }

    @Override // android.app.Service
    public void onCreate() {
            r0 = this;
            super.onCreate()
            com.ss.android.socialbase.downloader.downloader.cw.j(r0)
            return
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
            r0 = this;
            int r1 = super.onStartCommand(r1, r2, r3)
            boolean r2 = com.ss.android.socialbase.downloader.downloader.cw.g()
            if (r2 == 0) goto Lb
            r1 = 2
        Lb:
            return r1
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(android.app.job.JobParameters r3) {
            r2 = this;
            if (r3 == 0) goto L1c
            int r3 = r3.getJobId()
            java.lang.String r0 = "onStartJob, id = "
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r1 = "RetrySchedulerService"
            com.ss.android.socialbase.downloader.m.j.cw(r1, r0)
            com.ss.android.socialbase.downloader.impls.w r0 = com.ss.android.socialbase.downloader.impls.w.j()
            r0.j(r3)
        L1c:
            r3 = 0
            return r3
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(android.app.job.JobParameters r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
