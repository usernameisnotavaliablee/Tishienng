package androidx.customview.poolingcontainer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "PoolingContainer")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PoolingContainer {
    private static final int IsPoolingContainerTag = 0;
    private static final int PoolingContainerListenerHolderTag = 0;

    static {
            int r0 = androidx.customview.poolingcontainer.R.id.pooling_container_listener_holder_tag
            androidx.customview.poolingcontainer.PoolingContainer.PoolingContainerListenerHolderTag = r0
            int r0 = androidx.customview.poolingcontainer.R.id.is_pooling_container_tag
            androidx.customview.poolingcontainer.PoolingContainer.IsPoolingContainerTag = r0
            return
    }

    @android.annotation.SuppressLint({"ExecutorRegistration"})
    public static final void addPoolingContainerListener(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull androidx.customview.poolingcontainer.PoolingContainerListener r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = getPoolingContainerListenerHolder(r1)
            r1.addListener(r2)
            return
    }

    public static final void callPoolingContainerOnRelease(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = androidx.core.view.ViewKt.getAllViews(r1)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r0 = getPoolingContainerListenerHolder(r0)
            r0.onRelease()
            goto Ld
        L21:
            return
    }

    public static final void callPoolingContainerOnReleaseForChildren(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.sequences.m r1 = androidx.core.view.ViewGroupKt.getChildren(r1)
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r0 = getPoolingContainerListenerHolder(r0)
            r0.onRelease()
            goto Ld
        L21:
            return
    }

    private static final androidx.customview.poolingcontainer.PoolingContainerListenerHolder getPoolingContainerListenerHolder(android.view.View r2) {
            int r0 = androidx.customview.poolingcontainer.PoolingContainer.PoolingContainerListenerHolderTag
            java.lang.Object r1 = r2.getTag(r0)
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = (androidx.customview.poolingcontainer.PoolingContainerListenerHolder) r1
            if (r1 != 0) goto L12
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = new androidx.customview.poolingcontainer.PoolingContainerListenerHolder
            r1.<init>()
            r2.setTag(r0, r1)
        L12:
            return r1
    }

    public static final boolean isPoolingContainer(@org.jetbrains.annotations.NotNull android.view.View r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = androidx.customview.poolingcontainer.PoolingContainer.IsPoolingContainerTag
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L12
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L1a
            boolean r1 = r1.booleanValue()
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public static final boolean isWithinPoolingContainer(@org.jetbrains.annotations.NotNull android.view.View r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.sequences.m r2 = androidx.core.view.ViewKt.getAncestors(r2)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Ld
            android.view.View r0 = (android.view.View) r0
            boolean r0 = isPoolingContainer(r0)
            if (r0 == 0) goto Ld
            r2 = 1
            return r2
        L27:
            r2 = 0
            return r2
    }

    @android.annotation.SuppressLint({"ExecutorRegistration"})
    public static final void removePoolingContainerListener(@org.jetbrains.annotations.NotNull android.view.View r1, @org.jetbrains.annotations.NotNull androidx.customview.poolingcontainer.PoolingContainerListener r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.customview.poolingcontainer.PoolingContainerListenerHolder r1 = getPoolingContainerListenerHolder(r1)
            r1.removeListener(r2)
            return
    }

    public static final void setPoolingContainer(@org.jetbrains.annotations.NotNull android.view.View r1, boolean r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = androidx.customview.poolingcontainer.PoolingContainer.IsPoolingContainerTag
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setTag(r0, r2)
            return
    }
}
