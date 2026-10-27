package androidx.work;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PeriodicWorkRequestKt {
    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long r3, java.util.concurrent.TimeUnit r5) {
            java.lang.String r0 = "repeatIntervalTimeUnit"
            kotlin.jvm.internal.g0.p(r5, r0)
            androidx.work.PeriodicWorkRequest$Builder r0 = new androidx.work.PeriodicWorkRequest$Builder
            r1 = 4
            java.lang.String r2 = "W"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.work.ListenableWorker> r1 = androidx.work.ListenableWorker.class
            r0.<init>(r1, r3, r5)
            return r0
    }

    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long r9, java.util.concurrent.TimeUnit r11, long r12, java.util.concurrent.TimeUnit r14) {
            java.lang.String r0 = "repeatIntervalTimeUnit"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "flexTimeIntervalUnit"
            kotlin.jvm.internal.g0.p(r14, r0)
            androidx.work.PeriodicWorkRequest$Builder r1 = new androidx.work.PeriodicWorkRequest$Builder
            r0 = 4
            java.lang.String r2 = "W"
            kotlin.jvm.internal.g0.y(r0, r2)
            java.lang.Class<androidx.work.ListenableWorker> r2 = androidx.work.ListenableWorker.class
            r3 = r9
            r5 = r11
            r6 = r12
            r8 = r14
            r1.<init>(r2, r3, r5, r6, r8)
            return r1
    }

    @androidx.annotation.RequiresApi(26)
    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(java.time.Duration r3) {
            java.lang.String r0 = "repeatInterval"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.work.PeriodicWorkRequest$Builder r0 = new androidx.work.PeriodicWorkRequest$Builder
            r1 = 4
            java.lang.String r2 = "W"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.work.ListenableWorker> r1 = androidx.work.ListenableWorker.class
            r0.<init>(r1, r3)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    public static final /* synthetic */ <W extends androidx.work.ListenableWorker> androidx.work.PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(java.time.Duration r3, java.time.Duration r4) {
            java.lang.String r0 = "repeatInterval"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "flexTimeInterval"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.work.PeriodicWorkRequest$Builder r0 = new androidx.work.PeriodicWorkRequest$Builder
            r1 = 4
            java.lang.String r2 = "W"
            kotlin.jvm.internal.g0.y(r1, r2)
            java.lang.Class<androidx.work.ListenableWorker> r1 = androidx.work.ListenableWorker.class
            r0.<init>(r1, r3, r4)
            return r0
    }
}
