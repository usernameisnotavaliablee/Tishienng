package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
abstract class AndroidSpringLooperFactory {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @android.annotation.TargetApi(16)
    private static class ChoreographerAndroidSpringLooper extends com.facebook.rebound.SpringLooper {
        private final android.view.Choreographer b;
        private final android.view.Choreographer.FrameCallback c;
        private boolean d;
        private long e;


        public ChoreographerAndroidSpringLooper(android.view.Choreographer r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                com.facebook.rebound.AndroidSpringLooperFactory$ChoreographerAndroidSpringLooper$1 r1 = new com.facebook.rebound.AndroidSpringLooperFactory$ChoreographerAndroidSpringLooper$1
                r1.<init>(r0)
                r0.c = r1
                return
        }

        static /* synthetic */ boolean d(com.facebook.rebound.AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper r0) {
                boolean r0 = r0.d
                return r0
        }

        static /* synthetic */ long e(com.facebook.rebound.AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper r2) {
                long r0 = r2.e
                return r0
        }

        static /* synthetic */ long f(com.facebook.rebound.AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper r0, long r1) {
                r0.e = r1
                return r1
        }

        static /* synthetic */ android.view.Choreographer.FrameCallback g(com.facebook.rebound.AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper r0) {
                android.view.Choreographer$FrameCallback r0 = r0.c
                return r0
        }

        static /* synthetic */ android.view.Choreographer h(com.facebook.rebound.AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper r0) {
                android.view.Choreographer r0 = r0.b
                return r0
        }

        public static com.facebook.rebound.AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper i() {
                com.facebook.rebound.AndroidSpringLooperFactory$ChoreographerAndroidSpringLooper r0 = new com.facebook.rebound.AndroidSpringLooperFactory$ChoreographerAndroidSpringLooper
                android.view.Choreographer r1 = android.view.Choreographer.getInstance()
                r0.<init>(r1)
                return r0
        }

        @Override // com.facebook.rebound.SpringLooper
        public void b() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.d = r0
                long r0 = android.os.SystemClock.uptimeMillis()
                r2.e = r0
                android.view.Choreographer r0 = r2.b
                android.view.Choreographer$FrameCallback r1 = r2.c
                r0.removeFrameCallback(r1)
                android.view.Choreographer r0 = r2.b
                android.view.Choreographer$FrameCallback r1 = r2.c
                r0.postFrameCallback(r1)
                return
        }

        @Override // com.facebook.rebound.SpringLooper
        public void c() {
                r2 = this;
                r0 = 0
                r2.d = r0
                android.view.Choreographer r0 = r2.b
                android.view.Choreographer$FrameCallback r1 = r2.c
                r0.removeFrameCallback(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class LegacyAndroidSpringLooper extends com.facebook.rebound.SpringLooper {
        private final android.os.Handler b;
        private final java.lang.Runnable c;
        private boolean d;
        private long e;


        public LegacyAndroidSpringLooper(android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                com.facebook.rebound.AndroidSpringLooperFactory$LegacyAndroidSpringLooper$1 r1 = new com.facebook.rebound.AndroidSpringLooperFactory$LegacyAndroidSpringLooper$1
                r1.<init>(r0)
                r0.c = r1
                return
        }

        static /* synthetic */ boolean d(com.facebook.rebound.AndroidSpringLooperFactory.LegacyAndroidSpringLooper r0) {
                boolean r0 = r0.d
                return r0
        }

        static /* synthetic */ long e(com.facebook.rebound.AndroidSpringLooperFactory.LegacyAndroidSpringLooper r2) {
                long r0 = r2.e
                return r0
        }

        static /* synthetic */ long f(com.facebook.rebound.AndroidSpringLooperFactory.LegacyAndroidSpringLooper r0, long r1) {
                r0.e = r1
                return r1
        }

        static /* synthetic */ java.lang.Runnable g(com.facebook.rebound.AndroidSpringLooperFactory.LegacyAndroidSpringLooper r0) {
                java.lang.Runnable r0 = r0.c
                return r0
        }

        static /* synthetic */ android.os.Handler h(com.facebook.rebound.AndroidSpringLooperFactory.LegacyAndroidSpringLooper r0) {
                android.os.Handler r0 = r0.b
                return r0
        }

        public static com.facebook.rebound.SpringLooper i() {
                com.facebook.rebound.AndroidSpringLooperFactory$LegacyAndroidSpringLooper r0 = new com.facebook.rebound.AndroidSpringLooperFactory$LegacyAndroidSpringLooper
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return r0
        }

        @Override // com.facebook.rebound.SpringLooper
        public void b() {
                r2 = this;
                boolean r0 = r2.d
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.d = r0
                long r0 = android.os.SystemClock.uptimeMillis()
                r2.e = r0
                android.os.Handler r0 = r2.b
                java.lang.Runnable r1 = r2.c
                r0.removeCallbacks(r1)
                android.os.Handler r0 = r2.b
                java.lang.Runnable r1 = r2.c
                r0.post(r1)
                return
        }

        @Override // com.facebook.rebound.SpringLooper
        public void c() {
                r2 = this;
                r0 = 0
                r2.d = r0
                android.os.Handler r0 = r2.b
                java.lang.Runnable r1 = r2.c
                r0.removeCallbacks(r1)
                return
        }
    }

    AndroidSpringLooperFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.facebook.rebound.SpringLooper a() {
            com.facebook.rebound.AndroidSpringLooperFactory$ChoreographerAndroidSpringLooper r0 = com.facebook.rebound.AndroidSpringLooperFactory.ChoreographerAndroidSpringLooper.i()
            return r0
    }
}
