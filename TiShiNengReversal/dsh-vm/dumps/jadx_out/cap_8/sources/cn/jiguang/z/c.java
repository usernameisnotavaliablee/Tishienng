package cn.jiguang.z;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static java.lang.String a = "JDataControlManager";

    /* renamed from: c, reason: collision with root package name */
    private static java.lang.String f1600c = "DISABLE_DATA";

    /* renamed from: d, reason: collision with root package name */
    private static java.lang.String f1601d = "ENABLE_DATA";

    /* renamed from: b, reason: collision with root package name */
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.Integer>>> f1602b;

    /* renamed from: e, reason: collision with root package name */
    private android.content.Context f1603e;

    /* renamed from: cn.jiguang.z.c$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private static final class a {
        private static final cn.jiguang.z.c a = null;

        static {
                cn.jiguang.z.c r0 = new cn.jiguang.z.c
                r1 = 0
                r0.<init>(r1)
                cn.jiguang.z.c.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ cn.jiguang.z.c a() {
                cn.jiguang.z.c r0 = cn.jiguang.z.c.a.a
                return r0
        }
    }

    static {
            return
    }

    private c() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f1602b = r0
            return
    }

    /* synthetic */ c(cn.jiguang.z.c.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static cn.jiguang.z.c a() {
            cn.jiguang.z.c r0 = cn.jiguang.z.c.a.a()
            return r0
    }

    public synchronized android.os.Bundle a(android.content.Context r6, java.lang.String r7, android.os.Bundle r8) {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = cn.jiguang.z.c.a     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "setDataControl control="
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            r1.append(r8)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = " sdkType="
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            r1.append(r7)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L31
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L31
            r5.f1603e = r6     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.Integer>>> r6 = r5.f1602b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentHashMap r6 = (java.util.concurrent.ConcurrentHashMap) r6     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L34
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L31
            r6.<init>()     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r6 = move-exception
            goto Laf
        L34:
            java.lang.String r0 = "enable_c_c"
            java.lang.Object r0 = r6.get(r0)     // Catch: java.lang.Throwable -> L31
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L43
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L31
            r0.<init>()     // Catch: java.lang.Throwable -> L31
        L43:
            java.lang.String r1 = "enable_c_c"
            java.util.ArrayList r1 = r8.getIntegerArrayList(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "disable_c_c"
            java.lang.Object r2 = r6.get(r2)     // Catch: java.lang.Throwable -> L31
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L58
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
        L58:
            java.lang.String r3 = "disable_c_c"
            java.util.ArrayList r8 = r8.getIntegerArrayList(r3)     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L63
            r2.addAll(r8)     // Catch: java.lang.Throwable -> L31
        L63:
            if (r1 == 0) goto L7c
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L69:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L7c
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L31
            r4.intValue()     // Catch: java.lang.Throwable -> L31
            r2.remove(r4)     // Catch: java.lang.Throwable -> L31
            goto L69
        L7c:
            if (r8 == 0) goto L95
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L31
        L82:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L95
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L31
            r3.intValue()     // Catch: java.lang.Throwable -> L31
            r0.remove(r3)     // Catch: java.lang.Throwable -> L31
            goto L82
        L95:
            if (r1 == 0) goto L9a
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
        L9a:
            java.lang.String r8 = "enable_c_c"
            r6.put(r8, r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r8 = "disable_c_c"
            r6.put(r8, r2)     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.Integer>>> r8 = r5.f1602b     // Catch: java.lang.Throwable -> L31
            r8.put(r7, r6)     // Catch: java.lang.Throwable -> L31
            android.os.Bundle r6 = r5.b()     // Catch: java.lang.Throwable -> L31
            monitor-exit(r5)
            return r6
        Laf:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
    }

    public android.os.Bundle b() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Set<java.lang.Integer>>> r4 = r7.f1602b     // Catch: java.lang.Throwable -> La3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La3
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La3
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L6a
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L4b
        L26:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L60
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L4b
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "enable_c_c"
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Throwable -> L4b
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L4d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4b
            r0.addAll(r6)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto La6
        L4d:
            java.lang.String r5 = "disable_c_c"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L4b
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L26
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4b
            r1.addAll(r5)     // Catch: java.lang.Throwable -> L4b
            goto L26
        L60:
            java.lang.String r3 = cn.jiguang.z.c.f1600c     // Catch: java.lang.Throwable -> L4b
            r2.putIntegerArrayList(r3, r1)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = cn.jiguang.z.c.f1601d     // Catch: java.lang.Throwable -> L4b
            r2.putIntegerArrayList(r3, r0)     // Catch: java.lang.Throwable -> L4b
        L6a:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L8c
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L4b
        L74:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4b
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4b
            cn.jiguang.as.a r3 = cn.jiguang.as.a.a()     // Catch: java.lang.Throwable -> L4b
            r3.b(r1)     // Catch: java.lang.Throwable -> L4b
            goto L74
        L8c:
            java.lang.String r0 = cn.jiguang.z.c.a     // Catch: java.lang.Throwable -> L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "sendDataToRemoteProcess bundle="
            r1.append(r3)     // Catch: java.lang.Throwable -> L4b
            r1.append(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4b
            cn.jiguang.w.f.c(r0, r1)     // Catch: java.lang.Throwable -> L4b
            return r2
        La3:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La3
            throw r0     // Catch: java.lang.Throwable -> L4b
        La6:
            java.lang.String r1 = cn.jiguang.z.c.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sendDataToRemoteProcess throwable="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            cn.jiguang.w.f.c(r1, r0)
            r0 = 0
            return r0
    }
}
