package com.huawei.agconnect;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class j {
    private static final java.lang.Object f = null;
    private static final int g = 1;
    private static com.huawei.agconnect.j h;
    private final android.content.Context a;
    private final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> b;
    private final java.util.HashMap<java.lang.String, java.util.ArrayList<com.huawei.agconnect.j.c>> c;
    private final java.util.ArrayList<com.huawei.agconnect.j.b> d;
    private final android.os.Handler e;

    class a extends android.os.Handler {
        final /* synthetic */ com.huawei.agconnect.j a;

        a(com.huawei.agconnect.j r1, android.os.Looper r2) {
                r0 = this;
                r0.a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto Lb
                com.huawei.agconnect.j r3 = r2.a
                com.huawei.agconnect.j.a(r3)
                return
            Lb:
                super.handleMessage(r3)
                return
        }
    }

    private static class b {
        final android.content.Intent a;
        final java.util.ArrayList<com.huawei.agconnect.j.c> b;

        b(android.content.Intent r1, java.util.ArrayList<com.huawei.agconnect.j.c> r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }
    }

    private static class c {
        final android.content.IntentFilter a;
        final android.content.BroadcastReceiver b;
        boolean c;

        c(android.content.IntentFilter r1, android.content.BroadcastReceiver r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Receiver{"
                r0.append(r1)
                android.content.BroadcastReceiver r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = " filter="
                r0.append(r1)
                android.content.IntentFilter r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.huawei.agconnect.j.f = r0
            return
    }

    private j(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            r1.a = r2
            com.huawei.agconnect.j$a r0 = new com.huawei.agconnect.j$a
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r1, r2)
            r1.e = r0
            return
    }

    static /* synthetic */ void a(com.huawei.agconnect.j r0) {
            r0.b()
            return
    }

    private void b() {
            r9 = this;
        L0:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r9.b
            monitor-enter(r0)
            java.util.ArrayList<com.huawei.agconnect.j$b> r1 = r9.d     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Ld
            if (r1 > 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return
        Ld:
            r1 = move-exception
            goto L42
        Lf:
            com.huawei.agconnect.j$b[] r2 = new com.huawei.agconnect.j.b[r1]     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<com.huawei.agconnect.j$b> r3 = r9.d     // Catch: java.lang.Throwable -> Ld
            r3.toArray(r2)     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList<com.huawei.agconnect.j$b> r3 = r9.d     // Catch: java.lang.Throwable -> Ld
            r3.clear()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3 = 0
        L1e:
            if (r3 >= r1) goto L0
            r4 = r2[r3]
            r5 = 0
        L23:
            java.util.ArrayList<com.huawei.agconnect.j$c> r6 = r4.b
            int r6 = r6.size()
            if (r5 >= r6) goto L3f
            java.util.ArrayList<com.huawei.agconnect.j$c> r6 = r4.b
            java.lang.Object r6 = r6.get(r5)
            com.huawei.agconnect.j$c r6 = (com.huawei.agconnect.j.c) r6
            android.content.BroadcastReceiver r6 = r6.b
            android.content.Context r7 = r9.a
            android.content.Intent r8 = r4.a
            r6.onReceive(r7, r8)
            int r5 = r5 + 1
            goto L23
        L3f:
            int r3 = r3 + 1
            goto L1e
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public static com.huawei.agconnect.j c(android.content.Context r2) {
            java.lang.Object r0 = com.huawei.agconnect.j.f
            monitor-enter(r0)
            com.huawei.agconnect.j r1 = com.huawei.agconnect.j.h     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            com.huawei.agconnect.j r1 = new com.huawei.agconnect.j     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L17
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L17
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L17
            com.huawei.agconnect.j.h = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = move-exception
            goto L1d
        L19:
            com.huawei.agconnect.j r2 = com.huawei.agconnect.j.h     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return r2
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public boolean d(android.content.Intent r15) {
            r14 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r1 = r14.b
            monitor-enter(r1)
            java.lang.String r3 = r15.getAction()     // Catch: java.lang.Throwable -> L54
            android.content.Context r0 = r14.a     // Catch: java.lang.Throwable -> L54
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = r15.resolveTypeIfNeeded(r0)     // Catch: java.lang.Throwable -> L54
            android.net.Uri r6 = r15.getData()     // Catch: java.lang.Throwable -> L54
            java.lang.String r5 = r15.getScheme()     // Catch: java.lang.Throwable -> L54
            java.util.Set r7 = r15.getCategories()     // Catch: java.lang.Throwable -> L54
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.huawei.agconnect.j$c>> r0 = r14.c     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = r15.getAction()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L54
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L54
            r9 = 0
            if (r0 == 0) goto L8c
            r2 = 0
            r10 = r2
            r11 = 0
        L2f:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L54
            r12 = 1
            if (r11 >= r2) goto L5f
            java.lang.Object r2 = r0.get(r11)     // Catch: java.lang.Throwable -> L54
            r13 = r2
            com.huawei.agconnect.j$c r13 = (com.huawei.agconnect.j.c) r13     // Catch: java.lang.Throwable -> L54
            boolean r2 = r13.c     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L42
            goto L5c
        L42:
            android.content.IntentFilter r2 = r13.a     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "LocalBroadcastManager"
            int r2 = r2.match(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L54
            if (r2 < 0) goto L5c
            if (r10 != 0) goto L57
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L54
            r10.<init>()     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
            r15 = r0
            goto L8e
        L57:
            r10.add(r13)     // Catch: java.lang.Throwable -> L54
            r13.c = r12     // Catch: java.lang.Throwable -> L54
        L5c:
            int r11 = r11 + 1
            goto L2f
        L5f:
            if (r10 == 0) goto L8c
            r0 = 0
        L62:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L54
            if (r0 >= r2) goto L73
            java.lang.Object r2 = r10.get(r0)     // Catch: java.lang.Throwable -> L54
            com.huawei.agconnect.j$c r2 = (com.huawei.agconnect.j.c) r2     // Catch: java.lang.Throwable -> L54
            r2.c = r9     // Catch: java.lang.Throwable -> L54
            int r0 = r0 + 1
            goto L62
        L73:
            java.util.ArrayList<com.huawei.agconnect.j$b> r0 = r14.d     // Catch: java.lang.Throwable -> L54
            com.huawei.agconnect.j$b r2 = new com.huawei.agconnect.j$b     // Catch: java.lang.Throwable -> L54
            r2.<init>(r15, r10)     // Catch: java.lang.Throwable -> L54
            r0.add(r2)     // Catch: java.lang.Throwable -> L54
            android.os.Handler r15 = r14.e     // Catch: java.lang.Throwable -> L54
            boolean r15 = r15.hasMessages(r12)     // Catch: java.lang.Throwable -> L54
            if (r15 != 0) goto L8a
            android.os.Handler r15 = r14.e     // Catch: java.lang.Throwable -> L54
            r15.sendEmptyMessage(r12)     // Catch: java.lang.Throwable -> L54
        L8a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            return r12
        L8c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            return r9
        L8e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L54
            throw r15
    }

    public void registerReceiver(android.content.BroadcastReceiver r7, android.content.IntentFilter r8) {
            r6 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r6.b
            monitor-enter(r0)
            com.huawei.agconnect.j$c r1 = new com.huawei.agconnect.j$c     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r8, r7)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r2 = r6.b     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            if (r2 != 0) goto L20
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r4 = r6.b     // Catch: java.lang.Throwable -> L1e
            r4.put(r7, r2)     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L4a
        L20:
            r2.add(r8)     // Catch: java.lang.Throwable -> L1e
            r7 = 0
        L24:
            int r2 = r8.countActions()     // Catch: java.lang.Throwable -> L1e
            if (r7 >= r2) goto L48
            java.lang.String r2 = r8.getAction(r7)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.huawei.agconnect.j$c>> r4 = r6.c     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L1e
            if (r4 != 0) goto L42
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.huawei.agconnect.j$c>> r5 = r6.c     // Catch: java.lang.Throwable -> L1e
            r5.put(r2, r4)     // Catch: java.lang.Throwable -> L1e
        L42:
            r4.add(r1)     // Catch: java.lang.Throwable -> L1e
            int r7 = r7 + 1
            goto L24
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r7
    }

    public void unregisterReceiver(android.content.BroadcastReceiver r11) {
            r10 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r10.b
            monitor-enter(r0)
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r1 = r10.b     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.remove(r11)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r11 = move-exception
            goto L5e
        L11:
            r2 = 0
            r3 = 0
        L13:
            int r4 = r1.size()     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r4) goto Ld
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> Lf
            android.content.IntentFilter r4 = (android.content.IntentFilter) r4     // Catch: java.lang.Throwable -> Lf
            r5 = 0
        L20:
            int r6 = r4.countActions()     // Catch: java.lang.Throwable -> Lf
            if (r5 >= r6) goto L5b
            java.lang.String r6 = r4.getAction(r5)     // Catch: java.lang.Throwable -> Lf
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.huawei.agconnect.j$c>> r7 = r10.c     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r7.get(r6)     // Catch: java.lang.Throwable -> Lf
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> Lf
            if (r7 == 0) goto L58
            r8 = 0
        L35:
            int r9 = r7.size()     // Catch: java.lang.Throwable -> Lf
            if (r8 >= r9) goto L4d
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> Lf
            com.huawei.agconnect.j$c r9 = (com.huawei.agconnect.j.c) r9     // Catch: java.lang.Throwable -> Lf
            android.content.BroadcastReceiver r9 = r9.b     // Catch: java.lang.Throwable -> Lf
            if (r9 != r11) goto L4a
            r7.remove(r8)     // Catch: java.lang.Throwable -> Lf
            int r8 = r8 + (-1)
        L4a:
            int r8 = r8 + 1
            goto L35
        L4d:
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lf
            if (r7 > 0) goto L58
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.huawei.agconnect.j$c>> r7 = r10.c     // Catch: java.lang.Throwable -> Lf
            r7.remove(r6)     // Catch: java.lang.Throwable -> Lf
        L58:
            int r5 = r5 + 1
            goto L20
        L5b:
            int r3 = r3 + 1
            goto L13
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r11
    }
}
