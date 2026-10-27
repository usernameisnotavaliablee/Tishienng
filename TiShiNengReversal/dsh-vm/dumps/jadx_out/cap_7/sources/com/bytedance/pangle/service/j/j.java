package com.bytedance.pangle.service.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j extends com.bytedance.pangle.up.j {
    private static volatile com.bytedance.pangle.service.j.j xt;
    private final java.util.HashSet<android.content.ComponentName> ae;
    private final java.util.HashMap<android.content.ComponentName, android.os.IBinder> cw;
    private final java.util.List<java.lang.Runnable> g;
    private final android.os.Handler j;
    private final java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> m;
    private final java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j.xt> r;
    private final java.util.HashSet<android.content.ComponentName> tl;
    private final com.bytedance.pangle.service.j.j.C0012j<android.content.Intent> up;







    /* renamed from: com.bytedance.pangle.service.j.j$j, reason: collision with other inner class name */
    class C0012j<T> extends java.util.HashMap<com.bytedance.pangle.tl, T> {
        final /* synthetic */ com.bytedance.pangle.service.j.j j;

        C0012j(com.bytedance.pangle.service.j.j r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@androidx.annotation.Nullable java.lang.Object r6) {
                r5 = this;
                boolean r0 = super.containsKey(r6)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r6 instanceof com.bytedance.pangle.tl
                r2 = 0
                if (r0 != 0) goto Le
                return r2
            Le:
                java.util.Set r0 = r5.keySet()
                java.util.Iterator r0 = r0.iterator()
            L16:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L35
                java.lang.Object r3 = r0.next()
                com.bytedance.pangle.tl r3 = (com.bytedance.pangle.tl) r3
                int r3 = r3.j()     // Catch: android.os.RemoteException -> L30
                r4 = r6
                com.bytedance.pangle.tl r4 = (com.bytedance.pangle.tl) r4     // Catch: android.os.RemoteException -> L30
                int r4 = r4.j()     // Catch: android.os.RemoteException -> L30
                if (r3 != r4) goto L16
                return r1
            L30:
                r3 = move-exception
                com.bytedance.sdk.openadsdk.api.m.j(r3)
                goto L16
            L35:
                return r2
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        @androidx.annotation.Nullable
        public T remove(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = super.remove(r5)
                if (r0 == 0) goto L7
                return r0
            L7:
                java.util.Set r0 = r4.keySet()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r0.next()
                com.bytedance.pangle.tl r1 = (com.bytedance.pangle.tl) r1
                int r2 = r1.j()     // Catch: android.os.RemoteException -> L29
                r3 = r5
                com.bytedance.pangle.tl r3 = (com.bytedance.pangle.tl) r3     // Catch: android.os.RemoteException -> L29
                int r3 = r3.j()     // Catch: android.os.RemoteException -> L29
                if (r2 != r3) goto Lf
                goto L2f
            L29:
                r1 = move-exception
                com.bytedance.sdk.openadsdk.api.m.j(r1)
                goto Lf
            L2e:
                r1 = 0
            L2f:
                java.lang.Object r5 = super.remove(r1)
                return r5
        }
    }

    class xt extends java.util.HashSet<com.bytedance.pangle.tl> {
        final /* synthetic */ com.bytedance.pangle.service.j.j j;

        xt(com.bytedance.pangle.service.j.j r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@androidx.annotation.Nullable java.lang.Object r6) {
                r5 = this;
                boolean r0 = super.contains(r6)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r6 instanceof com.bytedance.pangle.tl
                r2 = 0
                if (r0 != 0) goto Le
                return r2
            Le:
                java.util.Iterator r0 = r5.iterator()
            L12:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L31
                java.lang.Object r3 = r0.next()
                com.bytedance.pangle.tl r3 = (com.bytedance.pangle.tl) r3
                int r3 = r3.j()     // Catch: android.os.RemoteException -> L2c
                r4 = r6
                com.bytedance.pangle.tl r4 = (com.bytedance.pangle.tl) r4     // Catch: android.os.RemoteException -> L2c
                int r4 = r4.j()     // Catch: android.os.RemoteException -> L2c
                if (r3 != r4) goto L12
                return r1
            L2c:
                r3 = move-exception
                com.bytedance.sdk.openadsdk.api.m.j(r3)
                goto L12
            L31:
                return r2
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                boolean r0 = super.remove(r5)
                if (r0 == 0) goto L8
                r5 = 1
                return r5
            L8:
                java.util.Iterator r0 = r4.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2b
                java.lang.Object r1 = r0.next()
                com.bytedance.pangle.tl r1 = (com.bytedance.pangle.tl) r1
                int r2 = r1.j()     // Catch: android.os.RemoteException -> L26
                r3 = r5
                com.bytedance.pangle.tl r3 = (com.bytedance.pangle.tl) r3     // Catch: android.os.RemoteException -> L26
                int r3 = r3.j()     // Catch: android.os.RemoteException -> L26
                if (r2 != r3) goto Lc
                goto L2c
            L26:
                r1 = move-exception
                com.bytedance.sdk.openadsdk.api.m.j(r1)
                goto Lc
            L2b:
                r1 = 0
            L2c:
                boolean r5 = super.remove(r1)
                return r5
        }
    }

    private j() {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.cw = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.r = r0
            com.bytedance.pangle.service.j.j$j r0 = new com.bytedance.pangle.service.j.j$j
            r0.<init>(r2)
            r2.up = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.m = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.ae = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.tl = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.g = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.j = r0
            return
    }

    private com.bytedance.pangle.service.j cw(android.content.Intent r3, java.lang.String r4) {
            r2 = this;
            android.content.ComponentName r3 = r3.getComponent()
            com.bytedance.pangle.plugin.PluginManager r0 = com.bytedance.pangle.plugin.PluginManager.getInstance()
            com.bytedance.pangle.plugin.Plugin r0 = r0.getPlugin(r4)
            boolean r4 = com.bytedance.pangle.Zeus.loadPlugin(r4)     // Catch: java.lang.Exception -> L26
            com.bytedance.pangle.PluginClassLoader r1 = r0.mClassLoader     // Catch: java.lang.Exception -> L24
            java.lang.String r3 = r3.getClassName()     // Catch: java.lang.Exception -> L24
            java.lang.Class r3 = r1.loadClass(r3)     // Catch: java.lang.Exception -> L24
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Exception -> L24
            com.bytedance.pangle.service.j r3 = (com.bytedance.pangle.service.j) r3     // Catch: java.lang.Exception -> L24
            r3.attach(r0)     // Catch: java.lang.Exception -> L24
            return r3
        L24:
            r3 = move-exception
            goto L28
        L26:
            r3 = move-exception
            r4 = 0
        L28:
            java.lang.String r0 = "newServiceInstance failed! loadPlugin = "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "Zeus/service_pangle"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r4, r3)
            r3 = 0
            return r3
    }

    private void cw(android.content.ComponentName r3) {
            r2 = this;
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r0 = r2.m
            java.lang.Object r0 = r0.remove(r3)
            com.bytedance.pangle.service.j r0 = (com.bytedance.pangle.service.j) r0
            java.util.HashSet<android.content.ComponentName> r1 = r2.tl
            r1.remove(r3)
            java.util.HashMap<android.content.ComponentName, android.os.IBinder> r1 = r2.cw
            r1.remove(r3)
            java.util.HashSet<android.content.ComponentName> r1 = r2.ae
            r1.remove(r3)
            if (r0 == 0) goto L1c
            r0.onDestroy()
        L1c:
            return
    }

    private synchronized android.content.ComponentName j(android.content.Intent r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            android.content.ComponentName r0 = r3.getComponent()     // Catch: java.lang.Throwable -> L20
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r1 = r2.m     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            com.bytedance.pangle.service.j r4 = r2.xt(r3, r4)     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L15
            monitor-exit(r2)
            return r0
        L15:
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r1 = r2.m     // Catch: java.lang.Throwable -> L20
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> L20
            java.util.HashSet<android.content.ComponentName> r4 = r2.ae     // Catch: java.lang.Throwable -> L20
            r4.add(r0)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r3 = move-exception
            goto L32
        L22:
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r4 = r2.m     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L20
            com.bytedance.pangle.service.j r4 = (com.bytedance.pangle.service.j) r4     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L30
            r1 = 0
            r4.onStartCommand(r3, r1, r1)     // Catch: java.lang.Throwable -> L20
        L30:
            monitor-exit(r2)
            return r0
        L32:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    static /* synthetic */ android.content.ComponentName j(com.bytedance.pangle.service.j.j r0, android.content.Intent r1, java.lang.String r2) {
            android.content.ComponentName r0 = r0.j(r1, r2)
            return r0
    }

    static /* synthetic */ void j(com.bytedance.pangle.service.j.j r0, com.bytedance.pangle.tl r1) {
            r0.j(r1)
            return
    }

    private synchronized void j(com.bytedance.pangle.tl r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r0 = r4.r     // Catch: java.lang.Throwable -> L49
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L49
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L49
            android.content.ComponentName r1 = (android.content.ComponentName) r1     // Catch: java.lang.Throwable -> L49
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r2 = r4.r     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L49
            com.bytedance.pangle.service.j.j$xt r2 = (com.bytedance.pangle.service.j.j.xt) r2     // Catch: java.lang.Throwable -> L49
            boolean r3 = r2.contains(r5)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto Lb
            r2.remove(r5)     // Catch: java.lang.Throwable -> L49
            com.bytedance.pangle.service.j.j$j<android.content.Intent> r0 = r4.up     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r0.remove(r5)     // Catch: java.lang.Throwable -> L49
            android.content.Intent r5 = (android.content.Intent) r5     // Catch: java.lang.Throwable -> L49
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L4b
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r0 = r4.r     // Catch: java.lang.Throwable -> L49
            r0.remove(r1)     // Catch: java.lang.Throwable -> L49
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r0 = r4.m     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L49
            com.bytedance.pangle.service.j r0 = (com.bytedance.pangle.service.j) r0     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            r0.onUnbind(r5)     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r5 = move-exception
            goto L52
        L4b:
            r4.xt(r1)     // Catch: java.lang.Throwable -> L49
            monitor-exit(r4)
            return
        L50:
            monitor-exit(r4)
            return
        L52:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L49
            throw r5
    }

    private synchronized boolean j(android.content.Intent r3, com.bytedance.pangle.tl r4, int r5, java.lang.String r6) throws android.os.RemoteException {
            r2 = this;
            monitor-enter(r2)
            android.content.ComponentName r5 = r3.getComponent()     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r0 = r2.m     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L1e
            com.bytedance.pangle.service.j r6 = r2.xt(r3, r6)     // Catch: java.lang.Throwable -> L1c
            if (r6 != 0) goto L16
            monitor-exit(r2)
            r3 = 0
            return r3
        L16:
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r0 = r2.m     // Catch: java.lang.Throwable -> L1c
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            r3 = move-exception
            goto L83
        L1e:
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r6 = r2.m     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.pangle.service.j r6 = (com.bytedance.pangle.service.j) r6     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap<android.content.ComponentName, android.os.IBinder> r0 = r2.cw     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L37
            java.util.HashMap<android.content.ComponentName, android.os.IBinder> r0 = r2.cw     // Catch: java.lang.Throwable -> L1c
            android.os.IBinder r6 = r6.onBind(r3)     // Catch: java.lang.Throwable -> L1c
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L1c
        L37:
            java.util.HashMap<android.content.ComponentName, android.os.IBinder> r6 = r2.cw     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r6 = r6.get(r5)     // Catch: java.lang.Throwable -> L1c
            android.os.IBinder r6 = (android.os.IBinder) r6     // Catch: java.lang.Throwable -> L1c
            if (r6 == 0) goto L80
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r0 = r2.r     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L6b
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r0 = r2.r     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.pangle.service.j.j$xt r0 = (com.bytedance.pangle.service.j.j.xt) r0     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L80
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r0 = r2.r     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.pangle.service.j.j$xt r0 = (com.bytedance.pangle.service.j.j.xt) r0     // Catch: java.lang.Throwable -> L1c
            r0.add(r4)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.pangle.service.j.j$j<android.content.Intent> r0 = r2.up     // Catch: java.lang.Throwable -> L1c
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L1c
            r4.j(r5, r6)     // Catch: java.lang.Throwable -> L1c
            goto L80
        L6b:
            com.bytedance.pangle.service.j.j$xt r0 = new com.bytedance.pangle.service.j.j$xt     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            r0.add(r4)     // Catch: java.lang.Throwable -> L1c
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r1 = r2.r     // Catch: java.lang.Throwable -> L1c
            r1.put(r5, r0)     // Catch: java.lang.Throwable -> L1c
            com.bytedance.pangle.service.j.j$j<android.content.Intent> r0 = r2.up     // Catch: java.lang.Throwable -> L1c
            r0.put(r4, r3)     // Catch: java.lang.Throwable -> L1c
            r4.j(r5, r6)     // Catch: java.lang.Throwable -> L1c
        L80:
            monitor-exit(r2)
            r3 = 1
            return r3
        L83:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    static /* synthetic */ boolean j(com.bytedance.pangle.service.j.j r0, android.content.Intent r1, com.bytedance.pangle.tl r2, int r3, java.lang.String r4) throws android.os.RemoteException {
            boolean r0 = r0.j(r1, r2, r3, r4)
            return r0
    }

    public static com.bytedance.pangle.service.j.j xt() {
            com.bytedance.pangle.service.j.j r0 = com.bytedance.pangle.service.j.j.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.pangle.service.j.j> r0 = com.bytedance.pangle.service.j.j.class
            monitor-enter(r0)
            com.bytedance.pangle.service.j.j r1 = com.bytedance.pangle.service.j.j.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.pangle.service.j.j r1 = new com.bytedance.pangle.service.j.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.pangle.service.j.j.xt = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.pangle.service.j.j r0 = com.bytedance.pangle.service.j.j.xt
            return r0
    }

    private com.bytedance.pangle.service.j xt(android.content.Intent r1, java.lang.String r2) {
            r0 = this;
            com.bytedance.pangle.service.j r1 = r0.cw(r1, r2)
            if (r1 == 0) goto L9
            r1.onCreate()
        L9:
            return r1
    }

    private boolean xt(android.content.ComponentName r3) {
            r2 = this;
            java.util.HashSet<android.content.ComponentName> r0 = r2.ae
            boolean r0 = r0.contains(r3)
            r1 = 1
            if (r0 != 0) goto L15
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r0 = r2.r
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L29
            r2.cw(r3)
            return r1
        L15:
            java.util.HashSet<android.content.ComponentName> r0 = r2.tl
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L29
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j.j$xt> r0 = r2.r
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L29
            r2.cw(r3)
            return r1
        L29:
            r3 = 0
            return r3
    }

    @Override // com.bytedance.pangle.up.j, android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.pangle.up
    public boolean bindService(android.content.Intent r9, com.bytedance.pangle.tl r10, int r11, java.lang.String r12) throws android.os.RemoteException {
            r8 = this;
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            if (r0 == 0) goto L25
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L15
            boolean r9 = r8.j(r9, r10, r11, r12)
            return r9
        L15:
            android.os.Handler r0 = r8.j
            com.bytedance.pangle.service.j.j$4 r1 = new com.bytedance.pangle.service.j.j$4
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r0.post(r1)
            goto L39
        L25:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.util.List<java.lang.Runnable> r9 = r2.g
            com.bytedance.pangle.service.j.j$5 r2 = new com.bytedance.pangle.service.j.j$5
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r9.add(r2)
        L39:
            r9 = 1
            return r9
    }

    public void cw() {
            r3 = this;
            java.util.List<java.lang.Runnable> r0 = r3.g
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L6
            android.os.Handler r2 = r3.j
            r2.post(r1)
            goto L6
        L1a:
            java.util.List<java.lang.Runnable> r0 = r3.g
            r0.clear()
            return
    }

    public synchronized boolean j(android.content.ComponentName r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.HashMap<android.content.ComponentName, com.bytedance.pangle.service.j> r0 = r1.m     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            java.util.HashSet<android.content.ComponentName> r0 = r1.tl     // Catch: java.lang.Throwable -> L14
            r0.add(r2)     // Catch: java.lang.Throwable -> L14
            boolean r2 = r1.xt(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return r2
        L14:
            r2 = move-exception
            goto L19
        L16:
            monitor-exit(r1)
            r2 = 0
            return r2
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    @Override // com.bytedance.pangle.up
    public android.content.ComponentName startService(android.content.Intent r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = com.bytedance.pangle.Zeus.hasInit()
            if (r0 == 0) goto L20
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L15
            android.content.ComponentName r3 = r2.j(r3, r4)
            return r3
        L15:
            android.os.Handler r0 = r2.j
            com.bytedance.pangle.service.j.j$1 r1 = new com.bytedance.pangle.service.j.j$1
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            goto L2a
        L20:
            java.util.List<java.lang.Runnable> r0 = r2.g
            com.bytedance.pangle.service.j.j$2 r1 = new com.bytedance.pangle.service.j.j$2
            r1.<init>(r2, r3, r4)
            r0.add(r1)
        L2a:
            android.content.ComponentName r3 = r3.getComponent()
            return r3
    }

    @Override // com.bytedance.pangle.up
    public boolean stopService(android.content.Intent r2, java.lang.String r3) {
            r1 = this;
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r3 != r0) goto L16
            com.bytedance.pangle.service.j.j r3 = xt()
            android.content.ComponentName r2 = r2.getComponent()
            r3.j(r2)
            goto L20
        L16:
            android.os.Handler r3 = r1.j
            com.bytedance.pangle.service.j.j$3 r0 = new com.bytedance.pangle.service.j.j$3
            r0.<init>(r1, r2)
            r3.post(r0)
        L20:
            r2 = 1
            return r2
    }

    @Override // com.bytedance.pangle.up
    public void unbindService(com.bytedance.pangle.tl r3) {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Le
            r2.j(r3)
            return
        Le:
            android.os.Handler r0 = r2.j
            com.bytedance.pangle.service.j.j$6 r1 = new com.bytedance.pangle.service.j.j$6
            r1.<init>(r2, r3)
            r0.post(r1)
            return
    }
}
