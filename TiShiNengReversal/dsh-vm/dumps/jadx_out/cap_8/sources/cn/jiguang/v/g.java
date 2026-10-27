package cn.jiguang.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class g {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1503b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> f1504c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1505d;




    private static final class a {
        private static final cn.jiguang.v.g a = null;

        static {
                cn.jiguang.v.g r0 = new cn.jiguang.v.g
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.v.g.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.v.g a() {
                cn.jiguang.v.g r0 = cn.jiguang.v.g.a.a
                return r0
        }
    }

    private g() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "JProcessInternalManager"
            r1.f1503b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f1504c = r0
            android.content.Context r0 = cn.jiguang.av.c.a()
            r1.a = r0
            return
    }

    /* synthetic */ g(cn.jiguang.v.g.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ android.content.Context a(cn.jiguang.v.g r0) {
            android.content.Context r0 = r0.a
            return r0
    }

    private android.os.Bundle a(java.lang.String r2) {
            r1 = this;
            android.content.Context r0 = r1.a
            java.lang.String r0 = cn.jiguang.v.d.a(r0)
            android.os.Bundle r2 = r1.a(r2, r0)
            return r2
    }

    private android.os.Bundle a(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            cn.jiguang.v.e r0 = cn.jiguang.v.e.a()     // Catch: java.lang.Throwable -> L1b
            android.content.Context r1 = r6.a     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "INTERNAL_API"
            r4 = 0
            r3 = r7
            r5 = r8
            android.os.Bundle r7 = r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L18
            if (r7 == 0) goto L12
            return r7
        L12:
            android.os.Bundle r7 = new android.os.Bundle     // Catch: java.lang.Throwable -> L18
            r7.<init>()     // Catch: java.lang.Throwable -> L18
            return r7
        L18:
            r0 = move-exception
        L19:
            r7 = r0
            goto L1e
        L1b:
            r0 = move-exception
            r5 = r8
            goto L19
        L1e:
            java.lang.String r8 = r6.f1503b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to get data from process: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            cn.jiguang.w.f.d(r8, r0, r7)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            return r7
    }

    public static cn.jiguang.v.g a() {
            cn.jiguang.v.g r0 = cn.jiguang.v.g.a.a()
            return r0
    }

    private java.lang.Object a(java.lang.String r4, cn.jiguang.e.a r5) {
            r3 = this;
            java.lang.String r0 = r3.f1503b     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r1.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r2 = "get action="
            r1.append(r2)     // Catch: java.lang.Throwable -> L37
            r1.append(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.w.f.l(r0, r1)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r3.f1504c     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L37
            boolean r1 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            java.lang.String r4 = r3.f1503b     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r5.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "get from memory cachedData="
            r5.append(r1)     // Catch: java.lang.Throwable -> L37
            r5.append(r0)     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.w.f.l(r4, r5)     // Catch: java.lang.Throwable -> L37
            return r0
        L37:
            r4 = move-exception
            goto L6d
        L39:
            java.lang.String r0 = "AIDL_TASK"
            cn.jiguang.v.g$3 r1 = new cn.jiguang.v.g$3     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L37
            cn.jiguang.au.d.a(r0, r1)     // Catch: java.lang.Throwable -> L37
            android.content.Context r4 = r3.a     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = cn.jiguang.e.b.a(r4, r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L37
            java.lang.String r5 = r3.f1503b     // Catch: java.lang.Throwable -> L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L37
            r0.<init>()     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = "get from sp cachedData="
            r0.append(r1)     // Catch: java.lang.Throwable -> L37
            r0.append(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L37
            cn.jiguang.w.f.l(r5, r0)     // Catch: java.lang.Throwable -> L37
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L37
            if (r5 != 0) goto L74
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L37
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L37
            return r5
        L6d:
            java.lang.String r5 = r3.f1503b
            java.lang.String r0 = "Error in getGenericData"
            cn.jiguang.w.f.d(r5, r0, r4)
        L74:
            r4 = 0
            return r4
    }

    static /* synthetic */ void a(cn.jiguang.v.g r0, java.lang.String r1) {
            r0.c(r1)
            return
    }

    static /* synthetic */ void a(cn.jiguang.v.g r0, java.lang.String r1, cn.jiguang.e.a r2) {
            r0.b(r1, r2)
            return
    }

    private void a(java.lang.String r5, android.os.Bundle r6, cn.jiguang.e.a r7) {
            r4 = this;
            if (r6 == 0) goto L5f
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L23
            r0.<init>()     // Catch: java.lang.Throwable -> L23
            java.util.Set r1 = r6.keySet()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r6.get(r2)     // Catch: java.lang.Throwable -> L23
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L23
            goto Lf
        L23:
            r5 = move-exception
            goto L58
        L25:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r6 = r4.f1504c     // Catch: java.lang.Throwable -> L23
            r6.put(r5, r0)     // Catch: java.lang.Throwable -> L23
            android.content.Context r5 = r4.a     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L23
            cn.jiguang.e.a r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L23
            r7 = 1
            cn.jiguang.e.a[] r7 = new cn.jiguang.e.a[r7]     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r7[r1] = r6     // Catch: java.lang.Throwable -> L23
            cn.jiguang.e.b.a(r5, r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = r4.f1503b     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r6.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = "Updated generic data cache: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r7 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r6.append(r7)     // Catch: java.lang.Throwable -> L23
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L23
            cn.jiguang.w.f.c(r5, r6)     // Catch: java.lang.Throwable -> L23
            return
        L58:
            java.lang.String r6 = r4.f1503b
            java.lang.String r7 = "Error updating generic data cache"
            cn.jiguang.w.f.d(r6, r7, r5)
        L5f:
            return
    }

    private void a(java.lang.String r3, android.os.Bundle r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "AIDL_TASK"
            cn.jiguang.v.g$1 r1 = new cn.jiguang.v.g$1     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lb
            cn.jiguang.au.d.a(r0, r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r3 = move-exception
            java.lang.String r4 = r2.f1503b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to send data to process: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            cn.jiguang.w.f.d(r4, r5, r3)
            return
    }

    private void b(java.lang.String r2, cn.jiguang.e.a r3) {
            r1 = this;
            android.os.Bundle r0 = r1.a(r2)     // Catch: java.lang.Throwable -> L8
            r1.a(r2, r0, r3)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r3 = r1.f1503b
            java.lang.String r0 = "Error updating generic data cache"
            cn.jiguang.w.f.d(r3, r0, r2)
            return
    }

    private boolean b(java.lang.String r4) {
            r3 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r3.f1504c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L27
            boolean r1 = r0 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            java.lang.String r4 = r3.f1503b     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "return state memory: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.c(r4, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L27
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Throwable -> L27
            return r4
        L27:
            r4 = move-exception
            goto L5a
        L29:
            java.lang.String r0 = "AIDL_TASK"
            cn.jiguang.v.g$2 r1 = new cn.jiguang.v.g$2     // Catch: java.lang.Throwable -> L27
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L27
            cn.jiguang.au.d.a(r0, r1)     // Catch: java.lang.Throwable -> L27
            android.content.Context r4 = r3.a     // Catch: java.lang.Throwable -> L27
            cn.jiguang.e.a r0 = cn.jiguang.e.a.K()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = cn.jiguang.e.b.a(r4, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r3.f1503b     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "return state sp: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            r1.append(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L27
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L27
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L27
            return r4
        L5a:
            java.lang.String r0 = r3.f1503b
            java.lang.String r1 = "Error in getConnectionState"
            cn.jiguang.w.f.d(r0, r1, r4)
            r4 = 0
            return r4
    }

    private android.os.Bundle c(java.lang.String r5, android.os.Bundle r6) {
            r4 = this;
            if (r6 != 0) goto L7
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
        L7:
            r5.getClass()
            int r0 = r5.hashCode()
            java.lang.String r1 = "deviceinfo"
            java.lang.String r2 = "get_loc_info"
            r3 = -1
            switch(r0) {
                case -164104770: goto L29;
                case -24181482: goto L20;
                case 781805572: goto L17;
                default: goto L16;
            }
        L16:
            goto L33
        L17:
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L1e
            goto L33
        L1e:
            r3 = 2
            goto L33
        L20:
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L27
            goto L33
        L27:
            r3 = 1
            goto L33
        L29:
            java.lang.String r0 = "isTcpLoggedIn"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L32
            goto L33
        L32:
            r3 = 0
        L33:
            r5 = 0
            switch(r3) {
                case 0: goto L88;
                case 1: goto L62;
                case 2: goto L38;
                default: goto L37;
            }
        L37:
            goto L87
        L38:
            android.content.Context r0 = r4.a
            java.lang.Object r5 = cn.jiguang.i.a.a(r0, r1, r5)
            java.lang.String r0 = r4.f1503b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "from jcore DEVICE_INFO bundle="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r0, r1)
            boolean r0 = r5 instanceof org.json.JSONObject
            if (r0 == 0) goto L87
            java.lang.String r0 = "de_inf"
            java.lang.String r5 = r5.toString()
            r6.putString(r0, r5)
            return r6
        L62:
            android.content.Context r0 = r4.a
            java.lang.Object r5 = cn.jiguang.i.a.a(r0, r2, r5)
            java.lang.String r0 = r4.f1503b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "from  jcore LOC_INFO bundle="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r0, r1)
            boolean r0 = r5 instanceof android.os.Bundle
            if (r0 == 0) goto L87
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6.putAll(r5)
        L87:
            return r6
        L88:
            cn.jiguang.ad.g r5 = cn.jiguang.ad.g.a()
            boolean r5 = r5.d()
            java.lang.String r0 = r4.f1503b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "from jcore isLoggedIn="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r0, r1)
            java.lang.String r0 = "state"
            r6.putBoolean(r0, r5)
            return r6
    }

    private void c(java.lang.String r5) {
            r4 = this;
            android.os.Bundle r0 = r4.a(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r4.f1503b     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r2.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = "Updated connection state bundle: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L59
            r2.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.w.f.c(r1, r2)     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5b
            java.lang.String r1 = "state"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L59
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r4.f1504c     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            r1.put(r5, r3)     // Catch: java.lang.Throwable -> L59
            android.content.Context r5 = r4.a     // Catch: java.lang.Throwable -> L59
            cn.jiguang.e.a r1 = cn.jiguang.e.a.K()     // Catch: java.lang.Throwable -> L59
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L59
            cn.jiguang.e.a r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L59
            r3 = 1
            cn.jiguang.e.a[] r3 = new cn.jiguang.e.a[r3]     // Catch: java.lang.Throwable -> L59
            r3[r2] = r1     // Catch: java.lang.Throwable -> L59
            cn.jiguang.e.b.a(r5, r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = r4.f1503b     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r1.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "Updated connection state cache: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L59
            r1.append(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L59
            cn.jiguang.w.f.c(r5, r0)     // Catch: java.lang.Throwable -> L59
            return
        L59:
            r5 = move-exception
            goto L5c
        L5b:
            return
        L5c:
            java.lang.String r0 = r4.f1503b
            java.lang.String r1 = "Error updating connection state cache"
            cn.jiguang.w.f.d(r0, r1, r5)
            return
    }

    private android.os.Bundle d(java.lang.String r5, android.os.Bundle r6) {
            r4 = this;
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 1
            r2 = 0
            r3 = -1
            switch(r0) {
                case -164104770: goto L24;
                case -24181482: goto L19;
                case 781805572: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L2e
        Le:
            java.lang.String r0 = "deviceinfo"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L17
            goto L2e
        L17:
            r3 = 2
            goto L2e
        L19:
            java.lang.String r0 = "get_loc_info"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L22
            goto L2e
        L22:
            r3 = 1
            goto L2e
        L24:
            java.lang.String r0 = "isTcpLoggedIn"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r3 = 0
        L2e:
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L3a;
                case 2: goto L32;
                default: goto L31;
            }
        L31:
            goto L8a
        L32:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aV()
        L36:
            r4.a(r5, r6, r0)
            goto L8a
        L3a:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aW()
            goto L36
        L3f:
            if (r6 == 0) goto L8a
            java.lang.String r0 = "state"
            boolean r6 = r6.getBoolean(r0, r2)
            if (r6 == 0) goto L56
            boolean r0 = r4.f1505d
            if (r0 != 0) goto L56
            r4.f1505d = r1
            cn.jiguang.as.b r0 = cn.jiguang.as.b.a()
            r0.b()
        L56:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r4.f1504c
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            r0.put(r5, r3)
            android.content.Context r5 = r4.a
            cn.jiguang.e.a r0 = cn.jiguang.e.a.K()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            cn.jiguang.e.a r0 = r0.a(r3)
            cn.jiguang.e.a[] r1 = new cn.jiguang.e.a[r1]
            r1[r2] = r0
            cn.jiguang.e.b.a(r5, r1)
            java.lang.String r5 = r4.f1503b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Updated connection state cache from callback: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            cn.jiguang.w.f.c(r5, r6)
        L8a:
            r5 = 0
            return r5
    }

    private java.lang.Object d(java.lang.String r2) {
            r1 = this;
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aV()
            java.lang.Object r2 = r1.a(r2, r0)
            return r2
    }

    private java.lang.Object e(java.lang.String r2) {
            r1 = this;
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aW()
            java.lang.Object r2 = r1.a(r2, r0)
            return r2
    }

    public java.lang.Object a(int r2) {
            r1 = this;
            r0 = 67
            if (r2 == r0) goto L20
            r0 = 68
            if (r2 == r0) goto L19
            r0 = 91
            if (r2 == r0) goto L12
            r0 = 94
            if (r2 == r0) goto L19
            r2 = 0
            return r2
        L12:
            java.lang.String r2 = "get_loc_info"
            java.lang.Object r2 = r1.e(r2)
            return r2
        L19:
            java.lang.String r2 = "deviceinfo"
            java.lang.Object r2 = r1.d(r2)
            return r2
        L20:
            java.lang.String r2 = "isTcpLoggedIn"
            boolean r2 = r1.b(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    public void a(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            android.content.Context r0 = r1.a
            java.lang.String r0 = r0.getPackageName()
            r1.a(r2, r3, r0)
            return
    }

    public android.os.Bundle b(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            java.lang.String r0 = r3.f1503b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "action="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            cn.jiguang.w.f.c(r0, r1)
            android.content.Context r0 = r3.a
            java.lang.String r0 = cn.jiguang.av.a.a(r0)
            android.content.Context r1 = r3.a
            java.lang.String r1 = cn.jiguang.v.d.a(r1)
            android.content.Context r2 = r3.a
            java.lang.String r2 = r2.getPackageName()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L33
            android.os.Bundle r4 = r3.d(r4, r5)
            return r4
        L33:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L44
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            android.os.Bundle r4 = r3.c(r4, r5)
            return r4
        L44:
            r4 = 0
            return r4
    }
}
