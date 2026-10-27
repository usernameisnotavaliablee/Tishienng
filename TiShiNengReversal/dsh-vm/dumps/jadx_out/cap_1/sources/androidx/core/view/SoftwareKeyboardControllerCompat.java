package androidx.core.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class SoftwareKeyboardControllerCompat {
    private final androidx.core.view.SoftwareKeyboardControllerCompat.Impl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Impl {
        Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        void hide() {
                r0 = this;
                return
        }

        void show() {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(20)
    private static class Impl20 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl {

        @androidx.annotation.Nullable
        private final android.view.View mView;

        Impl20(@androidx.annotation.Nullable android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.mView = r1
                return
        }

        public static /* synthetic */ void a(android.view.View r2) {
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
                r3 = this;
                android.view.View r0 = r3.mView
                if (r0 == 0) goto L1a
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                android.view.View r1 = r3.mView
                android.os.IBinder r1 = r1.getWindowToken()
                r2 = 0
                r0.hideSoftInputFromWindow(r1, r2)
            L1a:
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
                r2 = this;
                android.view.View r0 = r2.mView
                if (r0 != 0) goto L5
                goto L3d
            L5:
                boolean r1 = r0.isInEditMode()
                if (r1 != 0) goto L1b
                boolean r1 = r0.onCheckIsTextEditor()
                if (r1 == 0) goto L12
                goto L1b
            L12:
                android.view.View r0 = r0.getRootView()
                android.view.View r0 = r0.findFocus()
                goto L1e
            L1b:
                r0.requestFocus()
            L1e:
                if (r0 != 0) goto L2d
                android.view.View r0 = r2.mView
                android.view.View r0 = r0.getRootView()
                r1 = 16908290(0x1020002, float:2.3877235E-38)
                android.view.View r0 = r0.findViewById(r1)
            L2d:
                if (r0 == 0) goto L3d
                boolean r1 = r0.hasWindowFocus()
                if (r1 == 0) goto L3d
                androidx.core.view.y r1 = new androidx.core.view.y
                r1.<init>(r0)
                r0.post(r1)
            L3d:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    private static class Impl30 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl20 {

        @androidx.annotation.Nullable
        private android.view.View mView;

        @androidx.annotation.Nullable
        private android.view.WindowInsetsController mWindowInsetsController;

        Impl30(@androidx.annotation.NonNull android.view.View r1) {
                r0 = this;
                r0.<init>(r1)
                r0.mView = r1
                return
        }

        Impl30(@androidx.annotation.Nullable android.view.WindowInsetsController r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mWindowInsetsController = r2
                return
        }

        public static /* synthetic */ void b(java.util.concurrent.atomic.AtomicBoolean r0, android.view.WindowInsetsController r1, int r2) {
                r1 = r2 & 8
                if (r1 == 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                r0.set(r1)
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
                r5 = this;
                android.view.WindowInsetsController r0 = r5.mWindowInsetsController
                if (r0 == 0) goto L5
                goto Lf
            L5:
                android.view.View r0 = r5.mView
                if (r0 == 0) goto Le
                android.view.WindowInsetsController r0 = androidx.core.view.z.a(r0)
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r0 == 0) goto L49
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r2 = 0
                r1.<init>(r2)
                androidx.core.view.f0 r3 = new androidx.core.view.f0
                r3.<init>(r1)
                androidx.core.view.c0.a(r0, r3)
                boolean r1 = r1.get()
                if (r1 != 0) goto L3e
                android.view.View r1 = r5.mView
                if (r1 == 0) goto L3e
                android.content.Context r1 = r1.getContext()
                java.lang.String r4 = "input_method"
                java.lang.Object r1 = r1.getSystemService(r4)
                android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
                android.view.View r4 = r5.mView
                android.os.IBinder r4 = r4.getWindowToken()
                r1.hideSoftInputFromWindow(r4, r2)
            L3e:
                androidx.core.view.d0.a(r0, r3)
                int r1 = androidx.core.view.a0.a()
                androidx.core.view.e0.a(r0, r1)
                return
            L49:
                super.hide()
                return
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
                r3 = this;
                android.view.View r0 = r3.mView
                if (r0 == 0) goto L19
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 33
                if (r1 >= r2) goto L19
                android.content.Context r0 = r0.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r0.isActive()
            L19:
                android.view.WindowInsetsController r0 = r3.mWindowInsetsController
                if (r0 == 0) goto L1e
                goto L28
            L1e:
                android.view.View r0 = r3.mView
                if (r0 == 0) goto L27
                android.view.WindowInsetsController r0 = androidx.core.view.z.a(r0)
                goto L28
            L27:
                r0 = 0
            L28:
                if (r0 == 0) goto L31
                int r1 = androidx.core.view.a0.a()
                androidx.core.view.b0.a(r0, r1)
            L31:
                super.show()
                return
        }
    }

    public SoftwareKeyboardControllerCompat(@androidx.annotation.NonNull android.view.View r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl30 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30
            r0.<init>(r3)
            r2.mImpl = r0
            return
        L11:
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl20 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl20
            r0.<init>(r3)
            r2.mImpl = r0
            return
    }

    @androidx.annotation.RequiresApi(30)
    @java.lang.Deprecated
    SoftwareKeyboardControllerCompat(@androidx.annotation.NonNull android.view.WindowInsetsController r2) {
            r1 = this;
            r1.<init>()
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl30 r0 = new androidx.core.view.SoftwareKeyboardControllerCompat$Impl30
            r0.<init>(r2)
            r1.mImpl = r0
            return
    }

    public void hide() {
            r1 = this;
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl r0 = r1.mImpl
            r0.hide()
            return
    }

    public void show() {
            r1 = this;
            androidx.core.view.SoftwareKeyboardControllerCompat$Impl r0 = r1.mImpl
            r0.show()
            return
    }
}
