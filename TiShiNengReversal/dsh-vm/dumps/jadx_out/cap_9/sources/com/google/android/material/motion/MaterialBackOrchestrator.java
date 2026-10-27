package com.google.android.material.motion;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class MaterialBackOrchestrator {

    @androidx.annotation.Nullable
    private final com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate backCallbackDelegate;

    @androidx.annotation.NonNull
    private final com.google.android.material.motion.MaterialBackHandler backHandler;

    @androidx.annotation.NonNull
    private final android.view.View view;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.material.motion.MaterialBackOrchestrator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(33)
    private static class Api33BackCallbackDelegate implements com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate {

        @androidx.annotation.Nullable
        private android.window.OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Api33BackCallbackDelegate(com.google.android.material.motion.MaterialBackOrchestrator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        android.window.OnBackInvokedCallback createOnBackInvokedCallback(@androidx.annotation.NonNull com.google.android.material.motion.MaterialBackHandler r2) {
                r1 = this;
                java.util.Objects.requireNonNull(r2)
                com.google.android.material.motion.b r0 = new com.google.android.material.motion.b
                r0.<init>(r2)
                return r0
        }

        boolean isListeningForBackCallbacks() {
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @androidx.annotation.DoNotInline
        public void startListeningForBackCallbacks(@androidx.annotation.NonNull com.google.android.material.motion.MaterialBackHandler r2, @androidx.annotation.NonNull android.view.View r3, boolean r4) {
                r1 = this;
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                if (r0 == 0) goto L5
                goto Lb
            L5:
                android.window.OnBackInvokedDispatcher r3 = com.google.android.material.motion.a.a(r3)
                if (r3 != 0) goto Lc
            Lb:
                return
            Lc:
                android.window.OnBackInvokedCallback r2 = r1.createOnBackInvokedCallback(r2)
                r1.onBackInvokedCallback = r2
                if (r4 == 0) goto L18
                r4 = 1000000(0xf4240, float:1.401298E-39)
                goto L19
            L18:
                r4 = 0
            L19:
                androidx.appcompat.app.o.a(r3, r4, r2)
                return
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        @androidx.annotation.DoNotInline
        public void stopListeningForBackCallbacks(@androidx.annotation.NonNull android.view.View r2) {
                r1 = this;
                android.window.OnBackInvokedDispatcher r2 = com.google.android.material.motion.a.a(r2)
                if (r2 != 0) goto L7
                return
            L7:
                android.window.OnBackInvokedCallback r0 = r1.onBackInvokedCallback
                androidx.appcompat.app.m.a(r2, r0)
                r2 = 0
                r1.onBackInvokedCallback = r2
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(34)
    private static class Api34BackCallbackDelegate extends com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate {


        private Api34BackCallbackDelegate() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ Api34BackCallbackDelegate(com.google.android.material.motion.MaterialBackOrchestrator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        android.window.OnBackInvokedCallback createOnBackInvokedCallback(@androidx.annotation.NonNull com.google.android.material.motion.MaterialBackHandler r2) {
                r1 = this;
                com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate$1 r0 = new com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate$1
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface BackCallbackDelegate {
        void startListeningForBackCallbacks(@androidx.annotation.NonNull com.google.android.material.motion.MaterialBackHandler r1, @androidx.annotation.NonNull android.view.View r2, boolean r3);

        void stopListeningForBackCallbacks(@androidx.annotation.NonNull android.view.View r1);
    }

    public <T extends android.view.View & com.google.android.material.motion.MaterialBackHandler> MaterialBackOrchestrator(@androidx.annotation.NonNull T r2) {
            r1 = this;
            r0 = r2
            com.google.android.material.motion.MaterialBackHandler r0 = (com.google.android.material.motion.MaterialBackHandler) r0
            r1.<init>(r0, r2)
            return
    }

    public MaterialBackOrchestrator(@androidx.annotation.NonNull com.google.android.material.motion.MaterialBackHandler r2, @androidx.annotation.NonNull android.view.View r3) {
            r1 = this;
            r1.<init>()
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = createBackCallbackDelegate()
            r1.backCallbackDelegate = r0
            r1.backHandler = r2
            r1.view = r3
            return
    }

    @androidx.annotation.Nullable
    private static com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate createBackCallbackDelegate() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto Ld
            com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate r0 = new com.google.android.material.motion.MaterialBackOrchestrator$Api34BackCallbackDelegate
            r0.<init>(r2)
            return r0
        Ld:
            r1 = 33
            if (r0 < r1) goto L17
            com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate r0 = new com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate
            r0.<init>(r2)
            return r0
        L17:
            return r2
    }

    private void startListeningForBackCallbacks(boolean r4) {
            r3 = this;
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = r3.backCallbackDelegate
            if (r0 == 0) goto Lb
            com.google.android.material.motion.MaterialBackHandler r1 = r3.backHandler
            android.view.View r2 = r3.view
            r0.startListeningForBackCallbacks(r1, r2, r4)
        Lb:
            return
    }

    public boolean shouldListenForBackCallbacks() {
            r1 = this;
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = r1.backCallbackDelegate
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void startListeningForBackCallbacks() {
            r1 = this;
            r0 = 0
            r1.startListeningForBackCallbacks(r0)
            return
    }

    public void startListeningForBackCallbacksWithPriorityOverlay() {
            r1 = this;
            r0 = 1
            r1.startListeningForBackCallbacks(r0)
            return
    }

    public void stopListeningForBackCallbacks() {
            r2 = this;
            com.google.android.material.motion.MaterialBackOrchestrator$BackCallbackDelegate r0 = r2.backCallbackDelegate
            if (r0 == 0) goto L9
            android.view.View r1 = r2.view
            r0.stopListeningForBackCallbacks(r1)
        L9:
            return
    }
}
