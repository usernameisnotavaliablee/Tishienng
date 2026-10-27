package cn.jiguang.internal;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class JCoreInternalHelper {
    private static final java.lang.String TAG = "JCoreInternalHelper";
    private static cn.jiguang.internal.JCoreHelperAction jCoreHelperAction;
    private java.util.concurrent.atomic.AtomicReference<cn.jiguang.internal.JCoreHelperAction> localJCoreHelperAction;
    private long startId;




    private static final class a {
        private static final cn.jiguang.internal.JCoreInternalHelper a = null;

        static {
                cn.jiguang.internal.JCoreInternalHelper r0 = new cn.jiguang.internal.JCoreInternalHelper
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.internal.JCoreInternalHelper.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.internal.JCoreInternalHelper a() {
                cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.a.a
                return r0
        }
    }

    static {
            return
    }

    private JCoreInternalHelper() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.localJCoreHelperAction = r0
            r0 = 0
            r2.startId = r0
            return
    }

    /* synthetic */ JCoreInternalHelper(cn.jiguang.internal.JCoreInternalHelper.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ cn.jiguang.internal.JCoreHelperAction access$200() {
            cn.jiguang.internal.JCoreHelperAction r0 = cn.jiguang.internal.JCoreInternalHelper.jCoreHelperAction
            return r0
    }

    private android.os.Bundle addStartId(android.content.Context r3, int r4, android.os.Bundle r5) {
            r2 = this;
            r3 = 2
            if (r4 == r3) goto L13
            if (r5 != 0) goto La
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        La:
            java.lang.String r3 = "jg_time_start_id"
            long r0 = r2.getStartId()
            r5.putLong(r3, r0)
        L13:
            return r5
    }

    public static cn.jiguang.internal.JCoreInternalHelper getInstance() {
            cn.jiguang.internal.JCoreInternalHelper r0 = cn.jiguang.internal.JCoreInternalHelper.a.a()
            return r0
    }

    public java.lang.Object commonMethod(android.content.Context r7, java.lang.String r8, java.lang.Object r9) {
            r6 = this;
            cn.jiguang.internal.JCoreHelperAction r0 = cn.jiguang.internal.JCoreInternalHelper.jCoreHelperAction
            if (r0 == 0) goto L9
            java.lang.Object r7 = r0.onCommonMethod(r7, r8, r9)
            return r7
        L9:
            cn.jiguang.internal.JCoreInternalHelper$3 r0 = new cn.jiguang.internal.JCoreInternalHelper$3
            java.lang.String r2 = "JCoreInternalHelper#commonMethod"
            r1 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r7 = "ONCE_TASK"
            cn.jiguang.au.d.a(r7, r0)
            r7 = 0
            return r7
    }

    public android.os.Bundle directHandle(android.content.Context r8, java.lang.String r9, java.lang.String r10, android.os.Bundle r11) {
            r7 = this;
            cn.jiguang.internal.JCoreInternalHelper$2 r0 = new cn.jiguang.internal.JCoreInternalHelper$2
            java.lang.String r2 = "JCoreInternalHelper#directHandle"
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "DYNAMIC_LOAD_TASK"
            cn.jiguang.au.d.a(r8, r0)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            return r8
    }

    public long getStartId() {
            r5 = this;
            long r0 = r5.startId
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.startId = r0
        Le:
            long r0 = r5.startId
            return r0
    }

    public synchronized void initLoad(android.content.Context r4) {
            r3 = this;
            monitor-enter(r3)
            cn.jiguang.internal.JCoreHelperAction r0 = cn.jiguang.internal.JCoreInternalHelper.jCoreHelperAction     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            if (r4 != 0) goto Lb
            monitor-exit(r3)
            return
        Lb:
            cn.jiguang.dy.b r0 = cn.jiguang.dy.b.a()     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r0.a(r4, r1)     // Catch: java.lang.Throwable -> L14
            goto L2f
        L14:
            r4 = move-exception
            java.lang.String r0 = "JCoreInternalHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r1.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "load d y failed :"
            r1.append(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L42
            r1.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L42
            cn.jiguang.w.f.c(r0, r4)     // Catch: java.lang.Throwable -> L42
        L2f:
            cn.jiguang.internal.JCoreHelperAction r4 = cn.jiguang.internal.JCoreInternalHelper.jCoreHelperAction     // Catch: java.lang.Throwable -> L42
            if (r4 != 0) goto L44
            java.lang.String r4 = "JCoreInternalHelper"
            java.lang.String r0 = "load action by local"
            cn.jiguang.w.f.c(r4, r0)     // Catch: java.lang.Throwable -> L42
            cn.jiguang.c.b r4 = new cn.jiguang.c.b     // Catch: java.lang.Throwable -> L42
            r4.<init>()     // Catch: java.lang.Throwable -> L42
            cn.jiguang.internal.JCoreInternalHelper.jCoreHelperAction = r4     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r4 = move-exception
            goto L46
        L44:
            monitor-exit(r3)
            return
        L46:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r4
    }

    public java.lang.Object onEvent(android.content.Context r10, java.lang.String r11, int r12, boolean r13, java.lang.String r14, android.os.Bundle r15, java.lang.Object... r16) {
            r9 = this;
            android.os.Bundle r5 = r9.addStartId(r10, r12, r15)
            if (r13 != 0) goto L35
            cn.jiguang.internal.JCoreHelperAction r0 = cn.jiguang.internal.JCoreInternalHelper.jCoreHelperAction
            if (r0 == 0) goto L15
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r6 = r16
            java.lang.Object r10 = r0.onEvent(r1, r2, r3, r4, r5, r6)
            return r10
        L15:
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.internal.JCoreHelperAction> r13 = r9.localJCoreHelperAction
            java.lang.Object r13 = r13.get()
            cn.jiguang.internal.JCoreHelperAction r13 = (cn.jiguang.internal.JCoreHelperAction) r13
            if (r13 != 0) goto L29
            cn.jiguang.c.b r13 = new cn.jiguang.c.b
            r13.<init>()
            java.util.concurrent.atomic.AtomicReference<cn.jiguang.internal.JCoreHelperAction> r15 = r9.localJCoreHelperAction
            r15.set(r13)
        L29:
            r1 = r10
            r2 = r11
            r3 = r12
            r0 = r13
            r4 = r14
            r6 = r16
            java.lang.Object r10 = r0.onEvent(r1, r2, r3, r4, r5, r6)
            return r10
        L35:
            cn.jiguang.internal.JCoreInternalHelper$1 r0 = new cn.jiguang.internal.JCoreInternalHelper$1
            java.lang.String r2 = "JCoreInternalHelper#onEvent"
            r1 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r8 = r16
            r7 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.List<java.lang.Integer> r10 = cn.jiguang.c.b.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            boolean r10 = r10.contains(r11)
            r10 = r10 ^ 1
            java.lang.String r11 = "DYNAMIC_LOAD_TASK"
            cn.jiguang.au.d.a(r11, r0, r10)
            r10 = 0
            return r10
    }

    public void setStartId(android.content.Context r5) {
            r4 = this;
            long r0 = r4.startId
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.startId = r0
        Le:
            return
    }
}
