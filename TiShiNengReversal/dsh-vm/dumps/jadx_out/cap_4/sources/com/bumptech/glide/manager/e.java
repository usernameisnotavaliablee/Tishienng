package com.bumptech.glide.manager;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
final class e implements com.bumptech.glide.manager.c {
    private static final java.lang.String f = "ConnectivityMonitor";
    private final android.content.Context a;
    final com.bumptech.glide.manager.c.a b;
    boolean c;
    private boolean d;
    private final android.content.BroadcastReceiver e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bumptech.glide.manager.e a;

        a(com.bumptech.glide.manager.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@androidx.annotation.NonNull android.content.Context r2, android.content.Intent r3) {
                r1 = this;
                com.bumptech.glide.manager.e r3 = r1.a
                boolean r0 = r3.c
                boolean r2 = r3.a(r2)
                r3.c = r2
                com.bumptech.glide.manager.e r2 = r1.a
                boolean r2 = r2.c
                if (r0 == r2) goto L26
                java.lang.String r2 = "ConnectivityMonitor"
                r3 = 3
                boolean r2 = android.util.Log.isLoggable(r2, r3)
                if (r2 == 0) goto L1d
                com.bumptech.glide.manager.e r2 = r1.a
                boolean r2 = r2.c
            L1d:
                com.bumptech.glide.manager.e r2 = r1.a
                com.bumptech.glide.manager.c$a r3 = r2.b
                boolean r2 = r2.c
                r3.a(r2)
            L26:
                return
        }
    }

    e(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.bumptech.glide.manager.c.a r3) {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.manager.e$a r0 = new com.bumptech.glide.manager.e$a
            r0.<init>(r1)
            r1.e = r0
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            r1.a = r2
            r1.b = r3
            return
    }

    private void c() {
            r4 = this;
            boolean r0 = r4.d
            if (r0 == 0) goto L5
            return
        L5:
            android.content.Context r0 = r4.a
            boolean r0 = r4.a(r0)
            r4.c = r0
            android.content.Context r0 = r4.a     // Catch: java.lang.SecurityException -> L1f
            android.content.BroadcastReceiver r1 = r4.e     // Catch: java.lang.SecurityException -> L1f
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.SecurityException -> L1f
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)     // Catch: java.lang.SecurityException -> L1f
            r0.registerReceiver(r1, r2)     // Catch: java.lang.SecurityException -> L1f
            r0 = 1
            r4.d = r0     // Catch: java.lang.SecurityException -> L1f
            return
        L1f:
            java.lang.String r0 = "ConnectivityMonitor"
            r1 = 5
            android.util.Log.isLoggable(r0, r1)
            return
    }

    private void e() {
            r2 = this;
            boolean r0 = r2.d
            if (r0 != 0) goto L5
            return
        L5:
            android.content.Context r0 = r2.a
            android.content.BroadcastReceiver r1 = r2.e
            r0.unregisterReceiver(r1)
            r0 = 0
            r2.d = r0
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    boolean a(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            java.lang.Object r3 = com.bumptech.glide.util.k.d(r3)
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            r0 = 1
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch: java.lang.RuntimeException -> L1e
            if (r3 == 0) goto L1c
            boolean r3 = r3.isConnected()
            if (r3 == 0) goto L1c
            return r0
        L1c:
            r3 = 0
            return r3
        L1e:
            java.lang.String r3 = "ConnectivityMonitor"
            r1 = 5
            android.util.Log.isLoggable(r3, r1)
            return r0
    }

    @Override // com.bumptech.glide.manager.m
    public void onDestroy() {
            r0 = this;
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onStart() {
            r0 = this;
            r0.c()
            return
    }

    @Override // com.bumptech.glide.manager.m
    public void onStop() {
            r0 = this;
            r0.e()
            return
    }
}
