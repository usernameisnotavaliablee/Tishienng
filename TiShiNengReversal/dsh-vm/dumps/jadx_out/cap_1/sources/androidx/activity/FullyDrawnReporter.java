package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n1855#3,2:192\n*S KotlinDebug\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporter\n*L\n154#1:192,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class FullyDrawnReporter {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Executor executor;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object lock;

    @androidx.annotation.GuardedBy("lock")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.jvm.functions.Function0<kotlin.n1>> onReportCallbacks;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.n1> reportFullyDrawn;

    @androidx.annotation.GuardedBy("lock")
    private boolean reportPosted;

    @org.jetbrains.annotations.NotNull
    private final java.lang.Runnable reportRunnable;

    @androidx.annotation.GuardedBy("lock")
    private boolean reportedFullyDrawn;

    @androidx.annotation.GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r1 = this;
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "reportFullyDrawn"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.executor = r2
            r1.reportFullyDrawn = r3
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.lock = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.onReportCallbacks = r2
            androidx.activity.j r2 = new androidx.activity.j
            r2.<init>(r1)
            r1.reportRunnable = r2
            return
    }

    public static /* synthetic */ void a(androidx.activity.FullyDrawnReporter r0) {
            reportRunnable$lambda$2(r0)
            return
    }

    private final void postWhenReportersAreDone() {
            r2 = this;
            boolean r0 = r2.reportPosted
            if (r0 != 0) goto L12
            int r0 = r2.reporterCount
            if (r0 != 0) goto L12
            r0 = 1
            r2.reportPosted = r0
            java.util.concurrent.Executor r0 = r2.executor
            java.lang.Runnable r1 = r2.reportRunnable
            r0.execute(r1)
        L12:
            return
    }

    private static final void reportRunnable$lambda$2(androidx.activity.FullyDrawnReporter r2) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            r1 = 0
            r2.reportPosted = r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r2.reporterCount     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            kotlin.jvm.functions.Function0<kotlin.n1> r1 = r2.reportFullyDrawn     // Catch: java.lang.Throwable -> L1c
            r1.invoke()     // Catch: java.lang.Throwable -> L1c
            r2.fullyDrawnReported()     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r2 = move-exception
            goto L22
        L1e:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L22:
            monitor-exit(r0)
            throw r2
    }

    public final void addOnReportDrawnListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r2 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto Le
            r1 = 1
            goto L16
        Le:
            java.util.List<kotlin.jvm.functions.Function0<kotlin.n1>> r1 = r2.onReportCallbacks     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L1d
            r1.add(r3)     // Catch: java.lang.Throwable -> L1d
            r1 = 0
        L16:
            monitor-exit(r0)
            if (r1 == 0) goto L1c
            r3.invoke()
        L1c:
            return
        L1d:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void addReporter() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L10
            int r1 = r2.reporterCount     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r2.reporterCount = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L14
        L10:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L14:
            monitor-exit(r0)
            throw r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            r1 = 1
            r3.reportedFullyDrawn = r1     // Catch: java.lang.Throwable -> L1e
            java.util.List<kotlin.jvm.functions.Function0<kotlin.n1>> r1 = r3.onReportCallbacks     // Catch: java.lang.Throwable -> L1e
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1e
        Le:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1e
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2     // Catch: java.lang.Throwable -> L1e
            r2.invoke()     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r1 = move-exception
            goto L29
        L20:
            java.util.List<kotlin.jvm.functions.Function0<kotlin.n1>> r1 = r3.onReportCallbacks     // Catch: java.lang.Throwable -> L1e
            r1.clear()     // Catch: java.lang.Throwable -> L1e
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return
        L29:
            monitor-exit(r0)
            throw r1
    }

    public final boolean isFullyDrawnReported() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final void removeOnReportDrawnListener(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r3) {
            r2 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            java.util.List<kotlin.jvm.functions.Function0<kotlin.n1>> r1 = r2.onReportCallbacks     // Catch: java.lang.Throwable -> L13
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L13
            r1.remove(r3)     // Catch: java.lang.Throwable -> L13
            kotlin.n1 r3 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void removeReporter() {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.reportedFullyDrawn     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            int r1 = r2.reporterCount     // Catch: java.lang.Throwable -> L13
            if (r1 <= 0) goto L15
            int r1 = r1 + (-1)
            r2.reporterCount = r1     // Catch: java.lang.Throwable -> L13
            r2.postWhenReportersAreDone()     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L19
        L15:
            kotlin.n1 r1 = kotlin.n1.a     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L19:
            monitor-exit(r0)
            throw r1
    }
}
