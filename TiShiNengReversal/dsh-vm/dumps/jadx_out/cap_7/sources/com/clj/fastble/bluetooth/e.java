package com.clj.fastble.bluetooth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class e {
    private android.os.HandlerThread a;
    private android.os.Handler b;
    private com.clj.fastble.bluetooth.b c;
    private java.lang.String d;
    private java.lang.String e;
    private byte[] f;
    private int g;
    private boolean h;
    private long i;
    private d1.k j;
    private java.util.Queue<byte[]> k;
    private int l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.os.Handler {
        final /* synthetic */ com.clj.fastble.bluetooth.e a;

        a(com.clj.fastble.bluetooth.e r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r2) {
                r1 = this;
                super.handleMessage(r2)
                int r2 = r2.what
                r0 = 51
                if (r2 != r0) goto Le
                com.clj.fastble.bluetooth.e r2 = r1.a
                com.clj.fastble.bluetooth.e.a(r2)
            Le:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b extends d1.k {
        final /* synthetic */ com.clj.fastble.bluetooth.e c;

        b(com.clj.fastble.bluetooth.e r1) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                return
        }

        public void e(com.clj.fastble.exception.BleException r5) {
                r4 = this;
                com.clj.fastble.bluetooth.e r0 = r4.c
                d1.k r0 = com.clj.fastble.bluetooth.e.d(r0)
                if (r0 == 0) goto L2b
                com.clj.fastble.bluetooth.e r0 = r4.c
                d1.k r0 = com.clj.fastble.bluetooth.e.d(r0)
                com.clj.fastble.exception.OtherException r1 = new com.clj.fastble.exception.OtherException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "exception occur while writing: "
                r2.append(r3)
                java.lang.String r5 = r5.getDescription()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
                r0.e(r1)
            L2b:
                com.clj.fastble.bluetooth.e r5 = r4.c
                boolean r5 = com.clj.fastble.bluetooth.e.e(r5)
                if (r5 == 0) goto L4e
                com.clj.fastble.bluetooth.e r5 = r4.c
                android.os.Handler r5 = com.clj.fastble.bluetooth.e.f(r5)
                r0 = 51
                android.os.Message r5 = r5.obtainMessage(r0)
                com.clj.fastble.bluetooth.e r0 = r4.c
                android.os.Handler r0 = com.clj.fastble.bluetooth.e.f(r0)
                com.clj.fastble.bluetooth.e r1 = r4.c
                long r1 = com.clj.fastble.bluetooth.e.g(r1)
                r0.sendMessageDelayed(r5, r1)
            L4e:
                return
        }

        public void f(int r3, int r4, byte[] r5) {
                r2 = this;
                com.clj.fastble.bluetooth.e r3 = r2.c
                int r3 = com.clj.fastble.bluetooth.e.b(r3)
                com.clj.fastble.bluetooth.e r4 = r2.c
                java.util.Queue r4 = com.clj.fastble.bluetooth.e.c(r4)
                int r4 = r4.size()
                int r3 = r3 - r4
                com.clj.fastble.bluetooth.e r4 = r2.c
                d1.k r4 = com.clj.fastble.bluetooth.e.d(r4)
                if (r4 == 0) goto L28
                com.clj.fastble.bluetooth.e r4 = r2.c
                d1.k r4 = com.clj.fastble.bluetooth.e.d(r4)
                com.clj.fastble.bluetooth.e r0 = r2.c
                int r0 = com.clj.fastble.bluetooth.e.b(r0)
                r4.f(r3, r0, r5)
            L28:
                com.clj.fastble.bluetooth.e r3 = r2.c
                boolean r3 = com.clj.fastble.bluetooth.e.e(r3)
                if (r3 == 0) goto L4b
                com.clj.fastble.bluetooth.e r3 = r2.c
                android.os.Handler r3 = com.clj.fastble.bluetooth.e.f(r3)
                r4 = 51
                android.os.Message r3 = r3.obtainMessage(r4)
                com.clj.fastble.bluetooth.e r4 = r2.c
                android.os.Handler r4 = com.clj.fastble.bluetooth.e.f(r4)
                com.clj.fastble.bluetooth.e r5 = r2.c
                long r0 = com.clj.fastble.bluetooth.e.g(r5)
                r4.sendMessageDelayed(r3, r0)
            L4b:
                return
        }
    }

    public e() {
            r2 = this;
            r2.<init>()
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "splitWriter"
            r0.<init>(r1)
            r2.a = r0
            r0.start()
            com.clj.fastble.bluetooth.e$a r0 = new com.clj.fastble.bluetooth.e$a
            android.os.HandlerThread r1 = r2.a
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r2, r1)
            r2.b = r0
            return
    }

    static /* synthetic */ void a(com.clj.fastble.bluetooth.e r0) {
            r0.l()
            return
    }

    static /* synthetic */ int b(com.clj.fastble.bluetooth.e r0) {
            int r0 = r0.l
            return r0
    }

    static /* synthetic */ java.util.Queue c(com.clj.fastble.bluetooth.e r0) {
            java.util.Queue<byte[]> r0 = r0.k
            return r0
    }

    static /* synthetic */ d1.k d(com.clj.fastble.bluetooth.e r0) {
            d1.k r0 = r0.j
            return r0
    }

    static /* synthetic */ boolean e(com.clj.fastble.bluetooth.e r0) {
            boolean r0 = r0.h
            return r0
    }

    static /* synthetic */ android.os.Handler f(com.clj.fastble.bluetooth.e r0) {
            android.os.Handler r0 = r0.b
            return r0
    }

    static /* synthetic */ long g(com.clj.fastble.bluetooth.e r2) {
            long r0 = r2.i
            return r0
    }

    private void h() {
            r2 = this;
            android.os.HandlerThread r0 = r2.a
            r0.quit()
            android.os.Handler r0 = r2.b
            r1 = 0
            r0.removeCallbacksAndMessages(r1)
            return
    }

    private static java.util.Queue<byte[]> i(byte[] r8, int r9) {
            r0 = 20
            if (r9 <= r0) goto L9
            java.lang.String r0 = "Be careful: split count beyond 20! Ensure MTU higher than 23!"
            com.clj.fastble.utils.a.d(r0)
        L9:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            int r1 = r8.length
            int r1 = r1 % r9
            r2 = 1
            if (r1 != 0) goto L16
            int r1 = r8.length
            int r1 = r1 / r9
            goto L1e
        L16:
            int r1 = r8.length
            int r1 = r1 / r9
            int r1 = r1 + r2
            float r1 = (float) r1
            int r1 = java.lang.Math.round(r1)
        L1e:
            if (r1 <= 0) goto L49
            r3 = 0
            r4 = 0
        L22:
            if (r4 >= r1) goto L49
            if (r1 == r2) goto L33
            int r5 = r1 + (-1)
            if (r4 != r5) goto L2b
            goto L33
        L2b:
            int r5 = r4 * r9
            byte[] r6 = new byte[r9]
            java.lang.System.arraycopy(r8, r5, r6, r3, r9)
            goto L43
        L33:
            int r5 = r8.length
            int r5 = r5 % r9
            if (r5 != 0) goto L39
            r5 = r9
            goto L3b
        L39:
            int r5 = r8.length
            int r5 = r5 % r9
        L3b:
            int r6 = r4 * r9
            byte[] r7 = new byte[r5]
            java.lang.System.arraycopy(r8, r6, r7, r3, r5)
            r6 = r7
        L43:
            r0.offer(r6)
            int r4 = r4 + 1
            goto L22
        L49:
            return r0
    }

    private void j() {
            r3 = this;
            byte[] r0 = r3.f
            if (r0 == 0) goto L21
            int r1 = r3.g
            r2 = 1
            if (r1 < r2) goto L19
            java.util.Queue r0 = i(r0, r1)
            r3.k = r0
            int r0 = r0.size()
            r3.l = r0
            r3.l()
            return
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "split count should higher than 0!"
            r0.<init>(r1)
            throw r0
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "data is Null!"
            r0.<init>(r1)
            throw r0
    }

    private void l() {
            r4 = this;
            java.util.Queue<byte[]> r0 = r4.k
            java.lang.Object r0 = r0.peek()
            if (r0 != 0) goto Lc
            r4.h()
            return
        Lc:
            java.util.Queue<byte[]> r0 = r4.k
            java.lang.Object r0 = r0.poll()
            byte[] r0 = (byte[]) r0
            com.clj.fastble.bluetooth.b r1 = r4.c
            com.clj.fastble.bluetooth.c r1 = r1.L()
            java.lang.String r2 = r4.d
            java.lang.String r3 = r4.e
            com.clj.fastble.bluetooth.c r1 = r1.x(r2, r3)
            com.clj.fastble.bluetooth.e$b r2 = new com.clj.fastble.bluetooth.e$b
            r2.<init>(r4)
            java.lang.String r3 = r4.e
            r1.y(r0, r2, r3)
            boolean r0 = r4.h
            if (r0 != 0) goto L3f
            android.os.Handler r0 = r4.b
            r1 = 51
            android.os.Message r0 = r0.obtainMessage(r1)
            android.os.Handler r1 = r4.b
            long r2 = r4.i
            r1.sendMessageDelayed(r0, r2)
        L3f:
            return
    }

    public void k(com.clj.fastble.bluetooth.b r1, java.lang.String r2, java.lang.String r3, byte[] r4, boolean r5, long r6, d1.k r8) {
            r0 = this;
            r0.c = r1
            r0.d = r2
            r0.e = r3
            r0.f = r4
            r0.h = r5
            r0.i = r6
            com.clj.fastble.a r1 = com.clj.fastble.a.v()
            int r1 = r1.D()
            r0.g = r1
            r0.j = r8
            r0.j()
            return
    }
}
