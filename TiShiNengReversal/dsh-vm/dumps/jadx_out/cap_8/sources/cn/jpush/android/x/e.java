package cn.jpush.android.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private static volatile cn.jpush.android.x.e a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.LinkedList<cn.jpush.android.x.e.a> f2027b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.LinkedList<cn.jpush.android.x.e.a> f2028c;

    /* renamed from: d, reason: collision with root package name */
    private final java.util.Comparator<cn.jpush.android.x.e.a> f2029d;


    static class a {
        private long a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2030b;

        /* renamed from: c, reason: collision with root package name */
        private cn.jpush.android.d.d f2031c;

        /* renamed from: d, reason: collision with root package name */
        private int f2032d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2033e;

        public a(long r1, int r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r1 = 0
                r0.f2030b = r1
                r0.f2032d = r3
                return
        }

        public a(long r1, cn.jpush.android.d.d r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r1 = 1
                r0.f2030b = r1
                r0.f2031c = r3
                r0.f2033e = r4
                return
        }

        public a(org.json.JSONObject r3) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "operationTime"
                long r0 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L2d
                r2.a = r0     // Catch: java.lang.Throwable -> L2d
                java.lang.String r0 = "showOrDismiss"
                boolean r0 = r3.optBoolean(r0)     // Catch: java.lang.Throwable -> L2d
                r2.f2030b = r0     // Catch: java.lang.Throwable -> L2d
                java.lang.String r0 = "pushEntity"
                java.lang.String r0 = r3.optString(r0)     // Catch: java.lang.Throwable -> L2d
                boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L2d
                if (r1 != 0) goto L25
                cn.jpush.android.d.d r0 = cn.jpush.android.d.d.b(r0)     // Catch: java.lang.Throwable -> L2d
                r2.f2031c = r0     // Catch: java.lang.Throwable -> L2d
            L25:
                java.lang.String r0 = "notifyId"
                int r3 = r3.optInt(r0)     // Catch: java.lang.Throwable -> L2d
                r2.f2032d = r3     // Catch: java.lang.Throwable -> L2d
            L2d:
                return
        }

        static /* synthetic */ long a(cn.jpush.android.x.e.a r2) {
                long r0 = r2.a
                return r0
        }

        static /* synthetic */ boolean b(cn.jpush.android.x.e.a r0) {
                boolean r0 = r0.f2033e
                return r0
        }

        static /* synthetic */ cn.jpush.android.d.d c(cn.jpush.android.x.e.a r0) {
                cn.jpush.android.d.d r0 = r0.f2031c
                return r0
        }

        static /* synthetic */ boolean d(cn.jpush.android.x.e.a r0) {
                boolean r0 = r0.f2030b
                return r0
        }

        static /* synthetic */ int e(cn.jpush.android.x.e.a r0) {
                int r0 = r0.f2032d
                return r0
        }

        public org.json.JSONObject a() {
                r5 = this;
                r0 = 0
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
                r1.<init>()     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = "operationTime"
                long r3 = r5.a     // Catch: java.lang.Throwable -> L30
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L30
                java.lang.String r2 = "showOrDismiss"
                boolean r3 = r5.f2030b     // Catch: java.lang.Throwable -> L30
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L30
                boolean r2 = r5.f2030b     // Catch: java.lang.Throwable -> L30
                if (r2 == 0) goto L28
                java.lang.String r2 = "pushEntity"
                cn.jpush.android.d.d r3 = r5.f2031c     // Catch: java.lang.Throwable -> L30
                if (r3 == 0) goto L23
                java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L30
                goto L24
            L23:
                r3 = r0
            L24:
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L30
                return r1
            L28:
                java.lang.String r2 = "notifyId"
                int r3 = r5.f2032d     // Catch: java.lang.Throwable -> L30
                r1.put(r2, r3)     // Catch: java.lang.Throwable -> L30
                return r1
            L30:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Item{operationTime="
                r0.append(r1)
                long r1 = r3.a
                r0.append(r1)
                java.lang.String r1 = ", showOrDismiss="
                r0.append(r1)
                boolean r1 = r3.f2030b
                r0.append(r1)
                java.lang.String r1 = ", pushEntity="
                r0.append(r1)
                cn.jpush.android.d.d r1 = r3.f2031c
                r0.append(r1)
                java.lang.String r1 = ", notifyId="
                r0.append(r1)
                int r1 = r3.f2032d
                r0.append(r1)
                java.lang.String r1 = ", isDelayByInapp="
                r0.append(r1)
                boolean r1 = r3.f2033e
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private e() {
            r1 = this;
            r1.<init>()
            cn.jpush.android.x.e$1 r0 = new cn.jpush.android.x.e$1
            r0.<init>(r1)
            r1.f2029d = r0
            return
    }

    public static cn.jpush.android.x.e a() {
            cn.jpush.android.x.e r0 = cn.jpush.android.x.e.a
            if (r0 != 0) goto L19
            java.lang.Class<cn.jpush.android.x.e> r0 = cn.jpush.android.x.e.class
            monitor-enter(r0)
            cn.jpush.android.x.e r1 = cn.jpush.android.x.e.a     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jpush.android.x.e r1 = new cn.jpush.android.x.e     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.x.e.a = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jpush.android.x.e r0 = cn.jpush.android.x.e.a
            return r0
    }

    private static void a(android.content.Context r9, java.util.LinkedList<cn.jpush.android.x.e.a> r10, long r11, cn.jpush.android.x.e.a r13) {
            if (r13 != 0) goto L3
            return
        L3:
            cn.jpush.android.d.d r0 = cn.jpush.android.x.e.a.c(r13)
            java.lang.String r1 = "NotificationScheduler"
            if (r0 == 0) goto L1f
            cn.jpush.android.d.d r0 = cn.jpush.android.x.e.a.c(r13)
            java.lang.String r0 = r0.K
            java.lang.String r2 = "ssp"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L1f
            java.lang.String r9 = "ssp notification message"
            cn.jpush.android.helper.Logger.d(r1, r9)
            return
        L1f:
            long r2 = cn.jpush.android.x.e.a.a(r13)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto Lf1
            boolean r0 = cn.jpush.android.x.e.a.d(r13)
            java.lang.String r2 = "cancelNotification:"
            if (r0 == 0) goto Ld7
            cn.jpush.android.d.d r0 = cn.jpush.android.x.e.a.c(r13)
            if (r0 == 0) goto L67
            cn.jpush.android.d.d r0 = cn.jpush.android.x.e.a.c(r13)
            java.lang.String r0 = r0.f1757d
            cn.jpush.android.d.d r3 = cn.jpush.android.x.e.a.c(r13)
            java.lang.String r3 = r3.f1761h
            cn.jpush.android.d.d r4 = cn.jpush.android.x.e.a.c(r13)
            int r4 = r4.a
            boolean r0 = cn.jpush.android.x.d.a(r9, r0, r3, r4)
            if (r0 == 0) goto L67
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "item: "
            r9.append(r10)
            r9.append(r13)
            java.lang.String r10 = " already cancel"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            cn.jpush.android.helper.Logger.d(r1, r9)
            return
        L67:
            cn.jpush.android.d.d r0 = cn.jpush.android.x.e.a.c(r13)
            java.lang.String r0 = r0.aw
            long r3 = cn.jpush.android.ad.b.b(r0)
            cn.jpush.android.d.d r0 = cn.jpush.android.x.e.a.c(r13)
            int r0 = cn.jpush.android.x.b.a(r0)
            r5 = 0
            java.lang.String r7 = "handleNotification:"
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L9b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.d(r1, r10)
            cn.jpush.android.d.d r10 = cn.jpush.android.x.e.a.c(r13)
            cn.jpush.android.x.b.a.a(r9, r10)
            return
        L9b:
            int r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r5 > 0) goto Lb5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.d(r1, r10)
            cn.jpush.android.x.b.d(r9, r0)
            return
        Lb5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            cn.jpush.android.helper.Logger.d(r1, r11)
            cn.jpush.android.d.d r11 = cn.jpush.android.x.e.a.c(r13)
            cn.jpush.android.x.b.a.a(r9, r11)
            cn.jpush.android.x.e$a r9 = new cn.jpush.android.x.e$a
            r9.<init>(r3, r0)
            r10.add(r9)
            return
        Ld7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r2)
            r10.append(r13)
            java.lang.String r10 = r10.toString()
            cn.jpush.android.helper.Logger.d(r1, r10)
            int r10 = cn.jpush.android.x.e.a.e(r13)
            cn.jpush.android.x.b.d(r9, r10)
            return
        Lf1:
            r10.add(r13)
            return
    }

    private void b(android.content.Context r12, cn.jpush.android.x.e.a r13) {
            r11 = this;
            java.lang.String r1 = "NotificationScheduler"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r0.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "schedule item="
            r0.append(r2)     // Catch: java.lang.Throwable -> L68
            r0.append(r13)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L68
            cn.jpush.android.helper.Logger.d(r1, r0)     // Catch: java.lang.Throwable -> L68
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L68
            java.lang.Class<cn.jpush.android.service.SchedulerReceiver> r2 = cn.jpush.android.service.SchedulerReceiver.class
            r0.<init>(r12, r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "delay_notify"
            r0.setAction(r2)     // Catch: java.lang.Throwable -> L68
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            android.app.PendingIntent r10 = android.app.PendingIntent.getBroadcast(r12, r2, r0, r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "alarm"
            java.lang.Object r12 = r12.getSystemService(r0)     // Catch: java.lang.Throwable -> L68
            r4 = r12
            android.app.AlarmManager r4 = (android.app.AlarmManager) r4     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L6b
            long r6 = cn.jpush.android.x.e.a.a(r13)     // Catch: java.lang.Throwable -> L68
            r8 = 300(0x12c, double:1.48E-321)
            r5 = 0
            r4.setWindow(r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r12.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "setAlarm at="
            r12.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r0 = cn.jpush.android.ad.b.a(r0)     // Catch: java.lang.Throwable -> L68
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L68
            long r3 = cn.jpush.android.x.e.a.a(r13)     // Catch: java.lang.Throwable -> L68
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L68
            java.lang.String r13 = r0.format(r2)     // Catch: java.lang.Throwable -> L68
            r12.append(r13)     // Catch: java.lang.Throwable -> L68
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L68
            cn.jpush.android.helper.Logger.d(r1, r12)     // Catch: java.lang.Throwable -> L68
            return
        L68:
            r0 = move-exception
            r12 = r0
            goto L6c
        L6b:
            return
        L6c:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "can't trigger alarm cause by exception:"
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            cn.jpush.android.helper.Logger.ww(r1, r12)
            return
    }

    public void a(android.content.Context r5) {
            r4 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.f2027b = r0
            java.util.LinkedList<cn.jpush.android.x.e$a> r0 = r4.f2028c
            if (r0 != 0) goto L12
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.f2028c = r0
        L12:
            cn.jpush.android.cache.Key r0 = cn.jpush.android.cache.Key.NotiSchedule()
            java.lang.Object r5 = cn.jpush.android.cache.Sp.get(r5, r0)
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L40
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3f
            r5 = 0
        L28:
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L3f
            if (r5 >= r1) goto L40
            java.util.LinkedList<cn.jpush.android.x.e$a> r1 = r4.f2027b     // Catch: java.lang.Throwable -> L3f
            cn.jpush.android.x.e$a r2 = new cn.jpush.android.x.e$a     // Catch: java.lang.Throwable -> L3f
            org.json.JSONObject r3 = r0.getJSONObject(r5)     // Catch: java.lang.Throwable -> L3f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3f
            r1.add(r2)     // Catch: java.lang.Throwable -> L3f
            int r5 = r5 + 1
            goto L28
        L3f:
        L40:
            java.util.LinkedList<cn.jpush.android.x.e$a> r5 = r4.f2028c
            int r5 = r5.size()
            if (r5 <= 0) goto L5b
            java.util.LinkedList<cn.jpush.android.x.e$a> r5 = r4.f2027b
            java.util.LinkedList<cn.jpush.android.x.e$a> r0 = r4.f2028c
            r5.addAll(r0)
            java.util.LinkedList<cn.jpush.android.x.e$a> r5 = r4.f2028c
            r5.clear()
            java.util.LinkedList<cn.jpush.android.x.e$a> r5 = r4.f2027b
            java.util.Comparator<cn.jpush.android.x.e$a> r0 = r4.f2029d
            java.util.Collections.sort(r5, r0)
        L5b:
            return
    }

    public synchronized void a(android.content.Context r13, cn.jpush.android.x.e.a r14) {
            r12 = this;
            monitor-enter(r12)
            r12.a(r13)     // Catch: java.lang.Throwable -> L38
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L38
            r3 = 0
            if (r14 == 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            java.util.LinkedList<cn.jpush.android.x.e$a> r5 = r12.f2027b     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L38
        L19:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.x.e$a r6 = (cn.jpush.android.x.e.a) r6     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L3a
            long r7 = cn.jpush.android.x.e.a.a(r6)     // Catch: java.lang.Throwable -> L38
            long r9 = cn.jpush.android.x.e.a.a(r14)     // Catch: java.lang.Throwable -> L38
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L3a
            a(r13, r0, r1, r14)     // Catch: java.lang.Throwable -> L38
            r4 = 0
            goto L3a
        L38:
            r13 = move-exception
            goto L59
        L3a:
            a(r13, r0, r1, r6)     // Catch: java.lang.Throwable -> L38
            goto L19
        L3e:
            if (r4 == 0) goto L43
            a(r13, r0, r1, r14)     // Catch: java.lang.Throwable -> L38
        L43:
            r12.f2027b = r0     // Catch: java.lang.Throwable -> L38
            r12.b(r13)     // Catch: java.lang.Throwable -> L38
            boolean r14 = r0.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r14 != 0) goto L57
            java.lang.Object r14 = r0.getFirst()     // Catch: java.lang.Throwable -> L38
            cn.jpush.android.x.e$a r14 = (cn.jpush.android.x.e.a) r14     // Catch: java.lang.Throwable -> L38
            r12.b(r13, r14)     // Catch: java.lang.Throwable -> L38
        L57:
            monitor-exit(r12)
            return
        L59:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L38
            throw r13
    }

    public void b(android.content.Context r5) {
            r4 = this;
            java.util.LinkedList<cn.jpush.android.x.e$a> r0 = r4.f2027b
            if (r0 == 0) goto L4b
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.LinkedList<cn.jpush.android.x.e$a> r1 = r4.f2027b
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            cn.jpush.android.x.e$a r2 = (cn.jpush.android.x.e.a) r2
            boolean r3 = cn.jpush.android.x.e.a.b(r2)
            if (r3 == 0) goto L27
            java.util.LinkedList<cn.jpush.android.x.e$a> r3 = r4.f2028c
            r3.add(r2)
            goto Lf
        L27:
            org.json.JSONObject r2 = r2.a()
            r0.put(r2)
            goto Lf
        L2f:
            java.lang.String r0 = r0.toString()
            java.util.LinkedList<cn.jpush.android.x.e$a> r1 = r4.f2027b
            java.util.Comparator<cn.jpush.android.x.e$a> r2 = r4.f2029d
            java.util.Collections.sort(r1, r2)
            cn.jpush.android.cache.Key r1 = cn.jpush.android.cache.Key.NotiSchedule()
            cn.jpush.android.cache.Key r0 = r1.set(r0)
            r1 = 1
            cn.jpush.android.cache.Key[] r1 = new cn.jpush.android.cache.Key[r1]
            r2 = 0
            r1[r2] = r0
            cn.jpush.android.cache.Sp.set(r5, r1)
        L4b:
            return
    }
}
