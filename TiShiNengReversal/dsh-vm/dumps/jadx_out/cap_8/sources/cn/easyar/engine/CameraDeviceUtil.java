package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class CameraDeviceUtil {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InputFrameHandler implements cn.easyar.FunctorOfVoidFromInputFrame {
        private final java.lang.Object lock;
        private long rawPointer;

        private InputFrameHandler() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.rawPointer = r0
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r2.lock = r0
                return
        }

        private static native void nativeInvoke(long r0, cn.easyar.InputFrame r2);

        @Override // cn.easyar.FunctorOfVoidFromInputFrame
        public void invoke(cn.easyar.InputFrame r4) {
                r3 = this;
                java.lang.Object r0 = r3.lock
                monitor-enter(r0)
                long r1 = r3.rawPointer     // Catch: java.lang.Throwable -> La
                nativeInvoke(r1, r4)     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                return
            La:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                throw r4
        }

        public void setRawPointer(long r2) {
                r1 = this;
                java.lang.Object r0 = r1.lock
                monitor-enter(r0)
                r1.rawPointer = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }
    }

    CameraDeviceUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ void access$000(long r0, int r2, java.lang.String r3) {
            onPermissionCallback(r0, r2, r3)
            return
    }

    private static native void onPermissionCallback(long r0, int r2, java.lang.String r3);

    public static void requestPermissions(long r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            java.lang.String r2 = ""
            r3 = 0
            if (r0 < r1) goto L56
            java.lang.ref.WeakReference r0 = cn.easyar.engine.EasyAR.getInitializeActivity()
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L1c
            r0 = 2
            java.lang.String r1 = "ContextMiss"
            onPermissionCallback(r6, r0, r1)
            return
        L1c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r4 = "android.permission.CAMERA"
            int r5 = cn.easyar.engine.a.a(r0, r4)
            if (r5 == 0) goto L2c
            r1.add(r4)
        L2c:
            int r4 = r1.size()
            if (r4 != 0) goto L36
            onPermissionCallback(r6, r3, r2)
            return
        L36:
            android.app.FragmentManager r0 = r0.getFragmentManager()
            cn.easyar.engine.CameraDeviceUtil$1 r2 = new cn.easyar.engine.CameraDeviceUtil$1
            r2.<init>()
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            cn.easyar.engine.PermissionFragment r6 = cn.easyar.engine.PermissionFragment.newInstance(r6, r1, r2, r0)
            android.app.FragmentTransaction r7 = r0.beginTransaction()
            r7.add(r3, r6)
            r7.commit()
            return
        L56:
            onPermissionCallback(r6, r3, r2)
            return
    }
}
