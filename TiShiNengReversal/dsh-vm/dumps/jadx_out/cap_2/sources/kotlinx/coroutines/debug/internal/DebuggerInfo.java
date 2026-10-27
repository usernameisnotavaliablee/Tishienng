package kotlinx.coroutines.debug.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class DebuggerInfo implements java.io.Serializable {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long coroutineId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String dispatcher;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastObservedThreadName;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastObservedThreadState;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;
    private final long sequenceNumber;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String state;

    public DebuggerInfo(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.e r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r6) {
            r4 = this;
            r4.<init>()
            kotlinx.coroutines.p0$a r0 = kotlinx.coroutines.p0.b
            kotlin.coroutines.i$b r0 = r6.get(r0)
            kotlinx.coroutines.p0 r0 = (kotlinx.coroutines.p0) r0
            r1 = 0
            if (r0 == 0) goto L17
            long r2 = r0.w()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L18
        L17:
            r0 = r1
        L18:
            r4.coroutineId = r0
            kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r0 = r6.get(r0)
            kotlin.coroutines.f r0 = (kotlin.coroutines.f) r0
            if (r0 == 0) goto L29
            java.lang.String r0 = r0.toString()
            goto L2a
        L29:
            r0 = r1
        L2a:
            r4.dispatcher = r0
            kotlinx.coroutines.q0$a r0 = kotlinx.coroutines.q0.b
            kotlin.coroutines.i$b r6 = r6.get(r0)
            kotlinx.coroutines.q0 r6 = (kotlinx.coroutines.q0) r6
            if (r6 == 0) goto L3b
            java.lang.String r6 = r6.w()
            goto L3c
        L3b:
            r6 = r1
        L3c:
            r4.name = r6
            java.lang.String r6 = r5.f()
            r4.state = r6
            java.lang.Thread r6 = r5.lastObservedThread
            if (r6 == 0) goto L53
            java.lang.Thread$State r6 = r6.getState()
            if (r6 == 0) goto L53
            java.lang.String r6 = r6.toString()
            goto L54
        L53:
            r6 = r1
        L54:
            r4.lastObservedThreadState = r6
            java.lang.Thread r6 = r5.lastObservedThread
            if (r6 == 0) goto L5e
            java.lang.String r1 = r6.getName()
        L5e:
            r4.lastObservedThreadName = r1
            java.util.List r6 = r5.g()
            r4.lastObservedStackTrace = r6
            long r5 = r5.b
            r4.sequenceNumber = r5
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getCoroutineId() {
            r1 = this;
            java.lang.Long r0 = r1.coroutineId
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDispatcher() {
            r1 = this;
            java.lang.String r0 = r1.dispatcher
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.StackTraceElement> getLastObservedStackTrace() {
            r1 = this;
            java.util.List<java.lang.StackTraceElement> r0 = r1.lastObservedStackTrace
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastObservedThreadName() {
            r1 = this;
            java.lang.String r0 = r1.lastObservedThreadName
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastObservedThreadState() {
            r1 = this;
            java.lang.String r0 = r1.lastObservedThreadState
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final long getSequenceNumber() {
            r2 = this;
            long r0 = r2.sequenceNumber
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
            r1 = this;
            java.lang.String r0 = r1.state
            return r0
    }
}
