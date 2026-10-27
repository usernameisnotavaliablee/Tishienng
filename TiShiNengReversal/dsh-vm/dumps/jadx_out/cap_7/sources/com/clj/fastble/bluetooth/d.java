package com.clj.fastble.bluetooth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class d {
    private final com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> a;
    private final java.util.HashMap<java.lang.String, com.clj.fastble.bluetooth.b> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.Comparator<com.clj.fastble.bluetooth.b> {
        final /* synthetic */ com.clj.fastble.bluetooth.d a;

        a(com.clj.fastble.bluetooth.d r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        public int a(com.clj.fastble.bluetooth.b r1, com.clj.fastble.bluetooth.b r2) {
                r0 = this;
                java.lang.String r1 = r1.K()
                java.lang.String r2 = r2.K()
                int r1 = r1.compareToIgnoreCase(r2)
                return r1
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(com.clj.fastble.bluetooth.b r1, com.clj.fastble.bluetooth.b r2) {
                r0 = this;
                com.clj.fastble.bluetooth.b r1 = (com.clj.fastble.bluetooth.b) r1
                com.clj.fastble.bluetooth.b r2 = (com.clj.fastble.bluetooth.b) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    public d() {
            r2 = this;
            r2.<init>()
            com.clj.fastble.utils.BleLruHashMap r0 = new com.clj.fastble.utils.BleLruHashMap
            com.clj.fastble.a r1 = com.clj.fastble.a.v()
            int r1 = r1.w()
            r0.<init>(r1)
            r2.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.b = r0
            return
    }

    public synchronized void a(com.clj.fastble.bluetooth.b r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L5
            monitor-exit(r2)
            return
        L5:
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.K()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.K()     // Catch: java.lang.Throwable -> L1b
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public synchronized com.clj.fastble.bluetooth.b b(com.clj.fastble.data.BleDevice r3) {
            r2 = this;
            monitor-enter(r2)
            com.clj.fastble.bluetooth.b r0 = new com.clj.fastble.bluetooth.b     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap<java.lang.String, com.clj.fastble.bluetooth.b> r3 = r2.b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r0.K()     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L1e
            java.util.HashMap<java.lang.String, com.clj.fastble.bluetooth.b> r3 = r2.b     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r0.K()     // Catch: java.lang.Throwable -> L1c
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            monitor-exit(r2)
            return r0
        L20:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    public synchronized void c() {
            r2 = this;
            monitor-enter(r2)
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L21
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L21
            com.clj.fastble.bluetooth.b r1 = (com.clj.fastble.bluetooth.b) r1     // Catch: java.lang.Throwable -> L21
            r1.F()     // Catch: java.lang.Throwable -> L21
            goto Lb
        L21:
            r0 = move-exception
            goto L4f
        L23:
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L21
            r0.clear()     // Catch: java.lang.Throwable -> L21
            java.util.HashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.b     // Catch: java.lang.Throwable -> L21
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        L32:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L21
            com.clj.fastble.bluetooth.b r1 = (com.clj.fastble.bluetooth.b) r1     // Catch: java.lang.Throwable -> L21
            r1.F()     // Catch: java.lang.Throwable -> L21
            goto L32
        L48:
            java.util.HashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.b     // Catch: java.lang.Throwable -> L21
            r0.clear()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    public synchronized void d(com.clj.fastble.data.BleDevice r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.j(r2)     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            com.clj.fastble.bluetooth.b r2 = r1.f(r2)     // Catch: java.lang.Throwable -> Lf
            r2.G()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r1)
            return
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public synchronized void e() {
            r2 = this;
            monitor-enter(r2)
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L21
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L21
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L21
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L21
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L21
            com.clj.fastble.bluetooth.b r1 = (com.clj.fastble.bluetooth.b) r1     // Catch: java.lang.Throwable -> L21
            r1.G()     // Catch: java.lang.Throwable -> L21
            goto Lb
        L21:
            r0 = move-exception
            goto L2a
        L23:
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L21
            r0.clear()     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
    }

    public synchronized com.clj.fastble.bluetooth.b f(com.clj.fastble.data.BleDevice r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L20
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L20
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L1d
            com.clj.fastble.bluetooth.b r3 = (com.clj.fastble.bluetooth.b) r3     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return r3
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
        L20:
            monitor-exit(r2)
            r3 = 0
            return r3
    }

    public synchronized java.util.List<com.clj.fastble.bluetooth.b> g() {
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L16
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r1 = r2.a     // Catch: java.lang.Throwable -> L16
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L16
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
            com.clj.fastble.bluetooth.d$a r1 = new com.clj.fastble.bluetooth.d$a     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            java.util.Collections.sort(r0, r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            return r0
        L16:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public synchronized java.util.List<com.clj.fastble.data.BleDevice> h() {
            r3 = this;
            monitor-enter(r3)
            r3.k()     // Catch: java.lang.Throwable -> L27
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.util.List r1 = r3.g()     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L27
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
            com.clj.fastble.bluetooth.b r2 = (com.clj.fastble.bluetooth.b) r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L11
            com.clj.fastble.data.BleDevice r2 = r2.J()     // Catch: java.lang.Throwable -> L27
            r0.add(r2)     // Catch: java.lang.Throwable -> L27
            goto L11
        L27:
            r0 = move-exception
            goto L2b
        L29:
            monitor-exit(r3)
            return r0
        L2b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r0
    }

    public synchronized boolean i(android.bluetooth.BluetoothDevice r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L27
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r3.a     // Catch: java.lang.Throwable -> L24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L24
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r4.getAddress()     // Catch: java.lang.Throwable -> L24
            r1.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L24
            boolean r4 = r0.containsKey(r4)     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L27
            r4 = 1
            goto L28
        L24:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
        L27:
            r4 = 0
        L28:
            monitor-exit(r3)
            return r4
    }

    public synchronized boolean j(com.clj.fastble.data.BleDevice r2) {
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L14
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r1.a     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.b()     // Catch: java.lang.Throwable -> L11
            boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
        L14:
            r2 = 0
        L15:
            monitor-exit(r1)
            return r2
    }

    public void k() {
            r5 = this;
            java.util.List r0 = r5.g()
            r1 = 0
        L5:
            if (r0 == 0) goto L27
            int r2 = r0.size()
            if (r1 >= r2) goto L27
            java.lang.Object r2 = r0.get(r1)
            com.clj.fastble.bluetooth.b r2 = (com.clj.fastble.bluetooth.b) r2
            com.clj.fastble.a r3 = com.clj.fastble.a.v()
            com.clj.fastble.data.BleDevice r4 = r2.J()
            boolean r3 = r3.J(r4)
            if (r3 != 0) goto L24
            r5.l(r2)
        L24:
            int r1 = r1 + 1
            goto L5
        L27:
            return
    }

    public synchronized void l(com.clj.fastble.bluetooth.b r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L5
            monitor-exit(r2)
            return
        L5:
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.K()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            com.clj.fastble.utils.BleLruHashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r3.K()     // Catch: java.lang.Throwable -> L1b
            r0.remove(r3)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    public synchronized void m(com.clj.fastble.bluetooth.b r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 != 0) goto L5
            monitor-exit(r2)
            return
        L5:
            java.util.HashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.b     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r3.K()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            java.util.HashMap<java.lang.String, com.clj.fastble.bluetooth.b> r0 = r2.b     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = r3.K()     // Catch: java.lang.Throwable -> L1b
            r0.remove(r3)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L1f
        L1d:
            monitor-exit(r2)
            return
        L1f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }
}
