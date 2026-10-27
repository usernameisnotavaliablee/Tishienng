package cn.jiguang.au;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static final java.util.HashMap<java.lang.String, java.util.concurrent.ExecutorService> a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.HashMap<java.lang.String, java.lang.String> f671b = null;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.au.d.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            cn.jiguang.au.d.f671b = r0
            java.lang.String r1 = "SDK_INIT"
            java.lang.String r2 = "ic"
            r0.put(r1, r2)
            java.lang.String r1 = "SDK_SERVICE_INIT"
            java.lang.String r2 = "mn"
            r0.put(r1, r2)
            java.lang.String r1 = "TCP_CONN_TASK"
            java.lang.String r2 = "tc"
            r0.put(r1, r2)
            java.lang.String r1 = "UPLOAD_REPORT"
            java.lang.String r2 = "rp"
            r0.put(r1, r2)
            java.lang.String r1 = "ONCE_TASK"
            java.lang.String r2 = "oc"
            r0.put(r1, r2)
            java.lang.String r1 = "GET_ON_EVENT_TASK"
            java.lang.String r2 = "gt"
            r0.put(r1, r2)
            java.lang.String r1 = "SCHEDULE_TASK"
            java.lang.String r2 = "sc"
            r0.put(r1, r2)
            java.lang.String r1 = "MAJOR_TASK"
            java.lang.String r2 = "mj"
            r0.put(r1, r2)
            java.lang.String r1 = "NORMAL_TASK"
            java.lang.String r2 = "nr"
            r0.put(r1, r2)
            java.lang.String r1 = "FUTURE_TASK"
            java.lang.String r2 = "fr"
            r0.put(r1, r2)
            java.lang.String r1 = "DELAY_TASK"
            java.lang.String r2 = "dl"
            r0.put(r1, r2)
            java.lang.String r1 = "AIDL_TASK"
            java.lang.String r3 = "al"
            r0.put(r1, r3)
            java.lang.String r1 = "DYNAMIC_LOAD_TASK"
            r0.put(r1, r2)
            java.lang.String r1 = "IPC_ACTION_TASK"
            java.lang.String r2 = "ca"
            r0.put(r1, r2)
            java.lang.String r1 = "MAIN_IPC_ACTION_TASK"
            java.lang.String r2 = "m_ca"
            r0.put(r1, r2)
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(java.lang.String r3) {
            java.util.concurrent.ExecutorService r0 = c(r3)     // Catch: java.lang.Throwable -> L8
            a(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "shutdown executor "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "error: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r0 = "SDKWorker_XExecutor"
            cn.jiguang.w.f.l(r0, r3)
            return
    }

    public static void a(java.lang.String r3, java.lang.Runnable r4) {
            r0 = 0
            r2 = 1
            a(r3, r4, r0, r2)
            return
    }

    public static void a(java.lang.String r1, java.lang.Runnable r2, long r3) {
            r0 = 1
            a(r1, r2, r3, r0)
            return
    }

    public static void a(java.lang.String r3, java.lang.Runnable r4, long r5, boolean r7) {
            cn.jiguang.au.d$1 r0 = new cn.jiguang.au.d$1     // Catch: java.lang.Throwable -> L21
            r0.<init>(r7, r4)     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.ExecutorService r3 = c(r3)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L20
            r1 = 0
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 <= 0) goto L1d
            boolean r4 = r3 instanceof java.util.concurrent.ScheduledExecutorService     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L1d
            java.util.concurrent.ScheduledExecutorService r3 = (java.util.concurrent.ScheduledExecutorService) r3     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L21
            r3.schedule(r0, r5, r4)     // Catch: java.lang.Throwable -> L21
            return
        L1d:
            r3.execute(r0)     // Catch: java.lang.Throwable -> L21
        L20:
            return
        L21:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "execute failed, try again e:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "SDKWorker_XExecutor"
            cn.jiguang.w.f.l(r4, r3)
            return
    }

    public static void a(java.lang.String r2, java.lang.Runnable r3, boolean r4) {
            r0 = 0
            a(r2, r3, r0, r4)
            return
    }

    private static void a(java.util.concurrent.ExecutorService r5) {
            java.lang.String r0 = "SDKWorker_XExecutor"
            if (r5 != 0) goto L5
            goto L46
        L5:
            r5.shutdown()     // Catch: java.lang.Throwable -> L21 java.lang.InterruptedException -> L37
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L21 java.lang.InterruptedException -> L37
            r2 = 100
            boolean r4 = r5.awaitTermination(r2, r1)     // Catch: java.lang.Throwable -> L21 java.lang.InterruptedException -> L37
            if (r4 != 0) goto L46
            r5.shutdownNow()     // Catch: java.lang.Throwable -> L21 java.lang.InterruptedException -> L37
            boolean r1 = r5.awaitTermination(r2, r1)     // Catch: java.lang.Throwable -> L21 java.lang.InterruptedException -> L37
            if (r1 != 0) goto L46
            java.lang.String r1 = "executor did not terminate"
            cn.jiguang.w.f.a(r0, r1)     // Catch: java.lang.Throwable -> L21 java.lang.InterruptedException -> L37
            return
        L21:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "shutDown e:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jiguang.w.f.i(r0, r5)
            goto L46
        L37:
            r5.shutdownNow()
            java.lang.String r5 = "current thread is interrupted by self"
            cn.jiguang.w.f.a(r0, r5)
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L46:
            return
    }

    public static boolean b(java.lang.String r4) {
            r0 = 0
            java.util.concurrent.ExecutorService r1 = c(r4)     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            boolean r2 = r1.isShutdown()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L17
            boolean r4 = r1.isTerminated()     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L17
            r4 = 1
            return r4
        L15:
            r1 = move-exception
            goto L18
        L17:
            return r0
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "check executor "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = " isAlive error: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            java.lang.String r1 = "SDKWorker_XExecutor"
            cn.jiguang.w.f.l(r1, r4)
            return r0
    }

    private static java.util.concurrent.ExecutorService c(java.lang.String r13) {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = cn.jiguang.au.d.f671b
            java.lang.Object r1 = r0.get(r13)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            java.lang.String r13 = "NORMAL_TASK"
        Ld:
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap<java.lang.String, java.util.concurrent.ExecutorService> r1 = cn.jiguang.au.d.a
            java.lang.Object r2 = r1.get(r13)
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            if (r2 == 0) goto L25
            boolean r3 = r2.isShutdown()
            if (r3 == 0) goto L24
            goto L25
        L24:
            return r2
        L25:
            java.lang.Class<cn.jiguang.au.d> r2 = cn.jiguang.au.d.class
            monitor-enter(r2)
            java.lang.Object r3 = r1.get(r13)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.ExecutorService r3 = (java.util.concurrent.ExecutorService) r3     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L3b
            boolean r4 = r3.isShutdown()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L19d
            goto L3b
        L37:
            r0 = move-exception
            r13 = r0
            goto L19f
        L3b:
            int r3 = r13.hashCode()     // Catch: java.lang.Throwable -> L37
            r4 = 1
            switch(r3) {
                case -1761572955: goto L158;
                case -1642909390: goto L139;
                case -1155811197: goto L11b;
                case -1132229919: goto L109;
                case -657461836: goto Lea;
                case -96658502: goto Lcc;
                case 92320065: goto Lab;
                case 183091307: goto La2;
                case 467326238: goto L98;
                case 528640557: goto L8e;
                case 1082250773: goto L85;
                case 1350548607: goto L7c;
                case 1553188395: goto L72;
                case 1677919873: goto L4d;
                case 1921363421: goto L45;
                default: goto L43;
            }     // Catch: java.lang.Throwable -> L37
        L43:
            goto L177
        L45:
            java.lang.String r3 = "NORMAL_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            goto L177
        L4d:
            java.lang.String r3 = "FUTURE_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r3 = 5
            r11.<init>(r3)     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 3
            r7 = 3
            r8 = 15
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
            r5.allowCoreThreadTimeOut(r4)     // Catch: java.lang.Throwable -> L37
            r4 = 3
        L6f:
            r3 = r5
            goto L18f
        L72:
            java.lang.String r3 = "IPC_ACTION_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            goto L160
        L7c:
            java.lang.String r3 = "SDK_SERVICE_INIT"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            goto Ld4
        L85:
            java.lang.String r3 = "SDK_INIT"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            goto Ld4
        L8e:
            java.lang.String r3 = "SCHEDULE_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            goto L141
        L98:
            java.lang.String r3 = "DYNAMIC_LOAD_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            goto L160
        La2:
            java.lang.String r3 = "MAJOR_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            goto Ld4
        Lab:
            java.lang.String r3 = "GET_ON_EVENT_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r11.<init>()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 1
            r7 = 1
            r8 = 1
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
        Lc8:
            r5.allowCoreThreadTimeOut(r4)     // Catch: java.lang.Throwable -> L37
            goto L6f
        Lcc:
            java.lang.String r3 = "TCP_CONN_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
        Ld4:
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r11.<init>()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 2
            r7 = 2
            r8 = 0
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
            goto L6f
        Lea:
            java.lang.String r3 = "AIDL_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r11.<init>()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 1
            r7 = 1
            r8 = 15
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
            goto L6f
        L109:
            java.lang.String r3 = "DELAY_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            cn.jiguang.au.c r3 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.ScheduledExecutorService r3 = java.util.concurrent.Executors.newScheduledThreadPool(r4, r3)     // Catch: java.lang.Throwable -> L37
            goto L18f
        L11b:
            java.lang.String r3 = "ONCE_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r11.<init>()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 1
            r7 = 1
            r8 = 3
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
            goto Lc8
        L139:
            java.lang.String r3 = "UPLOAD_REPORT"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
        L141:
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r11.<init>()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 2
            r7 = 2
            r8 = 10
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
            goto Lc8
        L158:
            java.lang.String r3 = "MAIN_IPC_ACTION_TASK"
            boolean r3 = r13.equals(r3)     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L177
        L160:
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r11.<init>()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 1
            r7 = 1
            r8 = 15
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
            goto L6f
        L177:
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch: java.lang.Throwable -> L37
            r3 = 2
            r11.<init>(r3)     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.c r12 = new cn.jiguang.au.c     // Catch: java.lang.Throwable -> L37
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L37
            r6 = 1
            r7 = 5
            r8 = 1
            r5.<init>(r6, r7, r8, r10, r11, r12)     // Catch: java.lang.Throwable -> L37
            goto L6f
        L18f:
            r5 = r3
            java.util.concurrent.ThreadPoolExecutor r5 = (java.util.concurrent.ThreadPoolExecutor) r5     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.a r6 = new cn.jiguang.au.a     // Catch: java.lang.Throwable -> L37
            r6.<init>(r0, r4)     // Catch: java.lang.Throwable -> L37
            r5.setRejectedExecutionHandler(r6)     // Catch: java.lang.Throwable -> L37
            r1.put(r13, r3)     // Catch: java.lang.Throwable -> L37
        L19d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            return r3
        L19f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r13
    }
}
