package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ai {
    private static com.tencent.bugly.proguard.ai b;
    public com.tencent.bugly.proguard.ah a;
    private final com.tencent.bugly.proguard.w c;
    private final android.content.Context d;
    private java.util.Map<java.lang.Integer, java.lang.Long> e;
    private long f;
    private long g;
    private java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> h;
    private java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> i;
    private final java.lang.Object j;
    private long k;
    private int l;



    static {
            return
    }

    private ai(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.e = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r2.h = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            r2.i = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.j = r0
            r0 = 0
            r2.k = r0
            r0 = 0
            r2.l = r0
            r2.d = r3
            com.tencent.bugly.proguard.w r3 = com.tencent.bugly.proguard.w.a()
            r2.c = r3
            return
    }

    public static synchronized com.tencent.bugly.proguard.ai a() {
            java.lang.Class<com.tencent.bugly.proguard.ai> r0 = com.tencent.bugly.proguard.ai.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.ai r1 = com.tencent.bugly.proguard.ai.b     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public static synchronized com.tencent.bugly.proguard.ai a(android.content.Context r2) {
            java.lang.Class<com.tencent.bugly.proguard.ai> r0 = com.tencent.bugly.proguard.ai.class
            monitor-enter(r0)
            com.tencent.bugly.proguard.ai r1 = com.tencent.bugly.proguard.ai.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.tencent.bugly.proguard.ai r1 = new com.tencent.bugly.proguard.ai     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lf
            com.tencent.bugly.proguard.ai.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L15
        L11:
            com.tencent.bugly.proguard.ai r2 = com.tencent.bugly.proguard.ai.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    static /* synthetic */ java.lang.Object a(com.tencent.bugly.proguard.ai r0) {
            java.lang.Object r0 = r0.j
            return r0
    }

    private void a(int r12, int r13, byte[] r14, java.lang.String r15, java.lang.String r16, com.tencent.bugly.proguard.ah r17, boolean r18) {
            r11 = this;
            com.tencent.bugly.proguard.aj r0 = new com.tencent.bugly.proguard.aj     // Catch: java.lang.Throwable -> L1f
            android.content.Context r1 = r11.d     // Catch: java.lang.Throwable -> L1f
            r9 = 0
            r10 = 0
            r8 = 0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L1f
            r13 = r0
            r15 = 0
            r0 = 0
            r12 = r11
            r14 = r18
            r16 = r0
            r12.a(r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r0 = move-exception
            r12 = r0
            com.tencent.bugly.proguard.al.a(r12)
            return
    }

    private void a(int r10, java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r11) {
            r9 = this;
            com.tencent.bugly.proguard.ak r0 = com.tencent.bugly.proguard.ak.a()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r10 <= 0) goto L2b
            java.lang.String r4 = "[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            int r6 = android.os.Process.myPid()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = android.os.Process.myTid()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r5
            r8[r3] = r6
            r8[r1] = r7
            com.tencent.bugly.proguard.al.c(r4, r8)
        L2b:
            r4 = 0
        L2c:
            if (r4 >= r10) goto L7b
            java.lang.Object r5 = r11.poll()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            if (r5 == 0) goto L7b
            java.lang.Object r6 = r9.j
            monitor-enter(r6)
            int r7 = r9.l     // Catch: java.lang.Throwable -> L44
            if (r7 < r1) goto L46
            if (r0 == 0) goto L46
            r0.a(r5)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L44
            goto L76
        L44:
            r10 = move-exception
            goto L79
        L46:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "[UploadManager] Create and start a new thread to execute a upload task: %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r8 = "BUGLY_ASYNC_UPLOAD"
            r7[r2] = r8
            com.tencent.bugly.proguard.al.a(r6, r7)
            com.tencent.bugly.proguard.ai$1 r6 = new com.tencent.bugly.proguard.ai$1
            r6.<init>(r9, r5)
            java.lang.String r7 = "BUGLY_ASYNC_UPLOAD"
            java.lang.Thread r6 = com.tencent.bugly.proguard.ap.a(r6, r7)
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r9.j
            monitor-enter(r6)
            int r5 = r9.l     // Catch: java.lang.Throwable -> L69
            int r5 = r5 + r3
            r9.l = r5     // Catch: java.lang.Throwable -> L69
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            goto L76
        L69:
            r10 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            throw r10
        L6c:
            java.lang.String r6 = "[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time."
            java.lang.Object[] r7 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.al.d(r6, r7)
            r9.a(r5, r3)
        L76:
            int r4 = r4 + 1
            goto L2c
        L79:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L44
            throw r10
        L7b:
            return
    }

    private void a(java.lang.Runnable r5, long r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto Lb
            java.lang.String r5 = "[UploadManager] Upload task should not be null"
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.d(r5, r6)
            return
        Lb:
            int r1 = android.os.Process.myPid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = android.os.Process.myTid()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r1
            r1 = 1
            r3[r1] = r2
            java.lang.String r2 = "[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)"
            com.tencent.bugly.proguard.al.c(r2, r3)
            java.lang.String r2 = "BUGLY_SYNC_UPLOAD"
            java.lang.Thread r2 = com.tencent.bugly.proguard.ap.a(r5, r2)
            if (r2 != 0) goto L3b
            java.lang.String r6 = "[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue."
            java.lang.Object[] r7 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.e(r6, r7)
            r4.a(r5, r1)
            return
        L3b:
            r2.join(r6)     // Catch: java.lang.Throwable -> L3f
            return
        L3f:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r6
            java.lang.String r6 = "[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue."
            com.tencent.bugly.proguard.al.e(r6, r7)
            r4.a(r5, r1)
            r4.b()
            return
    }

    private void a(java.lang.Runnable r5, boolean r6, boolean r7, long r8) {
            r4 = this;
            int r0 = android.os.Process.myPid()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = android.os.Process.myTid()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "[UploadManager] Add upload task (pid=%d | tid=%d)"
            com.tencent.bugly.proguard.al.c(r0, r2)
            if (r7 == 0) goto L24
            r4.a(r5, r8)
            return
        L24:
            r4.a(r5, r6)
            r4.b()
            return
    }

    private static void a(java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r4, java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r5, int r6) {
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r6) goto L25
            java.lang.Object r2 = r4.peek()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L25
            r5.put(r2)     // Catch: java.lang.Throwable -> L13
            r4.poll()     // Catch: java.lang.Throwable -> L13
            goto L22
        L13:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            java.lang.String r2 = "[UploadManager] Failed to add upload task to temp urgent queue: %s"
            com.tencent.bugly.proguard.al.e(r2, r3)
        L22:
            int r1 = r1 + 1
            goto L2
        L25:
            return
    }

    private boolean a(java.lang.Runnable r7, boolean r8) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            java.lang.String r7 = "[UploadManager] Upload task should not be null"
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.a(r7, r8)
            return r0
        Lb:
            r1 = 1
            java.lang.String r2 = "[UploadManager] Add upload task to queue (pid=%d | tid=%d)"
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L3e
            int r4 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L3e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L3e
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L3e
            r5[r0] = r3     // Catch: java.lang.Throwable -> L3e
            r5[r1] = r4     // Catch: java.lang.Throwable -> L3e
            com.tencent.bugly.proguard.al.c(r2, r5)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r6.j     // Catch: java.lang.Throwable -> L3e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L35
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r8 = r6.h     // Catch: java.lang.Throwable -> L33
            r8.put(r7)     // Catch: java.lang.Throwable -> L33
            goto L3a
        L33:
            r7 = move-exception
            goto L3c
        L35:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r8 = r6.i     // Catch: java.lang.Throwable -> L33
            r8.put(r7)     // Catch: java.lang.Throwable -> L33
        L3a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            return r1
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
            throw r7     // Catch: java.lang.Throwable -> L3e
        L3e:
            r7 = move-exception
            java.lang.String r8 = "[UploadManager] Failed to add upload task to queue: %s"
            java.lang.String r7 = r7.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            com.tencent.bugly.proguard.al.e(r8, r1)
            return r0
    }

    static /* synthetic */ int b(com.tencent.bugly.proguard.ai r1) {
            int r0 = r1.l
            int r0 = r0 + (-1)
            r1.l = r0
            return r0
    }

    private void b() {
            r10 = this;
            com.tencent.bugly.proguard.ak r0 = com.tencent.bugly.proguard.ak.a()
            java.util.concurrent.LinkedBlockingQueue r1 = new java.util.concurrent.LinkedBlockingQueue
            r1.<init>()
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            java.lang.Object r3 = r10.j
            monitor-enter(r3)
            java.lang.String r4 = "[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)"
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L48
            int r6 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L48
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L48
            r9 = 0
            r8[r9] = r5     // Catch: java.lang.Throwable -> L48
            r5 = 1
            r8[r5] = r6     // Catch: java.lang.Throwable -> L48
            com.tencent.bugly.proguard.al.c(r4, r8)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r4 = r10.h     // Catch: java.lang.Throwable -> L48
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r6 = r10.i     // Catch: java.lang.Throwable -> L48
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L4a
            if (r6 != 0) goto L4a
            java.lang.String r0 = "[UploadManager] There is no upload task in queue."
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L48
            com.tencent.bugly.proguard.al.c(r0, r1)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r0 = move-exception
            goto L94
        L4a:
            if (r0 == 0) goto L52
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L53
        L52:
            r6 = 0
        L53:
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r0 = r10.h     // Catch: java.lang.Throwable -> L48
            a(r0, r1, r4)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> r0 = r10.i     // Catch: java.lang.Throwable -> L48
            a(r0, r2, r6)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            r10.a(r4, r1)
            if (r6 <= 0) goto L85
            java.lang.String r0 = "[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            int r3 = android.os.Process.myPid()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r4 = android.os.Process.myTid()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r9] = r1
            r8[r5] = r3
            r8[r7] = r4
            com.tencent.bugly.proguard.al.c(r0, r8)
        L85:
            com.tencent.bugly.proguard.ak r0 = com.tencent.bugly.proguard.ak.a()
            if (r0 == 0) goto L93
            com.tencent.bugly.proguard.ai$2 r1 = new com.tencent.bugly.proguard.ai$2
            r1.<init>(r10, r6, r2)
            r0.a(r1)
        L93:
            return
        L94:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            throw r0
    }

    public final synchronized long a(int r4) {
            r3 = this;
            monitor-enter(r3)
            if (r4 < 0) goto L19
            java.util.Map<java.lang.Integer, java.lang.Long> r0 = r3.e     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L17
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L28
            long r0 = r4.longValue()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)
            return r0
        L17:
            r4 = move-exception
            goto L2c
        L19:
            java.lang.String r0 = "[UploadManager] Unknown upload ID: %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L17
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L17
            com.tencent.bugly.proguard.al.e(r0, r1)     // Catch: java.lang.Throwable -> L17
        L28:
            monitor-exit(r3)
            r0 = 0
            return r0
        L2c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r4
    }

    public final long a(boolean r12) {
            r11 = this;
            long r0 = com.tencent.bugly.proguard.ap.b()
            r2 = 3
            if (r12 == 0) goto L9
            r3 = 5
            goto La
        L9:
            r3 = 3
        La:
            com.tencent.bugly.proguard.w r4 = r11.c
            java.util.List r4 = r4.a(r3)
            r5 = 0
            if (r4 == 0) goto L49
            int r6 = r4.size()
            if (r6 <= 0) goto L49
            r6 = 0
            java.lang.Object r12 = r4.get(r5)     // Catch: java.lang.Throwable -> L32
            com.tencent.bugly.proguard.y r12 = (com.tencent.bugly.proguard.y) r12     // Catch: java.lang.Throwable -> L32
            long r8 = r12.e     // Catch: java.lang.Throwable -> L32
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 < 0) goto L3d
            byte[] r0 = r12.g     // Catch: java.lang.Throwable -> L32
            long r6 = com.tencent.bugly.proguard.ap.d(r0)     // Catch: java.lang.Throwable -> L32
            if (r3 != r2) goto L34
            r11.f = r6     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r12 = move-exception
            goto L3a
        L34:
            r11.g = r6     // Catch: java.lang.Throwable -> L32
        L36:
            r4.remove(r12)     // Catch: java.lang.Throwable -> L32
            goto L3d
        L3a:
            com.tencent.bugly.proguard.al.a(r12)
        L3d:
            int r12 = r4.size()
            if (r12 <= 0) goto L52
            com.tencent.bugly.proguard.w r12 = r11.c
            r12.a(r4)
            goto L52
        L49:
            if (r12 == 0) goto L4f
            long r0 = r11.g
        L4d:
            r6 = r0
            goto L52
        L4f:
            long r0 = r11.f
            goto L4d
        L52:
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = r6 / r0
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r12
            java.lang.String r12 = "[UploadManager] Local network consume: %d KB"
            com.tencent.bugly.proguard.al.c(r12, r0)
            return r6
    }

    public final synchronized void a(int r6, long r7) {
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            r1 = 0
            if (r6 < 0) goto L49
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r5.e     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L47
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L47
            com.tencent.bugly.proguard.y r2 = new com.tencent.bugly.proguard.y     // Catch: java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            r2.b = r6     // Catch: java.lang.Throwable -> L47
            r2.e = r7     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = ""
            r2.c = r3     // Catch: java.lang.Throwable -> L47
            java.lang.String r3 = ""
            r2.d = r3     // Catch: java.lang.Throwable -> L47
            byte[] r3 = new byte[r1]     // Catch: java.lang.Throwable -> L47
            r2.g = r3     // Catch: java.lang.Throwable -> L47
            com.tencent.bugly.proguard.w r3 = r5.c     // Catch: java.lang.Throwable -> L47
            r3.b(r6)     // Catch: java.lang.Throwable -> L47
            com.tencent.bugly.proguard.w r3 = r5.c     // Catch: java.lang.Throwable -> L47
            r3.a(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "[UploadManager] Uploading(ID:%d) time: %s"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.tencent.bugly.proguard.ap.a(r7)     // Catch: java.lang.Throwable -> L47
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L47
            r8[r1] = r6     // Catch: java.lang.Throwable -> L47
            r8[r0] = r7     // Catch: java.lang.Throwable -> L47
            com.tencent.bugly.proguard.al.c(r2, r8)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r5)
            return
        L47:
            r6 = move-exception
            goto L58
        L49:
            java.lang.String r7 = "[UploadManager] Unknown uploading ID: %d"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L47
            r8[r1] = r6     // Catch: java.lang.Throwable -> L47
            com.tencent.bugly.proguard.al.e(r7, r8)     // Catch: java.lang.Throwable -> L47
            monitor-exit(r5)
            return
        L58:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L47
            throw r6
    }

    public final void a(int r12, com.tencent.bugly.proguard.bq r13, java.lang.String r14, java.lang.String r15, com.tencent.bugly.proguard.ah r16, long r17, boolean r19) {
            r11 = this;
            int r3 = r13.g
            byte[] r4 = com.tencent.bugly.proguard.ae.a(r13)
            com.tencent.bugly.proguard.aj r0 = new com.tencent.bugly.proguard.aj     // Catch: java.lang.Throwable -> L1e
            android.content.Context r1 = r11.d     // Catch: java.lang.Throwable -> L1e
            r2 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1e
            r7 = 1
            r8 = 1
            r5 = r11
            r9 = r17
            r6 = r0
            r5.a(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r0 = move-exception
            r12 = r0
            com.tencent.bugly.proguard.al.a(r12)
            return
    }

    public final void a(int r9, com.tencent.bugly.proguard.bq r10, java.lang.String r11, java.lang.String r12, com.tencent.bugly.proguard.ah r13, boolean r14) {
            r8 = this;
            int r2 = r10.g
            byte[] r3 = com.tencent.bugly.proguard.ae.a(r10)
            r0 = r8
            r1 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.a(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    protected final synchronized void a(long r5, boolean r7) {
            r4 = this;
            monitor-enter(r4)
            if (r7 == 0) goto L5
            r0 = 5
            goto L6
        L5:
            r0 = 3
        L6:
            com.tencent.bugly.proguard.y r1 = new com.tencent.bugly.proguard.y     // Catch: java.lang.Throwable -> L30
            r1.<init>()     // Catch: java.lang.Throwable -> L30
            r1.b = r0     // Catch: java.lang.Throwable -> L30
            long r2 = com.tencent.bugly.proguard.ap.b()     // Catch: java.lang.Throwable -> L30
            r1.e = r2     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = ""
            r1.c = r2     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = ""
            r1.d = r2     // Catch: java.lang.Throwable -> L30
            byte[] r2 = com.tencent.bugly.proguard.ap.c(r5)     // Catch: java.lang.Throwable -> L30
            r1.g = r2     // Catch: java.lang.Throwable -> L30
            com.tencent.bugly.proguard.w r2 = r4.c     // Catch: java.lang.Throwable -> L30
            r2.b(r0)     // Catch: java.lang.Throwable -> L30
            com.tencent.bugly.proguard.w r0 = r4.c     // Catch: java.lang.Throwable -> L30
            r0.a(r1)     // Catch: java.lang.Throwable -> L30
            if (r7 == 0) goto L32
            r4.g = r5     // Catch: java.lang.Throwable -> L30
            goto L34
        L30:
            r5 = move-exception
            goto L48
        L32:
            r4.f = r5     // Catch: java.lang.Throwable -> L30
        L34:
            java.lang.String r7 = "[UploadManager] Network total consume: %d KB"
            r0 = 1024(0x400, double:5.06E-321)
            long r5 = r5 / r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L30
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r6[r0] = r5     // Catch: java.lang.Throwable -> L30
            com.tencent.bugly.proguard.al.c(r7, r6)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r4)
            return
        L48:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L30
            throw r5
    }

    public final boolean b(int r8) {
            r7 = this;
            boolean r0 = com.tencent.bugly.proguard.p.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            java.lang.String r8 = "Uploading frequency will not be checked if SDK is in debug mode."
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.bugly.proguard.al.c(r8, r0)
            return r1
        Le:
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.a(r8)
            long r3 = r3 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r5 = r3 / r5
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r0
            r5[r1] = r8
            java.lang.String r8 = "[UploadManager] Time interval is %d seconds since last uploading(ID: %d)."
            com.tencent.bugly.proguard.al.c(r8, r5)
            r5 = 30000(0x7530, double:1.4822E-319)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L45
            r3 = 30
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r0[r2] = r8
            java.lang.String r8 = "[UploadManager] Data only be uploaded once in %d seconds."
            com.tencent.bugly.proguard.al.a(r8, r0)
            return r2
        L45:
            return r1
    }
}
