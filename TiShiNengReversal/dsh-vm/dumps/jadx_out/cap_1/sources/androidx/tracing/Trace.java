package androidx.tracing;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Trace {
    static final java.lang.String TAG = "Trace";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    private Trace() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void beginAsyncSection(@androidx.annotation.NonNull java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.beginAsyncSection(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            beginAsyncSectionFallback(r1, r2)
            return
    }

    private static void beginAsyncSectionFallback(@androidx.annotation.NonNull java.lang.String r8, int r9) {
            java.lang.String r0 = "asyncTraceBegin"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L21
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r1 != 0) goto L23
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L21
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L21
            r6[r4] = r7     // Catch: java.lang.Exception -> L21
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.Exception -> L21
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L21
            r6[r2] = r7     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Method r1 = r1.getMethod(r0, r6)     // Catch: java.lang.Exception -> L21
            androidx.tracing.Trace.sAsyncTraceBeginMethod = r1     // Catch: java.lang.Exception -> L21
            goto L23
        L21:
            r8 = move-exception
            goto L3c
        L23:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L21
            long r6 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L21
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L21
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L21
            r5[r4] = r6     // Catch: java.lang.Exception -> L21
            r5[r3] = r8     // Catch: java.lang.Exception -> L21
            r5[r2] = r9     // Catch: java.lang.Exception -> L21
            r8 = 0
            r1.invoke(r8, r5)     // Catch: java.lang.Exception -> L21
            return
        L3c:
            handleException(r0, r8)
            return
    }

    public static void beginSection(@androidx.annotation.NonNull java.lang.String r0) {
            androidx.tracing.TraceApi18Impl.beginSection(r0)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void endAsyncSection(@androidx.annotation.NonNull java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.endAsyncSection(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            endAsyncSectionFallback(r1, r2)
            return
    }

    private static void endAsyncSectionFallback(@androidx.annotation.NonNull java.lang.String r8, int r9) {
            java.lang.String r0 = "asyncTraceEnd"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L21
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r1 != 0) goto L23
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L21
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L21
            r6[r4] = r7     // Catch: java.lang.Exception -> L21
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.Exception -> L21
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L21
            r6[r2] = r7     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Method r1 = r1.getMethod(r0, r6)     // Catch: java.lang.Exception -> L21
            androidx.tracing.Trace.sAsyncTraceEndMethod = r1     // Catch: java.lang.Exception -> L21
            goto L23
        L21:
            r8 = move-exception
            goto L3c
        L23:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L21
            long r6 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L21
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L21
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L21
            r5[r4] = r6     // Catch: java.lang.Exception -> L21
            r5[r3] = r8     // Catch: java.lang.Exception -> L21
            r5[r2] = r9     // Catch: java.lang.Exception -> L21
            r8 = 0
            r1.invoke(r8, r5)     // Catch: java.lang.Exception -> L21
            return
        L3c:
            handleException(r0, r8)
            return
    }

    public static void endSection() {
            androidx.tracing.TraceApi18Impl.endSection()
            return
    }

    private static void handleException(@androidx.annotation.NonNull java.lang.String r0, @androidx.annotation.NonNull java.lang.Exception r1) {
            boolean r0 = r1 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L15
            java.lang.Throwable r0 = r1.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto Lf
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        Lf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L15:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static boolean isEnabled() {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Throwable -> L9
            if (r0 != 0) goto L9
            boolean r0 = androidx.tracing.a.a()     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            boolean r0 = isEnabledFallback()
            return r0
    }

    private static boolean isEnabledFallback() {
            java.lang.String r0 = "isTagEnabled"
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r2 = 0
            java.lang.reflect.Method r3 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L24
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L26
            java.lang.String r3 = "TRACE_TAG_APP"
            java.lang.reflect.Field r3 = r1.getField(r3)     // Catch: java.lang.Exception -> L24
            long r6 = r3.getLong(r5)     // Catch: java.lang.Exception -> L24
            androidx.tracing.Trace.sTraceTagApp = r6     // Catch: java.lang.Exception -> L24
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L24
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L24
            r3[r2] = r6     // Catch: java.lang.Exception -> L24
            java.lang.reflect.Method r1 = r1.getMethod(r0, r3)     // Catch: java.lang.Exception -> L24
            androidx.tracing.Trace.sIsTagEnabledMethod = r1     // Catch: java.lang.Exception -> L24
            goto L26
        L24:
            r1 = move-exception
            goto L3d
        L26:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L24
            long r6 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L24
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L24
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L24
            r4[r2] = r3     // Catch: java.lang.Exception -> L24
            java.lang.Object r1 = r1.invoke(r5, r4)     // Catch: java.lang.Exception -> L24
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L24
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L24
            return r0
        L3d:
            handleException(r0, r1)
            return r2
    }

    @android.annotation.SuppressLint({"NewApi"})
    public static void setCounter(@androidx.annotation.NonNull java.lang.String r1, int r2) {
            java.lang.reflect.Method r0 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Throwable -> L8
            if (r0 != 0) goto L8
            androidx.tracing.TraceApi29Impl.setCounter(r1, r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            setCounterFallback(r1, r2)
            return
    }

    private static void setCounterFallback(@androidx.annotation.NonNull java.lang.String r8, int r9) {
            java.lang.String r0 = "traceCounter"
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L21
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r1 != 0) goto L23
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> L21
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L21
            r6[r4] = r7     // Catch: java.lang.Exception -> L21
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r6[r3] = r7     // Catch: java.lang.Exception -> L21
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L21
            r6[r2] = r7     // Catch: java.lang.Exception -> L21
            java.lang.reflect.Method r1 = r1.getMethod(r0, r6)     // Catch: java.lang.Exception -> L21
            androidx.tracing.Trace.sTraceCounterMethod = r1     // Catch: java.lang.Exception -> L21
            goto L23
        L21:
            r8 = move-exception
            goto L3c
        L23:
            java.lang.reflect.Method r1 = androidx.tracing.Trace.sTraceCounterMethod     // Catch: java.lang.Exception -> L21
            long r6 = androidx.tracing.Trace.sTraceTagApp     // Catch: java.lang.Exception -> L21
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Exception -> L21
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L21
            r5[r4] = r6     // Catch: java.lang.Exception -> L21
            r5[r3] = r8     // Catch: java.lang.Exception -> L21
            r5[r2] = r9     // Catch: java.lang.Exception -> L21
            r8 = 0
            r1.invoke(r8, r5)     // Catch: java.lang.Exception -> L21
            return
        L3c:
            handleException(r0, r8)
            return
    }
}
