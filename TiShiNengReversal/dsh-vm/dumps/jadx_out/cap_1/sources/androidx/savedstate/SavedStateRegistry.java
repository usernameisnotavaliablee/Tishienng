package androidx.savedstate;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"RestrictedApi"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateRegistry {

    @org.jetbrains.annotations.NotNull
    private static final androidx.savedstate.SavedStateRegistry.Companion Companion = null;

    @java.lang.Deprecated
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;

    @org.jetbrains.annotations.NotNull
    private final androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> components;
    private boolean isAllowingSavingState;
    private boolean isRestored;

    @org.jetbrains.annotations.Nullable
    private androidx.savedstate.Recreator.SavedStateProvider recreatorProvider;

    @org.jetbrains.annotations.Nullable
    private android.os.Bundle restoredState;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface AutoRecreated {
        void onRecreated(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistryOwner r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Companion {
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
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface SavedStateProvider {
        @org.jetbrains.annotations.NotNull
        android.os.Bundle saveState();
    }

    static {
            androidx.savedstate.SavedStateRegistry$Companion r0 = new androidx.savedstate.SavedStateRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.SavedStateRegistry.Companion = r0
            return
    }

    public SavedStateRegistry() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.components = r0
            r0 = 1
            r1.isAllowingSavingState = r0
            return
    }

    public static /* synthetic */ void a(androidx.savedstate.SavedStateRegistry r0, androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
            performAttach$lambda$4(r0, r1, r2)
            return
    }

    private static final void performAttach$lambda$4(androidx.savedstate.SavedStateRegistry r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.g0.p(r3, r2)
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
            if (r3 != r2) goto L17
            r2 = 1
            r1.isAllowingSavingState = r2
            return
        L17:
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            if (r3 != r2) goto L1e
            r2 = 0
            r1.isAllowingSavingState = r2
        L1e:
            return
    }

    @androidx.annotation.MainThread
    @org.jetbrains.annotations.Nullable
    public final android.os.Bundle consumeRestoredStateForKey(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3.isRestored
            if (r0 == 0) goto L2c
            android.os.Bundle r0 = r3.restoredState
            r1 = 0
            if (r0 == 0) goto L2b
            if (r0 == 0) goto L15
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L16
        L15:
            r0 = r1
        L16:
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L1d
            r2.remove(r4)
        L1d:
            android.os.Bundle r4 = r3.restoredState
            if (r4 == 0) goto L28
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L28
            return r0
        L28:
            r3.restoredState = r1
            return r0
        L2b:
            return r1
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.Nullable
    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r3.components
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.String r2 = "components"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r1
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto Lb
            return r1
        L2f:
            r4 = 0
            return r4
    }

    public final boolean isAllowingSavingState$savedstate_release() {
            r1 = this;
            boolean r0 = r1.isAllowingSavingState
            return r0
    }

    @androidx.annotation.MainThread
    public final boolean isRestored() {
            r1 = this;
            boolean r0 = r1.isRestored
            return r0
    }

    @androidx.annotation.MainThread
    public final void performAttach$savedstate_release(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle r2) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.attached
            if (r0 != 0) goto L15
            androidx.savedstate.a r0 = new androidx.savedstate.a
            r0.<init>(r1)
            r2.addObserver(r0)
            r2 = 1
            r1.attached = r2
            return
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already attached."
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.MainThread
    public final void performRestore$savedstate_release(@org.jetbrains.annotations.Nullable android.os.Bundle r2) {
            r1 = this;
            boolean r0 = r1.attached
            if (r0 == 0) goto L20
            boolean r0 = r1.isRestored
            if (r0 != 0) goto L18
            if (r2 == 0) goto L11
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r2 = r2.getBundle(r0)
            goto L12
        L11:
            r2 = 0
        L12:
            r1.restoredState = r2
            r2 = 1
            r1.isRestored = r2
            return
        L18:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "SavedStateRegistry was already restored."
            r2.<init>(r0)
            throw r2
        L20:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "You must call performAttach() before calling performRestore(Bundle)."
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.MainThread
    public final void performSave(@org.jetbrains.annotations.NotNull android.os.Bundle r5) {
            r4 = this;
            java.lang.String r0 = "outBundle"
            kotlin.jvm.internal.g0.p(r5, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r4.restoredState
            if (r1 == 0) goto L11
            r0.putAll(r1)
        L11:
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r4.components
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r1 = r1.iteratorWithAdditions()
            java.lang.String r2 = "this.components.iteratorWithAdditions()"
            kotlin.jvm.internal.g0.o(r1, r2)
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            android.os.Bundle r2 = r2.saveState()
            r0.putBundle(r3, r2)
            goto L1c
        L3c:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L47
            java.lang.String r1 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r5.putBundle(r1, r0)
        L47:
            return
    }

    @androidx.annotation.MainThread
    public final void registerSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry.SavedStateProvider r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.components
            java.lang.Object r2 = r0.putIfAbsent(r2, r3)
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            if (r2 != 0) goto L15
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            r2.<init>(r3)
            throw r2
    }

    @androidx.annotation.MainThread
    public final void runOnNextRecreation(@org.jetbrains.annotations.NotNull java.lang.Class<? extends androidx.savedstate.SavedStateRegistry.AutoRecreated> r5) {
            r4 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4.isAllowingSavingState
            if (r0 == 0) goto L4a
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.recreatorProvider
            if (r0 != 0) goto L12
            androidx.savedstate.Recreator$SavedStateProvider r0 = new androidx.savedstate.Recreator$SavedStateProvider
            r0.<init>(r4)
        L12:
            r4.recreatorProvider = r0
            r0 = 0
            r5.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L29
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.recreatorProvider
            if (r0 == 0) goto L28
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "clazz.name"
            kotlin.jvm.internal.g0.o(r5, r1)
            r0.add(r5)
        L28:
            return
        L29:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            r2.append(r3)
            java.lang.String r5 = r5.getSimpleName()
            r2.append(r5)
            java.lang.String r5 = " must have default constructor in order to be automatically recreated"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L4a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            r5.<init>(r0)
            throw r5
    }

    public final void setAllowingSavingState$savedstate_release(boolean r1) {
            r0 = this;
            r0.isAllowingSavingState = r1
            return
    }

    @androidx.annotation.MainThread
    public final void unregisterSavedStateProvider(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.components
            r0.remove(r2)
            return
    }
}
