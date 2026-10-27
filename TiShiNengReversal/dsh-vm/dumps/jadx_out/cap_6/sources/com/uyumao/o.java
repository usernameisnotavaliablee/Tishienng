package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class o {
    public static volatile com.uyumao.o a;
    public final android.content.Context b;
    public final com.uyumao.o.a c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a {
        public final java.lang.String a;

        public a(com.uyumao.o r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                boolean r1 = android.text.TextUtils.isEmpty(r2)
                if (r1 != 0) goto L1a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r2)
                java.lang.String r2 = "_"
                r1.append(r2)
                java.lang.String r2 = r1.toString()
            L1a:
                r0.a = r2
                return
        }

        public long a(java.lang.String r3, long r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.a
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = java.lang.String.valueOf(r4)
                android.content.Context r1 = com.uyumao.e.a     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                boolean r1 = com.uyumao.n.c(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                if (r1 == 0) goto L2a
                com.uyumao.m r1 = com.uyumao.m.a()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                android.content.SharedPreferences r1 = r1.b     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                java.lang.String r0 = r1.getString(r3, r0)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2a
                goto L2a
            L28:
                r3 = move-exception
                throw r3
            L2a:
                long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Exception -> L2f
                return r3
            L2f:
                return r4
        }

        public final void a(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                android.content.Context r0 = com.uyumao.e.a     // Catch: java.lang.Exception -> L22
                boolean r0 = com.uyumao.n.c(r0)     // Catch: java.lang.Exception -> L22
                if (r0 == 0) goto L22
                com.uyumao.m r0 = com.uyumao.m.a()     // Catch: java.lang.Exception -> L22
                r0.getClass()     // Catch: java.lang.Exception -> L22
                boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L22
                if (r1 != 0) goto L22
                android.content.SharedPreferences r0 = r0.b     // Catch: java.lang.Exception -> L22
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> L22
                android.content.SharedPreferences$Editor r3 = r0.putString(r3, r4)     // Catch: java.lang.Exception -> L22
                r3.apply()     // Catch: java.lang.Exception -> L22
            L22:
                return
        }

        public void b(java.lang.String r3, long r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.a
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r2.a(r3, r4)
                return
        }
    }

    public o(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.uyumao.o$a r0 = new com.uyumao.o$a
            java.lang.String r1 = "AZX"
            r0.<init>(r2, r1)
            r2.c = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.b = r3
            return
    }

    public long a() {
            r4 = this;
            com.uyumao.o$a r0 = r4.c
            java.lang.String r1 = "smart_lc"
            r2 = 0
            long r0 = r0.a(r1, r2)
            return r0
    }

    public void a(long r5) {
            r4 = this;
            com.uyumao.o$a r0 = r4.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "smart_"
            r1.append(r2)
            java.lang.String r3 = "interval"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.b(r1, r5)
            com.uyumao.o$a r5 = r4.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r0 = "ts"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            long r0 = java.lang.System.currentTimeMillis()
            r5.b(r6, r0)
            return
    }

    public final boolean a(java.lang.String r8) {
            r7 = this;
            com.uyumao.o$a r0 = r7.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = "interval"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            long r0 = r0.a(r1, r2)
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L48
            com.uyumao.o$a r5 = r7.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r8 = "ts"
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            long r2 = r5.a(r8, r2)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r2
            long r2 = java.lang.Math.abs(r5)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r5
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L46
            return r4
        L46:
            r8 = 0
            return r8
        L48:
            return r4
    }
}
