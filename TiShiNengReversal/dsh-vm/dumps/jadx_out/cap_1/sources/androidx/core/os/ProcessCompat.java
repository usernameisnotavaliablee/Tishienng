package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ProcessCompat {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class Api19Impl {
        private static java.lang.reflect.Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api19Impl.sResolvedLock = r0
                return
        }

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"DiscouragedPrivateApi"})
        static boolean isApplicationUid(int r7) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api19Impl.sResolvedLock     // Catch: java.lang.Exception -> L41
                monitor-enter(r1)     // Catch: java.lang.Exception -> L41
                boolean r2 = androidx.core.os.ProcessCompat.Api19Impl.sResolved     // Catch: java.lang.Throwable -> L1c
                r3 = 0
                if (r2 != 0) goto L1e
                androidx.core.os.ProcessCompat.Api19Impl.sResolved = r0     // Catch: java.lang.Throwable -> L1c
                java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
                java.lang.String r4 = "isApp"
                java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L1c
                java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L1c
                r5[r3] = r6     // Catch: java.lang.Throwable -> L1c
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L1c
                androidx.core.os.ProcessCompat.Api19Impl.sMethodUserHandleIsAppMethod = r2     // Catch: java.lang.Throwable -> L1c
                goto L1e
            L1c:
                r7 = move-exception
                goto L3f
            L1e:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api19Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L41
                if (r1 == 0) goto L41
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L41
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L41
                r2[r3] = r7     // Catch: java.lang.Exception -> L41
                r7 = 0
                java.lang.Object r7 = r1.invoke(r7, r2)     // Catch: java.lang.Exception -> L41
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L41
                if (r7 == 0) goto L39
                boolean r7 = r7.booleanValue()     // Catch: java.lang.Exception -> L41
                return r7
            L39:
                java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L41
                r7.<init>()     // Catch: java.lang.Exception -> L41
                throw r7     // Catch: java.lang.Exception -> L41
            L3f:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
                throw r7     // Catch: java.lang.Exception -> L41
            L41:
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(24)
    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r0) {
                boolean r0 = android.os.Process.isApplicationUid(r0)
                return r0
        }
    }

    private ProcessCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isApplicationUid(int r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.os.ProcessCompat.Api24Impl.isApplicationUid(r2)
            return r2
        Lb:
            boolean r2 = androidx.core.os.ProcessCompat.Api19Impl.isApplicationUid(r2)
            return r2
    }
}
