package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class j3 {
    private boolean a;

    /* renamed from: b, reason: collision with root package name */
    java.util.ArrayList<com.amap.api.col.3l.j3.a> f3545b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private java.lang.String a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.Object f3546b;

        /* renamed from: c, reason: collision with root package name */
        private java.lang.Class<?>[] f3547c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.Object[] f3548d;

        public a(java.lang.Object r3, java.lang.String r4, java.lang.Object... r5) {
                r2 = this;
                r2.<init>()
                r2.f3546b = r3
                r2.a = r4
                if (r5 == 0) goto L34
                int r3 = r5.length
                if (r3 <= 0) goto L34
                int r3 = r5.length
                java.lang.Class[] r3 = new java.lang.Class[r3]
                r2.f3547c = r3
                r3 = 0
                r4 = 0
            L13:
                int r0 = r5.length
                if (r4 >= r0) goto L23
                java.lang.Class<?>[] r0 = r2.f3547c
                r1 = r5[r4]
                java.lang.Class r1 = r1.getClass()
                r0[r4] = r1
                int r4 = r4 + 1
                goto L13
            L23:
                int r4 = r5.length
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r2.f3548d = r4
            L28:
                int r4 = r5.length
                if (r3 >= r4) goto L34
                java.lang.Object[] r4 = r2.f3548d
                r0 = r5[r3]
                r4[r3] = r0
                int r3 = r3 + 1
                goto L28
            L34:
                return
        }

        static /* synthetic */ java.lang.Object a(com.amap.api.col.3l.j3.a r0) {
                java.lang.Object r0 = r0.f3546b
                return r0
        }

        static /* synthetic */ java.lang.String b(com.amap.api.col.3l.j3.a r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.Class[] c(com.amap.api.col.3l.j3.a r0) {
                java.lang.Class<?>[] r0 = r0.f3547c
                return r0
        }

        static /* synthetic */ java.lang.Object[] d(com.amap.api.col.3l.j3.a r0) {
                java.lang.Object[] r0 = r0.f3548d
                return r0
        }
    }

    public j3() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3545b = r0
            return
    }

    public final synchronized void a() {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.a     // Catch: java.lang.Throwable -> L38
            r1 = 1
            if (r0 != r1) goto L8
            monitor-exit(r8)
            return
        L8:
            r8.a = r1     // Catch: java.lang.Throwable -> L38
            r0 = 0
            r2 = 0
        Lc:
            java.util.ArrayList<com.amap.api.col.3l.j3$a> r3 = r8.f3545b     // Catch: java.lang.Throwable -> L38
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L38
            if (r2 >= r3) goto L8b
            java.util.ArrayList<com.amap.api.col.3l.j3$a> r3 = r8.f3545b     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L38
            com.amap.api.col.3l.j3$a r3 = (com.amap.api.col.3l.j3.a) r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = com.amap.api.col.3l.j3.a.a(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88
            if (r4 != 0) goto L23
            goto L88
        L23:
            java.lang.Object r4 = com.amap.api.col.3l.j3.a.a(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88
            java.lang.String r5 = com.amap.api.col.3l.j3.a.b(r3)     // Catch: java.lang.Throwable -> L38 java.lang.NoSuchMethodException -> L3a java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.Class[] r6 = com.amap.api.col.3l.j3.a.c(r3)     // Catch: java.lang.Throwable -> L38 java.lang.NoSuchMethodException -> L3a java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L38 java.lang.NoSuchMethodException -> L3a java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            goto L78
        L38:
            r0 = move-exception
            goto L92
        L3a:
            java.lang.Class[] r5 = com.amap.api.col.3l.j3.a.c(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            int r5 = r5.length     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            if (r5 <= 0) goto L77
            java.lang.Class[] r5 = com.amap.api.col.3l.j3.a.c(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            int r5 = r5.length     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            r6 = 0
        L49:
            java.lang.Class[] r7 = com.amap.api.col.3l.j3.a.c(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            int r7 = r7.length     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            if (r6 >= r7) goto L6e
            java.lang.Class[] r7 = com.amap.api.col.3l.j3.a.c(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            r7 = r7[r6]     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.Class[] r7 = r7.getInterfaces()     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            int r7 = r7.length     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            if (r7 <= 0) goto L6b
            java.lang.Class[] r7 = com.amap.api.col.3l.j3.a.c(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            r7 = r7[r6]     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.Class[] r7 = r7.getInterfaces()     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            r7 = r7[r0]     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            r5[r6] = r7     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
        L6b:
            int r6 = r6 + 1
            goto L49
        L6e:
            java.lang.String r6 = com.amap.api.col.3l.j3.a.b(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r5)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            goto L78
        L77:
            r4 = 0
        L78:
            if (r4 == 0) goto L88
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.Object r5 = com.amap.api.col.3l.j3.a.a(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            java.lang.Object[] r3 = com.amap.api.col.3l.j3.a.d(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
            r4.invoke(r5, r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88 java.lang.Throwable -> L88
        L88:
            int r2 = r2 + 1
            goto Lc
        L8b:
            java.util.ArrayList<com.amap.api.col.3l.j3$a> r0 = r8.f3545b     // Catch: java.lang.Throwable -> L38
            r0.clear()     // Catch: java.lang.Throwable -> L38
            monitor-exit(r8)
            return
        L92:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L38
            throw r0
    }

    public final synchronized void b(java.lang.Object r4, java.lang.Object... r5) {
            r3 = this;
            monitor-enter(r3)
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L1f
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1f
            int r1 = r0.length     // Catch: java.lang.Throwable -> L1f
            r2 = 3
            if (r1 < r2) goto L1f
            com.amap.api.col.3l.j3$a r1 = new com.amap.api.col.3l.j3$a     // Catch: java.lang.Throwable -> L1f
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = r0.getMethodName()     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r4, r0, r5)     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList<com.amap.api.col.3l.j3$a> r4 = r3.f3545b     // Catch: java.lang.Throwable -> L1f
            r4.add(r1)     // Catch: java.lang.Throwable -> L1f
        L1f:
            r4 = 0
            r3.a = r4     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            return
        L24:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
    }
}
