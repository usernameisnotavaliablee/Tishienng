package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e {
    private static final java.lang.String a = "Prefs";
    private static volatile com.umeng.socialize.a.e c;
    private final android.content.Context b;
    private final com.umeng.socialize.a.e.a d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a {
        final /* synthetic */ com.umeng.socialize.a.e a;
        private final java.lang.String b;

        public a(com.umeng.socialize.a.e r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                if (r1 != 0) goto L1c
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = "_"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L1c:
                r0.b = r2
                return
        }

        private java.lang.String b(java.lang.String r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.b
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }

        private java.lang.String c(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
                boolean r0 = com.umeng.socialize.a.c.a(r0)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
                if (r0 == 0) goto L15
                com.umeng.socialize.a.b r0 = com.umeng.socialize.a.b.a()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
                java.lang.String r2 = r0.b(r2, r3)     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
                return r2
            L13:
                r2 = move-exception
                throw r2
            L15:
                return r3
        }

        private void c(java.lang.String r2) {
                r1 = this;
                android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()     // Catch: java.lang.Throwable -> L11
                boolean r0 = com.umeng.socialize.a.c.a(r0)     // Catch: java.lang.Throwable -> L11
                if (r0 == 0) goto L11
                com.umeng.socialize.a.b r0 = com.umeng.socialize.a.b.a()     // Catch: java.lang.Throwable -> L11
                r0.a(r2)     // Catch: java.lang.Throwable -> L11
            L11:
                return
        }

        private void d(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()     // Catch: java.lang.Exception -> L11
                boolean r0 = com.umeng.socialize.a.c.a(r0)     // Catch: java.lang.Exception -> L11
                if (r0 == 0) goto L11
                com.umeng.socialize.a.b r0 = com.umeng.socialize.a.b.a()     // Catch: java.lang.Exception -> L11
                r0.a(r2, r3)     // Catch: java.lang.Exception -> L11
            L11:
                return
        }

        public void a(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = r0.b(r1)
                r0.c(r1)
                return
        }

        public void a(java.lang.String r1, float r2) {
                r0 = this;
                java.lang.String r1 = r0.b(r1)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.d(r1, r2)
                return
        }

        public void a(java.lang.String r1, int r2) {
                r0 = this;
                java.lang.String r1 = r0.b(r1)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.d(r1, r2)
                return
        }

        public void a(java.lang.String r1, long r2) {
                r0 = this;
                java.lang.String r1 = r0.b(r1)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.d(r1, r2)
                return
        }

        public void a(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r1 = r0.b(r1)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.d(r1, r2)
                return
        }

        public void a(java.lang.String r1, boolean r2) {
                r0 = this;
                java.lang.String r1 = r0.b(r1)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                r0.d(r1, r2)
                return
        }

        public float b(java.lang.String r2, float r3) {
                r1 = this;
                java.lang.String r2 = r1.b(r2)
                java.lang.String r0 = java.lang.String.valueOf(r3)
                java.lang.String r2 = r1.c(r2, r0)
                float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.Exception -> L11
                return r2
            L11:
                return r3
        }

        public int b(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r2 = r1.b(r2)
                java.lang.String r0 = java.lang.String.valueOf(r3)
                java.lang.String r2 = r1.c(r2, r0)
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Exception -> L11
                return r2
            L11:
                return r3
        }

        public long b(java.lang.String r2, long r3) {
                r1 = this;
                java.lang.String r2 = r1.b(r2)
                java.lang.String r0 = java.lang.String.valueOf(r3)
                java.lang.String r2 = r1.c(r2, r0)
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L11
                return r2
            L11:
                return r3
        }

        public java.lang.String b(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                java.lang.String r1 = r0.b(r1)
                java.lang.String r1 = r0.c(r1, r2)
                return r1
        }

        public boolean b(java.lang.String r2, boolean r3) {
                r1 = this;
                java.lang.String r2 = r1.b(r2)
                java.lang.String r0 = java.lang.String.valueOf(r3)
                java.lang.String r2 = r1.c(r2, r0)
                boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.Exception -> L11
                return r2
            L11:
                return r3
        }
    }

    private e(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.umeng.socialize.a.e$a r0 = new com.umeng.socialize.a.e$a
            java.lang.String r1 = "AZX"
            r0.<init>(r2, r1)
            r2.d = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.b = r3
            return
    }

    public static com.umeng.socialize.a.e a(android.content.Context r2) {
            com.umeng.socialize.a.e r0 = com.umeng.socialize.a.e.c
            if (r0 != 0) goto L19
            java.lang.Class<com.umeng.socialize.a.e> r0 = com.umeng.socialize.a.e.class
            monitor-enter(r0)
            com.umeng.socialize.a.e r1 = com.umeng.socialize.a.e.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.socialize.a.e r1 = new com.umeng.socialize.a.e     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            com.umeng.socialize.a.e.c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            com.umeng.socialize.a.e r2 = com.umeng.socialize.a.e.c
            return r2
    }

    private void a(java.lang.String r4, long r5) {
            r3 = this;
            com.umeng.socialize.a.e$a r0 = r3.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "interval"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1, r5)
            com.umeng.socialize.a.e$a r5 = r3.d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "ts"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            long r0 = java.lang.System.currentTimeMillis()
            r5.a(r4, r0)
            return
    }

    private boolean a(java.lang.String r9) {
            r8 = this;
            com.umeng.socialize.a.e$a r0 = r8.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r2 = "interval"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            long r0 = r0.b(r1, r2)
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L76
            com.umeng.socialize.a.e$a r5 = r8.d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            java.lang.String r7 = "ts"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            long r2 = r5.b(r6, r2)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            long r2 = java.lang.Math.abs(r5)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r5
            r5 = 0
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 < 0) goto L48
            r6 = 1
            goto L49
        L48:
            r6 = 0
        L49:
            if (r6 != 0) goto L75
            boolean r7 = com.umeng.socialize.a.a.c
            if (r7 == 0) goto L75
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "interval deny "
            r2[r5] = r3
            r2[r4] = r9
            java.lang.String r9 = " config:"
            r3 = 2
            r2[r3] = r9
            r9 = 3
            r2[r9] = r0
            java.lang.String r9 = " current:"
            r0 = 4
            r2[r0] = r9
            r9 = 5
            r2[r9] = r1
            java.lang.String r9 = "Prefs"
            com.umeng.socialize.a.m.a(r9, r2)
        L75:
            return r6
        L76:
            return r4
    }

    private void b(java.lang.String r4) {
            r3 = this;
            com.umeng.socialize.a.e$a r0 = r3.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "interval"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            com.umeng.socialize.a.e$a r0 = r3.d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r4 = "ts"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.a(r4)
            return
    }

    public long a() {
            r4 = this;
            com.umeng.socialize.a.e$a r0 = r4.d
            java.lang.String r1 = "smart_ts"
            r2 = 0
            long r0 = r0.b(r1, r2)
            return r0
    }

    public void a(int r3) {
            r2 = this;
            com.umeng.socialize.a.e$a r0 = r2.d
            java.lang.String r1 = "smart_lt"
            r0.a(r1, r3)
            return
    }

    public void a(long r2) {
            r1 = this;
            java.lang.String r0 = "smart_"
            r1.a(r0, r2)
            return
    }

    public boolean b() {
            r1 = this;
            java.lang.String r0 = "smart_"
            boolean r0 = r1.a(r0)
            return r0
    }

    public int c() {
            r3 = this;
            com.umeng.socialize.a.e$a r0 = r3.d
            java.lang.String r1 = "smart_lt"
            r2 = 0
            int r0 = r0.b(r1, r2)
            return r0
    }

    public long d() {
            r4 = this;
            com.umeng.socialize.a.e$a r0 = r4.d
            java.lang.String r1 = "smart_lc"
            r2 = 0
            long r0 = r0.b(r1, r2)
            return r0
    }

    public void e() {
            r5 = this;
            android.content.Context r0 = r5.b
            boolean r0 = com.umeng.socialize.a.c.a(r0)
            if (r0 != 0) goto L9
            return
        L9:
            long r0 = r5.d()
            com.umeng.socialize.a.e$a r2 = r5.d
            r3 = 1
            long r0 = r0 + r3
            java.lang.String r3 = "smart_lc"
            r2.a(r3, r0)
            return
    }
}
