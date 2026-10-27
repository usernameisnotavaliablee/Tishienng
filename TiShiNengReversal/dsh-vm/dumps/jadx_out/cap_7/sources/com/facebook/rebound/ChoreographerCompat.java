package com.facebook.rebound;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class ChoreographerCompat {
    private static final long c = 17;
    private static final boolean d = false;
    private static com.facebook.rebound.ChoreographerCompat e;
    private android.os.Handler a;
    private android.view.Choreographer b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class FrameCallback {
        private java.lang.Runnable a;
        private android.view.Choreographer.FrameCallback b;



        public FrameCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void a(long r1);

        @android.annotation.TargetApi(16)
        android.view.Choreographer.FrameCallback b() {
                r1 = this;
                android.view.Choreographer$FrameCallback r0 = r1.b
                if (r0 != 0) goto Lb
                com.facebook.rebound.ChoreographerCompat$FrameCallback$1 r0 = new com.facebook.rebound.ChoreographerCompat$FrameCallback$1
                r0.<init>(r1)
                r1.b = r0
            Lb:
                android.view.Choreographer$FrameCallback r0 = r1.b
                return r0
        }

        java.lang.Runnable c() {
                r1 = this;
                java.lang.Runnable r0 = r1.a
                if (r0 != 0) goto Lb
                com.facebook.rebound.ChoreographerCompat$FrameCallback$2 r0 = new com.facebook.rebound.ChoreographerCompat$FrameCallback$2
                r0.<init>(r1)
                r1.a = r0
            Lb:
                java.lang.Runnable r0 = r1.a
                return r0
        }
    }

    static {
            r0 = 1
            com.facebook.rebound.ChoreographerCompat.d = r0
            com.facebook.rebound.ChoreographerCompat r0 = new com.facebook.rebound.ChoreographerCompat
            r0.<init>()
            com.facebook.rebound.ChoreographerCompat.e = r0
            return
    }

    private ChoreographerCompat() {
            r2 = this;
            r2.<init>()
            boolean r0 = com.facebook.rebound.ChoreographerCompat.d
            if (r0 == 0) goto Le
            android.view.Choreographer r0 = r2.d()
            r2.b = r0
            return
        Le:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.a = r0
            return
    }

    @android.annotation.TargetApi(16)
    private void a(android.view.Choreographer.FrameCallback r2) {
            r1 = this;
            android.view.Choreographer r0 = r1.b
            r0.postFrameCallback(r2)
            return
    }

    @android.annotation.TargetApi(16)
    private void b(android.view.Choreographer.FrameCallback r2, long r3) {
            r1 = this;
            android.view.Choreographer r0 = r1.b
            r0.postFrameCallbackDelayed(r2, r3)
            return
    }

    @android.annotation.TargetApi(16)
    private void c(android.view.Choreographer.FrameCallback r2) {
            r1 = this;
            android.view.Choreographer r0 = r1.b
            r0.removeFrameCallback(r2)
            return
    }

    @android.annotation.TargetApi(16)
    private android.view.Choreographer d() {
            r1 = this;
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            return r0
    }

    public static com.facebook.rebound.ChoreographerCompat e() {
            com.facebook.rebound.ChoreographerCompat r0 = com.facebook.rebound.ChoreographerCompat.e
            return r0
    }

    public void f(com.facebook.rebound.ChoreographerCompat.FrameCallback r4) {
            r3 = this;
            boolean r0 = com.facebook.rebound.ChoreographerCompat.d
            if (r0 == 0) goto Lc
            android.view.Choreographer$FrameCallback r4 = r4.b()
            r3.a(r4)
            return
        Lc:
            android.os.Handler r0 = r3.a
            java.lang.Runnable r4 = r4.c()
            r1 = 0
            r0.postDelayed(r4, r1)
            return
    }

    public void g(com.facebook.rebound.ChoreographerCompat.FrameCallback r4, long r5) {
            r3 = this;
            boolean r0 = com.facebook.rebound.ChoreographerCompat.d
            if (r0 == 0) goto Lc
            android.view.Choreographer$FrameCallback r4 = r4.b()
            r3.b(r4, r5)
            return
        Lc:
            android.os.Handler r0 = r3.a
            java.lang.Runnable r4 = r4.c()
            r1 = 17
            long r5 = r5 + r1
            r0.postDelayed(r4, r5)
            return
    }

    public void h(com.facebook.rebound.ChoreographerCompat.FrameCallback r2) {
            r1 = this;
            boolean r0 = com.facebook.rebound.ChoreographerCompat.d
            if (r0 == 0) goto Lc
            android.view.Choreographer$FrameCallback r2 = r2.b()
            r1.c(r2)
            return
        Lc:
            android.os.Handler r0 = r1.a
            java.lang.Runnable r2 = r2.c()
            r0.removeCallbacks(r2)
            return
    }
}
