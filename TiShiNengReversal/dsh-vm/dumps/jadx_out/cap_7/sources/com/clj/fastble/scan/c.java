package com.clj.fastble.scan;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(18)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class c {
    private com.clj.fastble.data.BleScanState a;
    private com.clj.fastble.scan.a b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends com.clj.fastble.scan.a {
        final /* synthetic */ com.clj.fastble.scan.c l;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.clj.fastble.scan.c$a$a, reason: collision with other inner class name */
        class RunnableC0134a implements java.lang.Runnable {
            final /* synthetic */ java.util.List a;
            final /* synthetic */ d1.h b;
            final /* synthetic */ com.clj.fastble.scan.c.a c;

            RunnableC0134a(com.clj.fastble.scan.c.a r1, java.util.List r2, d1.h r3) {
                    r0 = this;
                    r0.c = r1
                    r0.a = r2
                    r0.b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    com.clj.fastble.a r0 = com.clj.fastble.a.v()
                    java.util.List r1 = r3.a
                    r2 = 0
                    java.lang.Object r1 = r1.get(r2)
                    com.clj.fastble.data.BleDevice r1 = (com.clj.fastble.data.BleDevice) r1
                    d1.h r2 = r3.b
                    r0.c(r1, r2)
                    return
            }
        }

        a(com.clj.fastble.scan.c r1) {
                r0 = this;
                r0.l = r1
                r0.<init>()
                return
        }

        @Override // com.clj.fastble.scan.a
        public void j(com.clj.fastble.data.BleDevice r2) {
                r1 = this;
                com.clj.fastble.scan.c r0 = r1.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                boolean r0 = r0.g()
                if (r0 == 0) goto L1e
                com.clj.fastble.scan.c r0 = r1.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                d1.j r0 = r0.e()
                d1.h r0 = (d1.h) r0
                if (r0 == 0) goto L2f
                r0.g(r2)
                return
            L1e:
                com.clj.fastble.scan.c r0 = r1.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                d1.j r0 = r0.e()
                d1.i r0 = (d1.i) r0
                if (r0 == 0) goto L2f
                r0.c(r2)
            L2f:
                return
        }

        @Override // com.clj.fastble.scan.a
        public void k(java.util.List<com.clj.fastble.data.BleDevice> r6) {
                r5 = this;
                com.clj.fastble.scan.c r0 = r5.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                boolean r0 = r0.g()
                if (r0 == 0) goto L49
                com.clj.fastble.scan.c r0 = r5.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                d1.j r0 = r0.e()
                d1.h r0 = (d1.h) r0
                if (r6 == 0) goto L42
                int r1 = r6.size()
                r2 = 1
                if (r1 >= r2) goto L22
                goto L42
            L22:
                if (r0 == 0) goto L2e
                r1 = 0
                java.lang.Object r1 = r6.get(r1)
                com.clj.fastble.data.BleDevice r1 = (com.clj.fastble.data.BleDevice) r1
                r0.h(r1)
            L2e:
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                com.clj.fastble.scan.c$a$a r2 = new com.clj.fastble.scan.c$a$a
                r2.<init>(r5, r6, r0)
                r3 = 100
                r1.postDelayed(r2, r3)
                return
            L42:
                if (r0 == 0) goto L5a
                r6 = 0
                r0.h(r6)
                return
            L49:
                com.clj.fastble.scan.c r0 = r5.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                d1.j r0 = r0.e()
                d1.i r0 = (d1.i) r0
                if (r0 == 0) goto L5a
                r0.d(r6)
            L5a:
                return
        }

        @Override // com.clj.fastble.scan.a
        public void l(boolean r2) {
                r1 = this;
                com.clj.fastble.scan.c r0 = r1.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                d1.j r0 = r0.e()
                if (r0 == 0) goto Lf
                r0.a(r2)
            Lf:
                return
        }

        @Override // com.clj.fastble.scan.a
        public void m(com.clj.fastble.data.BleDevice r2) {
                r1 = this;
                com.clj.fastble.scan.c r0 = r1.l
                com.clj.fastble.scan.a r0 = com.clj.fastble.scan.c.a(r0)
                d1.j r0 = r0.e()
                if (r0 == 0) goto Lf
                r0.b(r2)
            Lf:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private static final com.clj.fastble.scan.c a = null;

        static {
                com.clj.fastble.scan.c r0 = new com.clj.fastble.scan.c
                r0.<init>()
                com.clj.fastble.scan.c.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.clj.fastble.scan.c a() {
                com.clj.fastble.scan.c r0 = com.clj.fastble.scan.c.b.a
                return r0
        }
    }

    public c() {
            r1 = this;
            r1.<init>()
            com.clj.fastble.data.BleScanState r0 = com.clj.fastble.data.BleScanState.STATE_IDLE
            r1.a = r0
            com.clj.fastble.scan.c$a r0 = new com.clj.fastble.scan.c$a
            r0.<init>(r1)
            r1.b = r0
            return
    }

    static /* synthetic */ com.clj.fastble.scan.a a(com.clj.fastble.scan.c r0) {
            com.clj.fastble.scan.a r0 = r0.b
            return r0
    }

    public static com.clj.fastble.scan.c b() {
            com.clj.fastble.scan.c r0 = com.clj.fastble.scan.c.b.a()
            return r0
    }

    private synchronized void f(java.util.UUID[] r10, java.lang.String[] r11, java.lang.String r12, boolean r13, boolean r14, long r15, d1.j r17) {
            r9 = this;
            r7 = r17
            monitor-enter(r9)
            com.clj.fastble.data.BleScanState r0 = r9.a     // Catch: java.lang.Throwable -> L15
            com.clj.fastble.data.BleScanState r8 = com.clj.fastble.data.BleScanState.STATE_IDLE     // Catch: java.lang.Throwable -> L15
            if (r0 == r8) goto L1a
            java.lang.String r10 = "scan action already exists, complete the previous scan action first"
            com.clj.fastble.utils.a.d(r10)     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto L18
            r10 = 0
            r7.a(r10)     // Catch: java.lang.Throwable -> L15
            goto L18
        L15:
            r0 = move-exception
            r10 = r0
            goto L3f
        L18:
            monitor-exit(r9)
            return
        L1a:
            com.clj.fastble.scan.a r0 = r9.b     // Catch: java.lang.Throwable -> L15
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.n(r1, r2, r3, r4, r5, r7)     // Catch: java.lang.Throwable -> L15
            com.clj.fastble.a r11 = com.clj.fastble.a.v()     // Catch: java.lang.Throwable -> L15
            android.bluetooth.BluetoothAdapter r11 = r11.o()     // Catch: java.lang.Throwable -> L15
            com.clj.fastble.scan.a r12 = r9.b     // Catch: java.lang.Throwable -> L15
            boolean r10 = r11.startLeScan(r10, r12)     // Catch: java.lang.Throwable -> L15
            if (r10 == 0) goto L36
            com.clj.fastble.data.BleScanState r8 = com.clj.fastble.data.BleScanState.STATE_SCANNING     // Catch: java.lang.Throwable -> L15
        L36:
            r9.a = r8     // Catch: java.lang.Throwable -> L15
            com.clj.fastble.scan.a r11 = r9.b     // Catch: java.lang.Throwable -> L15
            r11.h(r10)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r9)
            return
        L3f:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L15
            throw r10
    }

    public com.clj.fastble.data.BleScanState c() {
            r1 = this;
            com.clj.fastble.data.BleScanState r0 = r1.a
            return r0
    }

    public void d(java.util.UUID[] r10, java.lang.String[] r11, java.lang.String r12, boolean r13, long r14, d1.i r16) {
            r9 = this;
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r14
            r8 = r16
            r0.f(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    public void e(java.util.UUID[] r10, java.lang.String[] r11, java.lang.String r12, boolean r13, long r14, d1.h r16) {
            r9 = this;
            r5 = 1
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r14
            r8 = r16
            r0.f(r1, r2, r3, r4, r5, r6, r8)
            return
    }

    public synchronized void g() {
            r2 = this;
            monitor-enter(r2)
            com.clj.fastble.a r0 = com.clj.fastble.a.v()     // Catch: java.lang.Throwable -> L19
            android.bluetooth.BluetoothAdapter r0 = r0.o()     // Catch: java.lang.Throwable -> L19
            com.clj.fastble.scan.a r1 = r2.b     // Catch: java.lang.Throwable -> L19
            r0.stopLeScan(r1)     // Catch: java.lang.Throwable -> L19
            com.clj.fastble.data.BleScanState r0 = com.clj.fastble.data.BleScanState.STATE_IDLE     // Catch: java.lang.Throwable -> L19
            r2.a = r0     // Catch: java.lang.Throwable -> L19
            com.clj.fastble.scan.a r0 = r2.b     // Catch: java.lang.Throwable -> L19
            r0.i()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            return
        L19:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L19
            throw r0
    }
}
