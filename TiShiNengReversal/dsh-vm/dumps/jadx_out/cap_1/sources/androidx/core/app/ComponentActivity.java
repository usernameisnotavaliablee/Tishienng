package androidx.core.app;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {

    @org.jetbrains.annotations.NotNull
    private final androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> extraDataMap;

    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleRegistry lifecycleRegistry;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.Deprecated(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class ExtraData {
        public ExtraData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.extraDataMap = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.lifecycleRegistry = r0
            return
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
            return
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
            return
    }

    private final boolean shouldSkipDump(java.lang.String[] r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L5e
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L5e
        L7:
            r4 = r4[r0]
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -645125871: goto L4e;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5e
        L12:
            java.lang.String r1 = "--autofill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            goto L5e
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r4 < r1) goto L22
            return r2
        L22:
            return r0
        L23:
            java.lang.String r1 = "--contentcapture"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L2c
            goto L5e
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L33
            return r2
        L33:
            return r0
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L46:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L4d
            return r2
        L4d:
            return r0
        L4e:
            java.lang.String r1 = "--translation"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L57
            goto L5e
        L57:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L5e
            return r2
        L5e:
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(@org.jetbrains.annotations.NotNull android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r1 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            boolean r3 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r2, r0, r2, r3)
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(@org.jetbrains.annotations.NotNull android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r0 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r0 == 0) goto L1b
            r3 = 1
            return r3
        L1b:
            boolean r3 = super.dispatchKeyShortcutEvent(r3)
            return r3
    }

    @kotlin.Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "extraDataClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r1.extraDataMap
            java.lang.Object r2 = r0.get(r2)
            androidx.core.app.ComponentActivity$ExtraData r2 = (androidx.core.app.ComponentActivity.ExtraData) r2
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.lifecycleRegistry
            return r0
    }

    @Override // android.app.Activity
    protected void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            androidx.lifecycle.ReportFragment$Companion r1 = androidx.lifecycle.ReportFragment.Companion
            r1.injectIfNeededIn(r0)
            return
    }

    @Override // android.app.Activity
    @androidx.annotation.CallSuper
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.LifecycleRegistry r0 = r2.lifecycleRegistry
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
            super.onSaveInstanceState(r3)
            return
    }

    @kotlin.Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void putExtraData(@org.jetbrains.annotations.NotNull androidx.core.app.ComponentActivity.ExtraData r3) {
            r2 = this;
            java.lang.String r0 = "extraData"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r2.extraDataMap
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    protected final boolean shouldDumpInternalState(@org.jetbrains.annotations.Nullable java.lang.String[] r1) {
            r0 = this;
            boolean r1 = r0.shouldSkipDump(r1)
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@org.jetbrains.annotations.NotNull android.view.KeyEvent r2) {
            r1 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }
}
