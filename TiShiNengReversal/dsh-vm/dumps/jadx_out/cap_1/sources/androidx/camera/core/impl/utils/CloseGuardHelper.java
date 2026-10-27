package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CloseGuardHelper {
    private final androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl mImpl;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(30)
    static final class CloseGuardApi30Impl implements androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl {
        private final android.util.CloseGuard mPlatformImpl;

        CloseGuardApi30Impl() {
                r1 = this;
                r1.<init>()
                android.util.CloseGuard r0 = new android.util.CloseGuard
                r0.<init>()
                r1.mPlatformImpl = r0
                return
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void close() {
                r1 = this;
                android.util.CloseGuard r0 = r1.mPlatformImpl
                r0.close()
                return
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void open(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                android.util.CloseGuard r0 = r1.mPlatformImpl
                r0.open(r2)
                return
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void warnIfOpen() {
                r1 = this;
                android.util.CloseGuard r0 = r1.mPlatformImpl
                r0.warnIfOpen()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface CloseGuardImpl {
        void close();

        void open(@androidx.annotation.NonNull java.lang.String r1);

        void warnIfOpen();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class CloseGuardNoOpImpl implements androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl {
        CloseGuardNoOpImpl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void close() {
                r0 = this;
                return
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void open(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "CloseMethodName must not be null."
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                return
        }

        @Override // androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl
        public void warnIfOpen() {
                r0 = this;
                return
        }
    }

    private CloseGuardHelper(androidx.camera.core.impl.utils.CloseGuardHelper.CloseGuardImpl r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.camera.core.impl.utils.CloseGuardHelper create() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.camera.core.impl.utils.CloseGuardHelper r0 = new androidx.camera.core.impl.utils.CloseGuardHelper
            androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardApi30Impl r1 = new androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardApi30Impl
            r1.<init>()
            r0.<init>(r1)
            return r0
        L11:
            androidx.camera.core.impl.utils.CloseGuardHelper r0 = new androidx.camera.core.impl.utils.CloseGuardHelper
            androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardNoOpImpl r1 = new androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardNoOpImpl
            r1.<init>()
            r0.<init>(r1)
            return r0
    }

    public void close() {
            r1 = this;
            androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl r0 = r1.mImpl
            r0.close()
            return
    }

    public void open(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl r0 = r1.mImpl
            r0.open(r2)
            return
    }

    public void warnIfOpen() {
            r1 = this;
            androidx.camera.core.impl.utils.CloseGuardHelper$CloseGuardImpl r0 = r1.mImpl
            r0.warnIfOpen()
            return
    }
}
