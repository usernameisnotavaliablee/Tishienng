package okhttp3.internal.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class TaskLoggerKt {
    public TaskLoggerKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ void access$log(java.util.logging.Logger r0, okhttp3.internal.concurrent.Task r1, okhttp3.internal.concurrent.TaskQueue r2, java.lang.String r3) {
            log(r0, r1, r2, r3)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String formatDuration(long r12) {
            r0 = -999500000(0xffffffffc46cd720, double:NaN)
            java.lang.String r2 = " s "
            r3 = 1000000000(0x3b9aca00, float:0.0047237873)
            r4 = 500000000(0x1dcd6500, float:5.436748E-21)
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 > 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = (long) r4
            long r12 = r12 - r4
            long r3 = (long) r3
            long r12 = r12 / r3
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L24:
            r0 = -999500(0xfffffffffff0bfb4, double:NaN)
            java.lang.String r5 = " ms"
            r6 = 1000000(0xf4240, float:1.401298E-39)
            r7 = 500000(0x7a120, float:7.00649E-40)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 > 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r7
            long r12 = r12 - r1
            long r1 = (long) r6
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L47:
            r0 = 0
            java.lang.String r8 = " µs"
            r9 = 1000(0x3e8, float:1.401E-42)
            r10 = 500(0x1f4, float:7.0E-43)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 > 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r10
            long r12 = r12 - r1
            long r1 = (long) r9
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L67:
            r0 = 999500(0xf404c, double:4.938186E-318)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r10
            long r12 = r12 + r1
            long r1 = (long) r9
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L82:
            r0 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 >= 0) goto L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r7
            long r12 = r12 + r1
            long r1 = (long) r6
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = (long) r4
            long r12 = r12 + r4
            long r3 = (long) r3
            long r12 = r12 / r3
            r0.append(r12)
            r0.append(r2)
            java.lang.String r12 = r0.toString()
        Lb0:
            kotlin.jvm.internal.t0 r13 = kotlin.jvm.internal.t0.a
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r1 = 0
            r0[r1] = r12
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r0, r13)
            java.lang.String r13 = "%6s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            java.lang.String r13 = "format(...)"
            kotlin.jvm.internal.g0.o(r12, r13)
            return r12
    }

    private static final void log(java.util.logging.Logger r3, okhttp3.internal.concurrent.Task r4, okhttp3.internal.concurrent.TaskQueue r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r5.getName$okhttp()
            r0.append(r5)
            r5 = 32
            r0.append(r5)
            kotlin.jvm.internal.t0 r5 = kotlin.jvm.internal.t0.a
            r5 = 1
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r2 = 0
            r1[r2] = r6
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r5)
            java.lang.String r6 = "%-22s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.String r6 = "format(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            r0.append(r5)
            java.lang.String r5 = ": "
            r0.append(r5)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.fine(r4)
            return
    }

    public static final <T> T logElapsed(@org.jetbrains.annotations.NotNull java.util.logging.Logger r6, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r7, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "task"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r6.isLoggable(r0)
            if (r0 == 0) goto L2e
            okhttp3.internal.concurrent.TaskRunner r1 = r8.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r1 = r1.getBackend()
            long r1 = r1.nanoTime()
            java.lang.String r3 = "starting"
            access$log(r6, r7, r8, r3)
            goto L30
        L2e:
            r1 = -1
        L30:
            r3 = 1
            java.lang.Object r9 = r9.invoke()     // Catch: java.lang.Throwable -> L63
            kotlin.jvm.internal.d0.d(r3)
            if (r0 == 0) goto L5f
            okhttp3.internal.concurrent.TaskRunner r0 = r8.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r4 = r0.nanoTime()
            long r4 = r4 - r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "finished run in "
            r0.append(r1)
            java.lang.String r1 = formatDuration(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            access$log(r6, r7, r8, r0)
        L5f:
            kotlin.jvm.internal.d0.c(r3)
            return r9
        L63:
            r9 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            if (r0 == 0) goto L8e
            okhttp3.internal.concurrent.TaskRunner r0 = r8.getTaskRunner$okhttp()
            okhttp3.internal.concurrent.TaskRunner$Backend r0 = r0.getBackend()
            long r4 = r0.nanoTime()
            long r4 = r4 - r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed a run in "
            r0.append(r1)
            java.lang.String r1 = formatDuration(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            access$log(r6, r7, r8, r0)
        L8e:
            kotlin.jvm.internal.d0.c(r3)
            throw r9
    }

    public static final void taskLog(@org.jetbrains.annotations.NotNull java.util.logging.Logger r1, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.Task r2, @org.jetbrains.annotations.NotNull okhttp3.internal.concurrent.TaskQueue r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.String> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "task"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "queue"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "messageBlock"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.logging.Level r0 = java.util.logging.Level.FINE
            boolean r0 = r1.isLoggable(r0)
            if (r0 == 0) goto L25
            java.lang.Object r4 = r4.invoke()
            java.lang.String r4 = (java.lang.String) r4
            access$log(r1, r2, r3, r4)
        L25:
            return
    }
}
