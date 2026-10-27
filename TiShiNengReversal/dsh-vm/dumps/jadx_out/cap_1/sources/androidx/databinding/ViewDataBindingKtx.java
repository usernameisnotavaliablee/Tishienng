package androidx.databinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ViewDataBindingKtx {

    @org.jetbrains.annotations.NotNull
    private static final androidx.databinding.CreateWeakListener CREATE_STATE_FLOW_LISTENER = null;

    @org.jetbrains.annotations.NotNull
    public static final androidx.databinding.ViewDataBindingKtx INSTANCE = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class StateFlowListener implements androidx.databinding.ObservableReference<kotlinx.coroutines.flow.i<? extends java.lang.Object>> {

        @org.jetbrains.annotations.Nullable
        private java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> _lifecycleOwnerRef;

        @org.jetbrains.annotations.NotNull
        private final androidx.databinding.WeakListener<kotlinx.coroutines.flow.i<java.lang.Object>> listener;

        @org.jetbrains.annotations.Nullable
        private kotlinx.coroutines.e2 observerJob;

        public StateFlowListener(@org.jetbrains.annotations.Nullable androidx.databinding.ViewDataBinding r2, int r3, @org.jetbrains.annotations.NotNull java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
                r1 = this;
                java.lang.String r0 = "referenceQueue"
                kotlin.jvm.internal.g0.p(r4, r0)
                r1.<init>()
                androidx.databinding.WeakListener r0 = new androidx.databinding.WeakListener
                r0.<init>(r2, r3, r1, r4)
                r1.listener = r0
                return
        }

        public static final /* synthetic */ androidx.databinding.WeakListener access$getListener$p(androidx.databinding.ViewDataBindingKtx.StateFlowListener r0) {
                androidx.databinding.WeakListener<kotlinx.coroutines.flow.i<java.lang.Object>> r0 = r0.listener
                return r0
        }

        private final void startCollection(androidx.lifecycle.LifecycleOwner r10, kotlinx.coroutines.flow.i<? extends java.lang.Object> r11) {
                r9 = this;
                kotlinx.coroutines.e2 r0 = r9.observerJob
                r1 = 0
                if (r0 == 0) goto L9
                r2 = 1
                kotlinx.coroutines.e2.a.b(r0, r1, r2, r1)
            L9:
                androidx.lifecycle.LifecycleCoroutineScope r3 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r10)
                androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1 r6 = new androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1
                r6.<init>(r10, r11, r9, r1)
                r7 = 3
                r8 = 0
                r4 = 0
                r5 = 0
                kotlinx.coroutines.e2 r10 = kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
                r9.observerJob = r10
                return
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void addListener(kotlinx.coroutines.flow.i<? extends java.lang.Object> r1) {
                r0 = this;
                kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
                r0.addListener2(r1)
                return
        }

        /* renamed from: addListener, reason: avoid collision after fix types in other method */
        public void addListener2(@org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.i<? extends java.lang.Object> r2) {
                r1 = this;
                java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r1._lifecycleOwnerRef
                if (r0 == 0) goto L12
                java.lang.Object r0 = r0.get()
                androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
                if (r0 != 0) goto Ld
                goto L12
            Ld:
                if (r2 == 0) goto L12
                r1.startCollection(r0, r2)
            L12:
                return
        }

        @Override // androidx.databinding.ObservableReference
        @org.jetbrains.annotations.NotNull
        public androidx.databinding.WeakListener<kotlinx.coroutines.flow.i<? extends java.lang.Object>> getListener() {
                r1 = this;
                androidx.databinding.WeakListener<kotlinx.coroutines.flow.i<java.lang.Object>> r0 = r1.listener
                return r0
        }

        @Override // androidx.databinding.ObservableReference
        public /* bridge */ /* synthetic */ void removeListener(kotlinx.coroutines.flow.i<? extends java.lang.Object> r1) {
                r0 = this;
                kotlinx.coroutines.flow.i r1 = (kotlinx.coroutines.flow.i) r1
                r0.removeListener2(r1)
                return
        }

        /* renamed from: removeListener, reason: avoid collision after fix types in other method */
        public void removeListener2(@org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.i<? extends java.lang.Object> r3) {
                r2 = this;
                kotlinx.coroutines.e2 r3 = r2.observerJob
                r0 = 0
                if (r3 == 0) goto L9
                r1 = 1
                kotlinx.coroutines.e2.a.b(r3, r0, r1, r0)
            L9:
                r2.observerJob = r0
                return
        }

        @Override // androidx.databinding.ObservableReference
        public void setLifecycleOwner(@org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleOwner r4) {
                r3 = this;
                java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r0 = r3._lifecycleOwnerRef
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r0.get()
                androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
                goto Ld
            Lc:
                r0 = r1
            Ld:
                if (r0 != r4) goto L10
                goto L31
            L10:
                kotlinx.coroutines.e2 r0 = r3.observerJob
                if (r0 == 0) goto L18
                r2 = 1
                kotlinx.coroutines.e2.a.b(r0, r1, r2, r1)
            L18:
                if (r4 != 0) goto L1d
                r3._lifecycleOwnerRef = r1
                return
            L1d:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r4)
                r3._lifecycleOwnerRef = r0
                androidx.databinding.WeakListener<kotlinx.coroutines.flow.i<java.lang.Object>> r0 = r3.listener
                java.lang.Object r0 = r0.getTarget()
                kotlinx.coroutines.flow.i r0 = (kotlinx.coroutines.flow.i) r0
                if (r0 == 0) goto L31
                r3.startCollection(r4, r0)
            L31:
                return
        }
    }

    static {
            androidx.databinding.ViewDataBindingKtx r0 = new androidx.databinding.ViewDataBindingKtx
            r0.<init>()
            androidx.databinding.ViewDataBindingKtx.INSTANCE = r0
            androidx.databinding.c r0 = new androidx.databinding.c
            r0.<init>()
            androidx.databinding.ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER = r0
            return
    }

    private ViewDataBindingKtx() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final androidx.databinding.WeakListener CREATE_STATE_FLOW_LISTENER$lambda$0(androidx.databinding.ViewDataBinding r1, int r2, java.lang.ref.ReferenceQueue r3) {
            androidx.databinding.ViewDataBindingKtx$StateFlowListener r0 = new androidx.databinding.ViewDataBindingKtx$StateFlowListener
            kotlin.jvm.internal.g0.m(r3)
            r0.<init>(r1, r2, r3)
            androidx.databinding.WeakListener r1 = r0.getListener()
            return r1
    }

    public static /* synthetic */ androidx.databinding.WeakListener a(androidx.databinding.ViewDataBinding r0, int r1, java.lang.ref.ReferenceQueue r2) {
            androidx.databinding.WeakListener r0 = CREATE_STATE_FLOW_LISTENER$lambda$0(r0, r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(@org.jetbrains.annotations.NotNull androidx.databinding.ViewDataBinding r2, int r3, @org.jetbrains.annotations.Nullable kotlinx.coroutines.flow.i<?> r4) {
            java.lang.String r0 = "viewDataBinding"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 1
            r2.mInStateFlowRegisterObserver = r0
            r0 = 0
            androidx.databinding.CreateWeakListener r1 = androidx.databinding.ViewDataBindingKtx.CREATE_STATE_FLOW_LISTENER     // Catch: java.lang.Throwable -> L13
            boolean r3 = r2.updateRegistration(r3, r4, r1)     // Catch: java.lang.Throwable -> L13
            r2.mInStateFlowRegisterObserver = r0
            return r3
        L13:
            r3 = move-exception
            r2.mInStateFlowRegisterObserver = r0
            throw r3
    }
}
