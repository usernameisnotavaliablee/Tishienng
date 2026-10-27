package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ComponentDialog extends android.app.Dialog implements androidx.lifecycle.LifecycleOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.savedstate.SavedStateRegistryOwner {

    @org.jetbrains.annotations.Nullable
    private androidx.lifecycle.LifecycleRegistry _lifecycleRegistry;

    @org.jetbrains.annotations.NotNull
    private final androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher;

    @org.jetbrains.annotations.NotNull
    private final androidx.savedstate.SavedStateRegistryController savedStateRegistryController;

    @kotlin.jvm.JvmOverloads
    public ComponentDialog(@org.jetbrains.annotations.NotNull android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ComponentDialog(@org.jetbrains.annotations.NotNull android.content.Context r2, @androidx.annotation.StyleRes int r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>(r2, r3)
            androidx.savedstate.SavedStateRegistryController$Companion r2 = androidx.savedstate.SavedStateRegistryController.Companion
            androidx.savedstate.SavedStateRegistryController r2 = r2.create(r1)
            r1.savedStateRegistryController = r2
            androidx.activity.OnBackPressedDispatcher r2 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.g r3 = new androidx.activity.g
            r3.<init>(r1)
            r2.<init>(r3)
            r1.onBackPressedDispatcher = r2
            return
    }

    public /* synthetic */ ComponentDialog(android.content.Context r1, int r2, int r3, kotlin.jvm.internal.v r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    public static /* synthetic */ void a(androidx.activity.ComponentDialog r0) {
            onBackPressedDispatcher$lambda$1(r0)
            return
    }

    private final androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1._lifecycleRegistry
            if (r0 != 0) goto Lb
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1._lifecycleRegistry = r0
        Lb:
            return r0
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
            return
    }

    private static final void onBackPressedDispatcher$lambda$1(androidx.activity.ComponentDialog r1) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.g0.p(r1, r0)
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public void addContentView(@org.jetbrains.annotations.NotNull android.view.View r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.initializeViewTreeOwners()
            super.addContentView(r2, r3)
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.getLifecycleRegistry()
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @org.jetbrains.annotations.NotNull
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.savedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @androidx.annotation.CallSuper
    public void initializeViewTreeOwners() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            kotlin.jvm.internal.g0.m(r0)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window!!.decorView"
            kotlin.jvm.internal.g0.o(r0, r1)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            android.view.Window r0 = r2.getWindow()
            kotlin.jvm.internal.g0.m(r0)
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.g0.o(r0, r1)
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(r0, r2)
            android.view.Window r0 = r2.getWindow()
            kotlin.jvm.internal.g0.m(r0)
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.g0.o(r0, r1)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r2)
            return
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            r0.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    protected void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L17
            androidx.activity.OnBackPressedDispatcher r0 = r3.onBackPressedDispatcher
            android.window.OnBackInvokedDispatcher r1 = androidx.activity.f.a(r3)
            java.lang.String r2 = "onBackInvokedDispatcher"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.setOnBackInvokedDispatcher(r1)
        L17:
            androidx.savedstate.SavedStateRegistryController r0 = r3.savedStateRegistryController
            r0.performRestore(r4)
            androidx.lifecycle.LifecycleRegistry r4 = r3.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r4.handleLifecycleEvent(r0)
            return
    }

    @Override // android.app.Dialog
    @org.jetbrains.annotations.NotNull
    public android.os.Bundle onSaveInstanceState() {
            r2 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            java.lang.String r1 = "super.onSaveInstanceState()"
            kotlin.jvm.internal.g0.o(r0, r1)
            androidx.savedstate.SavedStateRegistryController r1 = r2.savedStateRegistryController
            r1.performSave(r0)
            return r0
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    protected void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Dialog
    @androidx.annotation.CallSuper
    protected void onStop() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2._lifecycleRegistry = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.initializeViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(@org.jetbrains.annotations.NotNull android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.initializeViewTreeOwners()
            super.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(@org.jetbrains.annotations.NotNull android.view.View r2, @org.jetbrains.annotations.Nullable android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.initializeViewTreeOwners()
            super.setContentView(r2, r3)
            return
    }
}
