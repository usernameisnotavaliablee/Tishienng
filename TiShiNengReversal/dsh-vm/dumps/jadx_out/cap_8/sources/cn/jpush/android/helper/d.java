package cn.jpush.android.helper;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    private static java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> a;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.Object f1812c = null;

    /* renamed from: d, reason: collision with root package name */
    private static cn.jpush.android.helper.d f1813d;

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.helper.d.a> f1814b;

    private class a {
        public int a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f1815b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ cn.jpush.android.helper.d f1816c;

        public a(cn.jpush.android.helper.d r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.f1816c = r1
                r0.<init>()
                r0.a = r2
                r0.f1815b = r3
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MobileBean{sequence="
                r0.append(r1)
                int r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", mobileNumber='"
                r0.append(r1)
                java.lang.String r1 = r2.f1815b
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            cn.jpush.android.helper.d.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.helper.d.f1812c = r0
            return
    }

    public d() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f1814b = r0
            return
    }

    private static int a(long r7) {
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.helper.d.a
            int r0 = r0.size()
            r1 = 0
            r2 = 3
            if (r0 >= r2) goto L14
        La:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.helper.d.a
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r0.offer(r7)
            return r1
        L14:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.helper.d.a
            java.lang.Object r0 = r0.element()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            long r3 = r7 - r3
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2f
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r7 = cn.jpush.android.helper.d.a
            r7.clear()
            r7 = 2
            return r7
        L2f:
            r5 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L43
        L35:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.helper.d.a
            int r0 = r0.size()
            if (r0 < r2) goto La
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Long> r0 = cn.jpush.android.helper.d.a
            r0.poll()
            goto L35
        L43:
            r7 = 1
            return r7
    }

    public static synchronized cn.jpush.android.helper.d a() {
            java.lang.Class<cn.jpush.android.helper.d> r0 = cn.jpush.android.helper.d.class
            monitor-enter(r0)
            cn.jpush.android.helper.d r1 = cn.jpush.android.helper.d.f1813d     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            java.lang.Object r1 = cn.jpush.android.helper.d.f1812c     // Catch: java.lang.Throwable -> L1c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1c
            cn.jpush.android.helper.d r2 = cn.jpush.android.helper.d.f1813d     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L18
            cn.jpush.android.helper.d r2 = new cn.jpush.android.helper.d     // Catch: java.lang.Throwable -> L16
            r2.<init>()     // Catch: java.lang.Throwable -> L16
            cn.jpush.android.helper.d.f1813d = r2     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r2 = move-exception
            goto L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L1e
        L1a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r1 = move-exception
            goto L22
        L1e:
            cn.jpush.android.helper.d r1 = cn.jpush.android.helper.d.f1813d     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    public cn.jpush.android.api.JPushMessage a(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            r4 = 0
            if (r5 == 0) goto L41
            java.lang.String r0 = "sequence"
            r1 = -1
            int r0 = r5.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "code"
            int r1 = r5.getIntExtra(r2, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "mobile"
            java.lang.String r5 = r5.getStringExtra(r2)     // Catch: java.lang.Throwable -> L27
            cn.jpush.android.api.JPushMessage r2 = new cn.jpush.android.api.JPushMessage     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            r2.setSequence(r0)     // Catch: java.lang.Throwable -> L25
            r2.setErrorCode(r1)     // Catch: java.lang.Throwable -> L25
            r2.setMobileNumber(r5)     // Catch: java.lang.Throwable -> L25
            return r2
        L25:
            r4 = move-exception
            goto L2a
        L27:
            r5 = move-exception
            r2 = r4
            r4 = r5
        L2a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "parese mobile number response to JPushMessage failed, error:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "MobileNumberHelper"
            cn.jpush.android.helper.Logger.w(r5, r4)
            return r2
        L41:
            return r4
    }

    public void a(android.content.Context r5, int r6, int r7, java.lang.String r8) {
            r4 = this;
            java.lang.String r0 = "MobileNumberHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r1.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Action - onResult,sequence:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L53
            r1.append(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = ",code:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L53
            r1.append(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = ",mobileNumber:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L53
            r1.append(r8)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L53
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = cn.jpush.android.local.JPushConstants.getMessageReceiverClass(r5)     // Catch: java.lang.Throwable -> L53
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L53
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L55
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L53
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L53
            r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "mobile_result"
            r2.setAction(r1)     // Catch: java.lang.Throwable -> L53
            java.lang.String r1 = "sequence"
            r2.putExtra(r1, r6)     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = "code"
            r2.putExtra(r6, r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = "mobile"
            r2.putExtra(r6, r8)     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r5 = move-exception
            goto L5e
        L55:
            java.lang.String r6 = "not found messageReceiver"
            cn.jpush.android.helper.Logger.d(r0, r6)     // Catch: java.lang.Throwable -> L53
        L5a:
            cn.jpush.android.helper.a.a(r5, r2)     // Catch: java.lang.Throwable -> L53
            return
        L5e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onResult error:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            cn.jpush.android.helper.Logger.ww(r0, r5)
            return
    }

    public void a(android.content.Context r3, int r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "action - setMobileNubmer, sequence:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ",mobileNumber:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MobileNumberHelper"
            cn.jpush.android.helper.Logger.dd(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "sequence"
            r0.putInt(r1, r4)
            java.lang.String r4 = "mobile"
            r0.putString(r4, r5)
            java.lang.String r4 = "JPUSH"
            java.lang.String r5 = "set_mobile"
            cn.jpush.android.helper.JCoreHelper.runActionWithService(r3, r4, r5, r0)
            return
    }

    public void a(android.content.Context r2, long r3, int r5) {
            r1 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.helper.d$a> r0 = r1.f1814b
            int r0 = r0.size()
            if (r0 == 0) goto L4e
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.helper.d$a> r0 = r1.f1814b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r0.remove(r3)
            cn.jpush.android.helper.d$a r3 = (cn.jpush.android.helper.d.a) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "mobileBean:"
            r4.append(r0)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "MobileNumberHelper"
            cn.jpush.android.helper.Logger.d(r0, r4)
            if (r3 == 0) goto L49
            if (r5 != 0) goto L34
            java.lang.String r4 = r3.f1815b
            cn.jpush.android.cache.a.a(r2, r4)
            goto L41
        L34:
            r4 = 11
            if (r5 != r4) goto L3b
            int r5 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_INTERNEL_SERVER_ERROR
            goto L41
        L3b:
            r4 = 10
            if (r5 != r4) goto L41
            int r5 = cn.jpush.android.api.JPushInterface.ErrorCode.ERROR_CODE_INVALID_MOBILENUMBER
        L41:
            int r4 = r3.a
            java.lang.String r3 = r3.f1815b
            r1.a(r2, r4, r5, r3)
            return
        L49:
            java.lang.String r2 = "#unexcepted, do not find mobile number request cache"
            cn.jpush.android.helper.Logger.d(r0, r2)
        L4e:
            return
    }

    public void a(android.content.Context r14, android.os.Bundle r15) {
            r13 = this;
            java.lang.String r0 = "MobileNumberHelper"
            if (r15 != 0) goto La
            java.lang.String r14 = "[setMobileNum] bundle is bull"
            cn.jpush.android.helper.Logger.ww(r0, r14)
            return
        La:
            java.lang.String r1 = "sequence"
            r2 = 0
            int r1 = r15.getInt(r1, r2)
            java.lang.String r2 = "mobile"
            java.lang.String r15 = r15.getString(r2)
            java.lang.String r2 = cn.jpush.android.cache.a.f(r14)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "action:setMobileNum sequence:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ",mobileNumber:"
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ",lastMobileNumber:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.dd(r0, r3)
            if (r2 == 0) goto L52
            boolean r3 = android.text.TextUtils.equals(r15, r2)
            if (r3 == 0) goto L52
            java.lang.String r2 = "already set this mobile number"
            cn.jpush.android.helper.Logger.dd(r0, r2)
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.SUCCESS
            r13.a(r14, r1, r0, r15)
            return
        L52:
            int r3 = cn.jpush.android.cache.a.b(r14)
            r4 = 1
            if (r3 != r4) goto L5f
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.PUSH_STOPED
            r13.a(r14, r1, r0, r15)
            return
        L5f:
            if (r2 == 0) goto L65
            r2 = 0
            cn.jpush.android.cache.a.a(r14, r2)
        L65:
            long r2 = java.lang.System.currentTimeMillis()
            int r2 = a(r2)
            if (r2 == 0) goto L85
            if (r2 != r4) goto L77
            java.lang.String r3 = "set mobile number too soon,over 3 times in 10s"
        L73:
            cn.jpush.android.helper.Logger.w(r0, r3)
            goto L7a
        L77:
            java.lang.String r3 = "set mobile number failed,time shaft error，please try again"
            goto L73
        L7a:
            if (r2 != r4) goto L7f
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.INVOKE_TOO_SOON
            goto L81
        L7f:
            int r0 = cn.jpush.android.api.JPushInterface.ErrorCode.INCORRECT_TIME
        L81:
            r13.a(r14, r1, r0, r15)
            return
        L85:
            int r2 = cn.jpush.android.ad.h.c(r15)
            if (r2 == 0) goto La8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid mobile number: "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ", will not set mobile number this time."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            cn.jpush.android.helper.Logger.dd(r0, r3)
            r13.a(r14, r1, r2, r15)
            return
        La8:
            byte[] r12 = cn.jpush.android.z.b.a(r15)
            long r8 = cn.jpush.android.helper.f.a()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, cn.jpush.android.helper.d$a> r0 = r13.f1814b
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            cn.jpush.android.helper.d$a r3 = new cn.jpush.android.helper.d$a
            r3.<init>(r13, r1, r15)
            r0.put(r2, r3)
            r7 = 1
            r10 = 0
            java.lang.String r5 = "JPUSH"
            r6 = 26
            r4 = r14
            cn.jpush.android.helper.JCoreHelper.sendRequest(r4, r5, r6, r7, r8, r10, r12)
            return
    }
}
