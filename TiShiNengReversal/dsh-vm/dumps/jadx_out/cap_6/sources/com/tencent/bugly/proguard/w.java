package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class w {
    public static boolean a;
    private static com.tencent.bugly.proguard.w b;
    private static com.tencent.bugly.proguard.x c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.lang.Thread {
        final /* synthetic */ com.tencent.bugly.proguard.w a;
        private int b;
        private com.tencent.bugly.proguard.v c;
        private java.lang.String d;
        private android.content.ContentValues e;
        private boolean f;
        private java.lang.String[] g;
        private java.lang.String h;
        private java.lang.String[] i;
        private java.lang.String j;
        private java.lang.String k;
        private java.lang.String l;
        private java.lang.String m;
        private java.lang.String n;
        private java.lang.String[] o;
        private int p;

        /* renamed from: q, reason: collision with root package name */
        private java.lang.String f17q;
        private byte[] r;

        public a(com.tencent.bugly.proguard.w r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r1 = 4
                r0.b = r1
                r1 = 0
                r0.c = r1
                return
        }

        public final void a(int r1, java.lang.String r2, byte[] r3) {
                r0 = this;
                r0.p = r1
                r0.f17q = r2
                r0.r = r3
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
                r17 = this;
                r0 = r17
                int r1 = r0.b
                switch(r1) {
                    case 1: goto L5c;
                    case 2: goto L4e;
                    case 3: goto L2c;
                    case 4: goto L1e;
                    case 5: goto L14;
                    case 6: goto L8;
                    default: goto L7;
                }
            L7:
                goto L4d
            L8:
                com.tencent.bugly.proguard.w r1 = r0.a
                int r2 = r0.p
                java.lang.String r3 = r0.f17q
                com.tencent.bugly.proguard.v r4 = r0.c
                com.tencent.bugly.proguard.w.a(r1, r2, r3, r4)
                return
            L14:
                com.tencent.bugly.proguard.w r1 = r0.a
                int r2 = r0.p
                com.tencent.bugly.proguard.v r3 = r0.c
                com.tencent.bugly.proguard.w.a(r1, r2, r3)
                return
            L1e:
                com.tencent.bugly.proguard.w r1 = r0.a
                int r2 = r0.p
                java.lang.String r3 = r0.f17q
                byte[] r4 = r0.r
                com.tencent.bugly.proguard.v r5 = r0.c
                com.tencent.bugly.proguard.w.a(r1, r2, r3, r4, r5)
                return
            L2c:
                com.tencent.bugly.proguard.w r6 = r0.a
                boolean r7 = r0.f
                java.lang.String r8 = r0.d
                java.lang.String[] r9 = r0.g
                java.lang.String r10 = r0.h
                java.lang.String[] r11 = r0.i
                java.lang.String r12 = r0.j
                java.lang.String r13 = r0.k
                java.lang.String r14 = r0.l
                java.lang.String r15 = r0.m
                com.tencent.bugly.proguard.v r1 = r0.c
                r16 = r1
                android.database.Cursor r1 = com.tencent.bugly.proguard.w.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                if (r1 == 0) goto L4d
                r1.close()
            L4d:
                return
            L4e:
                com.tencent.bugly.proguard.w r1 = r0.a
                java.lang.String r2 = r0.d
                java.lang.String r3 = r0.n
                java.lang.String[] r4 = r0.o
                com.tencent.bugly.proguard.v r5 = r0.c
                com.tencent.bugly.proguard.w.a(r1, r2, r3, r4, r5)
                return
            L5c:
                com.tencent.bugly.proguard.w r1 = r0.a
                java.lang.String r2 = r0.d
                android.content.ContentValues r3 = r0.e
                com.tencent.bugly.proguard.v r4 = r0.c
                com.tencent.bugly.proguard.w.a(r1, r2, r3, r4)
                return
        }
    }

    static {
            return
    }

    private w(android.content.Context r2, java.util.List<com.tencent.bugly.proguard.o> r3) {
            r1 = this;
            r1.<init>()
            com.tencent.bugly.proguard.x r0 = new com.tencent.bugly.proguard.x
            r0.<init>(r2, r3)
            com.tencent.bugly.proguard.w.c = r0
            return
    }

    static /* synthetic */ int a(com.tencent.bugly.proguard.w r0, java.lang.String r1, java.lang.String r2, java.lang.String[] r3, com.tencent.bugly.proguard.v r4) {
            int r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    private synchronized int a(java.lang.String r3, java.lang.String r4, java.lang.String[] r5, com.tencent.bugly.proguard.v r6) {
            r2 = this;
            monitor-enter(r2)
            r6 = 0
            r0 = 0
            com.tencent.bugly.proguard.x r1 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L10
            android.database.sqlite.SQLiteDatabase r0 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            int r6 = r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r3 = move-exception
            goto L1e
        L12:
            boolean r3 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L28
            if (r0 == 0) goto L28
        L18:
            r0.close()     // Catch: java.lang.Throwable -> L1c
            goto L28
        L1c:
            r3 = move-exception
            goto L35
        L1e:
            com.tencent.bugly.proguard.al.a(r3)     // Catch: java.lang.Throwable -> L2a
            boolean r3 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L28
            if (r0 == 0) goto L28
            goto L18
        L28:
            monitor-exit(r2)
            return r6
        L2a:
            r3 = move-exception
            boolean r4 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L34
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.lang.Throwable -> L1c
        L34:
            throw r3     // Catch: java.lang.Throwable -> L1c
        L35:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    static /* synthetic */ long a(com.tencent.bugly.proguard.w r0, java.lang.String r1, android.content.ContentValues r2, com.tencent.bugly.proguard.v r3) {
            long r0 = r0.a(r1, r2, r3)
            return r0
    }

    static /* synthetic */ android.database.Cursor a(com.tencent.bugly.proguard.w r0, boolean r1, java.lang.String r2, java.lang.String[] r3, java.lang.String r4, java.lang.String[] r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, com.tencent.bugly.proguard.v r10) {
            android.database.Cursor r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    private synchronized android.database.Cursor a(boolean r13, java.lang.String r14, java.lang.String[] r15, java.lang.String r16, java.lang.String[] r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.tencent.bugly.proguard.v r22) {
            r12 = this;
            monitor-enter(r12)
            r1 = 0
            com.tencent.bugly.proguard.x r0 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L1e
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L23
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1e
            goto L23
        L1e:
            r0 = move-exception
            r13 = r0
            com.tencent.bugly.proguard.al.a(r13)     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r12)
            return r1
        L25:
            r0 = move-exception
            r13 = r0
            throw r13     // Catch: java.lang.Throwable -> L28
        L28:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L28
            throw r13
    }

    public static synchronized com.tencent.bugly.proguard.w a() {
            java.lang.Class<com.tencent.bugly.proguard.w> r0 = com.tencent.bugly.proguard.w.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.w r1 = com.tencent.bugly.proguard.w.b     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static synchronized com.tencent.bugly.proguard.w a(android.content.Context r2, java.util.List<com.tencent.bugly.proguard.o> r3) {
            java.lang.Class<com.tencent.bugly.proguard.w> r0 = com.tencent.bugly.proguard.w.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.w r1 = com.tencent.bugly.proguard.w.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.bugly.proguard.w r1 = new com.tencent.bugly.proguard.w     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.w.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.tencent.bugly.proguard.w r2 = com.tencent.bugly.proguard.w.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    private static com.tencent.bugly.proguard.y a(android.database.Cursor r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.tencent.bugly.proguard.y r1 = new com.tencent.bugly.proguard.y     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "_id"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L52
            long r2 = r4.getLong(r2)     // Catch: java.lang.Throwable -> L52
            r1.a = r2     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "_tp"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L52
            int r2 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L52
            r1.b = r2     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "_pc"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r4.getString(r2)     // Catch: java.lang.Throwable -> L52
            r1.c = r2     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "_th"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = r4.getString(r2)     // Catch: java.lang.Throwable -> L52
            r1.d = r2     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "_tm"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L52
            long r2 = r4.getLong(r2)     // Catch: java.lang.Throwable -> L52
            r1.e = r2     // Catch: java.lang.Throwable -> L52
            java.lang.String r2 = "_dt"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L52
            byte[] r4 = r4.getBlob(r2)     // Catch: java.lang.Throwable -> L52
            r1.g = r4     // Catch: java.lang.Throwable -> L52
            return r1
        L52:
            r4 = move-exception
            com.tencent.bugly.proguard.al.a(r4)
            return r0
    }

    static /* synthetic */ java.util.Map a(com.tencent.bugly.proguard.w r0, int r1, com.tencent.bugly.proguard.v r2) {
            java.util.Map r0 = r0.a(r1, r2)
            return r0
    }

    private synchronized boolean a(int r5, java.lang.String r6, com.tencent.bugly.proguard.v r7) {
            r4 = this;
            monitor-enter(r4)
            r7 = 0
            r0 = 0
            com.tencent.bugly.proguard.x r1 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L62
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L56
            boolean r2 = com.tencent.bugly.proguard.ap.b(r6)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1f
            java.lang.String r6 = "_id = "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r6.concat(r5)     // Catch: java.lang.Throwable -> L1c
            goto L3a
        L1c:
            r5 = move-exception
            r0 = r1
            goto L63
        L1f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "_id = "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            r2.append(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = " and _tp = \""
            r2.append(r5)     // Catch: java.lang.Throwable -> L1c
            r2.append(r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = "\""
            r2.append(r5)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L1c
        L3a:
            java.lang.String r6 = "t_pf"
            int r5 = r1.delete(r6, r5, r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = "[Database] deleted %s data %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "t_pf"
            r2[r7] = r3     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            r2[r3] = r0     // Catch: java.lang.Throwable -> L1c
            com.tencent.bugly.proguard.al.c(r6, r2)     // Catch: java.lang.Throwable -> L1c
            if (r5 <= 0) goto L56
            r7 = 1
        L56:
            boolean r5 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6f
            if (r1 == 0) goto L6f
            r1.close()     // Catch: java.lang.Throwable -> L60
            goto L6f
        L60:
            r5 = move-exception
            goto L7c
        L62:
            r5 = move-exception
        L63:
            com.tencent.bugly.proguard.al.a(r5)     // Catch: java.lang.Throwable -> L71
            boolean r5 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L60
            if (r5 == 0) goto L6f
            if (r0 == 0) goto L6f
            r0.close()     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r4)
            return r7
        L71:
            r5 = move-exception
            boolean r6 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L7b
            if (r0 == 0) goto L7b
            r0.close()     // Catch: java.lang.Throwable -> L60
        L7b:
            throw r5     // Catch: java.lang.Throwable -> L60
        L7c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L60
            throw r5
    }

    private boolean a(int r3, java.lang.String r4, byte[] r5, com.tencent.bugly.proguard.v r6) {
            r2 = this;
            com.tencent.bugly.proguard.y r6 = new com.tencent.bugly.proguard.y     // Catch: java.lang.Throwable -> L17
            r6.<init>()     // Catch: java.lang.Throwable -> L17
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L17
            r6.a = r0     // Catch: java.lang.Throwable -> L17
            r6.f = r4     // Catch: java.lang.Throwable -> L17
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L17
            r6.e = r3     // Catch: java.lang.Throwable -> L17
            r6.g = r5     // Catch: java.lang.Throwable -> L17
            boolean r3 = r2.b(r6)     // Catch: java.lang.Throwable -> L17
            return r3
        L17:
            r3 = move-exception
            com.tencent.bugly.proguard.al.a(r3)
            r3 = 0
            return r3
    }

    static /* synthetic */ boolean a(com.tencent.bugly.proguard.w r0, int r1, java.lang.String r2, com.tencent.bugly.proguard.v r3) {
            boolean r0 = r0.a(r1, r2, r3)
            return r0
    }

    static /* synthetic */ boolean a(com.tencent.bugly.proguard.w r0, int r1, java.lang.String r2, byte[] r3, com.tencent.bugly.proguard.v r4) {
            boolean r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    private static com.tencent.bugly.proguard.y b(android.database.Cursor r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.tencent.bugly.proguard.y r1 = new com.tencent.bugly.proguard.y     // Catch: java.lang.Throwable -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "_id"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L3a
            long r2 = r4.getLong(r2)     // Catch: java.lang.Throwable -> L3a
            r1.a = r2     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "_tm"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L3a
            long r2 = r4.getLong(r2)     // Catch: java.lang.Throwable -> L3a
            r1.e = r2     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "_tp"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r4.getString(r2)     // Catch: java.lang.Throwable -> L3a
            r1.f = r2     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "_dt"
            int r2 = r4.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L3a
            byte[] r4 = r4.getBlob(r2)     // Catch: java.lang.Throwable -> L3a
            r1.g = r4     // Catch: java.lang.Throwable -> L3a
            return r1
        L3a:
            r4 = move-exception
            com.tencent.bugly.proguard.al.a(r4)
            return r0
    }

    private synchronized boolean b(com.tencent.bugly.proguard.y r9) {
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            r1 = 0
            com.tencent.bugly.proguard.x r2 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L39
            android.database.sqlite.SQLiteDatabase r1 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L44
            android.content.ContentValues r2 = d(r9)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L44
            java.lang.String r3 = "t_pf"
            java.lang.String r4 = "_id"
            long r2 = r1.replace(r3, r4, r2)     // Catch: java.lang.Throwable -> L39
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L3b
            java.lang.String r4 = "[Database] insert %s success."
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = "t_pf"
            r6[r0] = r7     // Catch: java.lang.Throwable -> L39
            com.tencent.bugly.proguard.al.c(r4, r6)     // Catch: java.lang.Throwable -> L39
            r9.a = r2     // Catch: java.lang.Throwable -> L39
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L37
            r1.close()     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r9 = move-exception
            goto L68
        L37:
            monitor-exit(r8)
            return r5
        L39:
            r9 = move-exception
            goto L4f
        L3b:
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L42
            r1.close()     // Catch: java.lang.Throwable -> L35
        L42:
            monitor-exit(r8)
            return r0
        L44:
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L4d
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L35
        L4d:
            monitor-exit(r8)
            return r0
        L4f:
            com.tencent.bugly.proguard.al.a(r9)     // Catch: java.lang.Throwable -> L5d
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L5b
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Throwable -> L35
        L5b:
            monitor-exit(r8)
            return r0
        L5d:
            r9 = move-exception
            boolean r0 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L67
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.lang.Throwable -> L35
        L67:
            throw r9     // Catch: java.lang.Throwable -> L35
        L68:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            throw r9
    }

    private static android.content.ContentValues c(com.tencent.bugly.proguard.y r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            long r2 = r7.a     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L1d
            java.lang.String r4 = "_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L1b
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r7 = move-exception
            goto L4b
        L1d:
            java.lang.String r2 = "_tp"
            int r3 = r7.b     // Catch: java.lang.Throwable -> L1b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "_pc"
            java.lang.String r3 = r7.c     // Catch: java.lang.Throwable -> L1b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "_th"
            java.lang.String r3 = r7.d     // Catch: java.lang.Throwable -> L1b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "_tm"
            long r3 = r7.e     // Catch: java.lang.Throwable -> L1b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L1b
            byte[] r7 = r7.g     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L4a
            java.lang.String r2 = "_dt"
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> L1b
        L4a:
            return r1
        L4b:
            com.tencent.bugly.proguard.al.a(r7)
            return r0
    }

    private synchronized java.util.List<com.tencent.bugly.proguard.y> c(int r11) {
            r10 = this;
            monitor-enter(r10)
            r1 = 0
            com.tencent.bugly.proguard.x r0 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> Lb0
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto La9
            java.lang.String r0 = "_id = "
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = r0.concat(r3)     // Catch: java.lang.Throwable -> La5
            java.lang.String r3 = "t_pf"
            r8 = 0
            r9 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La5
            if (r3 != 0) goto L34
            if (r3 == 0) goto L2b
            r3.close()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r0 = move-exception
            r11 = r0
            goto Ld8
        L2b:
            boolean r11 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto L32
            r2.close()     // Catch: java.lang.Throwable -> L27
        L32:
            monitor-exit(r10)
            return r1
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r0.<init>()     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
        L3e:
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L4f
            r7 = 0
            if (r6 == 0) goto L6d
            com.tencent.bugly.proguard.y r6 = b(r3)     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L52
            r4.add(r6)     // Catch: java.lang.Throwable -> L4f
            goto L3e
        L4f:
            r0 = move-exception
            r11 = r0
            goto Lb4
        L52:
            java.lang.String r6 = "_tp"
            int r6 = r3.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = r3.getString(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = " or _tp = "
            r0.append(r8)     // Catch: java.lang.Throwable -> L65
            r0.append(r6)     // Catch: java.lang.Throwable -> L65
            goto L3e
        L65:
            java.lang.String r6 = "[Database] unknown id."
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L4f
            com.tencent.bugly.proguard.al.d(r6, r7)     // Catch: java.lang.Throwable -> L4f
            goto L3e
        L6d:
            int r6 = r0.length()     // Catch: java.lang.Throwable -> L4f
            if (r6 <= 0) goto L99
            java.lang.String r6 = " and _id = "
            r0.append(r6)     // Catch: java.lang.Throwable -> L4f
            r0.append(r11)     // Catch: java.lang.Throwable -> L4f
            r11 = 4
            java.lang.String r11 = r5.substring(r11)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "t_pf"
            int r11 = r2.delete(r0, r11, r1)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "[Database] deleted %s illegal data %d."
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L4f
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "t_pf"
            r5[r7] = r6     // Catch: java.lang.Throwable -> L4f
            r6 = 1
            r5[r6] = r11     // Catch: java.lang.Throwable -> L4f
            com.tencent.bugly.proguard.al.d(r0, r5)     // Catch: java.lang.Throwable -> L4f
        L99:
            r3.close()     // Catch: java.lang.Throwable -> L27
            boolean r11 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto La3
            r2.close()     // Catch: java.lang.Throwable -> L27
        La3:
            monitor-exit(r10)
            return r4
        La5:
            r0 = move-exception
            r11 = r0
            r3 = r1
            goto Lb4
        La9:
            boolean r11 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto Lc5
            if (r2 == 0) goto Lc5
            goto Lc2
        Lb0:
            r0 = move-exception
            r11 = r0
            r2 = r1
            r3 = r2
        Lb4:
            com.tencent.bugly.proguard.al.a(r11)     // Catch: java.lang.Throwable -> Lc7
            if (r3 == 0) goto Lbc
            r3.close()     // Catch: java.lang.Throwable -> L27
        Lbc:
            boolean r11 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L27
            if (r11 == 0) goto Lc5
            if (r2 == 0) goto Lc5
        Lc2:
            r2.close()     // Catch: java.lang.Throwable -> L27
        Lc5:
            monitor-exit(r10)
            return r1
        Lc7:
            r0 = move-exception
            r11 = r0
            if (r3 == 0) goto Lce
            r3.close()     // Catch: java.lang.Throwable -> L27
        Lce:
            boolean r0 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto Ld7
            if (r2 == 0) goto Ld7
            r2.close()     // Catch: java.lang.Throwable -> L27
        Ld7:
            throw r11     // Catch: java.lang.Throwable -> L27
        Ld8:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L27
            throw r11
    }

    private static android.content.ContentValues d(com.tencent.bugly.proguard.y r7) {
            r0 = 0
            if (r7 == 0) goto L44
            java.lang.String r1 = r7.f
            boolean r1 = com.tencent.bugly.proguard.ap.b(r1)
            if (r1 == 0) goto Lc
            goto L44
        Lc:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            long r2 = r7.a     // Catch: java.lang.Throwable -> L23
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L25
            java.lang.String r4 = "_id"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L23
            r1.put(r4, r2)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r7 = move-exception
            goto L41
        L25:
            java.lang.String r2 = "_tp"
            java.lang.String r3 = r7.f     // Catch: java.lang.Throwable -> L23
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "_tm"
            long r3 = r7.e     // Catch: java.lang.Throwable -> L23
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L23
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L23
            byte[] r7 = r7.g     // Catch: java.lang.Throwable -> L23
            if (r7 == 0) goto L40
            java.lang.String r2 = "_dt"
            r1.put(r2, r7)     // Catch: java.lang.Throwable -> L23
        L40:
            return r1
        L41:
            com.tencent.bugly.proguard.al.a(r7)
        L44:
            return r0
    }

    public final int a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            int r2 = r1.a(r2, r3, r0, r0)
            return r2
    }

    public final synchronized long a(java.lang.String r9, android.content.ContentValues r10, com.tencent.bugly.proguard.v r11) {
            r8 = this;
            monitor-enter(r8)
            r0 = -1
            r11 = 0
            com.tencent.bugly.proguard.x r2 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L26
            android.database.sqlite.SQLiteDatabase r11 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L26
            if (r11 == 0) goto L32
            if (r10 == 0) goto L32
            java.lang.String r2 = "_id"
            long r2 = r11.replace(r9, r2, r10)     // Catch: java.lang.Throwable -> L26
            r4 = 0
            r10 = 0
            r6 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L28
            java.lang.String r4 = "[Database] insert %s success."
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L26
            r5[r10] = r9     // Catch: java.lang.Throwable -> L26
            com.tencent.bugly.proguard.al.c(r4, r5)     // Catch: java.lang.Throwable -> L26
            goto L31
        L26:
            r9 = move-exception
            goto L3e
        L28:
            java.lang.String r4 = "[Database] replace %s error."
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L26
            r5[r10] = r9     // Catch: java.lang.Throwable -> L26
            com.tencent.bugly.proguard.al.d(r4, r5)     // Catch: java.lang.Throwable -> L26
        L31:
            r0 = r2
        L32:
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L48
            if (r11 == 0) goto L48
        L38:
            r11.close()     // Catch: java.lang.Throwable -> L3c
            goto L48
        L3c:
            r9 = move-exception
            goto L55
        L3e:
            com.tencent.bugly.proguard.al.a(r9)     // Catch: java.lang.Throwable -> L4a
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L48
            if (r11 == 0) goto L48
            goto L38
        L48:
            monitor-exit(r8)
            return r0
        L4a:
            r9 = move-exception
            boolean r10 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L54
            if (r11 == 0) goto L54
            r11.close()     // Catch: java.lang.Throwable -> L3c
        L54:
            throw r9     // Catch: java.lang.Throwable -> L3c
        L55:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3c
            throw r9
    }

    public final android.database.Cursor a(java.lang.String r7, java.lang.String[] r8, java.lang.String r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            android.database.Cursor r7 = r0.a(r1, r2, r3, r4, r5)
            return r7
    }

    public final android.database.Cursor a(java.lang.String r12, java.lang.String[] r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r11 = this;
            r7 = 0
            r10 = 0
            r1 = 0
            r5 = 0
            r6 = 0
            r0 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r8 = r15
            r9 = r16
            android.database.Cursor r12 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public final synchronized java.util.List<com.tencent.bugly.proguard.y> a(int r11) {
            r10 = this;
            monitor-enter(r10)
            com.tencent.bugly.proguard.x r0 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L31
            android.database.sqlite.SQLiteDatabase r1 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L31
            r9 = 0
            if (r1 == 0) goto Lcb
            if (r11 < 0) goto L1d
            java.lang.String r0 = "_tp = "
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L18
            java.lang.String r11 = r0.concat(r11)     // Catch: java.lang.Throwable -> L18
            r4 = r11
            goto L1e
        L18:
            r0 = move-exception
            r11 = r0
            r2 = r9
            goto Lac
        L1d:
            r4 = r9
        L1e:
            java.lang.String r2 = "t_lr"
            r7 = 0
            r8 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L18
            if (r11 != 0) goto L3e
            if (r11 == 0) goto L35
            r11.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            r11 = r0
            goto Lcd
        L35:
            boolean r11 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto L3c
            r1.close()     // Catch: java.lang.Throwable -> L31
        L3c:
            monitor-exit(r10)
            return r9
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r0.<init>()     // Catch: java.lang.Throwable -> L59
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
        L48:
            boolean r3 = r11.moveToNext()     // Catch: java.lang.Throwable -> L59
            r4 = 0
            if (r3 == 0) goto L78
            com.tencent.bugly.proguard.y r3 = a(r11)     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L5d
            r2.add(r3)     // Catch: java.lang.Throwable -> L59
            goto L48
        L59:
            r0 = move-exception
            r2 = r11
            r11 = r0
            goto Lac
        L5d:
            java.lang.String r3 = "_id"
            int r3 = r11.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L70
            long r5 = r11.getLong(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = " or _id = "
            r0.append(r3)     // Catch: java.lang.Throwable -> L70
            r0.append(r5)     // Catch: java.lang.Throwable -> L70
            goto L48
        L70:
            java.lang.String r3 = "[Database] unknown id."
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L59
            com.tencent.bugly.proguard.al.d(r3, r4)     // Catch: java.lang.Throwable -> L59
            goto L48
        L78:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L59
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L59
            if (r3 <= 0) goto La0
            r3 = 4
            java.lang.String r0 = r0.substring(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "t_lr"
            int r0 = r1.delete(r3, r0, r9)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "[Database] deleted %s illegal data %d"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = "t_lr"
            r5[r4] = r6     // Catch: java.lang.Throwable -> L59
            r4 = 1
            r5[r4] = r0     // Catch: java.lang.Throwable -> L59
            com.tencent.bugly.proguard.al.d(r3, r5)     // Catch: java.lang.Throwable -> L59
        La0:
            r11.close()     // Catch: java.lang.Throwable -> L31
            boolean r11 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto Laa
            r1.close()     // Catch: java.lang.Throwable -> L31
        Laa:
            monitor-exit(r10)
            return r2
        Lac:
            com.tencent.bugly.proguard.al.a(r11)     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto Lb4
            r2.close()     // Catch: java.lang.Throwable -> L31
        Lb4:
            boolean r11 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L31
            if (r11 == 0) goto Lcb
            r1.close()     // Catch: java.lang.Throwable -> L31
            goto Lcb
        Lbc:
            r0 = move-exception
            r11 = r0
            if (r2 == 0) goto Lc3
            r2.close()     // Catch: java.lang.Throwable -> L31
        Lc3:
            boolean r0 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto Lca
            r1.close()     // Catch: java.lang.Throwable -> L31
        Lca:
            throw r11     // Catch: java.lang.Throwable -> L31
        Lcb:
            monitor-exit(r10)
            return r9
        Lcd:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L31
            throw r11
    }

    public final java.util.Map<java.lang.String, byte[]> a(int r3, com.tencent.bugly.proguard.v r4) {
            r2 = this;
            r4 = 0
            java.util.List r3 = r2.c(r3)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2b
            r0.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L26
        L10:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L29
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L26
            com.tencent.bugly.proguard.y r4 = (com.tencent.bugly.proguard.y) r4     // Catch: java.lang.Throwable -> L26
            byte[] r1 = r4.g     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L10
            java.lang.String r4 = r4.f     // Catch: java.lang.Throwable -> L26
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L26
            goto L10
        L26:
            r3 = move-exception
            r4 = r0
            goto L2e
        L29:
            r4 = r0
            goto L2d
        L2b:
            r3 = move-exception
            goto L2e
        L2d:
            return r4
        L2e:
            com.tencent.bugly.proguard.al.a(r3)
            return r4
    }

    public final synchronized void a(java.util.List<com.tencent.bugly.proguard.y> r6) {
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L85
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto Lb
            goto L85
        Lb:
            com.tencent.bugly.proguard.x r0 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L33
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L33
        L1c:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L33
            com.tencent.bugly.proguard.y r2 = (com.tencent.bugly.proguard.y) r2     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = " or _id = "
            r1.append(r3)     // Catch: java.lang.Throwable -> L33
            long r2 = r2.a     // Catch: java.lang.Throwable -> L33
            r1.append(r2)     // Catch: java.lang.Throwable -> L33
            goto L1c
        L33:
            r6 = move-exception
            goto L83
        L35:
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L33
            int r2 = r6.length()     // Catch: java.lang.Throwable -> L33
            if (r2 <= 0) goto L44
            r2 = 4
            java.lang.String r6 = r6.substring(r2)     // Catch: java.lang.Throwable -> L33
        L44:
            r2 = 0
            r1.setLength(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "t_lr"
            r3 = 0
            int r6 = r0.delete(r1, r6, r3)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = "[Database] deleted %s data %d"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6b
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "t_lr"
            r3[r2] = r4     // Catch: java.lang.Throwable -> L6b
            r2 = 1
            r3[r2] = r6     // Catch: java.lang.Throwable -> L6b
            com.tencent.bugly.proguard.al.c(r1, r3)     // Catch: java.lang.Throwable -> L6b
            boolean r6 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L81
            r0.close()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
            return
        L6b:
            r6 = move-exception
            com.tencent.bugly.proguard.al.a(r6)     // Catch: java.lang.Throwable -> L78
            boolean r6 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L33
            if (r6 == 0) goto L81
            r0.close()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)
            return
        L78:
            r6 = move-exception
            boolean r1 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L80
            r0.close()     // Catch: java.lang.Throwable -> L33
        L80:
            throw r6     // Catch: java.lang.Throwable -> L33
        L81:
            monitor-exit(r5)
            return
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6
        L85:
            monitor-exit(r5)
            return
    }

    public final boolean a(int r1, java.lang.String r2, byte[] r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto L13
            com.tencent.bugly.proguard.w$a r4 = new com.tencent.bugly.proguard.w$a
            r4.<init>(r0)
            r4.a(r1, r2, r3)
            com.tencent.bugly.proguard.ak r1 = com.tencent.bugly.proguard.ak.a()
            r1.a(r4)
            r1 = 1
            return r1
        L13:
            r4 = 0
            boolean r1 = r0.a(r1, r2, r3, r4)
            return r1
    }

    public final synchronized boolean a(com.tencent.bugly.proguard.y r9) {
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            r1 = 0
            com.tencent.bugly.proguard.x r2 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L39
            android.database.sqlite.SQLiteDatabase r1 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L44
            android.content.ContentValues r2 = c(r9)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L44
            java.lang.String r3 = "t_lr"
            java.lang.String r4 = "_id"
            long r2 = r1.replace(r3, r4, r2)     // Catch: java.lang.Throwable -> L39
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L3b
            java.lang.String r4 = "[Database] insert %s success."
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L39
            java.lang.String r7 = "t_lr"
            r6[r0] = r7     // Catch: java.lang.Throwable -> L39
            com.tencent.bugly.proguard.al.c(r4, r6)     // Catch: java.lang.Throwable -> L39
            r9.a = r2     // Catch: java.lang.Throwable -> L39
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L37
            r1.close()     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r9 = move-exception
            goto L68
        L37:
            monitor-exit(r8)
            return r5
        L39:
            r9 = move-exception
            goto L4f
        L3b:
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L42
            r1.close()     // Catch: java.lang.Throwable -> L35
        L42:
            monitor-exit(r8)
            return r0
        L44:
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L4d
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L35
        L4d:
            monitor-exit(r8)
            return r0
        L4f:
            com.tencent.bugly.proguard.al.a(r9)     // Catch: java.lang.Throwable -> L5d
            boolean r9 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto L5b
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Throwable -> L35
        L5b:
            monitor-exit(r8)
            return r0
        L5d:
            r9 = move-exception
            boolean r0 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L67
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.lang.Throwable -> L35
        L67:
            throw r9     // Catch: java.lang.Throwable -> L35
        L68:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L35
            throw r9
    }

    public final synchronized void b(int r6) {
            r5 = this;
            monitor-enter(r5)
            com.tencent.bugly.proguard.x r0 = com.tencent.bugly.proguard.w.c     // Catch: java.lang.Throwable -> L3d
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L54
            r1 = 0
            if (r6 < 0) goto L19
            java.lang.String r2 = "_tp = "
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L17
            java.lang.String r6 = r2.concat(r6)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r6 = move-exception
            goto L3f
        L19:
            r6 = r1
        L1a:
            java.lang.String r2 = "t_lr"
            int r6 = r0.delete(r2, r6, r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "[Database] deleted %s data %d"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L17
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = "t_lr"
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L17
            r3 = 1
            r2[r3] = r6     // Catch: java.lang.Throwable -> L17
            com.tencent.bugly.proguard.al.c(r1, r2)     // Catch: java.lang.Throwable -> L17
            boolean r6 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L54
            r0.close()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return
        L3d:
            r6 = move-exception
            goto L56
        L3f:
            com.tencent.bugly.proguard.al.a(r6)     // Catch: java.lang.Throwable -> L4b
            boolean r6 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L3d
            if (r6 == 0) goto L54
            r0.close()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r5)
            return
        L4b:
            r6 = move-exception
            boolean r1 = com.tencent.bugly.proguard.w.a     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L53
            r0.close()     // Catch: java.lang.Throwable -> L3d
        L53:
            throw r6     // Catch: java.lang.Throwable -> L3d
        L54:
            monitor-exit(r5)
            return
        L56:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3d
            throw r6
    }
}
