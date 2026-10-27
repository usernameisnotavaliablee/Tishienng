package cn.jpush.android.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static volatile cn.jpush.android.ac.c f1630d;
    private java.util.Map<java.lang.Byte, cn.jpush.android.ac.c.a> a;

    /* renamed from: b, reason: collision with root package name */
    private java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> f1631b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Map<java.lang.Byte, java.lang.String> f1632c;

    private class a {
        public byte a;

        /* renamed from: b, reason: collision with root package name */
        public java.lang.String f1633b;

        /* renamed from: c, reason: collision with root package name */
        public long f1634c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f1635d;

        /* renamed from: e, reason: collision with root package name */
        public int f1636e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ cn.jpush.android.ac.c f1637f;

        public a(cn.jpush.android.ac.c r1, byte r2, java.lang.String r3, long r4, byte[] r6) {
                r0 = this;
                r0.f1637f = r1
                r0.<init>()
                r0.a = r2
                r0.f1633b = r3
                r0.f1634c = r4
                r0.f1635d = r6
                r1 = 0
                r0.f1636e = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "PluginPlatformRegIDBean{pluginPlatformType="
                r0.append(r1)
                byte r1 = r3.a
                r0.append(r1)
                java.lang.String r1 = ", regid='"
                r0.append(r1)
                java.lang.String r1 = r3.f1633b
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", rid="
                r0.append(r1)
                long r1 = r3.f1634c
                r0.append(r1)
                java.lang.String r1 = ", retryCount="
                r0.append(r1)
                int r1 = r3.f1636e
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1631b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1632c = r0
            return
    }

    private cn.jpush.android.ac.c.a a(long r6) {
            r5 = this;
            java.util.Map<java.lang.Byte, cn.jpush.android.ac.c$a> r0 = r5.a
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            cn.jpush.android.ac.c$a r2 = (cn.jpush.android.ac.c.a) r2
            long r2 = r2.f1634c
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto La
            java.lang.Object r6 = r1.getValue()
            cn.jpush.android.ac.c$a r6 = (cn.jpush.android.ac.c.a) r6
            return r6
        L29:
            java.lang.String r6 = "PluginPlatformRidUpdate"
            java.lang.String r7 = "can not find uploadBean by rid"
            cn.jpush.android.helper.Logger.d(r6, r7)
            r6 = 0
            return r6
    }

    public static cn.jpush.android.ac.c a() {
            cn.jpush.android.ac.c r0 = cn.jpush.android.ac.c.f1630d
            if (r0 != 0) goto L19
            java.lang.Class<cn.jpush.android.ac.c> r0 = cn.jpush.android.ac.c.class
            monitor-enter(r0)
            cn.jpush.android.ac.c r1 = cn.jpush.android.ac.c.f1630d     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            cn.jpush.android.ac.c r1 = new cn.jpush.android.ac.c     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            cn.jpush.android.ac.c.f1630d = r1     // Catch: java.lang.Throwable -> L13
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
            cn.jpush.android.ac.c r0 = cn.jpush.android.ac.c.f1630d
            return r0
    }

    private synchronized void a(android.content.Context r10, cn.jpush.android.ac.c.a r11) {
            r9 = this;
            monitor-enter(r9)
            java.lang.String r1 = "JPUSH"
            long r4 = r11.f1634c     // Catch: java.lang.Throwable -> L12
            byte[] r8 = r11.f1635d     // Catch: java.lang.Throwable -> L12
            r2 = 27
            r3 = 2
            r6 = 10000(0x2710, double:4.9407E-320)
            r0 = r10
            cn.jpush.android.helper.JCoreHelper.sendRequest(r0, r1, r2, r3, r4, r6, r8)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r9)
            return
        L12:
            r0 = move-exception
            r10 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L12
            throw r10
    }

    private void b(android.content.Context r8, byte r9, java.lang.String r10, boolean r11) {
            r7 = this;
            long r4 = cn.jpush.android.helper.f.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sendRidRequst regid:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ",rid:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ",whichPlatform:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = " unBindToken:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "PluginPlatformRidUpdate"
            cn.jpush.android.helper.Logger.v(r1, r0)
            byte[] r6 = cn.jpush.android.z.b.a(r10, r9, r11)
            cn.jpush.android.ac.c$a r0 = new cn.jpush.android.ac.c$a
            r1 = r7
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            java.util.Map<java.lang.Byte, cn.jpush.android.ac.c$a> r9 = r1.a
            java.lang.Byte r10 = java.lang.Byte.valueOf(r2)
            r9.put(r10, r0)
            r7.a(r8, r0)
            return
    }

    public void a(android.content.Context r9) {
            r8 = this;
            java.lang.String r0 = "PluginPlatformRidUpdate"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r1.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = "reUploadToken cache size="
            r1.append(r2)     // Catch: java.lang.Throwable -> La0
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r2 = r8.f1631b     // Catch: java.lang.Throwable -> La0
            int r2 = r2.size()     // Catch: java.lang.Throwable -> La0
            r1.append(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r2 = " map="
            r1.append(r2)     // Catch: java.lang.Throwable -> La0
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r2 = r8.f1631b     // Catch: java.lang.Throwable -> La0
            r1.append(r2)     // Catch: java.lang.Throwable -> La0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La0
            cn.jpush.android.helper.Logger.d(r0, r1)     // Catch: java.lang.Throwable -> La0
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r1 = r8.f1631b     // Catch: java.lang.Throwable -> La0
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> La0
            if (r1 != 0) goto La0
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r1 = r8.f1631b     // Catch: java.lang.Throwable -> La0
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La0
        L38:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto La0
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> La0
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> La0
            java.lang.Byte r3 = (java.lang.Byte) r3     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> La0
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> La0
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> La0
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La0
        L58:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L38
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> La0
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> La0
            java.lang.Object r5 = r4.getKey()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> La0
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> La0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La0
            r6.<init>()     // Catch: java.lang.Throwable -> La0
            java.lang.String r7 = "reUploadToken platform="
            r6.append(r7)     // Catch: java.lang.Throwable -> La0
            r6.append(r3)     // Catch: java.lang.Throwable -> La0
            java.lang.String r7 = " regID="
            r6.append(r7)     // Catch: java.lang.Throwable -> La0
            r6.append(r5)     // Catch: java.lang.Throwable -> La0
            java.lang.String r7 = " unBindToken="
            r6.append(r7)     // Catch: java.lang.Throwable -> La0
            r6.append(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> La0
            cn.jpush.android.helper.Logger.d(r0, r6)     // Catch: java.lang.Throwable -> La0
            byte r6 = r3.byteValue()     // Catch: java.lang.Throwable -> La0
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> La0
            r8.a(r9, r6, r5, r4)     // Catch: java.lang.Throwable -> La0
            goto L58
        La0:
            return
    }

    public synchronized void a(android.content.Context r3, byte r4, java.lang.String r5, boolean r6) {
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Lc5
            boolean r0 = cn.jpush.android.local.JPushConstants.isTcpConnected()     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L5d
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L5b
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L5b
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r5 = r2.f1631b     // Catch: java.lang.Throwable -> L5b
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L5b
            r5.put(r4, r0)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "99999363732041973"
            r5 = 1109(0x455, double:5.48E-321)
            cn.jpush.android.helper.c.a(r4, r5, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "PluginPlatformRidUpdate"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r4.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "tcp disconnected,cache data="
            r4.append(r5)     // Catch: java.lang.Throwable -> L5b
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r5 = r2.f1631b     // Catch: java.lang.Throwable -> L5b
            r4.append(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.helper.Logger.d(r3, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "PluginPlatformRidUpdate"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r4.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "tcp disconnected,cache size="
            r4.append(r5)     // Catch: java.lang.Throwable -> L5b
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r5 = r2.f1631b     // Catch: java.lang.Throwable -> L5b
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L5b
            r4.append(r5)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.helper.Logger.d(r3, r4)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r2)
            return
        L5b:
            r3 = move-exception
            goto Lce
        L5d:
            java.util.Map<java.lang.Byte, cn.jpush.android.ac.c$a> r0 = r2.a     // Catch: java.lang.Throwable -> L5b
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L86
            java.util.Map<java.lang.Byte, cn.jpush.android.ac.c$a> r0 = r2.a     // Catch: java.lang.Throwable -> L5b
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.ac.c$a r0 = (cn.jpush.android.ac.c.a) r0     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r0.f1633b     // Catch: java.lang.Throwable -> L5b
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L86
            java.lang.String r3 = "PluginPlatformRidUpdate"
            java.lang.String r4 = "same regid request, drop it"
            cn.jpush.android.helper.Logger.d(r3, r4)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r2)
            return
        L86:
            java.util.Map<java.lang.Byte, java.lang.String> r0 = r2.f1632c     // Catch: java.lang.Throwable -> L5b
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L5b
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lc1
            java.util.Map<java.lang.Byte, java.lang.String> r0 = r2.f1632c     // Catch: java.lang.Throwable -> L5b
            java.lang.Byte r1 = java.lang.Byte.valueOf(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch: java.lang.Throwable -> L5b
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto Lc1
            java.lang.String r3 = "PluginPlatformRidUpdate"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r5.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r6 = "rom is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L5b
            r5.append(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = " regId had report success,not need report again"
            r5.append(r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L5b
            cn.jpush.android.helper.Logger.ke(r3, r4)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r2)
            return
        Lc1:
            r2.b(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5b
            goto Lcc
        Lc5:
            java.lang.String r3 = "PluginPlatformRidUpdate"
            java.lang.String r4 = "unknown plugin platform type"
            cn.jpush.android.helper.Logger.w(r3, r4)     // Catch: java.lang.Throwable -> L5b
        Lcc:
            monitor-exit(r2)
            return
        Lce:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5b
            throw r3
    }

    public void a(android.content.Context r4, long r5) {
            r3 = this;
            cn.jpush.android.ac.c$a r0 = r3.a(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onUpdateRidSuccess rid:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " ,pluginPlatformRegIDBean:"
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "PluginPlatformRidUpdate"
            cn.jpush.android.helper.Logger.ki(r6, r5)
            if (r0 == 0) goto L83
            byte r5 = r0.a
            cn.jpush.android.cache.Key r5 = cn.jpush.android.cache.Key.ThirdPush_RegID(r5)
            java.lang.String r6 = r0.f1633b
            cn.jpush.android.cache.Key r5 = r5.set(r6)
            r6 = 1
            cn.jpush.android.cache.Key[] r1 = new cn.jpush.android.cache.Key[r6]
            r2 = 0
            r1[r2] = r5
            cn.jpush.android.cache.Sp.set(r4, r1)
            byte r5 = r0.a
            cn.jpush.android.cache.Key r5 = cn.jpush.android.cache.Key.ThirdPush_RegUpload(r5)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            cn.jpush.android.cache.Key r5 = r5.set(r1)
            cn.jpush.android.cache.Key[] r6 = new cn.jpush.android.cache.Key[r6]
            r6[r2] = r5
            cn.jpush.android.cache.Sp.set(r4, r6)
            cn.jpush.android.ac.e r5 = cn.jpush.android.ac.e.a()
            byte r6 = r0.a
            r5.a(r4, r6)
            java.util.Map<java.lang.Byte, cn.jpush.android.ac.c$a> r5 = r3.a
            byte r6 = r0.a
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            r5.remove(r6)
            java.util.Map<java.lang.Byte, java.util.HashMap<java.lang.String, java.lang.Boolean>> r5 = r3.f1631b
            byte r6 = r0.a
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            r5.remove(r6)
            java.util.Map<java.lang.Byte, java.lang.String> r5 = r3.f1632c
            byte r6 = r0.a
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            java.lang.String r1 = r0.f1633b
            r5.put(r6, r1)
            cn.jpush.android.ac.e r5 = cn.jpush.android.ac.e.a()
            byte r6 = r0.a
            java.lang.String r0 = r0.f1633b
            r5.b(r4, r6, r0)
        L83:
            return
    }

    public void a(android.content.Context r4, long r5, int r7) {
            r3 = this;
            cn.jpush.android.ac.c$a r0 = r3.a(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onUpdateRidFailed rid:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ",errorCode:"
            r1.append(r5)
            r1.append(r7)
            java.lang.String r5 = " ,pluginPlatformRegIDBean:"
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "PluginPlatformRidUpdate"
            cn.jpush.android.helper.Logger.ki(r6, r5)
            if (r0 == 0) goto L49
            int r5 = r0.f1636e
            r7 = 3
            if (r5 >= r7) goto L39
            int r5 = r5 + 1
            r0.f1636e = r5
            r3.a(r4, r0)
            return
        L39:
            java.lang.String r4 = "updateRegId failed"
            cn.jpush.android.helper.Logger.d(r6, r4)
            java.util.Map<java.lang.Byte, cn.jpush.android.ac.c$a> r4 = r3.a
            byte r5 = r0.a
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r4.remove(r5)
        L49:
            return
    }

    public void b(android.content.Context r4, long r5) {
            r3 = this;
            cn.jpush.android.ac.c$a r0 = r3.a(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onUpdateRidTimeout rid:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " ,pluginPlatformRegIDBean:"
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "PluginPlatformRidUpdate"
            cn.jpush.android.helper.Logger.ki(r6, r5)
            if (r0 == 0) goto L41
            int r5 = r0.f1636e
            r1 = 3
            if (r5 >= r1) goto L31
            int r5 = r5 + 1
            r0.f1636e = r5
            r3.a(r4, r0)
            return
        L31:
            java.lang.String r4 = "updateRegId failed by timeout"
            cn.jpush.android.helper.Logger.d(r6, r4)
            java.util.Map<java.lang.Byte, cn.jpush.android.ac.c$a> r4 = r3.a
            byte r5 = r0.a
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r4.remove(r5)
        L41:
            return
    }
}
