package com.snail.antifake.deviceid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private android.os.Handler a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.snail.antifake.deviceid.d.c b;
        final /* synthetic */ com.snail.antifake.deviceid.d c;

        a(com.snail.antifake.deviceid.d r1, java.lang.String r2, com.snail.antifake.deviceid.d.c r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.net.DatagramPacket r0 = new java.net.DatagramPacket
                r1 = 0
                byte[] r2 = new byte[r1]
                r0.<init>(r2, r1, r1)
                java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.lang.Throwable -> L4a
                r1.<init>()     // Catch: java.lang.Throwable -> L4a
                r2 = 2
            Le:
                r3 = 255(0xff, float:3.57E-43)
                if (r2 >= r3) goto L40
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
                r3.<init>()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = r5.a     // Catch: java.lang.Throwable -> L4a
                r3.append(r4)     // Catch: java.lang.Throwable -> L4a
                java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L4a
                r3.append(r4)     // Catch: java.lang.Throwable -> L4a
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4a
                java.net.InetAddress r3 = java.net.InetAddress.getByName(r3)     // Catch: java.lang.Throwable -> L4a
                r0.setAddress(r3)     // Catch: java.lang.Throwable -> L4a
                r1.send(r0)     // Catch: java.lang.Throwable -> L4a
                int r2 = r2 + 1
                r3 = 125(0x7d, float:1.75E-43)
                if (r2 != r3) goto Le
                r1.close()     // Catch: java.lang.Throwable -> L4a
                java.net.DatagramSocket r1 = new java.net.DatagramSocket     // Catch: java.lang.Throwable -> L4a
                r1.<init>()     // Catch: java.lang.Throwable -> L4a
                goto Le
            L40:
                r1.close()     // Catch: java.lang.Throwable -> L4a
                com.snail.antifake.deviceid.d r0 = r5.c     // Catch: java.lang.Throwable -> L4a
                com.snail.antifake.deviceid.d$c r1 = r5.b     // Catch: java.lang.Throwable -> L4a
                com.snail.antifake.deviceid.d.a(r0, r1)     // Catch: java.lang.Throwable -> L4a
            L4a:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.lang.Runnable {
        final /* synthetic */ com.snail.antifake.deviceid.d.c a;
        final /* synthetic */ com.snail.antifake.deviceid.d b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a implements java.lang.Runnable {
            final /* synthetic */ java.util.Map a;
            final /* synthetic */ com.snail.antifake.deviceid.d.b b;

            a(com.snail.antifake.deviceid.d.b r1, java.util.Map r2) {
                    r0 = this;
                    r0.b = r1
                    r0.a = r2
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    com.snail.antifake.deviceid.d$b r0 = r2.b
                    com.snail.antifake.deviceid.d$c r0 = r0.a
                    java.util.Map r1 = r2.a
                    r0.a(r1)
                    return
            }
        }

        b(com.snail.antifake.deviceid.d r1, com.snail.antifake.deviceid.d.c r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.HashMap r0 = new java.util.HashMap     // Catch: java.io.IOException -> L51
                r0.<init>()     // Catch: java.io.IOException -> L51
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.io.IOException -> L51
                java.lang.String r2 = "cat proc/net/arp"
                java.lang.Process r1 = r1.exec(r2)     // Catch: java.io.IOException -> L51
                java.io.InputStream r1 = r1.getInputStream()     // Catch: java.io.IOException -> L51
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L51
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L51
                r3.<init>(r1)     // Catch: java.io.IOException -> L51
                r2.<init>(r3)     // Catch: java.io.IOException -> L51
            L1d:
                java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> L51
                if (r1 == 0) goto L43
                java.lang.String r3 = "00:00:00:00:00:00"
                boolean r3 = r1.contains(r3)     // Catch: java.io.IOException -> L51
                if (r3 != 0) goto L1d
                java.lang.String r3 = "IP"
                boolean r3 = r1.contains(r3)     // Catch: java.io.IOException -> L51
                if (r3 != 0) goto L1d
                java.lang.String r3 = "\\s+"
                java.lang.String[] r1 = r1.split(r3)     // Catch: java.io.IOException -> L51
                r3 = 3
                r3 = r1[r3]     // Catch: java.io.IOException -> L51
                r4 = 0
                r1 = r1[r4]     // Catch: java.io.IOException -> L51
                r0.put(r3, r1)     // Catch: java.io.IOException -> L51
                goto L1d
            L43:
                com.snail.antifake.deviceid.d r1 = r5.b     // Catch: java.io.IOException -> L51
                android.os.Handler r1 = com.snail.antifake.deviceid.d.b(r1)     // Catch: java.io.IOException -> L51
                com.snail.antifake.deviceid.d$b$a r2 = new com.snail.antifake.deviceid.d$b$a     // Catch: java.io.IOException -> L51
                r2.<init>(r5, r0)     // Catch: java.io.IOException -> L51
                r1.post(r2)     // Catch: java.io.IOException -> L51
            L51:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface c {
        void a(java.util.Map<java.lang.String, java.lang.String> r1);
    }

    public d() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.a = r0
            return
    }

    static /* synthetic */ void a(com.snail.antifake.deviceid.d r0, com.snail.antifake.deviceid.d.c r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ android.os.Handler b(com.snail.antifake.deviceid.d r0) {
            android.os.Handler r0 = r0.a
            return r0
    }

    private void c(com.snail.antifake.deviceid.d.c r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            com.snail.antifake.deviceid.d$b r1 = new com.snail.antifake.deviceid.d$b
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    private java.lang.String d() {
            r6 = this;
            r0 = 0
            java.util.Enumeration r1 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.net.SocketException -> L37
        L5:
            boolean r2 = r1.hasMoreElements()     // Catch: java.net.SocketException -> L37
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.nextElement()     // Catch: java.net.SocketException -> L37
            java.net.NetworkInterface r2 = (java.net.NetworkInterface) r2     // Catch: java.net.SocketException -> L37
            java.util.Enumeration r2 = r2.getInetAddresses()     // Catch: java.net.SocketException -> L37
        L15:
            boolean r3 = r2.hasMoreElements()     // Catch: java.net.SocketException -> L37
            if (r3 == 0) goto L5
            java.lang.Object r3 = r2.nextElement()     // Catch: java.net.SocketException -> L37
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch: java.net.SocketException -> L37
            boolean r4 = r3 instanceof java.net.Inet6Address     // Catch: java.net.SocketException -> L37
            if (r4 == 0) goto L26
            goto L15
        L26:
            java.lang.String r4 = r3.getHostAddress()     // Catch: java.net.SocketException -> L37
            java.lang.String r5 = "127.0.0.1"
            boolean r4 = r5.equals(r4)     // Catch: java.net.SocketException -> L37
            if (r4 != 0) goto L15
            java.lang.String r0 = r3.getHostAddress()     // Catch: java.net.SocketException -> L37
            goto L5
        L37:
            return r0
    }

    public void e(com.snail.antifake.deviceid.d.c r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r0 = r3.d()
            java.lang.String r1 = "."
            int r1 = r0.lastIndexOf(r1)
            int r1 = r1 + 1
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.Thread r1 = new java.lang.Thread
            com.snail.antifake.deviceid.d$a r2 = new com.snail.antifake.deviceid.d$a
            r2.<init>(r3, r0, r4)
            r1.<init>(r2)
            r1.start()
            return
    }
}
