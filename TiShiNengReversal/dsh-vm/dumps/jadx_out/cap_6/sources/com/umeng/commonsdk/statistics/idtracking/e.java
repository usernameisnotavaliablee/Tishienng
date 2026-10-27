package com.umeng.commonsdk.statistics.idtracking;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    public static final long a = 86400000;
    public static com.umeng.commonsdk.statistics.idtracking.e b;
    private static final java.lang.String c = null;
    private static java.lang.Object j;
    private java.io.File d;
    private com.umeng.commonsdk.statistics.proto.c e;
    private long f;
    private long g;
    private java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> h;
    private com.umeng.commonsdk.statistics.idtracking.e.a i;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private android.content.Context a;
        private java.util.Set<java.lang.String> b;

        public a(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.b = r0
                r1.a = r2
                return
        }

        public synchronized void a() {
                r3 = this;
                monitor-enter(r3)
                java.util.Set<java.lang.String> r0 = r3.b     // Catch: java.lang.Throwable -> L29
                boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L29
                if (r0 != 0) goto L4b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
                r0.<init>()     // Catch: java.lang.Throwable -> L29
                java.util.Set<java.lang.String> r1 = r3.b     // Catch: java.lang.Throwable -> L29
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L29
            L14:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L29
                if (r2 == 0) goto L2b
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L29
                java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L29
                r0.append(r2)     // Catch: java.lang.Throwable -> L29
                r2 = 44
                r0.append(r2)     // Catch: java.lang.Throwable -> L29
                goto L14
            L29:
                r0 = move-exception
                goto L4d
            L2b:
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L29
                int r1 = r1 + (-1)
                r0.deleteCharAt(r1)     // Catch: java.lang.Throwable -> L29
                android.content.Context r1 = r3.a     // Catch: java.lang.Throwable -> L29
                android.content.SharedPreferences r1 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r1)     // Catch: java.lang.Throwable -> L29
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L29
                java.lang.String r2 = "invld_id"
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29
                android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)     // Catch: java.lang.Throwable -> L29
                r0.commit()     // Catch: java.lang.Throwable -> L29
            L4b:
                monitor-exit(r3)
                return
            L4d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
                throw r0
        }

        public synchronized boolean a(java.lang.String r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.Set<java.lang.String> r0 = r1.b     // Catch: java.lang.Throwable -> Lb
                boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> Lb
                r2 = r2 ^ 1
                monitor-exit(r1)
                return r2
            Lb:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
                throw r2
        }

        public synchronized void b() {
                r5 = this;
                monitor-enter(r5)
                android.content.Context r0 = r5.a     // Catch: java.lang.Throwable -> L2e
                android.content.SharedPreferences r0 = com.umeng.commonsdk.statistics.internal.PreferenceWrapper.getDefault(r0)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r1 = "invld_id"
                r2 = 0
                java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.Throwable -> L2e
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2e
                if (r1 != 0) goto L33
                java.lang.String r1 = ","
                java.lang.String[] r0 = r0.split(r1)     // Catch: java.lang.Throwable -> L2e
                if (r0 == 0) goto L33
                int r1 = r0.length     // Catch: java.lang.Throwable -> L2e
                r2 = 0
            L1e:
                if (r2 >= r1) goto L33
                r3 = r0[r2]     // Catch: java.lang.Throwable -> L2e
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2e
                if (r4 != 0) goto L30
                java.util.Set<java.lang.String> r4 = r5.b     // Catch: java.lang.Throwable -> L2e
                r4.add(r3)     // Catch: java.lang.Throwable -> L2e
                goto L30
            L2e:
                r0 = move-exception
                goto L35
            L30:
                int r2 = r2 + 1
                goto L1e
            L33:
                monitor-exit(r5)
                return
            L35:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
                throw r0
        }

        public synchronized void b(java.lang.String r2) {
                r1 = this;
                monitor-enter(r1)
                java.util.Set<java.lang.String> r0 = r1.b     // Catch: java.lang.Throwable -> L8
                r0.add(r2)     // Catch: java.lang.Throwable -> L8
                monitor-exit(r1)
                return
            L8:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r2
        }

        public void c(java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.b
                r0.remove(r2)
                return
        }
    }

    static {
            com.umeng.analytics.pro.au r0 = com.umeng.analytics.pro.au.b()
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.b(r1)
            com.umeng.commonsdk.statistics.idtracking.e.c = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.commonsdk.statistics.idtracking.e.j = r0
            return
    }

    e(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.e = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.h = r1
            r3.i = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getFilesDir()
            java.lang.String r2 = com.umeng.commonsdk.statistics.idtracking.e.c
            r0.<init>(r1, r2)
            r3.d = r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r3.g = r0
            com.umeng.commonsdk.statistics.idtracking.e$a r0 = new com.umeng.commonsdk.statistics.idtracking.e$a
            r0.<init>(r4)
            r3.i = r0
            r0.b()
            return
    }

    public static synchronized com.umeng.commonsdk.statistics.idtracking.e a(android.content.Context r3) {
            java.lang.Class<com.umeng.commonsdk.statistics.idtracking.e> r0 = com.umeng.commonsdk.statistics.idtracking.e.class
            monitor-enter(r0)
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L6c
            com.umeng.commonsdk.statistics.idtracking.e r1 = new com.umeng.commonsdk.statistics.idtracking.e     // Catch: java.lang.Throwable -> L65
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.e.b = r1     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.f r2 = new com.umeng.commonsdk.statistics.idtracking.f     // Catch: java.lang.Throwable -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.b r2 = new com.umeng.commonsdk.statistics.idtracking.b     // Catch: java.lang.Throwable -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.j r2 = new com.umeng.commonsdk.statistics.idtracking.j     // Catch: java.lang.Throwable -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.d r2 = new com.umeng.commonsdk.statistics.idtracking.d     // Catch: java.lang.Throwable -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.c r2 = new com.umeng.commonsdk.statistics.idtracking.c     // Catch: java.lang.Throwable -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.g r2 = new com.umeng.commonsdk.statistics.idtracking.g     // Catch: java.lang.Throwable -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.i r2 = new com.umeng.commonsdk.statistics.idtracking.i     // Catch: java.lang.Throwable -> L65
            r2.<init>()     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            java.lang.String r1 = "header_device_oaid"
            boolean r1 = com.umeng.commonsdk.config.FieldManager.allow(r1)     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L67
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            com.umeng.commonsdk.statistics.idtracking.h r2 = new com.umeng.commonsdk.statistics.idtracking.h     // Catch: java.lang.Throwable -> L65
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L65
            r1.a(r2)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r3 = move-exception
            goto L70
        L67:
            com.umeng.commonsdk.statistics.idtracking.e r3 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            r3.f()     // Catch: java.lang.Throwable -> L65
        L6c:
            com.umeng.commonsdk.statistics.idtracking.e r3 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)
            return r3
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r3
    }

    public static synchronized void a() {
            java.lang.Class<com.umeng.commonsdk.statistics.idtracking.e> r0 = com.umeng.commonsdk.statistics.idtracking.e.class
            monitor-enter(r0)
            com.umeng.commonsdk.statistics.idtracking.e r1 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            r1.e()     // Catch: java.lang.Throwable -> Le
            r1 = 0
            com.umeng.commonsdk.statistics.idtracking.e.b = r1     // Catch: java.lang.Throwable -> Le
            goto L10
        Le:
            r1 = move-exception
            goto L12
        L10:
            monitor-exit(r0)
            return
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    private void a(com.umeng.commonsdk.statistics.proto.c r3) {
            r2 = this;
            if (r3 == 0) goto L8e
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            if (r0 == 0) goto L8e
            java.lang.String r1 = "mac"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1b
            java.lang.String r0 = "header_device_id_mac"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 != 0) goto L1b
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            r0.remove(r1)
        L1b:
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            java.lang.String r1 = "imei"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L32
            java.lang.String r0 = "header_device_id_imei"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 != 0) goto L32
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            r0.remove(r1)
        L32:
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            java.lang.String r1 = "android_id"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L49
            java.lang.String r0 = "header_device_id_android_id"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 != 0) goto L49
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            r0.remove(r1)
        L49:
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            java.lang.String r1 = "serial"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L60
            java.lang.String r0 = "header_device_id_serialNo"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 != 0) goto L60
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            r0.remove(r1)
        L60:
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            java.lang.String r1 = "idfa"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L77
            java.lang.String r0 = "header_tracking_idfa"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 != 0) goto L77
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            r0.remove(r1)
        L77:
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r0 = r3.a
            java.lang.String r1 = "oaid"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L8e
            java.lang.String r0 = "header_device_oaid"
            boolean r0 = com.umeng.commonsdk.config.FieldManager.allow(r0)
            if (r0 != 0) goto L8e
            java.util.Map<java.lang.String, com.umeng.commonsdk.statistics.proto.b> r3 = r3.a
            r3.remove(r1)
        L8e:
            return
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a r3) {
            r2 = this;
            com.umeng.commonsdk.statistics.idtracking.e$a r0 = r2.i
            java.lang.String r1 = r3.b()
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L13
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r0 = r2.h
            boolean r3 = r0.add(r3)
            return r3
        L13:
            boolean r0 = com.umeng.commonsdk.statistics.AnalyticsConstants.UM_DEBUG
            if (r0 == 0) goto L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid domain: "
            r0.append(r1)
            java.lang.String r3 = r3.b()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.umeng.commonsdk.statistics.common.MLog.w(r3)
        L2f:
            r3 = 0
            return r3
    }

    private void b(com.umeng.commonsdk.statistics.proto.c r3) {
            r2 = this;
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.e.j
            monitor-enter(r0)
            if (r3 == 0) goto L20
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L20
            r2.a(r3)     // Catch: java.lang.Throwable -> L1d
            com.umeng.analytics.pro.ca r1 = new com.umeng.analytics.pro.ca     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            byte[] r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L20
            java.io.File r1 = r2.d     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L20
            com.umeng.commonsdk.statistics.common.HelperUtils.writeFile(r1, r3)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L20
            goto L20
        L1b:
            r3 = move-exception
            goto L22
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L20
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }

    private synchronized void h() {
            r7 = this;
            monitor-enter(r7)
            com.umeng.commonsdk.statistics.proto.c r0 = new com.umeng.commonsdk.statistics.proto.c     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3b
            r1.<init>()     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Throwable -> L3b
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r3 = r7.h     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3b
        L16:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L3b
            com.umeng.commonsdk.statistics.idtracking.a r4 = (com.umeng.commonsdk.statistics.idtracking.a) r4     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r4.c()     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L29
            goto L16
        L29:
            com.umeng.commonsdk.statistics.proto.b r5 = r4.d()     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L3d
            java.lang.String r5 = r4.b()     // Catch: java.lang.Throwable -> L3b
            com.umeng.commonsdk.statistics.proto.b r6 = r4.d()     // Catch: java.lang.Throwable -> L3b
            r1.put(r5, r6)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r0 = move-exception
            goto L64
        L3d:
            java.util.List r5 = r4.e()     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L16
            java.util.List r5 = r4.e()     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto L16
            java.util.List r4 = r4.e()     // Catch: java.lang.Throwable -> L3b
            r2.addAll(r4)     // Catch: java.lang.Throwable -> L3b
            goto L16
        L55:
            r0.a(r2)     // Catch: java.lang.Throwable -> L3b
            r0.a(r1)     // Catch: java.lang.Throwable -> L3b
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L3b
            r7.e = r0     // Catch: java.lang.Throwable -> L61
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r7)
            return
        L61:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L3b
        L64:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            throw r0
    }

    private com.umeng.commonsdk.statistics.proto.c i() {
            r7 = this;
            java.lang.Object r0 = com.umeng.commonsdk.statistics.idtracking.e.j
            monitor-enter(r0)
            java.io.File r1 = r7.d     // Catch: java.lang.Throwable -> Le
            boolean r1 = r1.exists()     // Catch: java.lang.Throwable -> Le
            r2 = 0
            if (r1 != 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r2
        Le:
            r1 = move-exception
            goto L3f
        L10:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            java.io.File r3 = r7.d     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L34
            byte[] r3 = com.umeng.commonsdk.statistics.common.HelperUtils.readStreamToByteArray(r1)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            com.umeng.commonsdk.statistics.proto.c r4 = new com.umeng.commonsdk.statistics.proto.c     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            r4.<init>()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            com.umeng.analytics.pro.bu r5 = new com.umeng.analytics.pro.bu     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            r5.<init>()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            r5.a(r4, r3)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L3a
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r4
        L2d:
            r2 = move-exception
            goto L36
        L2f:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L36
        L34:
            r1 = r2
            goto L3a
        L36:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r1)     // Catch: java.lang.Throwable -> Le
            throw r2     // Catch: java.lang.Throwable -> Le
        L3a:
            com.umeng.commonsdk.statistics.common.HelperUtils.safeClose(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return r2
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public void a(long r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public synchronized void b() {
            r7 = this;
            monitor-enter(r7)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3f
            long r2 = r7.f     // Catch: java.lang.Throwable -> L3f
            long r2 = r0 - r2
            long r4 = r7.g     // Catch: java.lang.Throwable -> L3f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L52
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r2 = r7.h     // Catch: java.lang.Throwable -> L3f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3f
            r3 = 0
        L16:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L43
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L3f
            com.umeng.commonsdk.statistics.idtracking.a r4 = (com.umeng.commonsdk.statistics.idtracking.a) r4     // Catch: java.lang.Throwable -> L3f
            boolean r5 = r4.c()     // Catch: java.lang.Throwable -> L3f
            if (r5 != 0) goto L29
            goto L16
        L29:
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L16
            boolean r3 = r4.c()     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L41
            com.umeng.commonsdk.statistics.idtracking.e$a r3 = r7.i     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L3f
            r3.b(r4)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L54
        L41:
            r3 = 1
            goto L16
        L43:
            if (r3 == 0) goto L50
            r7.h()     // Catch: java.lang.Throwable -> L3f
            com.umeng.commonsdk.statistics.idtracking.e$a r2 = r7.i     // Catch: java.lang.Throwable -> L3f
            r2.a()     // Catch: java.lang.Throwable -> L3f
            r7.g()     // Catch: java.lang.Throwable -> L3f
        L50:
            r7.f = r0     // Catch: java.lang.Throwable -> L3f
        L52:
            monitor-exit(r7)
            return
        L54:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3f
            throw r0
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c c() {
            r1 = this;
            monitor-enter(r1)
            com.umeng.commonsdk.statistics.proto.c r0 = r1.e     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public java.lang.String d() {
            r1 = this;
            r0 = 0
            return r0
    }

    public synchronized void e() {
            r5 = this;
            monitor-enter(r5)
            com.umeng.commonsdk.statistics.idtracking.e r0 = com.umeng.commonsdk.statistics.idtracking.e.b     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L7
            monitor-exit(r5)
            return
        L7:
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r0 = r5.h     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r2 = 0
        Lf:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L38
            com.umeng.commonsdk.statistics.idtracking.a r3 = (com.umeng.commonsdk.statistics.idtracking.a) r3     // Catch: java.lang.Throwable -> L38
            boolean r4 = r3.c()     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L22
            goto Lf
        L22:
            java.util.List r4 = r3.e()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto Lf
            java.util.List r4 = r3.e()     // Catch: java.lang.Throwable -> L38
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto Lf
            r2 = 0
            r3.a(r2)     // Catch: java.lang.Throwable -> L38
            r2 = 1
            goto Lf
        L38:
            r0 = move-exception
            goto L46
        L3a:
            if (r2 == 0) goto L44
            com.umeng.commonsdk.statistics.proto.c r0 = r5.e     // Catch: java.lang.Throwable -> L38
            r0.b(r1)     // Catch: java.lang.Throwable -> L38
            r5.g()     // Catch: java.lang.Throwable -> L38
        L44:
            monitor-exit(r5)
            return
        L46:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    public synchronized void f() {
            r4 = this;
            monitor-enter(r4)
            com.umeng.commonsdk.statistics.proto.c r0 = r4.i()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L9
            monitor-exit(r4)
            return
        L9:
            r4.a(r0)     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L59
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r2 = r4.h     // Catch: java.lang.Throwable -> L59
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L59
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L59
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L59
            r4.e = r0     // Catch: java.lang.Throwable -> L3b
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r0 = r4.h     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3b
        L20:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3b
            com.umeng.commonsdk.statistics.idtracking.a r2 = (com.umeng.commonsdk.statistics.idtracking.a) r2     // Catch: java.lang.Throwable -> L3b
            com.umeng.commonsdk.statistics.proto.c r3 = r4.e     // Catch: java.lang.Throwable -> L3b
            r2.a(r3)     // Catch: java.lang.Throwable -> L3b
            boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L3b
            if (r3 != 0) goto L20
            r1.add(r2)     // Catch: java.lang.Throwable -> L3b
            goto L20
        L3b:
            r0 = move-exception
            goto L5b
        L3d:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L3b
        L41:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3b
            com.umeng.commonsdk.statistics.idtracking.a r1 = (com.umeng.commonsdk.statistics.idtracking.a) r1     // Catch: java.lang.Throwable -> L3b
            java.util.Set<com.umeng.commonsdk.statistics.idtracking.a> r2 = r4.h     // Catch: java.lang.Throwable -> L3b
            r2.remove(r1)     // Catch: java.lang.Throwable -> L3b
            goto L41
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            r4.h()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r4)
            return
        L59:
            r0 = move-exception
            goto L5d
        L5b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L59
        L5d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L59
            throw r0
    }

    public synchronized void g() {
            r1 = this;
            monitor-enter(r1)
            com.umeng.commonsdk.statistics.proto.c r0 = r1.e     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto Lb
            r1.b(r0)     // Catch: java.lang.Throwable -> L9
            goto Lb
        L9:
            r0 = move-exception
            goto Ld
        Lb:
            monitor-exit(r1)
            return
        Ld:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }
}
