package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class TraceCompat {
    private static final java.lang.String TAG = "TraceCompat";
    private static java.lang.reflect.Method sAsyncTraceBeginMethod;
    private static java.lang.reflect.Method sAsyncTraceEndMethod;
    private static java.lang.reflect.Method sIsTagEnabledMethod;
    private static java.lang.reflect.Method sTraceCounterMethod;
    private static long sTraceTagApp;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(29)
    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        static void beginAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.beginAsyncSection(r0, r1)
                return
        }

        @androidx.annotation.DoNotInline
        static void endAsyncSection(java.lang.String r0, int r1) {
                android.os.Trace.endAsyncSection(r0, r1)
                return
        }

        @androidx.annotation.DoNotInline
        static boolean isEnabled() {
                boolean r0 = android.os.Trace.isEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        static void setCounter(java.lang.String r0, long r1) {
                android.os.Trace.setCounter(r0, r1)
                return
        }
    }

    static {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto L5b
            java.lang.String r2 = "TRACE_TAG_APP"
            java.lang.reflect.Field r2 = r1.getField(r2)     // Catch: java.lang.Exception -> L5b
            r3 = 0
            long r2 = r2.getLong(r3)     // Catch: java.lang.Exception -> L5b
            androidx.core.os.TraceCompat.sTraceTagApp = r2     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = "isTagEnabled"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L5b
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L5b
            r6 = 0
            r5[r6] = r3     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch: java.lang.Exception -> L5b
            androidx.core.os.TraceCompat.sIsTagEnabledMethod = r2     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = "asyncTraceBegin"
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5b
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L5b
            r8[r6] = r3     // Catch: java.lang.Exception -> L5b
            r8[r4] = r0     // Catch: java.lang.Exception -> L5b
            r9 = 2
            r8[r9] = r5     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r2 = r1.getMethod(r2, r8)     // Catch: java.lang.Exception -> L5b
            androidx.core.os.TraceCompat.sAsyncTraceBeginMethod = r2     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = "asyncTraceEnd"
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L5b
            r8[r6] = r3     // Catch: java.lang.Exception -> L5b
            r8[r4] = r0     // Catch: java.lang.Exception -> L5b
            r8[r9] = r5     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r2 = r1.getMethod(r2, r8)     // Catch: java.lang.Exception -> L5b
            androidx.core.os.TraceCompat.sAsyncTraceEndMethod = r2     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = "traceCounter"
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L5b
            r7[r6] = r3     // Catch: java.lang.Exception -> L5b
            r7[r4] = r0     // Catch: java.lang.Exception -> L5b
            r7[r9] = r5     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r0 = r1.getMethod(r2, r7)     // Catch: java.lang.Exception -> L5b
            androidx.core.os.TraceCompat.sTraceCounterMethod = r0     // Catch: java.lang.Exception -> L5b
        L5b:
            return
    }

    private TraceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void beginAsyncSection(@androidx.annotation.NonNull java.lang.String r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.beginAsyncSection(r4, r5)
            return
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceBeginMethod     // Catch: java.lang.Exception -> L26
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L26
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L26
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L26
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Exception -> L26
            r1 = 1
            r2[r1] = r4     // Catch: java.lang.Exception -> L26
            r4 = 2
            r2[r4] = r5     // Catch: java.lang.Exception -> L26
            r4 = 0
            r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L26
        L26:
            return
    }

    public static void beginSection(@androidx.annotation.NonNull java.lang.String r0) {
            android.os.Trace.beginSection(r0)
            return
    }

    public static void endAsyncSection(@androidx.annotation.NonNull java.lang.String r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.os.TraceCompat.Api29Impl.endAsyncSection(r4, r5)
            return
        La:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sAsyncTraceEndMethod     // Catch: java.lang.Exception -> L26
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L26
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L26
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L26
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L26
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Exception -> L26
            r1 = 1
            r2[r1] = r4     // Catch: java.lang.Exception -> L26
            r4 = 2
            r2[r4] = r5     // Catch: java.lang.Exception -> L26
            r4 = 0
            r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L26
        L26:
            return
    }

    public static void endSection() {
            android.os.Trace.endSection()
            return
    }

    public static boolean isEnabled() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.os.TraceCompat.Api29Impl.isEnabled()
            return r0
        Lb:
            r0 = 0
            java.lang.reflect.Method r1 = androidx.core.os.TraceCompat.sIsTagEnabledMethod     // Catch: java.lang.Exception -> L24
            long r2 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L24
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L24
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L24
            r3[r0] = r2     // Catch: java.lang.Exception -> L24
            r2 = 0
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L24
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L24
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L24
        L24:
            return r0
    }

    public static void setCounter(@androidx.annotation.NonNull java.lang.String r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            long r0 = (long) r5
            androidx.core.os.TraceCompat.Api29Impl.setCounter(r4, r0)
            return
        Lb:
            java.lang.reflect.Method r0 = androidx.core.os.TraceCompat.sTraceCounterMethod     // Catch: java.lang.Exception -> L27
            long r1 = androidx.core.os.TraceCompat.sTraceTagApp     // Catch: java.lang.Exception -> L27
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Exception -> L27
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> L27
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L27
            r3 = 0
            r2[r3] = r1     // Catch: java.lang.Exception -> L27
            r1 = 1
            r2[r1] = r4     // Catch: java.lang.Exception -> L27
            r4 = 2
            r2[r4] = r5     // Catch: java.lang.Exception -> L27
            r4 = 0
            r0.invoke(r4, r2)     // Catch: java.lang.Exception -> L27
        L27:
            return
    }
}
