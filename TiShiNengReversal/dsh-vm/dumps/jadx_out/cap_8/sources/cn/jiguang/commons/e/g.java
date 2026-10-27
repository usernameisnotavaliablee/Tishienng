package cn.jiguang.commons.E;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g extends cn.jiguang.commons.a.c {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f779c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f780d = null;
    private final java.util.concurrent.atomic.AtomicReference a;

    class a extends android.content.BroadcastReceiver {
        final /* synthetic */ cn.jiguang.commons.E.g a;

        /* renamed from: cn.jiguang.commons.E.g$a$a, reason: collision with other inner class name */
        class RunnableC0025a implements java.lang.Runnable {
            final /* synthetic */ android.content.Intent a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ java.lang.String f781b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ cn.jiguang.commons.E.g.a f782c;

            RunnableC0025a(cn.jiguang.commons.E.g.a r1, android.content.Intent r2, java.lang.String r3) {
                    r0 = this;
                    r0.f782c = r1
                    r0.a = r2
                    r0.f781b = r3
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r3 = this;
                    cn.jiguang.commons.E.g$a r0 = r3.f782c
                    cn.jiguang.commons.E.g r0 = r0.a
                    android.content.Intent r1 = r3.a
                    java.lang.String r2 = r3.f781b
                    cn.jiguang.commons.E.g.a(r0, r1, r2)
                    return
            }
        }

        a(cn.jiguang.commons.E.g r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = r4.getAction()
                if (r3 != 0) goto L7
                return
            L7:
                cn.jiguang.commons.C.a r0 = cn.jiguang.commons.C.a.c()
                cn.jiguang.commons.E.g$a$a r1 = new cn.jiguang.commons.E.g$a$a
                r1.<init>(r2, r4, r3)
                cn.jiguang.commons.C.a$g r3 = cn.jiguang.commons.C.a.g.f770c
                r0.a(r1, r3)
                return
        }
    }

    private static final class b {
        private static final cn.jiguang.commons.E.g a = null;

        static {
                cn.jiguang.commons.E.g r0 = new cn.jiguang.commons.E.g
                r0.<init>()
                cn.jiguang.commons.E.g.b.a = r0
                return
        }

        public b() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.commons.E.g a() {
                cn.jiguang.commons.E.g r0 = cn.jiguang.commons.E.g.b.a
                return r0
        }
    }

    static {
            r0 = 35
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [81, 78, 125, 122, 121, 120, 84, 14, 112, 102, 98, 116, 94, 84, 55, 105, 117, 101, 89, 79, 119, 38, 70, 80, 115, 107, 88, 79, 83, 78, 113, 100, 93, 77, 82} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.E.g.f779c = r0
            r0 = 37
            byte[] r0 = new byte[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [120, 102, 114, 99, 95, 73, 125, 38, 127, 127, 68, 69, 119, 124, 56, 112, 83, 84, 112, 103, 120, 63, 96, 97, 90, 67, 87, 86, 117, 127, 75, 77, 91, 94, 102, 101, 93} // fill-array
            java.lang.String r0 = cn.jiguang.commons.L.n.c(r0)
            cn.jiguang.commons.E.g.f780d = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.a = r0
            return
    }

    private java.lang.String a(android.content.Intent r2) {
            r1 = this;
            android.net.Uri r0 = r2.getData()
            if (r0 == 0) goto Lf
            android.net.Uri r2 = r2.getData()
            java.lang.String r2 = r2.getSchemeSpecificPart()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    private org.json.JSONObject a(java.lang.String r4, cn.jiguang.commons.c.e r5, int r6) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L33
            r0.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "action"
            r0.put(r1, r4)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "app_name"
            java.lang.String r1 = r5.a     // Catch: java.lang.Exception -> L33
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "appid"
            java.lang.String r1 = r5.f1007c     // Catch: java.lang.Exception -> L33
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "source"
            r0.put(r4, r6)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "update_time"
            long r1 = r5.l     // Catch: java.lang.Exception -> L33
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "install_time"
            long r1 = r5.f1015k     // Catch: java.lang.Exception -> L33
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = "install_type"
            int r5 = r5.f1010f     // Catch: java.lang.Exception -> L33
            r0.put(r4, r5)     // Catch: java.lang.Exception -> L33
            return r0
        L33:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "create package event data err:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "JAppMovement"
            cn.jiguang.commons.w.a.c(r5, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            return r4
    }

    private void a(android.content.BroadcastReceiver r2) {
            r1 = this;
            if (r2 == 0) goto L9
            android.content.Context r0 = cn.jiguang.commons.L.h.a()
            r0.unregisterReceiver(r2)
        L9:
            return
    }

    private void a(android.content.Intent r4, java.lang.String r5) {
            r3 = this;
            java.lang.String r0 = "JAppMovement"
            cn.jiguang.commons.f.j r1 = cn.jiguang.commons.f.j.j()     // Catch: java.lang.Exception -> L4a
            r2 = 1101(0x44d, float:1.543E-42)
            cn.jiguang.commons.c.i r1 = r1.a(r2)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L50
            cn.jiguang.commons.g.l r2 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L4a
            boolean r1 = r2.c(r1)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L19
            goto L50
        L19:
            java.lang.String r4 = r3.a(r4)     // Catch: java.lang.Exception -> L4a
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L4a
            if (r1 == 0) goto L24
            return
        L24:
            java.lang.String r1 = cn.jiguang.commons.E.g.f779c     // Catch: java.lang.Exception -> L4a
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Exception -> L4a
            if (r1 != 0) goto L4c
            java.lang.String r2 = cn.jiguang.commons.E.g.f780d     // Catch: java.lang.Exception -> L4a
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Exception -> L4a
            if (r2 == 0) goto L35
            goto L4c
        L35:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4a
            r4.<init>()     // Catch: java.lang.Exception -> L4a
            java.lang.String r1 = "unknown action:"
            r4.append(r1)     // Catch: java.lang.Exception -> L4a
            r4.append(r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L4a
            cn.jiguang.commons.w.a.f(r0, r4)     // Catch: java.lang.Exception -> L4a
            return
        L4a:
            r4 = move-exception
            goto L59
        L4c:
            r3.a(r4, r1)     // Catch: java.lang.Exception -> L4a
            return
        L50:
            java.lang.String r4 = "data collection disabled for app events"
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L4a
            r3.e()     // Catch: java.lang.Exception -> L4a
            return
        L59:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "process package event err:"
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.c(r0, r4)
            return
    }

    static /* synthetic */ void a(cn.jiguang.commons.E.g r0, android.content.Intent r1, java.lang.String r2) {
            r0.a(r1, r2)
            return
    }

    private void a(cn.jiguang.commons.c.e r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "JAppMovement"
            if (r5 == 0) goto L9
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f952f     // Catch: java.lang.Exception -> L7
            goto Lb
        L7:
            r4 = move-exception
            goto L3f
        L9:
            java.lang.String r1 = cn.jiguang.commons.a.d.a.f953g     // Catch: java.lang.Exception -> L7
        Lb:
            java.util.List r2 = r3.i(r1)     // Catch: java.lang.Exception -> L7
            r2.add(r4)     // Catch: java.lang.Exception -> L7
            java.lang.String r2 = cn.jiguang.commons.L.c.a(r2)     // Catch: java.lang.Exception -> L7
            cn.jiguang.commons.L.m.c(r1, r2)     // Catch: java.lang.Exception -> L7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7
            r1.<init>()     // Catch: java.lang.Exception -> L7
            java.lang.String r2 = "saved "
            r1.append(r2)     // Catch: java.lang.Exception -> L7
            if (r5 == 0) goto L28
            java.lang.String r5 = "add"
            goto L2a
        L28:
            java.lang.String r5 = "remove"
        L2a:
            r1.append(r5)     // Catch: java.lang.Exception -> L7
            java.lang.String r5 = " to cache:"
            r1.append(r5)     // Catch: java.lang.Exception -> L7
            java.lang.String r4 = r4.f1007c     // Catch: java.lang.Exception -> L7
            r1.append(r4)     // Catch: java.lang.Exception -> L7
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Exception -> L7
            cn.jiguang.commons.w.a.a(r0, r4)     // Catch: java.lang.Exception -> L7
            return
        L3f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "save to cache err:"
            r5.append(r1)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.c(r0, r4)
            return
    }

    private void a(java.lang.String r8, boolean r9) {
            r7 = this;
            java.lang.String r0 = "removal"
            java.lang.String r1 = "addition"
            if (r9 == 0) goto L8
            r2 = r1
            goto L9
        L8:
            r2 = r0
        L9:
            java.lang.String r3 = "JAppMovement"
            if (r9 == 0) goto L21
            cn.jiguang.commons.g.l r4 = cn.jiguang.commons.g.l.a()     // Catch: java.lang.Exception -> L1f
            r5 = 1105(0x451, float:1.548E-42)
            r6 = 0
            boolean r4 = r4.a(r5, r6)     // Catch: java.lang.Exception -> L1f
            if (r4 == 0) goto L21
            cn.jiguang.commons.c.e r8 = r7.g(r8)     // Catch: java.lang.Exception -> L1f
            goto L25
        L1f:
            r8 = move-exception
            goto L47
        L21:
            cn.jiguang.commons.c.e r8 = r7.h(r8)     // Catch: java.lang.Exception -> L1f
        L25:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1f
            r4.<init>()     // Catch: java.lang.Exception -> L1f
            java.lang.String r5 = "caching app "
            r4.append(r5)     // Catch: java.lang.Exception -> L1f
            r4.append(r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = ":"
            r4.append(r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = r8.f1007c     // Catch: java.lang.Exception -> L1f
            r4.append(r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L1f
            cn.jiguang.commons.w.a.a(r3, r2)     // Catch: java.lang.Exception -> L1f
            r7.a(r8, r9)     // Catch: java.lang.Exception -> L1f
            return
        L47:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "handle package "
            r2.append(r4)
            if (r9 == 0) goto L54
            r0 = r1
        L54:
            r2.append(r0)
            java.lang.String r9 = " err:"
            r2.append(r9)
            java.lang.String r8 = r8.getMessage()
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            cn.jiguang.commons.w.a.c(r3, r8)
            return
    }

    private void a(java.util.List r7, java.util.List r8) {
            r6 = this;
            java.util.List r0 = cn.jiguang.commons.L.c.a()
            java.util.List r1 = r6.g()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "backup app list size:"
            r2.append(r3)
            r3 = 0
            if (r0 != 0) goto L17
            r4 = 0
            goto L1b
        L17:
            int r4 = r0.size()
        L1b:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "JAppMovement"
            cn.jiguang.commons.w.a.a(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "current app list size:"
            r2.append(r5)
            if (r1 != 0) goto L34
            goto L38
        L34:
            int r3 = r1.size()
        L38:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            cn.jiguang.commons.w.a.a(r4, r2)
            if (r0 == 0) goto Lc1
            if (r1 == 0) goto Lc1
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Lc1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L53
            goto Lc1
        L53:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r4 = r0.iterator()
        L61:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L73
            java.lang.Object r5 = r4.next()
            cn.jiguang.commons.c.e r5 = (cn.jiguang.commons.c.e) r5
            java.lang.String r5 = r5.f1007c
            r2.add(r5)
            goto L61
        L73:
            java.util.Iterator r4 = r1.iterator()
        L77:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L89
            java.lang.Object r5 = r4.next()
            cn.jiguang.commons.c.e r5 = (cn.jiguang.commons.c.e) r5
            java.lang.String r5 = r5.f1007c
            r3.add(r5)
            goto L77
        L89:
            java.util.Iterator r1 = r1.iterator()
        L8d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto La5
            java.lang.Object r4 = r1.next()
            cn.jiguang.commons.c.e r4 = (cn.jiguang.commons.c.e) r4
            java.lang.String r5 = r4.f1007c
            boolean r5 = r2.contains(r5)
            if (r5 != 0) goto L8d
            r7.add(r4)
            goto L8d
        La5:
            java.util.Iterator r7 = r0.iterator()
        La9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r7.next()
            cn.jiguang.commons.c.e r0 = (cn.jiguang.commons.c.e) r0
            java.lang.String r1 = r0.f1007c
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto La9
            r8.add(r0)
            goto La9
        Lc1:
            return
    }

    private void a(java.util.List r5, java.util.List r6, java.util.List r7, java.util.List r8, java.util.Map r9, java.util.Map r10, java.util.Map r11, java.util.Map r12) {
            r4 = this;
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Iterator r5 = r5.iterator()
        Le:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r5.next()
            cn.jiguang.commons.c.e r2 = (cn.jiguang.commons.c.e) r2
            java.lang.String r3 = r2.f1007c
            boolean r3 = r10.containsKey(r3)
            if (r3 != 0) goto Le
            java.lang.String r3 = r2.f1007c
            r9.put(r3, r2)
            java.lang.String r2 = r2.f1007c
            r11.put(r2, r1)
            goto Le
        L2d:
            java.util.Iterator r5 = r6.iterator()
        L31:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L50
            java.lang.Object r6 = r5.next()
            cn.jiguang.commons.c.e r6 = (cn.jiguang.commons.c.e) r6
            java.lang.String r2 = r6.f1007c
            boolean r2 = r9.containsKey(r2)
            if (r2 != 0) goto L31
            java.lang.String r2 = r6.f1007c
            r10.put(r2, r6)
            java.lang.String r6 = r6.f1007c
            r12.put(r6, r1)
            goto L31
        L50:
            java.util.Iterator r5 = r7.iterator()
        L54:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L75
            java.lang.Object r6 = r5.next()
            cn.jiguang.commons.c.e r6 = (cn.jiguang.commons.c.e) r6
            java.lang.String r7 = r6.f1007c
            boolean r1 = r9.containsKey(r7)
            if (r1 != 0) goto L54
            boolean r1 = r10.containsKey(r7)
            if (r1 != 0) goto L54
            r9.put(r7, r6)
            r11.put(r7, r0)
            goto L54
        L75:
            java.util.Iterator r5 = r8.iterator()
        L79:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9a
            java.lang.Object r6 = r5.next()
            cn.jiguang.commons.c.e r6 = (cn.jiguang.commons.c.e) r6
            java.lang.String r7 = r6.f1007c
            boolean r8 = r9.containsKey(r7)
            if (r8 != 0) goto L79
            boolean r8 = r10.containsKey(r7)
            if (r8 != 0) goto L79
            r10.put(r7, r6)
            r12.put(r7, r0)
            goto L79
        L9a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "final merged events - adds:"
            r5.append(r6)
            int r6 = r9.size()
            r5.append(r6)
            java.lang.String r6 = ", removes:"
            r5.append(r6)
            int r6 = r10.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "JAppMovement"
            cn.jiguang.commons.w.a.a(r6, r5)
            return
    }

    private void a(java.util.Map r4, java.util.Map r5, java.util.Map r6, java.util.Map r7) {
            r3 = this;
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            cn.jiguang.commons.c.e r0 = (cn.jiguang.commons.c.e) r0
            if (r0 == 0) goto L8
            int r1 = r0.f1010f
            boolean r1 = cn.jiguang.commons.L.t.c(r1)
            if (r1 == 0) goto L1f
            goto L8
        L1f:
            java.lang.String r1 = r0.f1007c
            java.lang.Object r1 = r6.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "add"
            r3.c(r2, r0, r1)
            goto L8
        L31:
            java.util.Collection r4 = r5.values()
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L62
            java.lang.Object r5 = r4.next()
            cn.jiguang.commons.c.e r5 = (cn.jiguang.commons.c.e) r5
            if (r5 == 0) goto L39
            int r6 = r5.f1010f
            boolean r6 = cn.jiguang.commons.L.t.c(r6)
            if (r6 == 0) goto L50
            goto L39
        L50:
            java.lang.String r6 = r5.f1007c
            java.lang.Object r6 = r7.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r0 = "rmv"
            r3.c(r0, r5, r6)
            goto L39
        L62:
            return
    }

    private android.content.IntentFilter c() {
            r2 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = cn.jiguang.commons.E.g.f779c
            r0.addAction(r1)
            java.lang.String r1 = cn.jiguang.commons.E.g.f780d
            r0.addAction(r1)
            java.lang.String r1 = "package"
            r0.addDataScheme(r1)
            return r0
    }

    private void c(java.lang.String r4, cn.jiguang.commons.c.e r5, int r6) {
            r3 = this;
            java.lang.String r0 = "JAppMovement"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r1.<init>()     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = "reporting app change:"
            r1.append(r2)     // Catch: java.lang.Exception -> L2e
            r1.append(r4)     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = ", app:"
            r1.append(r2)     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = r5.a     // Catch: java.lang.Exception -> L2e
            r1.append(r2)     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L2e
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L2e
            org.json.JSONObject r4 = r3.a(r4, r5, r6)     // Catch: java.lang.Exception -> L2e
            cn.jiguang.commons.g.p r5 = cn.jiguang.commons.g.p.e()     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = "app_add_rmv"
            r5.a(r4, r6)     // Catch: java.lang.Exception -> L2e
            return
        L2e:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "report app change err:"
            r5.append(r6)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            cn.jiguang.commons.w.a.c(r0, r4)
            return
    }

    private android.content.BroadcastReceiver d() {
            r1 = this;
            cn.jiguang.commons.E.g$a r0 = new cn.jiguang.commons.E.g$a
            r0.<init>(r1)
            return r0
    }

    private cn.jiguang.commons.c.e f(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "JAppMovement"
            java.util.List r1 = cn.jiguang.commons.L.c.a()     // Catch: java.lang.Exception -> L3b
            if (r1 == 0) goto L54
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L3b
            if (r2 != 0) goto L54
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L3b
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L3b
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L3b
            cn.jiguang.commons.c.e r2 = (cn.jiguang.commons.c.e) r2     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = r2.f1007c     // Catch: java.lang.Exception -> L3b
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Exception -> L3b
            if (r3 == 0) goto L12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L3b
            r1.<init>()     // Catch: java.lang.Exception -> L3b
            java.lang.String r3 = "found app info in backup:"
            r1.append(r3)     // Catch: java.lang.Exception -> L3b
            r1.append(r5)     // Catch: java.lang.Exception -> L3b
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L3b
            cn.jiguang.commons.w.a.a(r0, r5)     // Catch: java.lang.Exception -> L3b
            return r2
        L3b:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "search backup err:"
            r1.append(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            cn.jiguang.commons.w.a.f(r0, r5)
        L54:
            r5 = 0
            return r5
    }

    private cn.jiguang.commons.c.e g(java.lang.String r3) {
            r2 = this;
            r0 = 0
            android.content.pm.PackageInfo r3 = cn.jiguang.commons.L.t.a(r3, r0)     // Catch: java.lang.Exception -> L12
            if (r3 == 0) goto L12
            boolean r1 = cn.jiguang.commons.L.t.c(r3)     // Catch: java.lang.Exception -> L12
            if (r1 != 0) goto L12
            cn.jiguang.commons.c.e r3 = cn.jiguang.commons.L.c.a(r3, r0)     // Catch: java.lang.Exception -> L12
            return r3
        L12:
            r3 = 0
            return r3
    }

    private java.util.List g() {
            r3 = this;
            cn.jiguang.commons.g.n r0 = cn.jiguang.commons.g.n.a()     // Catch: java.lang.Exception -> Lc
            r1 = 1100(0x44c, float:1.541E-42)
            r2 = 0
            java.util.List r0 = r0.c(r1, r2)     // Catch: java.lang.Exception -> Lc
            return r0
        Lc:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get current app list err:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "JAppMovement"
            cn.jiguang.commons.w.a.c(r1, r0)
            r0 = 0
            return r0
    }

    public static cn.jiguang.commons.E.g h() {
            cn.jiguang.commons.E.g r0 = cn.jiguang.commons.E.g.b.a()
            return r0
    }

    private cn.jiguang.commons.c.e h(java.lang.String r6) {
            r5 = this;
            r0 = 0
            java.util.List r1 = r5.g()     // Catch: java.lang.Exception -> L67
            if (r1 == 0) goto L26
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> L67
            if (r2 != 0) goto L26
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L67
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L67
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L67
            cn.jiguang.commons.c.e r2 = (cn.jiguang.commons.c.e) r2     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = r2.f1007c     // Catch: java.lang.Exception -> L67
            boolean r3 = r6.equals(r3)     // Catch: java.lang.Exception -> L67
            if (r3 == 0) goto L11
            goto L27
        L26:
            r2 = r0
        L27:
            if (r2 != 0) goto L2d
            cn.jiguang.commons.c.e r2 = r5.f(r6)     // Catch: java.lang.Exception -> L67
        L2d:
            java.lang.String r1 = "JAppMovement"
            if (r2 != 0) goto L49
            cn.jiguang.commons.c.e r2 = cn.jiguang.commons.L.c.c(r6)     // Catch: java.lang.Exception -> L67
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
            r3.<init>()     // Catch: java.lang.Exception -> L67
            java.lang.String r4 = "created basic app info for removed package:"
            r3.append(r4)     // Catch: java.lang.Exception -> L67
            r3.append(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L67
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Exception -> L67
        L49:
            int r3 = r2.f1010f     // Catch: java.lang.Exception -> L67
            boolean r3 = cn.jiguang.commons.L.t.c(r3)     // Catch: java.lang.Exception -> L67
            if (r3 == 0) goto L66
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L67
            r2.<init>()     // Catch: java.lang.Exception -> L67
            java.lang.String r3 = "ignoring system package removal:"
            r2.append(r3)     // Catch: java.lang.Exception -> L67
            r2.append(r6)     // Catch: java.lang.Exception -> L67
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L67
            cn.jiguang.commons.w.a.a(r1, r6)     // Catch: java.lang.Exception -> L67
            return r0
        L66:
            return r2
        L67:
            return r0
    }

    private java.util.List i(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = cn.jiguang.commons.L.m.j(r3)     // Catch: java.lang.Exception -> L10
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L12
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L10
            r3.<init>()     // Catch: java.lang.Exception -> L10
            return r3
        L10:
            r3 = move-exception
            goto L17
        L12:
            java.util.List r3 = cn.jiguang.commons.L.c.f(r3)     // Catch: java.lang.Exception -> L10
            return r3
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "read cache file err:"
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "JAppMovement"
            cn.jiguang.commons.w.a.c(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            return r3
    }

    private void i() {
            r13 = this;
            java.lang.String r0 = ", removes:"
            java.lang.String r1 = "JAppMovement"
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r7.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r11 = cn.jiguang.commons.a.d.a.f952f     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.util.List r3 = r13.i(r11)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r12 = cn.jiguang.commons.a.d.a.f953g     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.util.List r4 = r13.i(r12)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r5 = "broadcast events - adds:"
            r2.append(r5)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.append(r5)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.append(r0)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.append(r5)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            cn.jiguang.commons.w.a.a(r1, r2)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r5.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r6.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r13.a(r5, r6)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r9 = "comparison events - adds:"
            r2.append(r9)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            int r9 = r5.size()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.append(r9)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.append(r0)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            int r0 = r6.size()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2.append(r0)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r0 == 0) goto L8f
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r0 == 0) goto L8f
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r0 == 0) goto L8f
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r0 == 0) goto L8f
            java.lang.String r0 = "no app changes detected, skipping"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            return
        L89:
            r0 = move-exception
            r2 = r13
            goto Ldc
        L8c:
            r0 = move-exception
            r2 = r13
            goto Ldd
        L8f:
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r9.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.util.HashMap r10 = new java.util.HashMap     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r10.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r2 = r13
            r2.a(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            r0.<init>()     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            java.lang.String r3 = "processed app changes:"
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            int r3 = r7.size()     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            java.lang.String r3 = " adds,"
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            int r3 = r8.size()     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            java.lang.String r3 = " removes"
            r0.append(r3)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            r13.a(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            java.lang.String r0 = "reported all app changes ok"
            cn.jiguang.commons.w.a.a(r1, r0)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            cn.jiguang.commons.L.m.d(r11)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            cn.jiguang.commons.L.m.d(r12)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            super.d(r1)     // Catch: java.lang.Throwable -> Ld8 java.lang.Exception -> Lda
            return
        Ld8:
            r0 = move-exception
            goto Ldc
        Lda:
            r0 = move-exception
            goto Ldd
        Ldc:
            throw r0
        Ldd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "movement err:"
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            cn.jiguang.commons.w.a.f(r1, r0)
            return
    }

    @Override // cn.jiguang.commons.a.c
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "JAppMovement"
            return r0
    }

    @Override // cn.jiguang.commons.a.c
    public void a(boolean r4) {
            r3 = this;
            java.lang.String r4 = "JAppMovement"
            java.lang.String r0 = "start app change detection"
            cn.jiguang.commons.w.a.a(r4, r0)     // Catch: java.lang.Exception -> Lb
            r3.i()     // Catch: java.lang.Exception -> Lb
            return
        Lb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doBusiness movement err:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            cn.jiguang.commons.w.a.f(r4, r0)
            return
    }

    public void e() {
            r2 = this;
            java.lang.String r0 = "JAppMovement"
            java.lang.String r1 = "app monitoring disabled"
            cn.jiguang.commons.w.a.a(r0, r1)
            r2.k()
            return
    }

    public void f() {
            r2 = this;
            java.lang.String r0 = "JAppMovement"
            java.lang.String r1 = "app monitoring enabled"
            cn.jiguang.commons.w.a.a(r0, r1)
            r2.j()
            return
    }

    public void j() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r6.a
            java.lang.Object r0 = r0.get()
            android.content.BroadcastReceiver r0 = (android.content.BroadcastReceiver) r0
            java.lang.String r1 = "JAppMovement"
            if (r0 == 0) goto L12
            java.lang.String r0 = "app receiver already registered"
            cn.jiguang.commons.w.a.a(r1, r0)
            return
        L12:
            android.content.BroadcastReceiver r0 = r6.d()
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r3 = r6.a     // Catch: java.lang.Exception -> L25
            boolean r3 = androidx.camera.view.p.a(r3, r2, r0)     // Catch: java.lang.Exception -> L25
            if (r3 != 0) goto L27
            java.lang.String r3 = "another thread handling registration"
        L21:
            cn.jiguang.commons.w.a.a(r1, r3)     // Catch: java.lang.Exception -> L25
            return
        L25:
            r3 = move-exception
            goto L36
        L27:
            android.content.IntentFilter r3 = r6.c()     // Catch: java.lang.Exception -> L25
            android.content.Context r4 = cn.jiguang.commons.L.h.a()     // Catch: java.lang.Exception -> L25
            r5 = 0
            cn.jiguang.commons.L.w.a(r4, r0, r3, r5)     // Catch: java.lang.Exception -> L25
            java.lang.String r3 = "app receiver registered ok"
            goto L21
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "register receiver err:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            cn.jiguang.commons.w.a.c(r1, r3)
            java.util.concurrent.atomic.AtomicReference r1 = r6.a
            r1.set(r2)
            r6.a(r0)     // Catch: java.lang.Exception -> L56
        L56:
            return
    }

    public void k() {
            r4 = this;
            java.lang.String r0 = "JAppMovement"
            java.util.concurrent.atomic.AtomicReference r1 = r4.a     // Catch: java.lang.Exception -> L13
            r2 = 0
            java.lang.Object r1 = r1.getAndSet(r2)     // Catch: java.lang.Exception -> L13
            android.content.BroadcastReceiver r1 = (android.content.BroadcastReceiver) r1     // Catch: java.lang.Exception -> L13
            if (r1 != 0) goto L15
            java.lang.String r1 = "app receiver not registered"
        Lf:
            cn.jiguang.commons.w.a.a(r0, r1)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r1 = move-exception
            goto L1b
        L15:
            r4.a(r1)     // Catch: java.lang.Exception -> L13
            java.lang.String r1 = "app receiver unregistered ok"
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unregister receiver err:"
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            cn.jiguang.commons.w.a.c(r0, r1)
            return
    }
}
