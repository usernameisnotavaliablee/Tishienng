package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class LifecycleRegistry extends androidx.lifecycle.Lifecycle {

    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LifecycleRegistry.Companion Companion = null;
    private int addingObserverCounter;
    private final boolean enforceMainThread;
    private boolean handlingEvent;

    @org.jetbrains.annotations.NotNull
    private final java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> lifecycleOwner;
    private boolean newEventOccurred;

    @org.jetbrains.annotations.NotNull
    private androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry.ObserverWithState> observerMap;

    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<androidx.lifecycle.Lifecycle.State> parentStates;

    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.Lifecycle.State state;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        @androidx.annotation.VisibleForTesting
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.LifecycleRegistry createUnsafe(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r4) {
                r3 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.g0.p(r4, r0)
                androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
                r1 = 0
                r2 = 0
                r0.<init>(r4, r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.Lifecycle.State min$lifecycle_runtime_release(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2, @org.jetbrains.annotations.Nullable androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                java.lang.String r0 = "state1"
                kotlin.jvm.internal.g0.p(r2, r0)
                if (r3 == 0) goto Le
                int r0 = r3.compareTo(r2)
                if (r0 >= 0) goto Le
                return r3
            Le:
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ObserverWithState {

        @org.jetbrains.annotations.NotNull
        private androidx.lifecycle.LifecycleEventObserver lifecycleObserver;

        @org.jetbrains.annotations.NotNull
        private androidx.lifecycle.Lifecycle.State state;

        public ObserverWithState(@org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleObserver r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r3) {
                r1 = this;
                java.lang.String r0 = "initialState"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.<init>()
                kotlin.jvm.internal.g0.m(r2)
                androidx.lifecycle.LifecycleEventObserver r2 = androidx.lifecycle.Lifecycling.lifecycleEventObserver(r2)
                r1.lifecycleObserver = r2
                r1.state = r3
                return
        }

        public final void dispatchEvent(@org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleOwner r4, @org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r5) {
                r3 = this;
                java.lang.String r0 = "event"
                kotlin.jvm.internal.g0.p(r5, r0)
                androidx.lifecycle.Lifecycle$State r0 = r5.getTargetState()
                androidx.lifecycle.LifecycleRegistry$Companion r1 = androidx.lifecycle.LifecycleRegistry.Companion
                androidx.lifecycle.Lifecycle$State r2 = r3.state
                androidx.lifecycle.Lifecycle$State r1 = r1.min$lifecycle_runtime_release(r2, r0)
                r3.state = r1
                androidx.lifecycle.LifecycleEventObserver r1 = r3.lifecycleObserver
                kotlin.jvm.internal.g0.m(r4)
                r1.onStateChanged(r4, r5)
                r3.state = r0
                return
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.LifecycleEventObserver getLifecycleObserver() {
                r1 = this;
                androidx.lifecycle.LifecycleEventObserver r0 = r1.lifecycleObserver
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.lifecycle.Lifecycle.State getState() {
                r1 = this;
                androidx.lifecycle.Lifecycle$State r0 = r1.state
                return r0
        }

        public final void setLifecycleObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleEventObserver r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.lifecycleObserver = r2
                return
        }

        public final void setState(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.state = r2
                return
        }
    }

    static {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = new androidx.lifecycle.LifecycleRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.LifecycleRegistry.Companion = r0
            return
    }

    public LifecycleRegistry(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r2) {
            r1 = this;
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    private LifecycleRegistry(androidx.lifecycle.LifecycleOwner r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.enforceMainThread = r2
            androidx.arch.core.internal.FastSafeIterableMap r2 = new androidx.arch.core.internal.FastSafeIterableMap
            r2.<init>()
            r0.observerMap = r2
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            r0.state = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.parentStates = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.lifecycleOwner = r2
            return
    }

    public /* synthetic */ LifecycleRegistry(androidx.lifecycle.LifecycleOwner r1, boolean r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private final void backwardPass(androidx.lifecycle.LifecycleOwner r6) {
            r5 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.observerMap
            java.util.Iterator r0 = r0.descendingIterator()
            java.lang.String r1 = "observerMap.descendingIterator()"
            kotlin.jvm.internal.g0.o(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L79
            boolean r1 = r5.newEventOccurred
            if (r1 != 0) goto L79
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "next()"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Object r2 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r2 = (androidx.lifecycle.LifecycleObserver) r2
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
        L2c:
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            androidx.lifecycle.Lifecycle$State r4 = r5.state
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto Lb
            boolean r3 = r5.newEventOccurred
            if (r3 != 0) goto Lb
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r5.observerMap
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto Lb
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r1.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.downFrom(r4)
            if (r3 == 0) goto L5e
            androidx.lifecycle.Lifecycle$State r4 = r3.getTargetState()
            r5.pushParentState(r4)
            r1.dispatchEvent(r6, r3)
            r5.popParentState()
            goto L2c
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "no event down from "
            r0.append(r2)
            androidx.lifecycle.Lifecycle$State r1 = r1.getState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L79:
            return
    }

    private final androidx.lifecycle.Lifecycle.State calculateTargetState(androidx.lifecycle.LifecycleObserver r4) {
            r3 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.observerMap
            java.util.Map$Entry r4 = r0.ceil(r4)
            r0 = 0
            if (r4 == 0) goto L16
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r4 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r4
            if (r4 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r4 = r4.getState()
            goto L17
        L16:
            r4 = r0
        L17:
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r1 = r3.parentStates
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2d
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r3.parentStates
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
        L2d:
            androidx.lifecycle.LifecycleRegistry$Companion r1 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.Lifecycle$State r2 = r3.state
            androidx.lifecycle.Lifecycle$State r4 = r1.min$lifecycle_runtime_release(r2, r4)
            androidx.lifecycle.Lifecycle$State r4 = r1.min$lifecycle_runtime_release(r4, r0)
            return r4
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.LifecycleRegistry createUnsafe(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleOwner r1) {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.LifecycleRegistry r1 = r0.createUnsafe(r1)
            return r1
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    private final void enforceMainThreadIfNeeded(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.enforceMainThread
            if (r0 == 0) goto L2f
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            boolean r0 = r0.isMainThread()
            if (r0 == 0) goto Lf
            goto L2f
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " must be called on the main thread"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            return
    }

    private final void forwardPass(androidx.lifecycle.LifecycleOwner r6) {
            r5 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r5.observerMap
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r0 = r0.iteratorWithAdditions()
            java.lang.String r1 = "observerMap.iteratorWithAdditions()"
            kotlin.jvm.internal.g0.o(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L74
            boolean r1 = r5.newEventOccurred
            if (r1 != 0) goto L74
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            androidx.lifecycle.LifecycleObserver r2 = (androidx.lifecycle.LifecycleObserver) r2
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
        L27:
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            androidx.lifecycle.Lifecycle$State r4 = r5.state
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto Lb
            boolean r3 = r5.newEventOccurred
            if (r3 != 0) goto Lb
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r5.observerMap
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto Lb
            androidx.lifecycle.Lifecycle$State r3 = r1.getState()
            r5.pushParentState(r3)
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r1.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.upFrom(r4)
            if (r3 == 0) goto L59
            r1.dispatchEvent(r6, r3)
            r5.popParentState()
            goto L27
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "no event up from "
            r0.append(r2)
            androidx.lifecycle.Lifecycle$State r1 = r1.getState()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L74:
            return
    }

    private final boolean isSynced() {
            r3 = this;
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.observerMap
            int r0 = r0.size()
            r1 = 1
            if (r0 != 0) goto La
            return r1
        La:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r3.observerMap
            java.util.Map$Entry r0 = r0.eldest()
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r0
            androidx.lifecycle.Lifecycle$State r0 = r0.getState()
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r3.observerMap
            java.util.Map$Entry r2 = r2.newest()
            kotlin.jvm.internal.g0.m(r2)
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.getState()
            if (r0 != r2) goto L37
            androidx.lifecycle.Lifecycle$State r0 = r3.state
            if (r0 != r2) goto L37
            return r1
        L37:
            r0 = 0
            return r0
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final androidx.lifecycle.Lifecycle.State min$lifecycle_runtime_release(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r1, @org.jetbrains.annotations.Nullable androidx.lifecycle.Lifecycle.State r2) {
            androidx.lifecycle.LifecycleRegistry$Companion r0 = androidx.lifecycle.LifecycleRegistry.Companion
            androidx.lifecycle.Lifecycle$State r1 = r0.min$lifecycle_runtime_release(r1, r2)
            return r1
    }

    private final void moveToState(androidx.lifecycle.Lifecycle.State r3) {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r2.state
            if (r0 != r3) goto L5
            goto L5a
        L5:
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 != r1) goto L39
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r3 == r0) goto Le
            goto L39
        Le:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "no event down from "
            r3.append(r0)
            androidx.lifecycle.Lifecycle$State r0 = r2.state
            r3.append(r0)
            java.lang.String r0 = " in component "
            r3.append(r0)
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r2.lifecycleOwner
            java.lang.Object r0 = r0.get()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L39:
            r2.state = r3
            boolean r3 = r2.handlingEvent
            r0 = 1
            if (r3 != 0) goto L5b
            int r3 = r2.addingObserverCounter
            if (r3 == 0) goto L45
            goto L5b
        L45:
            r2.handlingEvent = r0
            r2.sync()
            r3 = 0
            r2.handlingEvent = r3
            androidx.lifecycle.Lifecycle$State r3 = r2.state
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r3 != r0) goto L5a
            androidx.arch.core.internal.FastSafeIterableMap r3 = new androidx.arch.core.internal.FastSafeIterableMap
            r3.<init>()
            r2.observerMap = r3
        L5a:
            return
        L5b:
            r2.newEventOccurred = r0
            return
    }

    private final void popParentState() {
            r2 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r2.parentStates
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    private final void pushParentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.util.ArrayList<androidx.lifecycle.Lifecycle$State> r0 = r1.parentStates
            r0.add(r2)
            return
    }

    private final void sync() {
            r3 = this;
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r3.lifecycleOwner
            java.lang.Object r0 = r0.get()
            androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            if (r0 == 0) goto L56
        La:
            boolean r1 = r3.isSynced()
            r2 = 0
            if (r1 != 0) goto L53
            r3.newEventOccurred = r2
            androidx.lifecycle.Lifecycle$State r1 = r3.state
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r2 = r3.observerMap
            java.util.Map$Entry r2 = r2.eldest()
            kotlin.jvm.internal.g0.m(r2)
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r2 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r2
            androidx.lifecycle.Lifecycle$State r2 = r2.getState()
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L31
            r3.backwardPass(r0)
        L31:
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r1 = r3.observerMap
            java.util.Map$Entry r1 = r1.newest()
            boolean r2 = r3.newEventOccurred
            if (r2 != 0) goto La
            if (r1 == 0) goto La
            androidx.lifecycle.Lifecycle$State r2 = r3.state
            java.lang.Object r1 = r1.getValue()
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
            androidx.lifecycle.Lifecycle$State r1 = r1.getState()
            int r1 = r2.compareTo(r1)
            if (r1 <= 0) goto La
            r3.forwardPass(r0)
            goto La
        L53:
            r3.newEventOccurred = r2
            return
        L56:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleObserver r7) {
            r6 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "addObserver"
            r6.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r0 = r6.state
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r0 != r1) goto L11
            goto L13
        L11:
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
        L13:
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r0 = new androidx.lifecycle.LifecycleRegistry$ObserverWithState
            r0.<init>(r7, r1)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r1 = r6.observerMap
            java.lang.Object r1 = r1.putIfAbsent(r7, r0)
            androidx.lifecycle.LifecycleRegistry$ObserverWithState r1 = (androidx.lifecycle.LifecycleRegistry.ObserverWithState) r1
            if (r1 == 0) goto L23
            goto L2d
        L23:
            java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r1 = r6.lifecycleOwner
            java.lang.Object r1 = r1.get()
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 != 0) goto L2e
        L2d:
            return
        L2e:
            int r2 = r6.addingObserverCounter
            r3 = 1
            if (r2 != 0) goto L3a
            boolean r2 = r6.handlingEvent
            if (r2 == 0) goto L38
            goto L3a
        L38:
            r2 = 0
            goto L3b
        L3a:
            r2 = 1
        L3b:
            androidx.lifecycle.Lifecycle$State r4 = r6.calculateTargetState(r7)
            int r5 = r6.addingObserverCounter
            int r5 = r5 + r3
            r6.addingObserverCounter = r5
        L44:
            androidx.lifecycle.Lifecycle$State r3 = r0.getState()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L8f
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r3 = r6.observerMap
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L8f
            androidx.lifecycle.Lifecycle$State r3 = r0.getState()
            r6.pushParentState(r3)
            androidx.lifecycle.Lifecycle$Event$Companion r3 = androidx.lifecycle.Lifecycle.Event.Companion
            androidx.lifecycle.Lifecycle$State r4 = r0.getState()
            androidx.lifecycle.Lifecycle$Event r3 = r3.upFrom(r4)
            if (r3 == 0) goto L74
            r0.dispatchEvent(r1, r3)
            r6.popParentState()
            androidx.lifecycle.Lifecycle$State r4 = r6.calculateTargetState(r7)
            goto L44
        L74:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no event up from "
            r1.append(r2)
            androidx.lifecycle.Lifecycle$State r0 = r0.getState()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.<init>(r0)
            throw r7
        L8f:
            if (r2 != 0) goto L94
            r6.sync()
        L94:
            int r7 = r6.addingObserverCounter
            int r7 = r7 + (-1)
            r6.addingObserverCounter = r7
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle.State getCurrentState() {
            r1 = this;
            androidx.lifecycle.Lifecycle$State r0 = r1.state
            return r0
    }

    public int getObserverCount() {
            r1 = this;
            java.lang.String r0 = "getObserverCount"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.observerMap
            int r0 = r0.size()
            return r0
    }

    public void handleLifecycleEvent(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "handleLifecycleEvent"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.lifecycle.Lifecycle$State r2 = r2.getTargetState()
            r1.moveToState(r2)
            return
    }

    @kotlin.Deprecated(message = "Override [currentState].")
    @androidx.annotation.MainThread
    public void markState(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "markState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.setCurrentState(r2)
            return
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@org.jetbrains.annotations.NotNull androidx.lifecycle.LifecycleObserver r2) {
            r1 = this;
            java.lang.String r0 = "observer"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "removeObserver"
            r1.enforceMainThreadIfNeeded(r0)
            androidx.arch.core.internal.FastSafeIterableMap<androidx.lifecycle.LifecycleObserver, androidx.lifecycle.LifecycleRegistry$ObserverWithState> r0 = r1.observerMap
            r0.remove(r2)
            return
    }

    public void setCurrentState(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "setCurrentState"
            r1.enforceMainThreadIfNeeded(r0)
            r1.moveToState(r2)
            return
    }
}
