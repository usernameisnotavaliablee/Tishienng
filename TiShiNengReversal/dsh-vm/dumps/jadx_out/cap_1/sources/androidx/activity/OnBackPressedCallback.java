package androidx.activity;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class OnBackPressedCallback {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> cancellables;

    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.n1> enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.isEnabled = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.cancellables = r1
            return
    }

    @kotlin.jvm.JvmName(name = "addCancellable")
    public final void addCancellable(@org.jetbrains.annotations.NotNull androidx.activity.Cancellable r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.cancellables
            r0.add(r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.n1> getEnabledChangedCallback$activity_release() {
            r1 = this;
            kotlin.jvm.functions.Function0<kotlin.n1> r0 = r1.enabledChangedCallback
            return r0
    }

    @androidx.annotation.MainThread
    public void handleOnBackCancelled() {
            r0 = this;
            return
    }

    @androidx.annotation.MainThread
    public abstract void handleOnBackPressed();

    @androidx.annotation.MainThread
    public void handleOnBackProgressed(@org.jetbrains.annotations.NotNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @androidx.annotation.MainThread
    public void handleOnBackStarted(@org.jetbrains.annotations.NotNull androidx.activity.BackEventCompat r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.g0.p(r2, r0)
            return
    }

    @androidx.annotation.MainThread
    public final boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.isEnabled
            return r0
    }

    @androidx.annotation.MainThread
    public final void remove() {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r2.cancellables
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.activity.Cancellable r1 = (androidx.activity.Cancellable) r1
            r1.cancel()
            goto L6
        L16:
            return
    }

    @kotlin.jvm.JvmName(name = "removeCancellable")
    public final void removeCancellable(@org.jetbrains.annotations.NotNull androidx.activity.Cancellable r2) {
            r1 = this;
            java.lang.String r0 = "cancellable"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> r0 = r1.cancellables
            r0.remove(r2)
            return
    }

    @androidx.annotation.MainThread
    public final void setEnabled(boolean r1) {
            r0 = this;
            r0.isEnabled = r1
            kotlin.jvm.functions.Function0<kotlin.n1> r1 = r0.enabledChangedCallback
            if (r1 == 0) goto L9
            r1.invoke()
        L9:
            return
    }

    public final void setEnabledChangedCallback$activity_release(@org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.n1> r1) {
            r0 = this;
            r0.enabledChangedCallback = r1
            return
    }
}
