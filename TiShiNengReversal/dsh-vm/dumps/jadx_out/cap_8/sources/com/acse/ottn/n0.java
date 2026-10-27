package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class n0 {
    public static com.acse.ottn.n0 a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends android.os.CountDownTimer {
        public final /* synthetic */ com.acse.ottn.n0.d a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n0 f2513b;

        public a(com.acse.ottn.n0 r1, long r2, long r4, com.acse.ottn.n0.d r6) {
                r0 = this;
                r0.f2513b = r1
                r0.a = r6
                r0.<init>(r2, r4)
                return
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
                r1 = this;
                com.acse.ottn.n0$d r0 = r1.a
                r0.a()
                return
        }

        @Override // android.os.CountDownTimer
        public void onTick(long r2) {
                r1 = this;
                com.acse.ottn.n0$d r0 = r1.a
                r0.a(r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class b extends java.util.TimerTask {
        public final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2514b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2515c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n0.d f2516d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n0 f2517e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.n0.b a;

            public a(com.acse.ottn.n0.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.acse.ottn.n0$b r0 = r1.a
                    com.acse.ottn.n0$d r0 = r0.f2516d
                    r0.a()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.acse.ottn.n0$b$b, reason: collision with other inner class name */
        public class RunnableC0079b implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.n0.b a;

            public RunnableC0079b(com.acse.ottn.n0.b r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.acse.ottn.n0$b r0 = r4.a
                    com.acse.ottn.n0$d r1 = r0.f2516d
                    int r2 = r0.f2515c
                    int[] r0 = r0.a
                    r3 = 0
                    r0 = r0[r3]
                    int r2 = r2 - r0
                    long r2 = (long) r2
                    r1.a(r2)
                    return
            }
        }

        public b(com.acse.ottn.n0 r1, int[] r2, int r3, int r4, com.acse.ottn.n0.d r5) {
                r0 = this;
                r0.f2517e = r1
                r0.a = r2
                r0.f2514b = r3
                r0.f2515c = r4
                r0.f2516d = r5
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r5 = this;
                boolean r0 = com.acse.ottn.l0.f2437h
                r1 = 0
                if (r0 == 0) goto L9
                r5.cancel()
                goto Lb
            L9:
                com.acse.ottn.l0.f2437h = r1
            Lb:
                int[] r0 = r5.a
                r2 = r0[r1]
                int r3 = r5.f2514b
                int r2 = r2 + r3
                r0[r1] = r2
                int r0 = r5.f2515c
                r3 = 0
                if (r2 < r0) goto L2f
                r5.cancel()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.n0$b$a r1 = new com.acse.ottn.n0$b$a
                r1.<init>(r5)
                r0.postDelayed(r1, r3)
                return
            L2f:
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.n0$b$b r1 = new com.acse.ottn.n0$b$b
                r1.<init>(r5)
                r0.postDelayed(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class c extends java.util.TimerTask {
        public final /* synthetic */ int[] a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2518b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2519c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n0.d f2520d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.n0 f2521e;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class a implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.n0.c a;

            public a(com.acse.ottn.n0.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r1 = this;
                    com.acse.ottn.n0$c r0 = r1.a
                    com.acse.ottn.n0$d r0 = r0.f2520d
                    r0.a()
                    return
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public class b implements java.lang.Runnable {
            public final /* synthetic */ com.acse.ottn.n0.c a;

            public b(com.acse.ottn.n0.c r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r4 = this;
                    com.acse.ottn.n0$c r0 = r4.a
                    com.acse.ottn.n0$d r1 = r0.f2520d
                    int r2 = r0.f2519c
                    int[] r0 = r0.a
                    r3 = 0
                    r0 = r0[r3]
                    int r2 = r2 - r0
                    long r2 = (long) r2
                    r1.a(r2)
                    return
            }
        }

        public c(com.acse.ottn.n0 r1, int[] r2, int r3, int r4, com.acse.ottn.n0.d r5) {
                r0 = this;
                r0.f2521e = r1
                r0.a = r2
                r0.f2518b = r3
                r0.f2519c = r4
                r0.f2520d = r5
                r0.<init>()
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r5 = this;
                int[] r0 = r5.a
                r1 = 0
                r2 = r0[r1]
                int r3 = r5.f2518b
                int r2 = r2 + r3
                r0[r1] = r2
                int r0 = r5.f2519c
                r3 = 0
                if (r2 < r0) goto L25
                r5.cancel()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.n0$c$a r1 = new com.acse.ottn.n0$c$a
                r1.<init>(r5)
                r0.postDelayed(r1, r3)
                return
            L25:
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                com.acse.ottn.n0$c$b r1 = new com.acse.ottn.n0$c$b
                r1.<init>(r5)
                r0.postDelayed(r1, r3)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a();

        void a(long r1);
    }

    public n0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.acse.ottn.n0 a() {
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a
            if (r0 != 0) goto L19
            java.lang.Class<com.acse.ottn.n0> r0 = com.acse.ottn.n0.class
            monitor-enter(r0)
            com.acse.ottn.n0 r1 = com.acse.ottn.n0.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.acse.ottn.n0 r1 = new com.acse.ottn.n0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.acse.ottn.n0.a = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.acse.ottn.n0 r0 = com.acse.ottn.n0.a
            return r0
    }

    public android.os.CountDownTimer a(int r8, int r9, com.acse.ottn.n0.d r10) {
            r7 = this;
            com.acse.ottn.n0$a r0 = new com.acse.ottn.n0$a
            long r2 = (long) r8
            long r4 = (long) r9
            r1 = r7
            r6 = r10
            r0.<init>(r1, r2, r4, r6)
            return r0
    }

    public java.util.TimerTask b(int r11, int r12, com.acse.ottn.n0.d r13) {
            r10 = this;
            r0 = 0
            com.acse.ottn.l0.f2437h = r0
            int[] r3 = new int[]{r0}
            com.acse.ottn.n0$b r1 = new com.acse.ottn.n0$b
            r2 = r10
            r5 = r11
            r4 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.Timer r11 = new java.util.Timer
            r11.<init>()
            long r8 = (long) r4
            r6 = 0
            r4 = r11
            r5 = r1
            r4.scheduleAtFixedRate(r5, r6, r8)
            return r1
    }

    public java.util.Timer c(int r11, int r12, com.acse.ottn.n0.d r13) {
            r10 = this;
            r0 = 0
            int[] r3 = new int[]{r0}
            com.acse.ottn.n0$c r1 = new com.acse.ottn.n0$c
            r2 = r10
            r5 = r11
            r4 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.Timer r11 = new java.util.Timer
            r11.<init>()
            long r8 = (long) r4
            r6 = 0
            r4 = r11
            r5 = r1
            r4.scheduleAtFixedRate(r5, r6, r8)
            return r4
    }
}
