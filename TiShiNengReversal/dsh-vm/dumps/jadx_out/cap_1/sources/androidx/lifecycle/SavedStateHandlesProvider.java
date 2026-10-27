package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n215#2,2:226\n1#3:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:226,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SavedStateHandlesProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
    private boolean restored;

    @org.jetbrains.annotations.Nullable
    private android.os.Bundle restoredState;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s viewModel$delegate;

    public SavedStateHandlesProvider(@org.jetbrains.annotations.NotNull androidx.savedstate.SavedStateRegistry r2, @org.jetbrains.annotations.NotNull androidx.lifecycle.ViewModelStoreOwner r3) {
            r1 = this;
            java.lang.String r0 = "savedStateRegistry"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "viewModelStoreOwner"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.savedStateRegistry = r2
            androidx.lifecycle.SavedStateHandlesProvider$viewModel$2 r2 = new androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            r2.<init>(r3)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.viewModel$delegate = r2
            return
    }

    private final androidx.lifecycle.SavedStateHandlesVM getViewModel() {
            r1 = this;
            kotlin.s r0 = r1.viewModel$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.SavedStateHandlesVM r0 = (androidx.lifecycle.SavedStateHandlesVM) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final android.os.Bundle consumeRestoredStateForKey(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.performRestore()
            android.os.Bundle r0 = r3.restoredState
            r1 = 0
            if (r0 == 0) goto L12
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L13
        L12:
            r0 = r1
        L13:
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L1a
            r2.remove(r4)
        L1a:
            android.os.Bundle r4 = r3.restoredState
            if (r4 == 0) goto L27
            boolean r4 = r4.isEmpty()
            r2 = 1
            if (r4 != r2) goto L27
            r3.restoredState = r1
        L27:
            return r0
    }

    public final void performRestore() {
            r3 = this;
            boolean r0 = r3.restored
            if (r0 != 0) goto L25
            androidx.savedstate.SavedStateRegistry r0 = r3.savedStateRegistry
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r0 = r0.consumeRestoredStateForKey(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L18
            r1.putAll(r2)
        L18:
            if (r0 == 0) goto L1d
            r1.putAll(r0)
        L1d:
            r3.restoredState = r1
            r0 = 1
            r3.restored = r0
            r3.getViewModel()
        L25:
            return
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    @org.jetbrains.annotations.NotNull
    public android.os.Bundle saveState() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r5.restoredState
            if (r1 == 0) goto Lc
            r0.putAll(r1)
        Lc:
            androidx.lifecycle.SavedStateHandlesVM r1 = r5.getViewModel()
            java.util.Map r1 = r1.getHandles()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.SavedStateHandle r2 = (androidx.lifecycle.SavedStateHandle) r2
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = r2.savedStateProvider()
            android.os.Bundle r2 = r2.saveState()
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            boolean r4 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r4 != 0) goto L1c
            r0.putBundle(r3, r2)
            goto L1c
        L48:
            r1 = 0
            r5.restored = r1
            return r0
    }
}
