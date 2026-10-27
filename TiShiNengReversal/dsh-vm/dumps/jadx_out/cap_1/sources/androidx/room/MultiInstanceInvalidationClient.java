package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMultiInstanceInvalidationClient.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,146:1\n1#2:147\n60#3:148\n63#3:152\n50#4:149\n55#4:151\n107#5:150\n*S KotlinDebug\n*F\n+ 1 MultiInstanceInvalidationClient.android.kt\nandroidx/room/MultiInstanceInvalidationClient\n*L\n133#1:148\n133#1:152\n133#1:149\n133#1:151\n133#1:150\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class MultiInstanceInvalidationClient {
    private final android.content.Context appContext;
    private int clientId;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.r0 coroutineScope;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.s<java.util.Set<java.lang.String>> invalidatedTables;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.IMultiInstanceInvalidationCallback invalidationCallback;

    @org.jetbrains.annotations.Nullable
    private androidx.room.IMultiInstanceInvalidationService invalidationService;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.InvalidationTracker invalidationTracker;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.MultiInstanceInvalidationClient$observer$1 observer;

    @org.jetbrains.annotations.NotNull
    private final android.content.ServiceConnection serviceConnection;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean stopped;

    public MultiInstanceInvalidationClient(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull androidx.room.InvalidationTracker r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "invalidationTracker"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.name = r3
            r1.invalidationTracker = r4
            android.content.Context r2 = r2.getApplicationContext()
            r1.appContext = r2
            androidx.room.RoomDatabase r2 = r4.getDatabase$room_runtime_release()
            kotlinx.coroutines.r0 r2 = r2.getCoroutineScope()
            r1.coroutineScope = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 1
            r2.<init>(r3)
            r1.stopped = r2
            r2 = 0
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlinx.coroutines.flow.s r2 = kotlinx.coroutines.flow.z.a(r2, r2, r3)
            r1.invalidatedTables = r2
            java.lang.String[] r2 = r4.getTableNames$room_runtime_release()
            androidx.room.MultiInstanceInvalidationClient$observer$1 r3 = new androidx.room.MultiInstanceInvalidationClient$observer$1
            r3.<init>(r1, r2)
            r1.observer = r3
            androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1 r2 = new androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1
            r2.<init>(r1)
            r1.invalidationCallback = r2
            androidx.room.MultiInstanceInvalidationClient$serviceConnection$1 r2 = new androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            r2.<init>(r1)
            r1.serviceConnection = r2
            return
    }

    public static final /* synthetic */ int access$getClientId$p(androidx.room.MultiInstanceInvalidationClient r0) {
            int r0 = r0.clientId
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.r0 access$getCoroutineScope$p(androidx.room.MultiInstanceInvalidationClient r0) {
            kotlinx.coroutines.r0 r0 = r0.coroutineScope
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.flow.s access$getInvalidatedTables$p(androidx.room.MultiInstanceInvalidationClient r0) {
            kotlinx.coroutines.flow.s<java.util.Set<java.lang.String>> r0 = r0.invalidatedTables
            return r0
    }

    public static final /* synthetic */ androidx.room.IMultiInstanceInvalidationService access$getInvalidationService$p(androidx.room.MultiInstanceInvalidationClient r0) {
            androidx.room.IMultiInstanceInvalidationService r0 = r0.invalidationService
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean access$getStopped$p(androidx.room.MultiInstanceInvalidationClient r0) {
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.stopped
            return r0
    }

    public static final /* synthetic */ void access$registerCallback(androidx.room.MultiInstanceInvalidationClient r0) {
            r0.registerCallback()
            return
    }

    public static final /* synthetic */ void access$setInvalidationService$p(androidx.room.MultiInstanceInvalidationClient r0, androidx.room.IMultiInstanceInvalidationService r1) {
            r0.invalidationService = r1
            return
    }

    private final void registerCallback() {
            r3 = this;
            androidx.room.IMultiInstanceInvalidationService r0 = r3.invalidationService     // Catch: android.os.RemoteException -> Le
            if (r0 == 0) goto Le
            androidx.room.IMultiInstanceInvalidationCallback r1 = r3.invalidationCallback     // Catch: android.os.RemoteException -> Le
            java.lang.String r2 = r3.name     // Catch: android.os.RemoteException -> Le
            int r0 = r0.registerCallback(r1, r2)     // Catch: android.os.RemoteException -> Le
            r3.clientId = r0     // Catch: android.os.RemoteException -> Le
        Le:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.i<java.util.Set<java.lang.String>> createFlow(@org.jetbrains.annotations.NotNull java.lang.String[] r3) {
            r2 = this;
            java.lang.String r0 = "resolvedTableNames"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlinx.coroutines.flow.s<java.util.Set<java.lang.String>> r0 = r2.invalidatedTables
            androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1 r1 = new androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1
            r1.<init>(r0, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.InvalidationTracker getInvalidationTracker() {
            r1 = this;
            androidx.room.InvalidationTracker r0 = r1.invalidationTracker
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final void start(@org.jetbrains.annotations.NotNull android.content.Intent r4) {
            r3 = this;
            java.lang.String r0 = "serviceIntent"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.stopped
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L1d
            android.content.Context r0 = r3.appContext
            android.content.ServiceConnection r1 = r3.serviceConnection
            r0.bindService(r4, r1, r2)
            androidx.room.InvalidationTracker r4 = r3.invalidationTracker
            androidx.room.MultiInstanceInvalidationClient$observer$1 r0 = r3.observer
            r4.addRemoteObserver$room_runtime_release(r0)
        L1d:
            return
    }

    public final void stop() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.stopped
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L23
            androidx.room.InvalidationTracker r0 = r3.invalidationTracker
            androidx.room.MultiInstanceInvalidationClient$observer$1 r1 = r3.observer
            r0.removeObserver(r1)
            androidx.room.IMultiInstanceInvalidationService r0 = r3.invalidationService     // Catch: android.os.RemoteException -> L1c
            if (r0 == 0) goto L1c
            androidx.room.IMultiInstanceInvalidationCallback r1 = r3.invalidationCallback     // Catch: android.os.RemoteException -> L1c
            int r2 = r3.clientId     // Catch: android.os.RemoteException -> L1c
            r0.unregisterCallback(r1, r2)     // Catch: android.os.RemoteException -> L1c
        L1c:
            android.content.Context r0 = r3.appContext
            android.content.ServiceConnection r1 = r3.serviceConnection
            r0.unbindService(r1)
        L23:
            return
    }
}
