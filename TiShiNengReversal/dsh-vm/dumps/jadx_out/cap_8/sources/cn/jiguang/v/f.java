package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class f {

    public static class a {
        private static volatile cn.jiguang.v.f.a a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> f1495b;

        private a() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
                r0.<init>()
                r1.f1495b = r0
                return
        }

        public static cn.jiguang.v.f.a a() {
                cn.jiguang.v.f$a r0 = cn.jiguang.v.f.a.a
                if (r0 != 0) goto L19
                java.lang.Class<cn.jiguang.v.f$a> r0 = cn.jiguang.v.f.a.class
                monitor-enter(r0)
                cn.jiguang.v.f$a r1 = cn.jiguang.v.f.a.a     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                cn.jiguang.v.f$a r1 = new cn.jiguang.v.f$a     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                cn.jiguang.v.f.a.a = r1     // Catch: java.lang.Throwable -> L13
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
                cn.jiguang.v.f$a r0 = cn.jiguang.v.f.a.a
                return r0
        }

        public boolean a(android.os.Bundle r8) {
                r7 = this;
                r0 = 0
                if (r8 != 0) goto L4
                return r0
            L4:
                long r1 = cn.jiguang.v.f.a(r8)
                long r3 = cn.jiguang.v.f.b(r8)
                java.lang.String r8 = "MessageProcessor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "isMessageProcessed Message "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r6 = " from run "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                cn.jiguang.w.f.c(r8, r5)
                r5 = -1
                int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r8 == 0) goto L92
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L35
                goto L92
            L35:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r3)
                java.lang.String r5 = "_"
                r8.append(r5)
                r8.append(r1)
                java.lang.String r8 = r8.toString()
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r5 = r7.f1495b
                boolean r5 = r5.contains(r8)
                if (r5 == 0) goto L76
                java.lang.String r8 = "MessageProcessor"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r5 = "Message "
                r0.append(r5)
                r0.append(r1)
                java.lang.String r1 = " from run "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " has been processed before"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                cn.jiguang.w.f.c(r8, r0)
                r8 = 1
                return r8
            L76:
                monitor-enter(r7)
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r1 = r7.f1495b     // Catch: java.lang.Throwable -> L87
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L87
                r2 = 1000(0x3e8, float:1.401E-42)
                if (r1 < r2) goto L89
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r1 = r7.f1495b     // Catch: java.lang.Throwable -> L87
                r1.poll()     // Catch: java.lang.Throwable -> L87
                goto L89
            L87:
                r8 = move-exception
                goto L90
            L89:
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r1 = r7.f1495b     // Catch: java.lang.Throwable -> L87
                r1.offer(r8)     // Catch: java.lang.Throwable -> L87
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L87
                return r0
            L90:
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L87
                throw r8
            L92:
                return r0
        }
    }

    public static class b {

        /* renamed from: b, reason: collision with root package name */
        private static volatile cn.jiguang.v.f.b f1496b;
        private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f.b.a>> a;

        public static class a {
            private android.content.Context a;

            /* renamed from: b, reason: collision with root package name */
            private java.lang.String f1497b;

            /* renamed from: c, reason: collision with root package name */
            private java.lang.String f1498c;

            /* renamed from: d, reason: collision with root package name */
            private android.os.Bundle f1499d;

            /* renamed from: e, reason: collision with root package name */
            private java.lang.String f1500e;

            public a(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4, java.lang.String r5) {
                    r0 = this;
                    r0.<init>()
                    r0.a = r1
                    r0.f1497b = r2
                    r0.f1498c = r3
                    r0.f1499d = r4
                    r0.f1500e = r5
                    return
            }

            public java.lang.String a() {
                    r1 = this;
                    java.lang.String r0 = r1.f1497b
                    return r0
            }

            public java.lang.String b() {
                    r1 = this;
                    java.lang.String r0 = r1.f1498c
                    return r0
            }

            public android.os.Bundle c() {
                    r1 = this;
                    android.os.Bundle r0 = r1.f1499d
                    return r0
            }
        }

        private b() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                r1.a = r0
                return
        }

        public static cn.jiguang.v.f.b a() {
                cn.jiguang.v.f$b r0 = cn.jiguang.v.f.b.f1496b
                if (r0 != 0) goto L19
                java.lang.Class<cn.jiguang.v.f$b> r0 = cn.jiguang.v.f.b.class
                monitor-enter(r0)
                cn.jiguang.v.f$b r1 = cn.jiguang.v.f.b.f1496b     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                cn.jiguang.v.f$b r1 = new cn.jiguang.v.f$b     // Catch: java.lang.Throwable -> L13
                r1.<init>()     // Catch: java.lang.Throwable -> L13
                cn.jiguang.v.f.b.f1496b = r1     // Catch: java.lang.Throwable -> L13
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
                cn.jiguang.v.f$b r0 = cn.jiguang.v.f.b.f1496b
                return r0
        }

        private java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f.b.a> a(java.lang.String r4) {
                r3 = this;
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f$b$a>> r0 = r3.a
                java.lang.Object r0 = r0.get(r4)
                java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0
                if (r0 != 0) goto L2a
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f$b$a>> r1 = r3.a
                monitor-enter(r1)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f$b$a>> r0 = r3.a     // Catch: java.lang.Throwable -> L24
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L24
                java.util.concurrent.LinkedBlockingQueue r0 = (java.util.concurrent.LinkedBlockingQueue) r0     // Catch: java.lang.Throwable -> L24
                if (r0 != 0) goto L26
                java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Throwable -> L24
                r2 = 1000(0x3e8, float:1.401E-42)
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L24
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f$b$a>> r2 = r3.a     // Catch: java.lang.Throwable -> L24
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L24
                goto L26
            L24:
                r4 = move-exception
                goto L28
            L26:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
                return r0
            L28:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L24
                throw r4
            L2a:
                return r0
        }

        private void a(cn.jiguang.v.f.b.a r4, java.lang.String r5) {
                r3 = this;
                java.util.concurrent.LinkedBlockingQueue r0 = r3.a(r5)     // Catch: java.lang.Exception -> L19
                if (r0 == 0) goto L20
                java.util.concurrent.LinkedBlockingQueue r1 = new java.util.concurrent.LinkedBlockingQueue     // Catch: java.lang.Exception -> L19
                r2 = 1000(0x3e8, float:1.401E-42)
                r1.<init>(r2)     // Catch: java.lang.Exception -> L19
            Ld:
                r1.offer(r4)     // Catch: java.lang.Exception -> L19
                java.lang.Object r4 = r0.poll()     // Catch: java.lang.Exception -> L19
                cn.jiguang.v.f$b$a r4 = (cn.jiguang.v.f.b.a) r4     // Catch: java.lang.Exception -> L19
                if (r4 == 0) goto L1b
                goto Ld
            L19:
                r4 = move-exception
                goto L21
            L1b:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f$b$a>> r4 = r3.a     // Catch: java.lang.Exception -> L19
                r4.put(r5, r1)     // Catch: java.lang.Exception -> L19
            L20:
                return
            L21:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "重新入队失败: "
                r5.append(r0)
                java.lang.String r4 = r4.getMessage()
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "MessageQueueManager"
                cn.jiguang.w.f.l(r5, r4)
                return
        }

        private cn.jiguang.v.f.b.a b(java.lang.String r4) {
                r3 = this;
                r0 = 0
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.LinkedBlockingQueue<cn.jiguang.v.f$b$a>> r1 = r3.a     // Catch: java.lang.Exception -> L13
                java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Exception -> L13
                java.util.concurrent.LinkedBlockingQueue r4 = (java.util.concurrent.LinkedBlockingQueue) r4     // Catch: java.lang.Exception -> L13
                if (r4 != 0) goto Lc
                return r0
            Lc:
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Exception -> L13
                cn.jiguang.v.f$b$a r4 = (cn.jiguang.v.f.b.a) r4     // Catch: java.lang.Exception -> L13
                return r4
            L13:
                r4 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "从队列获取消息失败: "
                r1.append(r2)
                java.lang.String r4 = r4.getMessage()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                java.lang.String r1 = "MessageQueueManager"
                cn.jiguang.w.f.i(r1, r4)
                return r0
        }

        public synchronized android.os.Bundle a(android.content.Context r7, android.net.Uri r8, java.lang.String r9) {
                r6 = this;
                monitor-enter(r6)
                r0 = 0
                if (r7 == 0) goto La8
                if (r9 != 0) goto L8
                goto La8
            L8:
                cn.jiguang.v.f$b$a r1 = r6.b(r9)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                r2 = r0
            Ld:
                if (r1 == 0) goto L8a
                java.lang.String r2 = "MessageQueueManager"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                r3.<init>()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r4 = "sendByProvider, uri="
                r3.append(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                android.os.Bundle r4 = r1.c()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                long r4 = cn.jiguang.v.f.a(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                r3.append(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r4 = ","
                r3.append(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                r3.append(r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r4 = ", componentCls="
                r3.append(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r4 = r1.a()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                r3.append(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r4 = ", action="
                r3.append(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r4 = r1.b()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                r3.append(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                cn.jiguang.w.f.c(r2, r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                android.content.ContentResolver r2 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r3 = r1.a()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                java.lang.String r4 = r1.b()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                android.os.Bundle r5 = r1.c()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                android.os.Bundle r2 = r2.call(r8, r3, r4, r5)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                cn.jiguang.v.f$b$a r1 = r6.b(r9)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
                goto Ld
            L66:
                r7 = move-exception
                goto Lb1
            L68:
                r7 = move-exception
                java.lang.String r8 = "MessageQueueManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                r2.<init>()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                java.lang.String r3 = "发送消息失败: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                java.lang.String r3 = r7.getMessage()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                r2.append(r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                cn.jiguang.w.f.i(r8, r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                r6.a(r1, r9)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
                throw r7     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L88
            L88:
                r7 = move-exception
                goto L8c
            L8a:
                monitor-exit(r6)
                return r2
            L8c:
                java.lang.String r8 = "MessageQueueManager"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
                r9.<init>()     // Catch: java.lang.Throwable -> L66
                java.lang.String r1 = "callMessage发生异常: "
                r9.append(r1)     // Catch: java.lang.Throwable -> L66
                java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L66
                r9.append(r7)     // Catch: java.lang.Throwable -> L66
                java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L66
                cn.jiguang.w.f.l(r8, r7)     // Catch: java.lang.Throwable -> L66
                monitor-exit(r6)
                return r0
            La8:
                java.lang.String r7 = "MessageQueueManager"
                java.lang.String r8 = "callMessage: context或toProcess为空"
                cn.jiguang.w.f.i(r7, r8)     // Catch: java.lang.Throwable -> L66
                monitor-exit(r6)
                return r0
            Lb1:
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L66
                throw r7
        }

        public synchronized void a(cn.jiguang.android.IDataShare r6, java.lang.String r7) {
                r5 = this;
                monitor-enter(r5)
                if (r6 == 0) goto L79
                if (r7 != 0) goto L6
                goto L79
            L6:
                cn.jiguang.v.f$b$a r0 = r5.b(r7)     // Catch: java.lang.Throwable -> L56
            La:
                if (r0 == 0) goto L77
                java.lang.String r1 = "MessageQueueManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                r2.<init>()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r3 = "sendByAidl queue, "
                r2.append(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                android.os.Bundle r3 = r0.c()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                long r3 = cn.jiguang.v.f.a(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                r2.append(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r3 = ","
                r2.append(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r3 = r0.a()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                r2.append(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r3 = ","
                r2.append(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r3 = r0.b()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                r2.append(r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r1 = r0.a()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                java.lang.String r2 = r0.b()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                android.os.Bundle r3 = r0.c()     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                r6.onAction(r1, r2, r3)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                cn.jiguang.v.f$b$a r0 = r5.b(r7)     // Catch: java.lang.Throwable -> L56 android.os.RemoteException -> L58
                goto La
            L56:
                r6 = move-exception
                goto L82
            L58:
                r6 = move-exception
                java.lang.String r1 = "MessageQueueManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
                r2.<init>()     // Catch: java.lang.Throwable -> L56
                java.lang.String r3 = "sendMessage RemoteException: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L56
                java.lang.String r3 = r6.getMessage()     // Catch: java.lang.Throwable -> L56
                r2.append(r3)     // Catch: java.lang.Throwable -> L56
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L56
                cn.jiguang.w.f.i(r1, r2)     // Catch: java.lang.Throwable -> L56
                r5.a(r0, r7)     // Catch: java.lang.Throwable -> L56
                throw r6     // Catch: java.lang.Throwable -> L56
            L77:
                monitor-exit(r5)
                return
            L79:
                java.lang.String r6 = "MessageQueueManager"
                java.lang.String r7 = "sendMessage: aidl或toProcess为空"
                cn.jiguang.w.f.i(r6, r7)     // Catch: java.lang.Throwable -> L56
                monitor-exit(r5)
                return
            L82:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L56
                throw r6
        }

        public synchronized boolean a(android.content.Context r9, java.lang.String r10, java.lang.String r11, android.os.Bundle r12, java.lang.String r13) {
                r8 = this;
                monitor-enter(r8)
                r1 = 0
                java.lang.String r0 = "MessageQueueManager"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r2.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.lang.String r3 = "开始添加消息到队列 - componentCls: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r2.append(r10)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.lang.String r3 = ", action: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r2.append(r11)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.lang.String r3 = ", toProcess: "
                r2.append(r3)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r2.append(r13)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                cn.jiguang.w.f.c(r0, r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                boolean r0 = r8.a(r12, r13)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                if (r0 != 0) goto L31
                monitor-exit(r8)
                return r1
            L31:
                cn.jiguang.v.f$b$a r2 = new cn.jiguang.v.f$b$a     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.util.concurrent.LinkedBlockingQueue r9 = r8.a(r7)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                boolean r10 = r9.offer(r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                if (r10 != 0) goto L67
                java.lang.String r11 = "MessageQueueManager"
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r12.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.lang.String r13 = "消息添加到队列失败 - 队列可能已满:"
                r12.append(r13)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                int r9 = r9.size()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                r12.append(r9)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                java.lang.String r9 = r12.toString()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                cn.jiguang.w.f.i(r11, r9)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L64
                goto L67
            L61:
                r0 = move-exception
                r9 = r0
                goto L86
            L64:
                r0 = move-exception
                r9 = r0
                goto L69
            L67:
                monitor-exit(r8)
                return r10
            L69:
                java.lang.String r10 = "MessageQueueManager"
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
                r11.<init>()     // Catch: java.lang.Throwable -> L61
                java.lang.String r12 = "添加消息到队列失败: "
                r11.append(r12)     // Catch: java.lang.Throwable -> L61
                java.lang.String r9 = r9.getMessage()     // Catch: java.lang.Throwable -> L61
                r11.append(r9)     // Catch: java.lang.Throwable -> L61
                java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L61
                cn.jiguang.w.f.i(r10, r9)     // Catch: java.lang.Throwable -> L61
                monitor-exit(r8)
                return r1
            L86:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L61
                throw r9
        }

        public boolean a(android.os.Bundle r2, java.lang.String r3) {
                r1 = this;
                r0 = 0
                if (r2 == 0) goto L19
                if (r3 != 0) goto L6
                goto L19
            L6:
                java.lang.String r3 = "jpush_JMessenger_message_id"
                boolean r2 = r2.containsKey(r3)
                if (r2 != 0) goto L17
                java.lang.String r2 = "MessageQueueManager"
                java.lang.String r3 = "消息缺少ID，不是要处理的信息，不添加到队列"
                cn.jiguang.w.f.i(r2, r3)
                return r0
            L17:
                r2 = 1
                return r2
            L19:
                return r0
        }
    }

    public static class c {
        private static volatile cn.jiguang.v.f.c a;

        /* renamed from: b, reason: collision with root package name */
        private final java.util.concurrent.atomic.AtomicLong f1501b;

        /* renamed from: c, reason: collision with root package name */
        private long f1502c;

        private c(android.content.Context r4) {
                r3 = this;
                r3.<init>()
                java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
                r1 = 0
                r0.<init>(r1)
                r3.f1501b = r0
                if (r4 == 0) goto L15
                long r0 = r3.b(r4)
                r3.f1502c = r0
                return
            L15:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "context cannot be null"
                r4.<init>(r0)
                throw r4
        }

        public static cn.jiguang.v.f.c a(android.content.Context r2) {
                cn.jiguang.v.f$c r0 = cn.jiguang.v.f.c.a
                if (r0 != 0) goto L19
                java.lang.Class<cn.jiguang.v.f$c> r0 = cn.jiguang.v.f.c.class
                monitor-enter(r0)
                cn.jiguang.v.f$c r1 = cn.jiguang.v.f.c.a     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L15
                cn.jiguang.v.f$c r1 = new cn.jiguang.v.f$c     // Catch: java.lang.Throwable -> L13
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
                cn.jiguang.v.f.c.a = r1     // Catch: java.lang.Throwable -> L13
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
                cn.jiguang.v.f$c r2 = cn.jiguang.v.f.c.a
                return r2
        }

        private long b(android.content.Context r9) {
                r8 = this;
                java.lang.String r0 = "cn.jiguang.helper.jpush_messenger"
                r1 = 0
                android.content.SharedPreferences r9 = r9.getSharedPreferences(r0, r1)
                java.lang.String r0 = "run_id"
                r1 = 0
                long r3 = r9.getLong(r0, r1)
                r5 = 1
                long r3 = r3 + r5
                r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 <= 0) goto L1a
                goto L1b
            L1a:
                r1 = r3
            L1b:
                android.content.SharedPreferences$Editor r9 = r9.edit()
                android.content.SharedPreferences$Editor r9 = r9.putLong(r0, r1)
                r9.commit()
                return r1
        }

        public synchronized long a() {
                r5 = this;
                monitor-enter(r5)
                java.util.concurrent.atomic.AtomicLong r0 = r5.f1501b     // Catch: java.lang.Throwable -> L1e
                long r0 = r0.incrementAndGet()     // Catch: java.lang.Throwable -> L1e
                r2 = 9223372036854774807(0x7ffffffffffffc17, double:NaN)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L20
                java.util.concurrent.atomic.AtomicLong r0 = r5.f1501b     // Catch: java.lang.Throwable -> L1e
                r1 = 100
                r0.set(r1)     // Catch: java.lang.Throwable -> L1e
                java.util.concurrent.atomic.AtomicLong r0 = r5.f1501b     // Catch: java.lang.Throwable -> L1e
                long r0 = r0.incrementAndGet()     // Catch: java.lang.Throwable -> L1e
                goto L20
            L1e:
                r0 = move-exception
                goto L22
            L20:
                monitor-exit(r5)
                return r0
            L22:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1e
                throw r0
        }

        public android.os.Bundle a(android.os.Bundle r4) {
                r3 = this;
                if (r4 != 0) goto L7
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
            L7:
                java.lang.String r0 = "jpush_JMessenger_message_id"
                long r1 = r3.a()
                r4.putLong(r0, r1)
                java.lang.String r0 = "jpush_JMessenger_run_id"
                long r1 = r3.f1502c
                r4.putLong(r0, r1)
                return r4
        }
    }

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a(android.os.Bundle r3) {
            r0 = -1
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = "jpush_JMessenger_message_id"
            long r0 = r3.getLong(r2, r0)
            return r0
    }

    public static long b(android.os.Bundle r3) {
            r0 = -1
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = "jpush_JMessenger_run_id"
            long r0 = r3.getLong(r2, r0)
            return r0
    }
}
