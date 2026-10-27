package com.bytedance.pangle.receiver;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class xt {
    private static com.bytedance.pangle.receiver.xt xt;
    private final java.util.Map<java.lang.String, com.bytedance.pangle.receiver.xt.j> cw;
    public final java.util.Set<java.lang.Integer> j;
    private final java.util.Map<com.bytedance.pangle.receiver.PluginBroadcastReceiver, android.content.BroadcastReceiver> r;

    public static class j {
        public java.lang.String j;
        public final java.util.Set<com.bytedance.pangle.receiver.PluginBroadcastReceiver> xt;

        public j() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
                r0.<init>()
                r1.xt = r0
                return
        }

        public void j(android.content.Context r6, android.content.Intent r7) {
                r5 = this;
                java.util.Set<com.bytedance.pangle.receiver.PluginBroadcastReceiver> r0 = r5.xt
                if (r0 == 0) goto L45
                int r0 = r0.size()
                if (r0 <= 0) goto L45
                java.util.Set<com.bytedance.pangle.receiver.PluginBroadcastReceiver> r0 = r5.xt
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L45
                java.lang.Object r1 = r0.next()
                com.bytedance.pangle.receiver.PluginBroadcastReceiver r1 = (com.bytedance.pangle.receiver.PluginBroadcastReceiver) r1
                if (r1 == 0) goto L10
                r1.onReceive(r6, r7)     // Catch: java.lang.Throwable -> L22
                goto L10
            L22:
                r1 = move-exception
                if (r7 == 0) goto L2a
                java.lang.String r2 = r7.getAction()
                goto L2c
            L2a:
                java.lang.String r2 = ""
            L2c:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "plugin-receiver->action:"
                r3.<init>(r4)
                r3.append(r2)
                java.lang.String r2 = "[exception]:"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.String r3 = "Zeus/receiver_pangle"
                com.bytedance.pangle.log.ZeusLogger.w(r3, r2, r1)
                goto L10
            L45:
                return
        }

        public void registerReceiver(com.bytedance.pangle.receiver.PluginBroadcastReceiver r2) {
                r1 = this;
                if (r2 == 0) goto L7
                java.util.Set<com.bytedance.pangle.receiver.PluginBroadcastReceiver> r0 = r1.xt
                r0.add(r2)
            L7:
                return
        }

        public void unregisterReceiver(com.bytedance.pangle.receiver.PluginBroadcastReceiver r3) {
                r2 = this;
                if (r3 == 0) goto L2b
                java.util.Set<com.bytedance.pangle.receiver.PluginBroadcastReceiver> r0 = r2.xt     // Catch: java.lang.Throwable -> L10
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L10
                if (r0 <= 0) goto L2b
                java.util.Set<com.bytedance.pangle.receiver.PluginBroadcastReceiver> r0 = r2.xt     // Catch: java.lang.Throwable -> L10
                r0.remove(r3)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r3 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "unregisterReceiver-plugin-receiver->action:"
                r0.<init>(r1)
                java.lang.String r1 = r2.j
                r0.append(r1)
                java.lang.String r1 = "[exception]:"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "Zeus/receiver_pangle"
                com.bytedance.pangle.log.ZeusLogger.w(r1, r0, r3)
            L2b:
                return
        }
    }

    private xt() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.cw = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.r = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r1.j = r0
            return
    }

    public static com.bytedance.pangle.receiver.xt j() {
            com.bytedance.pangle.receiver.xt r0 = com.bytedance.pangle.receiver.xt.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.pangle.service.j.j> r0 = com.bytedance.pangle.service.j.j.class
            monitor-enter(r0)
            com.bytedance.pangle.receiver.xt r1 = com.bytedance.pangle.receiver.xt.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.pangle.receiver.xt r1 = new com.bytedance.pangle.receiver.xt     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.pangle.receiver.xt.xt = r1     // Catch: java.lang.Throwable -> L13
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
            com.bytedance.pangle.receiver.xt r0 = com.bytedance.pangle.receiver.xt.xt
            return r0
    }

    private void j(android.content.IntentFilter r4, com.bytedance.pangle.receiver.PluginBroadcastReceiver r5) {
            r3 = this;
            if (r4 == 0) goto L38
            java.util.Iterator r0 = r4.actionsIterator()
            if (r0 == 0) goto L38
            java.util.Iterator r4 = r4.actionsIterator()
        Lc:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lc
            java.util.Map<java.lang.String, com.bytedance.pangle.receiver.xt$j> r1 = r3.cw
            java.lang.Object r1 = r1.get(r0)
            com.bytedance.pangle.receiver.xt$j r1 = (com.bytedance.pangle.receiver.xt.j) r1
            if (r1 == 0) goto L28
            r1.registerReceiver(r5)
            goto Lc
        L28:
            com.bytedance.pangle.receiver.xt$j r1 = new com.bytedance.pangle.receiver.xt$j
            r1.<init>()
            r1.j = r0
            r1.registerReceiver(r5)
            java.util.Map<java.lang.String, com.bytedance.pangle.receiver.xt$j> r2 = r3.cw
            r2.put(r0, r1)
            goto Lc
        L38:
            return
    }

    public void j(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            if (r6 == 0) goto L42
            java.lang.String r0 = r6.getAction()
            if (r0 == 0) goto L42
            java.lang.String r0 = r6.getAction()
            java.util.Map<java.lang.String, com.bytedance.pangle.receiver.xt$j> r1 = r4.cw
            if (r1 == 0) goto L42
            int r1 = r1.size()
            if (r1 <= 0) goto L42
            java.util.Map<java.lang.String, com.bytedance.pangle.receiver.xt$j> r1 = r4.cw
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L42
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L20
            java.lang.Object r2 = r2.getValue()
            com.bytedance.pangle.receiver.xt$j r2 = (com.bytedance.pangle.receiver.xt.j) r2
            if (r2 == 0) goto L20
            r2.j(r5, r6)
            goto L20
        L42:
            return
    }

    public boolean j(int r2) {
            r1 = this;
            java.util.Set<java.lang.Integer> r0 = r1.j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            return r2
    }

    public android.content.Intent registerReceiver(android.content.Context r5, com.bytedance.pangle.receiver.PluginBroadcastReceiver r6, android.content.IntentFilter r7) {
            r4 = this;
            r0 = 0
            if (r7 == 0) goto L48
            java.util.Iterator r1 = r7.actionsIterator()
            if (r1 != 0) goto La
            goto L48
        La:
            r1 = 2
            r2 = 34
            if (r6 != 0) goto L25
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r2) goto L20
            android.content.pm.ApplicationInfo r6 = r5.getApplicationInfo()
            int r6 = r6.targetSdkVersion
            if (r6 < r2) goto L20
            android.content.Intent r5 = cn.jiguang.commons.L.j1.a(r5, r0, r7, r1)
            return r5
        L20:
            android.content.Intent r5 = r5.registerReceiver(r0, r7)
            return r5
        L25:
            com.bytedance.pangle.receiver.BroadcastReceiverProxy r0 = new com.bytedance.pangle.receiver.BroadcastReceiverProxy
            r0.<init>()
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L3b
            android.content.pm.ApplicationInfo r3 = r5.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            if (r3 < r2) goto L3b
            android.content.Intent r5 = cn.jiguang.commons.L.j1.a(r5, r0, r7, r1)
            goto L3f
        L3b:
            android.content.Intent r5 = r5.registerReceiver(r0, r7)
        L3f:
            java.util.Map<com.bytedance.pangle.receiver.PluginBroadcastReceiver, android.content.BroadcastReceiver> r1 = r4.r
            r1.put(r6, r0)
            r4.j(r7, r6)
            return r5
        L48:
            return r0
    }

    public android.content.Intent registerReceiver(android.content.Context r4, com.bytedance.pangle.receiver.PluginBroadcastReceiver r5, android.content.IntentFilter r6, int r7) {
            r3 = this;
            r0 = 0
            if (r6 == 0) goto L3b
            java.util.Iterator r1 = r6.actionsIterator()
            if (r1 == 0) goto L3b
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L10
            goto L3b
        L10:
            if (r5 != 0) goto L29
            r5 = 34
            if (r1 < r5) goto L24
            android.content.pm.ApplicationInfo r7 = r4.getApplicationInfo()
            int r7 = r7.targetSdkVersion
            if (r7 < r5) goto L24
            r5 = 2
            android.content.Intent r4 = cn.jiguang.commons.L.j1.a(r4, r0, r6, r5)
            return r4
        L24:
            android.content.Intent r4 = r4.registerReceiver(r0, r6)
            return r4
        L29:
            com.bytedance.pangle.receiver.BroadcastReceiverProxy r0 = new com.bytedance.pangle.receiver.BroadcastReceiverProxy
            r0.<init>()
            android.content.Intent r4 = cn.jiguang.commons.L.j1.a(r4, r0, r6, r7)
            java.util.Map<com.bytedance.pangle.receiver.PluginBroadcastReceiver, android.content.BroadcastReceiver> r7 = r3.r
            r7.put(r5, r0)
            r3.j(r6, r5)
            return r4
        L3b:
            return r0
    }

    public android.content.Intent registerReceiver(android.content.Context r7, com.bytedance.pangle.receiver.PluginBroadcastReceiver r8, android.content.IntentFilter r9, java.lang.String r10, android.os.Handler r11) {
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L62
            java.util.Iterator r1 = r9.actionsIterator()
            if (r1 != 0) goto La
            goto L62
        La:
            r1 = 34
            if (r8 != 0) goto L25
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r1) goto L20
            android.content.pm.ApplicationInfo r8 = r7.getApplicationInfo()
            int r8 = r8.targetSdkVersion
            if (r8 < r1) goto L20
            r8 = 2
            android.content.Intent r7 = cn.jiguang.commons.L.j1.a(r7, r0, r9, r8)
            return r7
        L20:
            android.content.Intent r7 = r7.registerReceiver(r0, r9)
            return r7
        L25:
            r0 = 34
            com.bytedance.pangle.receiver.BroadcastReceiverProxy r1 = new com.bytedance.pangle.receiver.BroadcastReceiverProxy
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r0) goto L42
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            if (r2 < r0) goto L42
            r5 = 2
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            android.content.Intent r7 = cn.jiguang.av.h0.a(r0, r1, r2, r3, r4, r5)
            goto L4a
        L42:
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            android.content.Intent r7 = r0.registerReceiver(r1, r2, r3, r4)
        L4a:
            java.util.Map<com.bytedance.pangle.receiver.PluginBroadcastReceiver, android.content.BroadcastReceiver> r9 = r6.r
            r9.put(r8, r1)
            if (r4 == 0) goto L5e
            java.util.Set<java.lang.Integer> r9 = r6.j
            int r10 = r1.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
        L5e:
            r6.j(r2, r8)
            return r7
        L62:
            return r0
    }

    public android.content.Intent registerReceiver(android.content.Context r7, com.bytedance.pangle.receiver.PluginBroadcastReceiver r8, android.content.IntentFilter r9, java.lang.String r10, android.os.Handler r11, int r12) {
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L4f
            java.util.Iterator r1 = r9.actionsIterator()
            if (r1 == 0) goto L4f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 >= r2) goto L10
            goto L4f
        L10:
            if (r8 != 0) goto L29
            r8 = 34
            if (r1 < r8) goto L24
            android.content.pm.ApplicationInfo r10 = r7.getApplicationInfo()
            int r10 = r10.targetSdkVersion
            if (r10 < r8) goto L24
            r8 = 2
            android.content.Intent r7 = cn.jiguang.commons.L.j1.a(r7, r0, r9, r8)
            return r7
        L24:
            android.content.Intent r7 = r7.registerReceiver(r0, r9)
            return r7
        L29:
            com.bytedance.pangle.receiver.BroadcastReceiverProxy r1 = new com.bytedance.pangle.receiver.BroadcastReceiverProxy
            r1.<init>()
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.content.Intent r7 = cn.jiguang.av.h0.a(r0, r1, r2, r3, r4, r5)
            java.util.Map<com.bytedance.pangle.receiver.PluginBroadcastReceiver, android.content.BroadcastReceiver> r9 = r6.r
            r9.put(r8, r1)
            if (r4 == 0) goto L4b
            java.util.Set<java.lang.Integer> r9 = r6.j
            int r10 = r1.hashCode()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
        L4b:
            r6.j(r2, r8)
            return r7
        L4f:
            return r0
    }

    public void unregisterReceiver(android.content.Context r5, com.bytedance.pangle.receiver.PluginBroadcastReceiver r6) {
            r4 = this;
            java.util.Map<java.lang.String, com.bytedance.pangle.receiver.xt$j> r0 = r4.cw
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            com.bytedance.pangle.receiver.xt$j r1 = (com.bytedance.pangle.receiver.xt.j) r1
            if (r1 == 0) goto L21
            r1.unregisterReceiver(r6)
        L21:
            java.util.Map<com.bytedance.pangle.receiver.PluginBroadcastReceiver, android.content.BroadcastReceiver> r1 = r4.r
            java.lang.Object r1 = r1.get(r6)
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1
            if (r1 == 0) goto La
            java.util.Set<java.lang.Integer> r2 = r4.j     // Catch: java.lang.Throwable -> L41
            int r3 = r1.hashCode()     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L41
            r2.remove(r3)     // Catch: java.lang.Throwable -> L41
            java.util.Map<com.bytedance.pangle.receiver.PluginBroadcastReceiver, android.content.BroadcastReceiver> r2 = r4.r     // Catch: java.lang.Throwable -> L41
            r2.remove(r6)     // Catch: java.lang.Throwable -> L41
            r5.unregisterReceiver(r1)     // Catch: java.lang.Throwable -> L41
            goto La
        L41:
            r1 = move-exception
            java.lang.String r2 = "Zeus/receiver_pangle"
            java.lang.String r3 = "unregisterReceiver-移除系统注册的广播发生异常:"
            com.bytedance.pangle.log.ZeusLogger.w(r2, r3, r1)
            goto La
        L4a:
            return
    }
}
